import java.util.*;
public class project1 {
	/////////////////////////// METHODS HERE //////////////////////////////
	
	
	////Method for counting different numbers in an array////
	static int countDifferentNumbs(int Array1[], int n)
	{
	    int result = 1; //set result to one which is a counter 
	 
	    // Pick all elements one by one
	    for (int i = 1; i < n; i++)
	    {
	        int j = 0;
	        for (j = 0; j < i; j++) {
	            if (Array1[i] == Array1[j]) { 
	                break;
	            }
	        }
	        if (i == j) {
	        	result++;
	        }
	            
	            }
	    return result;
	}
	
	////Method for finding the second smallest number in an array////
		public static int getSecondSmallest(int Array1[] , int n){  
		Arrays.sort(Array1);  //we sort the array that we created
		int smallnumb=0;
		for (int i=0; i<n-1;i++) {
			if (Array1[i]==Array1[i+1]) {          //we check for same numbers at next to each other 
				continue;   // we continue this process as long as there are same numbers next to each other 
			}else {
				smallnumb=Array1[i+1]; // this else is added to print out the first number that is not the same as the previous since we sorted it out  
				break; // loop stops when we find the number 
			}
		}
		return smallnumb;   //and we return the number in the second position or index
		}  
		
		
	///////////////////////// MAIN MAIN MAIN /////////////////////////////////////////////////
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of array: ");
		int n = scan.nextInt();
		System.out.println("Please enter the elements: ");
		int [] Array1 = new int[n];
		 
		
		/////////////NUMBER OF ELEMENTS//////////////// 
		for (int i=0; i<n; i++) {
			Array1[i]=scan.nextInt();
		}
		
		System.out.println("The number of elements is: " + n );
		
		//////////////////////NUMBER OF DIFFERENT NUMBERS//////////////////////////////// 
		System.out.println("The number of different numbers is "+ countDifferentNumbs(Array1, n));
		
		//////////////////////EVEN NUMBERS////////////////////////////////////// 
		int counter1=0;
		for (int i=0; i<n; i++){
			if (Array1[i]%2==0) {
				counter1++;
			}
			
			
		}
		System.out.println("The number of even numbers is:"+counter1);
		////////////////////////////////ODD NUMBERS///////////////////////////////////////// 
		int counter2=0;
		for (int i=0; i<n; i++){
			if (Array1[i]%2!=0) {
				counter2++;
			}
			
			
		}
		System.out.println("The number of odd numbers is:"+counter2);
		///////////////////////////////////LARGEST NUMBER/////////////////////////////////////////////
		int max=Array1[0];
		for (int i=1; i<n; i++) {
			if (Array1[i]>max) {
				max=Array1[i];
			}
		}
		System.out.println("The maximum is: "+ max);
		
		
		//////////////////////////////////SECOND SMALLEST NUMBER////////////////////////////////// 
		
		System.out.println("The second smallest number is: "+getSecondSmallest(Array1,n)); 
		
		//////////////////////////// FREQUENCY IN % //////////////////////////////////////////////
		
			double percent= (double)100 /n ;
			double percent1 = percent; //creating a copy to use later 
			for (int i =0; i<n; i++) {
				if (i+1 == n) {
					System.out.println("Number: "+ Array1[i]+ " with frequency " + percent1+"%.");	
					break;
				}
				if (Array1[i] == Array1[i+1]) {
					percent1+=percent;	
					continue;
				}
					System.out.println("Number: "+ Array1[i]+ " with frequency " + percent1+"%.");
					percent1 = percent;
					
			}
		
		
	         //////////////////THE NUMBER WITH MAXIMUM OCCURRENCE///////////////
			int maxx=0;
			int ele=0;
			for (int i=0; i<n; i++) {
				int repeatNumber=1;
		            for (int j = 0; j < n; j++) { 
		                if (Array1[i] == Array1[j] && i!=j) {  
		                	 repeatNumber++; 
		                }// end if 2 
				
			    if (maxx<repeatNumber) {
	        	 maxx=repeatNumber;
	        	 ele=Array1[i]; 
	         }//end if 3 
		            }//end for 2
				    }//end for 1
			System.out.println("The number with maximum occurrence is: "+ ele+ " with repetition of: " + maxx);
		////////////////////////AVERAGE/////////////////////////
		int sumavg=0;
		double avgg=0;
		for(int i=0;i<n;i++) 
		{
			sumavg+=Array1[i];
		}
		avgg=(double)sumavg/n;
	       	System.out.println("The average of the given numbers is: "+avgg);
		//////////////////Deviation////////////////
	       	//meaning of standard deviation: how spread out a set of data is  
	       	//formula is sqrt of sum of (avg minus for each element)^2 /(n-1) 
	       	
	    double sum1=0;
	    for (int i=0; i<n; i++) {
	    	sum1+=Math.pow(Array1[i]- avgg, 2);
	    }
	    double deviation = Math.sqrt(sum1/(n));
	    System.out.println("The standard deviation of the given numbers is: "+ (float)deviation);
	    
	    //////////////////////MEDIAN////////////////////////////////////
	    Arrays.sort(Array1);
	    double median;
	    int middle = (n / 2);
	    if(n % 2 == 0){
	    	//if array is even 
	     int medianA = Array1[middle]; 
	     int medianB = Array1[middle-1];
	     median = (double)(medianA + medianB) / 2;
	     System.out.println("The median is: "+median);
	    } else{
	    	//if array is odd
	    	
	     median = Array1[middle];
	     System.out.println("The median is: "+median);
	    }
	    
	    /////////////////////////SUM/////////////////////////////
	    long allsum=0;
	    for(int i=0;i<n;i++) 
		{
			 allsum = allsum+Array1[i];
		}
	    System.out.println("The sum of the array is: "+allsum);
	    
	    ///////////////////Reversed Array/////////////////////////////
	  
	    System.out.println("The reversed array: ");
	    for (int i=n-1; i>=0; i--) {
	    	
	    	if (i==0){
	    	System.out.print(Array1[i]);
	    	}
	    	else {
			System.out.print(Array1[i]+ ",");
	    }
		
	    
	}

	   // System.out.println(PalindromeChecker(123));
	    System.out.println();
	    
	    /////////////////The number of palindromes //////////////////////
	    
	   int counter111=0;
        for (int i=0; i<Array1.length; i++) {
            if (Array1[i] == reverse(Array1[i])) {
                counter111++;
            }
        }
        System.out.println("Number of palindromes is: " + counter111);
        System.out.println("The biggest palindrome that is smaller than the biggest number: " + palindrome(Array1));
}//END MAIN 
	 public static int reverse (int a){
	        int reverse = 0;
	        while (a > 0) {
	            int d = a % 10;
	            reverse = reverse * 10 + d;
	            a = a / 10;
	        }
	        return reverse;
	    }
	 
	 public static int palindrome (int[] Array1) {
		 Arrays.sort(Array1);
		 int maxxi=0;
		for (int i= Array1.length-2; i>=0; i--) {
			if (Array1[i] == reverse(Array1[i]) && Array1[i] != Array1[Array1.length -1]) {
				maxxi=Array1[i];
				break;
			}
		}
		return maxxi;
	 }
}//END CLASS
