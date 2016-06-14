/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuffMann.Tree;

import java.util.Objects;

/**
 *
 * @author Thomas De Praetere
 */
public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private Character key;

    public TreeNode(TreeNode left, TreeNode right, Character key) {
        this.left = left;
        this.right = right;
        this.key = key;
    }

    public TreeNode(Character key) {
        this.key = key;
        left = null;
        right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Character getKey() {
        return key;
    }

    public void setKey(Character key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TreeNode other = (TreeNode) obj;
        return Objects.equals(this.key, other.key);
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

}
