package praktek2;

class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
    private Node<AnyType> root;

    BinarySearchTree() {
        root = null;

    }

    private Node<AnyType> insertNode(AnyType x, Node<AnyType> t) throws Exception {
        if (t == null) {
            t = new Node<>(x);

        } else if (x.compareTo(t.data) < 0) {
            t.left = insertNode(x, t.left);

        } else if (x.compareTo(t.data) > 0) {

            t.right = insertNode(x, t.right);
        } else {
            throw new Exception(x.toString());
        }
        return t;
    }

    private void inOrder(Node<AnyType> t) {
        if (t != null) {
            if (t.left != null) {
                inOrder(t.left);
            }
            System.out.print(t.data + " ");
            if (t.right != null) {
                inOrder(t.right);
            }
        }
    }

    void insert(AnyType x) throws Exception {
        root = insertNode(x, root);
    }

    void inOrder() {
        inOrder(root);
    }

    void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node<AnyType> t) {
        System.out.print(t.data + " ");

        if (t.left != null) {
            preOrder(t.left);
        }
        if (t.right != null) {
            preOrder(t.right);
        }
    }

    void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node<AnyType> t) {

        if (t != null) {
            if (t.left != null) {
                postOrder(t.left);
            }
            if (t.right != null) {
                postOrder(t.right);
            }
            System.out.print(t.data + " ");
        }

    }

    void minimum() {
        minimum(root);
    }

    private void minimum(Node<AnyType> t) {
        if (t != null) {
            if (t.left != null) {
                minimum(t.left);
            } else {
                System.out.print(t.data);
            }
        }
    }

    void maximum() {
        maximum(root);
    }

    private void maximum(Node<AnyType> t) {
        if (t != null) {
            if (t.right != null) {
                maximum(t.right);
            } else {
                System.out.print(t.data);
            }
        }
    }

}