package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	
	
	public static void main(String[] args) {
		List<String> adjectives = Arrays.asList("slimy","blind","white","black");
		List<String> nouns = Arrays.asList("pants","bones","bones","wings");
		 List<List<String>> totalList =  Arrays.asList(adjectives, nouns);
		int adj = new Random().nextInt(adjectives.size());
		int nou = new Random().nextInt(nouns.size());
			System.out.print(adjectives.get(adj) + " " + nouns.get(nou));
			}
		

	
		}
	
   

		
	





