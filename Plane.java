
public class Plane {
     
	 private boolean[] seats = new boolean[10];
     private int seat;
       
     public Plane() {
    	      
     }
     
	 public void findSeats1() {
		 seat = 11;   
			 for (int i = 0; i<5; i++) {
		    		if (!(seats[i])) {
		    		   seats[i] = true;
		    		   seat = i;
		    		   break;	    
		            }
		    	}  		
			 if (seat == 11) {
		    	 System.out.println("Sorry, no seats left ):\nThe next flight leaves in 3 hours.");
	        }
	 }		 
			 
	 public void findSeats2()	{
	      for ( int i = 5; i<10; i++) {
		    		if (!(seats[i])) {
		    		   seats[i] = true;
		    		   seat  = i;
		         	   break;  
		            }
		 
	      }
          if (seat == 11) {
    	      System.out.println("Sorry, no seats left ):\nThe next flight leaves in 3 hours.");
          }
	 }		 

public void getSeats() {
     if (seat != 11) {
	    System.out.printf("Your seat number is: %d, Safe Travels!\n", seat+1);
      }

 }
}