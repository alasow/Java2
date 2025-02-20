public class Hello {

    /* This is my first java program.
     * This will print 'Hello, World!' as the output
     */
 
    public static void main(String []args) {
       System.out.println("Hello, Alasow!"); // prints Hello, World!
       // Creating objects of other classes
       Students std = new Students();
       Developers dw = new Developers();

       // Calling methods from both classes
       std.displayFirstMessage();
       dw.displaySecondMessage();
    }
    
 }

 // First additional class
class Students {
   public void displayFirstMessage() {
       System.out.println("Hello from Student Class!");
   }
}

// Second additional class
class Developers {
   public void displaySecondMessage() {
       System.out.println("Hello from Developer Class!");
   }
}