// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        Node President = new Node("President: Justine Nica");
        Node VicePres = new Node("VicePres: Shyne Mae");
        Node Secretary = new Node("Secretary: Daniela Ann");
        Node Treasurer = new Node("Treasurer: Angelo Keith");
        Node AsstTreasurer = new Node("AsstTreasurer: Andrea Nicole");
        Node Auditor = new Node("Auditor: Johnny Barrientos");
        Node PIO = new Node("PIO: Kenneth Aaron");

        // Set left and right child of root node President
        President.left = VicePres;
        President.right = Secretary;

        // Set left and right child of node VicePres
        VicePres.left = Treasurer;
        VicePres.right = AsstTreasurer;

        // Set left and right child of node Secretary
        Secretary.left = Auditor;
        Secretary.right = PIO;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(President);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(President);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(President);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
