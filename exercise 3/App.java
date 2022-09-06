// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack box_stack = new Stack(5);
  
      // Insert new elements into the stack
      box_stack.push("White Box");
      box_stack.push("Red Box");
      box_stack.push("Orange Box");
      box_stack.push("Brown Box");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + box_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + box_stack.peek());
  
      // Remove top element in the stack
      box_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      box_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + box_stack.peek());
    }
  }
