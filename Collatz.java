
public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        for (int seed = 1; seed <= N; seed++) {
            int n = seed;        
            int steps = 1;        
            String sequence = ""; 
            if (mode.equals("v")) {
                sequence += n + " "; 
            }
            do {
                if (n % 2 == 0) {
                    n = n / 2;        
                } else {
                    n = 3 * n + 1;    
                }
                steps++;             
                if (mode.equals("v")) {
                    sequence += n + " ";
                }
            } while (n != 1);     
            if (mode.equals("v")) {
                sequence += "(" + steps + ")";
                System.out.println(sequence);
            }
        }
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
