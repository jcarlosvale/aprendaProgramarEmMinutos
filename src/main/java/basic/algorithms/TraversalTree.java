package basic.algorithms;


import basic.datastructure.BinaryTree;

import java.util.LinkedList;

public class TraversalTree {

    /**
     * POS-ORDER
     *  LEFT - RIGHT - ROOT
     */
    public static void posOrder(BinaryTree tree) {
        if (tree == null){
            return;
        }
        posOrder(tree.left);
        posOrder(tree.right);
        //consume node - root
        System.out.println(tree.value);
    }

    /**
     * IN-ORDER
     *  LEFT - ROOT - RIGHT
     */
    public static void inOrder(BinaryTree tree) {
        if (tree == null){
            return;
        }
        inOrder(tree.left);
        //consume node - root
        System.out.println(tree.value);
        inOrder(tree.right);
    }

    /**
     * PRE-ORDER
     *  ROOT - LEFT - RIGHT
     */
    public static void preOrder(BinaryTree tree) {
        if (tree == null){
            return;
        }
        //consume node - root
        System.out.println(tree.value);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    /**
     * BFS Algorithm
     */
    public static void bfs (BinaryTree tree) {
        LinkedList<BinaryTree> children = new LinkedList<>();
        //root
        if (tree != null) {
            System.out.println(tree.value);
            if (tree.left != null) {
                children.add(tree.left);
            }
            if (tree.right != null) {
                children.add(tree.right);
            }
            while(! children.isEmpty()) {
                BinaryTree node = children.removeFirst();
                System.out.println(node.value);
                if (node.left != null) {
                    children.add(node.left);
                }
                if (node.right != null) {
                    children.add(node.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(2,     //root
                new BinaryTree(7,               //left
                        new BinaryTree(9),
                        new BinaryTree(6)),
                new BinaryTree(5,               //right
                        new BinaryTree(4),
                        new BinaryTree(1)));
        //posOrder(tree);
        //inOrder(tree);
        //preOrder(tree);
        bfs(tree);
    }

}
