/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuffMann.Tree;

/**
 *
 * @author Thomas De Praetere
 */
public class Tree implements Comparable<Tree> {

    private TreeNode root;
    private int value;

    public Tree(TreeNode root, int value) {
        this.root = root;
        this.value = value;
    }

    public Tree() {
        root = null;
        value = -1;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Tree o) {
        return value - o.value;
    }

    

}
