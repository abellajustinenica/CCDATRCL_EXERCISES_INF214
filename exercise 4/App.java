import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Classlist = new LinkedList<>();

        // Enqueue 5 of your classmates in this section
        Classlist.add("Alliyah Almocera");
        Classlist.add("Idel Lawrence Aranilla");
        Classlist.add("Winna Jane Bablis");
        Classlist.add("Jap Bolanos");
        Classlist.add("Moses Christian Bantegui");

        System.out.println("The 5 students in the class list: " + Classlist);

        // Get size of the queue.
        System.out.println("The number of students in the class list: " + Classlist.size());

        // Get the front of the queue
        System.out.println("Student at the front of the queue: " + Classlist.peek());

        // Dequeue 5 of your classmates
        Classlist.remove();
        Classlist.remove();
        Classlist.remove();
        Classlist.remove();
        Classlist.remove();

        // Enqueue another 5 of your classmates
        Classlist.add("Richael Paller");
        Classlist.add("Jeremiah Pagarigan");
        Classlist.add("Ivan Guansing");
        Classlist.add("Jonnah Hermosura");
        Classlist.add("Kean John Dapitillo");

        System.out.println("The 5 new students added in the class list: " + Classlist);

        // Get size of the queue.
        System.out.println("The number of students in the class list: " + Classlist.size());

        // Get the front of the queue
        System.out.println("Student at the front of the queue: " + Classlist.peek());

    }
}
