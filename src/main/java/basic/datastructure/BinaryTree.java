package basic.datastructure;

public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree() {}

    public BinaryTree(int value) {
        this.value = value;
    }

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this(value);
        this.left = left;
        this.right = right;
    }
}
