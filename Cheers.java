// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word= args[0];
            word= word.toUpperCase();
            int times= Integer.parseInt(args[1]);
            String anLetters = "AEFHILMNORSX";
            for (int i=0; i<word.length(); i++) {
                char letter = word.charAt(i);
                String prefix;
                if(anLetters.indexOf(letter)!=-1) {
                        prefix= "an";
                }
                else{
                        prefix="a";
                }
                System.out.println("Give me "+ prefix+ " "+ letter+ ": "+ letter+ "!");
            }
            System.out.println("What does that spell?");
            for (int i=0; i<times; i++);{
                System.out.println(word+ "!!!");
            }
        }
}
