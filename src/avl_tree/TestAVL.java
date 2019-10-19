package avl_tree;

public class TestAVL {
    public static void main(String[] args) {
        AVLTree<Integer> avl = new AVLTree<>();
        avl.insert(15);
        avl.insert(10);
        avl.insert(4);
        avl.insert(21);
        avl.insert(12);
        avl.insert(7);
        avl.insert(8);
        avl.insert(32);
        avl.insert(40);
        avl.insert(14);
        avl.insert(45);
        avl.insert(60);
        avl.insert(42);
        avl.printPreOrder();
        System.out.println();
        avl.delete_predecessor(15);
        avl.printPreOrder();
        System.out.println();
        avl.delete_predecessor(32);
        avl.printPreOrder();
    }
}
