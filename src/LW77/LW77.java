/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LW77;

/**
 *
 * @author Thomas De Praetere
 */
public class LW77 {

    private final int sliding_window;

    public LW77(int sliding_window) {
        this.sliding_window = sliding_window;
    }

    public String compress(String st, boolean is_short) {
        char[] arr = st.toCharArray();

        String ret = "";

        int start_w = 0;
        int end_w = 0;

        while (end_w < arr.length) {
            int pos = 0;
            int match = 0;
            for (int i = start_w; i < end_w; i++) {
                if (arr[i] == arr[end_w]) {
                    int m = longest_match(i, end_w, arr);
                    if (m > match) {
                        match = m;
                        pos = i-start_w;
                    }
                }
            }

            if (is_short) {
                ret += (end_w + match < arr.length) ? pos + "" + match + "" + arr[end_w + match] : pos + "" + match + "EOF";
            } else {
                ret += (end_w + match < arr.length) ? "(" + pos + ", " + match + ", " + arr[end_w + match] + "), " : "(" + pos + ", " + match + ", " + "EOF" + "), ";
            }

            end_w += 1 + match;
            start_w = (end_w - sliding_window < 0) ? 0 : end_w - sliding_window;
        }
        return ret;
    }

    private int longest_match(int start_to_match, int start, char[] arr) {
        int i = start_to_match;
        int j = start;

        int match_length = 0;

        while (j < arr.length && arr[i] == arr[j]) {
            i++;
            j++;
            match_length++;
        }
        return match_length;
    }

}
