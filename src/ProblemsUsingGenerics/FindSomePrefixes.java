package ProblemsUsingGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class FindSomePrefixes {
	
	class iteratorHelper implements Iterator{
		String A;
		public iteratorHelper(String A) {
			this.A = A;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			ArrayList<Character> arrayCharsSentence = new ArrayList<>(
	                 A.chars()
	                 .mapToObj(e -> (char) e)
	                 .collect(
	                  Collectors.toList()
	                 )
	         );
			boolean hasNext = false;
			for(String sentence : listOfchars) {
				 
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
		
	public  String longestPrefix (ArrayList<String> A) {
		String longestPrefix = "";
		int minStringSize=0;
		for(String sentence : A) {
			minStringSize = sentence.length();
			if(sentence.length()<minStringSize) {
				minStringSize = sentence.length();
			}
		}
		for(String sentence : A) {
			
		}
		while(minStringSize!=0) {
			
		}
		
			
		return longestPrefix;
		}
		

}
