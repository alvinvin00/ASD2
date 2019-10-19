package avl_tree;

class AVLTree<AnyType extends Comparable<? super AnyType>> {

    private Node<AnyType> root;

    AVLTree() {
        root = null;
    }

    private int height(Node<AnyType> t) {
        return t == null ? -1 : t.height;
    }

    private int max(int ltHeight, int rtHeight) {
/*
        if (ltHeight > rtHeight) {
            return ltHeight;
        }
        return rtHeight;
*/
        return Math.max(ltHeight, rtHeight);
    }

    //Case 1
    private Node<AnyType> rotateWithLeftChild(Node<AnyType> k2) {
        Node<AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;

        k2.height = max(height(k2.left), height(k2.right)) + 1;
        k1.height = max(height(k1.left), k2.height) + 1;

        return k1;
    }

    //Case 4
    private Node<AnyType> rotateWithRightChild(Node<AnyType> k1) {
        Node<AnyType> k2 = k1.right;

        k1.right = k2.left;
        k2.left = k1;

        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;

        return k2;
    }

    //Case 2 : Left to Right
    private Node<AnyType> doubleWithLeftChild(Node<AnyType> k3) {
        k3.left = rotateWithRightChild(k3.left); //Arah Rotasi ke kiri
        return rotateWithLeftChild(k3); //Arah Rotasi ke kanan
    }

    //Case 3 : Right to Left
    private Node<AnyType> doubleWithRightChild(Node<AnyType> k1) {
        k1.right = rotateWithLeftChild(k1.right); //Arah Rotasi ke Kanan
        return rotateWithRightChild(k1); //Arah Rotasi ke Kiri
    }

    void insert(AnyType x) {
        root = insert(x, root);
    }

    private Node<AnyType> insert(AnyType x, Node<AnyType> t) {
        if (t == null) {
            t = new Node<>(x, null, null);
        }
        //Case 1 dan Case 2
        else if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
            if (height(t.left) - height(t.right) > 1) {
                if (x.compareTo(t.left.element) < 0) {
                    t = rotateWithLeftChild(t); //Case 1
                } else {
                    t = doubleWithLeftChild(t); //Case 2
                }
            }
        } else if (x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);
            if (height(t.right) - height(t.left) > 1) {
                if (x.compareTo(t.right.element) > 0) {
                    t = rotateWithRightChild(t); //Case 4
                } else {
                    t = doubleWithRightChild(t); //Case 3
                }
            }
        }
        t.height = max(height(t.left), height(t.right)) + 1;

        return t;
    }

    private void preOrder(Node<AnyType> t) {
        if (t != null) {
            System.out.print(t.element + " ");
            if (t.left != null) {
                preOrder(t.left);
            }
            if (t.right != null) {
                preOrder(t.right);
            }
        }
    }

    private void inOrder(Node<AnyType> t) {
        if (t != null) {
            if (t.left != null) {
                inOrder(t.left);
            }
            System.out.print(t.element + " ");
            if (t.right != null) {
                inOrder(t.right);
            }
        }
    }

    private void postOrder(Node<AnyType> t) {
        if (t != null) {
            if (t.left != null) {
                postOrder(t.left);
            }
            if (t.right != null) {
                postOrder(t.right);
            }
            System.out.print(t.element + " ");
        }
    }

    void printPreOrder() {
        if (root == null)
            System.out.println("Empty tree");
        else
            preOrder(root);
    }

    public void printInOrder() {
        if (root == null)
            System.out.println("Empty tree");
        else
            inOrder(root);
    }

    public void printPostOrder() {
        if (root == null)
            System.out.println("Empty tree");
        else
            postOrder(root);
    }

    private Node<AnyType> findMin(Node<AnyType> t) {
        if (t == null) {
            return null;
        }
        while (t.left != null) {
            t = t.left;
        }
        return t;

    }

    void delete_successor(AnyType x) {
        delete_successor(x, root);
    }

    private Node<AnyType> delete_successor(AnyType x, Node<AnyType> t) {
        if (t == null) {
            return null;
        } else if (x.compareTo(t.element) < 0) {
            t.left = delete_successor(x, t.left);
        } else if (x.compareTo(t.element) > 0) {
            t.right = delete_successor(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = delete_successor(t.element, t.right);
        } else {
            t = t.left != null ? t.left : t.right;
        }
        return balance(t);
    }

    private Node<AnyType> balance(Node<AnyType> t) {
        if (t == null) {
            return null;
        } else if (height(t.left) - height(t.right) > 1) {
            //Check case 1/2
            if (height(t.left.left) >= height(t.left.right)) { //Subtree LH
                t = rotateWithLeftChild(t); //Case 1
            } else { //Subtree RH
                t = doubleWithLeftChild(t); //Case 2
            }
        } else if (height(t.right) - height(t.left) > 1) { //Subtree RH
            //Check Case 3/4
            if (height(t.right.right) >= height(t.right.left
            )) { //Subtree RH
                t = rotateWithRightChild(t); //Case 4
            } else {
                t = doubleWithRightChild(t);
            }
        }
        t.height = max(height(t.left), height(t.right)) + 1; //Update tree height
        return t;
    }


}
