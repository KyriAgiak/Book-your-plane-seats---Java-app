import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		String ans = "0";
		Plane client = new Plane();
		do {   
		    System.out.println("Welcome, please enter '1' for business class or '2' for economy class:");
		    Scanner sc = new Scanner(System.in);
		    int input = sc.nextInt();
           
           if (input == 1) {
               client.findSeats1();
           }else {
               client.findSeats2();
           }
               client.getSeats();
           
           
           System.out.println("Would you like to book another seat?\n(Enter 'yes' or 'no')");
           
		  ans = sc.next();
		  
		} while (ans.equals("yes"));
        
	}

}