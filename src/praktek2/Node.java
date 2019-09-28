package praktek2;

class Node<AnyType> {

    Node<AnyType> left, right;
    AnyType data;

    Node(AnyType data) {
        left = right = null;
        this.data = data;
    }

}
