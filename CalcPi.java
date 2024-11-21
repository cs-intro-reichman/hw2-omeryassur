// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
int number = Integer.parseInt(args[0]);
double denominator = 1;
double frcation;
double pi = 0;
for (int i = 0; i<number; i++) 
	{
		if (i%2==0){
			frcation= (1/denominator);
			pi+= frcation;
		}
		else
		{
			frcation= (1/denominator);
			pi-= frcation;
		}
		denominator+= 2;
	}
	pi*=4;
	System.out.println("pi according to Java:"+ Math.PI);
	System.out.println("pi, approximated:          "+ pi);




	}
}
