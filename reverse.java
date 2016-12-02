public class reverse {
	/**  
	 * Reverses the words in a sentence
	 * */	
	public static String sentenceReverser (String sentence) {
		if (sentence.length() == 0){
			return "There is no string to return. Please enter a sentence.";
		}
		int index = sentence.indexOf(" ");										 							//Find the index of the first occurrence of whitespace
		if (index < 0) {  														 							//Base case called when index is -1
			return sentence; 																				/*If no whitespace found, there must be only a word, 
																											therefore, sentence, the word is returned*/
		} 
		else {   																							/*First return recursively, the reversed rest of the sentence, 
																											then a single whitespace and the first word*/
			return sentenceReverser(sentence.substring(index + 1)) + " " + sentence.substring(0, index); 
		}   
	}
	
	public static void main(String[] args) {
		System.out.println(sentenceReverser("This not awesome"));
	}
}
