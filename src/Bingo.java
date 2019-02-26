import java.util.*;
import java.util.concurrent.TimeUnit;

public class Bingo {
	// Variables
	private static Random rand = new Random(); // ???
	private static LinkedHashMap<Integer, Boolean> letrB = new LinkedHashMap<Integer, Boolean>();
	private static LinkedHashMap<Integer, Boolean> letrI = new LinkedHashMap<Integer, Boolean>();
	private static LinkedHashMap<Integer, Boolean> letrN = new LinkedHashMap<Integer, Boolean>();
	private static LinkedHashMap<Integer, Boolean> letrG = new LinkedHashMap<Integer, Boolean>();
	private static LinkedHashMap<Integer, Boolean> letrO = new LinkedHashMap<Integer, Boolean>();

	public static void main(String[] args) throws InterruptedException { // ???
		// Variables
		ArrayList<Integer> list = new ArrayList<Integer>();
		int randomInt;

		// key, val. kay=id=uniqe
		generateCard();
		System.out.println(letrB.toString());
		System.out.println(letrI.toString());
		System.out.println(letrN.toString());
		System.out.println(letrG.toString());
		System.out.println(letrO.toString());
		System.out.println();

		// Calling the numbers
		for (int x = 1; x < 20; x++) {
			randomInt = generateBallNum();
			if (!list.contains(randomInt)) {
				if (list.size() == 5)// Shift right, while keeping 5 nums
					list.remove(0);
				list.add(randomInt);
				System.out.println(list.toString());
				//check each column(row)
				if(letrB.containsKey(randomInt)) {
					letrB.put(randomInt, true);
				}
				if(letrI.containsKey(randomInt)) {
					letrI.put(randomInt, true);
				}
				if(letrN.containsKey(randomInt)) {
					letrN.put(randomInt, true);
				}
				if(letrG.containsKey(randomInt)) {
					letrG.put(randomInt, true);
				}
				if(letrO.containsKey(randomInt)) {
					letrO.put(randomInt, true);
				}
			
				//TimeUnit.SECONDS.sleep(1);
			} else
				continue; //?
		}
		System.out.println();
		System.out.println(letrB.toString());
		System.out.println(letrI.toString());
		System.out.println(letrN.toString());
		System.out.println(letrG.toString());
		System.out.println(letrO.toString());

	}

	public static int generateBallNum() { // ???
		return rand.nextInt(76) + 1;
	}

	public static void generateCard() {
		int randomKey = 0;

		// Letter B
		while (letrB.size() < 5) {
			randomKey = rand.nextInt(15) + 1;
			if (!letrB.containsKey(randomKey)) {
				letrB.put(randomKey, false);// Initially it's false because not marked
			}
		}
		// Letter I
		while (letrI.size() < 5) {
			randomKey = rand.nextInt(15) + 16;
			if (!letrI.containsKey(randomKey)) {
				letrI.put(randomKey, false);// Initially it's false because not marked
			}
		}
		// Letter N
		while (letrN.size() < 5) {
			randomKey = rand.nextInt(15) + 31;
			if (!letrN.containsKey(randomKey)) {
				letrN.put(randomKey, false);// Initially it's false because not marked
			}
		}
		// Letter G
		while (letrG.size() < 5) {
			randomKey = rand.nextInt(15) + 46;
			if (!letrG.containsKey(randomKey)) {
				letrG.put(randomKey, false);// Initially it's false because not marked
			}
		}
		// Letter O
		while (letrO.size() < 5) {
			randomKey = rand.nextInt(15) + 61;
			if (!letrO.containsKey(randomKey)) {
				letrO.put(randomKey, false);// Initially it's false because not marked
			}
		}
	}

}
