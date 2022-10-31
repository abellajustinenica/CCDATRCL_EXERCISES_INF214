public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 10;
        int noEdges = 13;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "nicaaaxx";
        myGraph.edge[0].dest = "shyndltrr";

        // Edge 2
        myGraph.edge[1].src = "nicaaaxx";
        myGraph.edge[1].dest = "aronkenx";

        // Edge 3
        myGraph.edge[2].src = "nicaaaxx";
        myGraph.edge[2].dest = "drnnyyy";

        //Edge 4
        myGraph.edge[3].src = "nicaaaxx";
        myGraph.edge[3].dest = "nrnlzld";

        // Edge 5
        myGraph.edge[4].src = "shyndltrr";
        myGraph.edge[4].dest = "kyeliseo";

        //Edge 6
        myGraph.edge[5].src = "drnnyyy";
        myGraph.edge[5].dest = "nrnlzld";

        //Edge 7
        myGraph.edge[6].src = "drnnyyy";
        myGraph.edge[6].dest = "armyka";
    
        // Edge 8
        myGraph.edge[7].src = "nrnlzld";
        myGraph.edge[7].dest = "armyka";

        // Edge 9
        myGraph.edge[8].src = "nrnlzld";
        myGraph.edge[8].dest = "diyens";

        // Edge 10
        myGraph.edge[9].src = "nrnlzld";
        myGraph.edge[9].dest = "kyeliseo";

        // Edge 11
        myGraph.edge[10].src = "armyka";
        myGraph.edge[10].dest = "leyameyyy";

        // Edge 12
        myGraph.edge[11].src = "leyameyyy";
        myGraph.edge[11].dest = "astgela";

        //Edge 13
        myGraph.edge[12].src = "leyameyyy";
        myGraph.edge[12].dest = "diyens";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
