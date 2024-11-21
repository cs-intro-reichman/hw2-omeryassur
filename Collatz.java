// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		int current = N;
		int counter=0;
		for (int i=0; i<N; i++) {
			counter=0;
			current= i+1;
		while (current!=1&&counter>1) {
		 if (current%2==0){
			 current=current/2;
			 System.out.print(current+ " ");
		}
			else{
			 current=current*3+1;
			 System.out.print(current+ " ");
		 }
		 counter++;
	 }
	 System.out.print(current+ " ");
	 System.out.println();
	}
	 System.out.println("Every one of the first "+ counter+ " hailstone sequences reached 1.");
 	}

 }
