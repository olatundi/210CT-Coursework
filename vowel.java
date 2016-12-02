public class vowel {
	/**  
	 * Removes all vocals from a given string
	 * */
	public static String vowelRemover(String word){
		if (word.equals("")){																			//Check if the string is empty
			System.out.println("Please enter a word");
			return "";																					
		}
		
		char index = word.charAt(0);																	//Select the character to be checked
		if (index == 'a' || index == 'e' || index == 'i'
		   || index == 'o' || index == 'u' || index == 'A' || index == 'E' 
		   || index == 'I'|| index == 'O' || index == 'U'){
			return vowelRemover(word.substring(1));														//Select the rest of the word to be checked
		}
		else{
			return index+ vowelRemover(word.substring(1));												//Add the char then check the rest of the word
		}
	}
	
	public static void main(String[] args) {
		System.out.println(vowelRemover("beautiful"));
	}
}
