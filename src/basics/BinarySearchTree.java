package basics;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

    private List<Node> tree = new LinkedList<>();

    public static class Node {
        public Node(
                Node parent,
                Node left,
                Integer value,
                Node right
        ) {
            this.parent = parent;
            this.left = left;
            this.value = value;
            this.right = right;
        }
        private Node parent;
        private Node left;
        private Integer value;
        private Node right;
    }

    private void addRoot(Node node) {
        tree.add(node);
    }

    public void add(Integer value) {
        Node root = getRoot();

        if(value < root.value) {
            Node node = root.left;
            while(true) {
                if(node.value.equals(value)) {

                    break;
                } else if(node.left == null && node.right == null) break;
                else node = node.left;
            }
        } else {
            root.right = new Node(root, null, value, null);
        }
    }

    public Node getRoot() {
        return tree.stream().filter( nd -> nd.parent == null ).findFirst().get();
    }

    public Node getParentForExistingNode(Integer value) {
       Node root = getRoot();
       System.out.println("Root is "+root.value);
       Node parent = null;

       if(value < root.value) {
           Node node = root.left;
           while(true) {
               if(node.value.equals(value)) {
                   parent = node.parent;
                   break;
               } else if(node.left == null && node.right == null) break;
               else node = node.left;
           }
       }
       else  {
            Node node = root.right;
            while(true) {
                if(node.value.equals(value)) {
                    parent = node.parent;
                    break;
                } else if(node.left == null && node.right == null) break;
                else node = node.right;
            }
        }
       return parent;
    }

    public static void main(String[] args) {
        Node root = new Node(
                null,
                null,
                50,
                null
        );

        BinarySearchTree tree = new BinarySearchTree();
        tree.addRoot(root);
        tree.add(20);

        System.out.println(tree.getParentForExistingNode(20).value);;
    }
}
