import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class WordsFrequencies {
	
	public static boolean isContains(String word, ArrayList list) {
		for (int i = 0; i < list.size(); i++){
			if (word.equals(list.get(i))) {
				return true;
			}
		}
		return false;
	}

	public static void main (String[] args) throws FileNotFoundException {
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> uniqueWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("D:\\Programming\\Code\\Assignment 3\\song.txt"));

		String newWord = "";
		while (input.hasNext()) {
			newWord = input.next();
			words.add(newWord);
		}

		
		for (int i = 0; i < words.size(); i++) {
			if (isContains(words.get(i), uniqueWords) != true) {
				uniqueWords.add(words.get(i));
			}
		}

		int count;
		for (int i = 0; i < uniqueWords.size(); i++) {
			count = 0;
			for (int j = 0; j < words.size(); j++) {
				if (uniqueWords.get(i).equals(words.get(j))){
					count++;
				}
			}
			System.out.println(count + ": " + uniqueWords.get(i));
		}

		/*for (String i : uniqueWords) {
			System.out.print(i + " ");
		}*/	
	}
}