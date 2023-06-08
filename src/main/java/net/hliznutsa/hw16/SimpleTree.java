package net.hliznutsa.hw16;

import java.util.ArrayList;
import java.util.List;

public class SimpleTree {
    private TreeNode root;

    public void add(int value) {
        root = addNode(root, value);
    }

    private TreeNode addNode(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        }

        return current;
    }

    public List<Integer> iteration() {
        List<Integer> values = new ArrayList<>();
        iterationTree(root, values);
        return values;
    }

    private void iterationTree(TreeNode node, List<Integer> values) {
        if (node != null) {
            values.add(node.value);
            iterationTree(node.left, values);
            iterationTree(node.right, values);
        }
    }

    private static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}

