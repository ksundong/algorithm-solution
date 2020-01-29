package dev.idion.baekjoon.treetraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int repeatCount = Integer.parseInt(bufferedReader.readLine());
        Map<String, Node> nodeMap = new HashMap<>();
        Node rootNode = null;

        for (int i = 0; i < repeatCount; i++) {
            String[] nodeLines = bufferedReader.readLine().split(" ");
            String nodeValue = nodeLines[0];
            String leftNodeValue = nodeLines[1];
            String rightNodeValue = nodeLines[2];
            nodeMap.put(nodeValue, nodeMap.getOrDefault(nodeValue, new Node(nodeValue)));
            Node node = nodeMap.get(nodeValue);
            if (!leftNodeValue.equals(".")) {
                Node leftNode = new Node(leftNodeValue);
                node.setLeftNode(leftNode);
                nodeMap.put(leftNodeValue, leftNode);
            }
            if (!rightNodeValue.equals(".")) {
                Node rightNode = new Node(rightNodeValue);
                node.setRightNode(rightNode);
                nodeMap.put(rightNodeValue, rightNode);
            }
            if (i == 0) rootNode = node;
        }
        preorder(rootNode);
        System.out.println();
        inorder(rootNode);
        System.out.println();
        postorder(rootNode);
    }

    private static void preorder(Node node) {
        System.out.print(node.getValue());
        if (node.getLeftNode() != null) preorder(node.getLeftNode());
        if (node.getRightNode() != null) preorder(node.getRightNode());
    }

    private static void inorder(Node node) {
        if (node.getLeftNode() != null) inorder(node.getLeftNode());
        System.out.print(node.getValue());
        if (node.getRightNode() != null) inorder(node.getRightNode());
    }

    private static void postorder(Node node) {
        if (node.getLeftNode() != null) postorder(node.getLeftNode());
        if (node.getRightNode() != null) postorder(node.getRightNode());
        System.out.print(node.getValue());
    }

    static class Node {
        private Node leftNode;
        private Node rightNode;
        private String value;

        public Node(String value) {
            this.value = value;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public String getValue() {
            return value;
        }
    }
}
