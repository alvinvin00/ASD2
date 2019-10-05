package binary_tree;

class Node<AnyType> {

    Node<AnyType> left, right;
    AnyType data;

    Node(AnyType data) {
        left = right = null;
        this.data = data;
    }

}
