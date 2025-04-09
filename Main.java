// public class Main {
//     public static void main(String[] args) {
//         double celsius = 25;
//         double fahrenheit = (celsius * 9 / 5 ) + 32;
//         System.out.println(celsius+"C is"+ fahrenheit+"F");
    // }}
    public class Main {
         public static void main(String[] args) {
         int secretNumber = 42;
         int guess = 50;
         int attempts = 0;
    
         while (guess != secretNumber) {
         attempts++;
        if (guess > secretNumber) {
         System.out.println("Guess " + guess + ": Too high");
         guess -= 1;
        
         } else {
         System.out.println("Guess " + guess + ": Too low");
         guess += 1;
         }
         }
         attempts++;
     System.out.println("Guess " + guess + ": Correct!");
         System.out.println("You won in " + attempts + " attempts!");
         }
         }
        
        
    
    