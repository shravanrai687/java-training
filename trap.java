package day2;

public abstract class trap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 4
				 
				 
				 
				 ; 
	        int space; 
	  
	        int i, j, lterm, rterm; 
	  
	        lterm = 1; // The terms on the LHS of the pattern 
	  
	        // The terms on the RHS of the pattern 
	        rterm = num * num + 1;  
	  
	        for (i = num; i > 0; i--) { 
	  
	            // To print number of spaces  
	            for (space = num; space > i; space--)          
	                System.out.print(" "); 
	  
	            for (j = 1; j <= i; j++) { 
	                System.out.print(lterm); 
	                System.out.print("*"); 
	                lterm++; 
	            } 
	            for (j = 1; j <= i; j++) { 
	                System.out.print(rterm); 
	                if (j < i) 
	                    System.out.print("*"); 
	                rterm++; 
	            } 
	  
	            // To get the next term on RHS of the Pattern 
	            rterm = rterm - (i - 1) * 2 - 1;  
	            System.out.println(); 
	        } }
}
