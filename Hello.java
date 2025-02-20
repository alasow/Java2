public class Hello {

    /* This is my first java program.
     * This will print 'Hello, World!' as the output
     */
 
    public static void main(String []args) {
       System.out.println("Hello, Alasow!"); // prints Hello, World!
       // Creating objects of other classes
       FirstClass first = new FirstClass();
       SecondClass second = new SecondClass();

       // Calling methods from both classes
       first.displayFirstMessage();
       second.displaySecondMessage();
    }
    
 }

 // First additional class
class FirstClass {
   public void displayFirstMessage() {
       System.out.println("Hello from FirstClass!");
   }
}

// Second additional class
class SecondClass {
   public void displaySecondMessage() {
       System.out.println("Hello from SecondClass!");
   }
}