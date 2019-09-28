package praktek2;

public class TestBST {

    public static void main(String[] args) throws Exception {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(8);
        bst.insert(3);
        bst.insert(1);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(10);
        bst.insert(14);
        bst.insert(13);

        System.out.print("InOrder : ");
        bst.inOrder();
        System.out.println();

        System.out.print("PreOrder : ");
        bst.preOrder();
        System.out.println();

        System.out.print("PostOrder : ");
        bst.postOrder();
        System.out.println();

        System.out.print("Minimum : ");
        bst.minimum();
        System.out.println();

        System.out.print("Maximum : ");
        bst.maximum();
        System.out.println();

    }
}