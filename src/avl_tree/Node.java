package avl_tree;

class Node<AnyType> {
    AnyType element;
    Node<AnyType> left;
    Node<AnyType> right;
    int height;

    Node(AnyType theElement, Node<AnyType> lt, Node<AnyType> rt) {
        element = theElement;
        left = lt;
        right = rt;
    }
}
