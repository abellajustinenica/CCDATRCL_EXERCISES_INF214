public class Node {

    // Every node has three properties
    // 1. Key/Data
    String data;

    // 2. Pointer to the left child
    Node left;

    // 3. Pointer to the right child
    Node right;

    // Constructor
    public Node(String scienceClub) {

        // Set node data
        this.data = scienceClub;

        // Initialize left and right pointers to NULL.
        left = null;
        right = null;
    }
}
