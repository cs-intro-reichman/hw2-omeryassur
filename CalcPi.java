// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int number = Integer.parseInt(args[0]);
		double denominator = 1;
		double fraction;
		double pi=1;
		for (int i=0; i<number; i++)
		{
			if (i%2==0) {
				fraction= (1/denominator);
				pi=fraction;
			}
			else
			{
				fraction=(1/denominator);
				pi+= fraction;
			}
			denominator+=2;
		}
		pi*=4.0;
		System.out.println("pi according to Java: "+ Math.PI);
		System.out.println("pi, approximated:       "+ pi);
	}
}
