package binary_tree;

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

    void delete_successor(AnyType x) throws Exception {
        root = delete_successor(x, root);
    }

    private Node<AnyType> delete_successor(AnyType x, Node<AnyType> t) throws Exception {
        if (t == null) {
            throw new Exception(x.toString());

        } else if (x.compareTo(t.data) < 0) {
            t.left = delete_successor(x, t.left);
        } else if (x.compareTo(t.data) > 0) {
            t.right = delete_successor(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.data = minValue(t.right).data;
            t.right = delete_successor(t.data, t.right);
        } else {
            t = t.left != null ? t.left : t.right;
        }
        return t;
    }

    void delete_predecessor(AnyType x) throws Exception {
        root = delete_predecessor(x, root);
    }

    private Node<AnyType> delete_predecessor(AnyType x, Node<AnyType> t) throws Exception {
        if (t == null) {
            throw new Exception(x.toString());

        } else if (x.compareTo(t.data) < 0) {
            t.left = delete_predecessor(x, t.left);
        } else if (x.compareTo(t.data) > 0) {
            t.right = delete_predecessor(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.data = maxValue(t.left).data;
            t.left = delete_predecessor(t.data, t.left);
        } else {
            t = t.right != null ? t.right : t.left;
        }
        return t;
    }

    void delete_max() throws Exception {
        root = delete_max(root);
    }

    void delete_min() throws Exception {
        root = delete_min(root);
    }

    private Node<AnyType> delete_min(Node<AnyType> t) throws Exception {

        if (t == null) {
            throw new Exception();
        } else if (t.left.left == null) {
            if (t.left.right != null) {
                t.left = t.left.right;
            } else t.left = null;
        } else {
            delete_min(t.left);
        }
        return t;
    }

    private Node<AnyType> delete_max(Node<AnyType> t) throws Exception {

        if (t == null) {
            throw new Exception();
        } else if (t.right.right == null) {
            if (t.right.left != null) {
                t.right = t.right.left;
            } else t.right = null;
        } else {
            delete_max(t.right);
        }
        return t;
    }

    void insert(AnyType x) throws Exception {
        root = insertNode(x, root);
    }

    void inOrder() {
        inOrder(root);
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

    AnyType minValue() {
        return elementAt(minValue(root));
    }

    private Node<AnyType> minValue(Node<AnyType> t) {
        if (t != null) {
            if (t.left != null) {
                return minValue(t.left);
            }
        }
        return t;
    }

    private AnyType elementAt(Node<AnyType> t) {
        return (t == null) ? null : t.data;
    }

    AnyType maxValue() {
        return elementAt(maxValue(root));
    }

    private Node<AnyType> maxValue(Node<AnyType> t) {
        if (t != null) {
            if (t.right != null) {
                return maxValue(t.right);
            }
        }
        return t;
    }

}