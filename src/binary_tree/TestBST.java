package binary_tree;

import java.util.Scanner;

public class TestBST {

    public static void main(String[] args) throws Exception {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Scanner s = new Scanner(System.in);

        bst.insert(15);
        bst.insert(1);
        bst.insert(8);
        bst.insert(6);
        bst.insert(7);
        bst.insert(9);
        bst.insert(11);
        bst.insert(18);
        bst.insert(19);
        transverse(bst);

        System.out.print("Minimum : ");
        System.out.println(bst.minValue());

        System.out.print("Maximum : ");
        System.out.println(bst.maxValue());

//        System.out.print("Masukkan node yang ingin dihapus (Predecessor) : ");
//        bst.delete_predecessor(s.nextInt());

//        System.out.print("Masukkan node yang ingin dihapus (Successor) : ");
//        bst.delete_successor(s.nextInt());

        bst.delete_max();

        System.out.println("Transversal setelah node dihapus : ");

        transverse(bst);
    }

    private static void transverse(BinarySearchTree<Integer> bst) {
        System.out.print("InOrder : ");
        bst.inOrder();
        System.out.println();

        System.out.print("PreOrder : ");
        bst.preOrder();
        System.out.println();

        System.out.print("PostOrder : ");
        bst.postOrder();
        System.out.println();
    }
}