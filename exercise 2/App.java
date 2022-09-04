import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Enchanted");
        Playlist.add("Leaves");
        Playlist.add("August");
        Playlist.add("Dandelions");
        Playlist.add("Imagination");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Reckless");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Mr Perfectly fine");

        // Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // Replace the last song using the set() method
        Playlist.set(5, "Happier");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
