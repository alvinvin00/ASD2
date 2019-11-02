package avl_tree;

public class TestAVL {
    public static void main(String[] args) {
        AVLTree<Integer> avl = new AVLTree<>();

        avl.insert(50);
        avl.insert(30);
        avl.insert(70);
        avl.insert(20);
        avl.insert(35);
        avl.insert(60);
        avl.insert(80);
        avl.insert(15);
        avl.insert(25);
        avl.insert(40);
        avl.insert(55);
        avl.insert(10);

//        System.out.println();
//        avl.delete_predecessor(15);
//        avl.printPreOrder();
//        System.out.println();
//        avl.delete_predecessor(32);
//        avl.printPreOrder();
    }
}
