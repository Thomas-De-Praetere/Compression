/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuffMann;

import HuffMann.Tree.Tree;
import HuffMann.Tree.TreeNode;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *
 * @author Thomas De Praetere
 */
public class HuffMann {

    public String compact(String st) {
        Map<TreeNode, Integer> map = analyze(st);

        PriorityQueue<Tree> queue = new PriorityQueue<>();

        for (TreeNode n : map.keySet()) {
            queue.add(new Tree(n, map.get(n)));
        }

        while (queue.size() != 1) {
            Tree t1 = queue.poll();
            Tree t2 = queue.poll();

            queue.add(new Tree(new TreeNode(t1.getRoot(), t2.getRoot(), null), t1.getValue() + t2.getValue()));
        }

        Map<Character, String> dict = makeCode(queue.peek());

        String str = "";
        for (char c : st.toCharArray()) {
            str += dict.get(c);
        }
        return str;
    }

    private Map<Character, String> makeCode(Tree t) {
        Map<Character, String> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        makeCode(st, t.getRoot(), map);
        return map;
    }

    private void makeCode(Stack<Character> l, TreeNode n, Map<Character, String> map) {
        if (n.isLeaf()) {
            String st = "";
            for (Character c : l) {
                st += c.toString();
            }
            map.put(n.getKey(), st);
        } else {
            if (n.getLeft() != null) {
                l.push('0');
                makeCode(l, n.getLeft(), map);
                l.pop();
            }
            if (n.getRight() != null) {
                l.push('1');
                makeCode(l, n.getRight(), map);
                l.pop();
            }

        }
    }

    private Map<TreeNode, Integer> analyze(String st) {
        Map<TreeNode, Integer> map = new HashMap<>();

        char[] arr = st.toCharArray();
        for (char b : arr) {
            if (!map.containsKey(new TreeNode(b))) {
                map.put(new TreeNode(b), 0);
            }
            map.put(new TreeNode(b), map.get(new TreeNode(b)) + 1);
        }

        return map;
    }

}
