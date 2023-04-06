
public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*
    Multiple lines as 
    comments. This is 
    how i do that..
    */
   
    char grade = 'C';
    String firstName = "George";
    int age = 47;
    // 12.6 mph
    double windSpeed = 12.7; 
    
    System.out.println(firstName);
    System.out.println(windSpeed);
    
    System.out.println("My name is: " + firstName);
    System.out.println("I am " + age + " years young.\n" + 
                      "The wind is blowing at " + windSpeed);
        
    // if a number is even or odd
    double average = 10.0/4;
    System.out.println(average);
    
    // modulus operator
    double remainder = 10.0 % 4;
    System.out.println("The remainder is: " + remainder);
    
    double costOfGroceries = 2.15; 
    costOfGroceries = costOfGroceries + 2.15;
    System.out.println(costOfGroceries);
    
    int seatsAvaliable = 4;
    System.out.println("Avaliable plane seats left on a flight " + seatsAvaliable);
    
    int clients = 120;
    System.out.println("clients:" + clients);
    
  }

}
