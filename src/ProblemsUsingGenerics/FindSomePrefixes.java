package ProblemsUsingGenerics;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindSomePrefixes {
	//https://stackoverflow.com/questions/5545584/nifty-way-to-iterate-over-parallel-arrays-in-java-using-foreach
	
	static ArrayList<Character> arrayCharsSentence = new ArrayList<>();
		
	static public  String longestPrefix (ArrayList<String> A) {
		String longestPrefix = "";
		int minStringSize=0;
		for(String sentence : A) {
			minStringSize = sentence.length();
			if(sentence.length()<minStringSize) {
				minStringSize = sentence.length();
			}
		}
		for(String sentence : A) {
			
					ArrayList<Character> stringToCharacters = new ArrayList<>(
					sentence.chars()
	                .mapToObj(e -> (char) e)
	                .collect(
	                 Collectors.toList()
	                ));
					arrayCharsSentence.addAll(stringToCharacters);
			
		}
		while(minStringSize!=0) {
			
		}
		
			
		return longestPrefix;
		}
		
    public static void main (String args []) {
    		ArrayList<String> sup = new ArrayList<String>(){
    			{
    				add("hola");
    				add("queshow");
    				}
    			};
    	longestPrefix(sup);
    }

}
