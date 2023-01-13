/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int i = 0; i <= 25; i++){
		String letter = letters.substring(i,i+1);
		int count = 0;
		for (int a = 0; a < phrase.length(); a++){
			String lett = phrase.substring(a, a+1);
			if (letter.equals(lett)){
				count = count + 1;
				

			}
		}
		System.out.println("there is " + count + " " + letter + " in this phrase. ");
			
		
	}
	

	}
}
