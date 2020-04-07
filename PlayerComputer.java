package gra.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PlayerComputer extends Player {

	List<Integer> possibleFields = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

	GameRunner gameRunner = new GameRunner();

	public void changeFieldValue(int value) {

		if (possibleFields.contains(value)) {
			int toRemove = 100;
			for (int i = 0; i < possibleFields.size(); i++) {
				if (possibleFields.get(i) == value) {
					toRemove = i;
				}
			}
			System.out.println("--" + toRemove);
			if (toRemove != 100) {
				possibleFields.remove(toRemove);
			} else {

			}
		} else {

		}
	}

	public int computerMove(int index) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(possibleFields.size() - 1);

		int result = possibleFields.get(randomNumber);
		possibleFields.remove(randomNumber);

		return result;
	}

	@Override
	public void reset() {
		super.reset();

		possibleFields = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

}