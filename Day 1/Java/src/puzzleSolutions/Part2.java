package puzzleSolutions;

import java.util.ArrayList;
import java.util.Iterator;

public class Part2 extends AbstractPuzzle{

	public Part2(ArrayList<Integer> puzzInput) {
		super(puzzInput);
	}
	
	@Override
	public Integer solvePuzzle() {
		Iterator<Integer> it1 = puzzleInput.iterator();
		Integer valueA = it1.next();
		while (it1.hasNext()) {
			Iterator<Integer> it2 = puzzleInput.iterator();
			Integer valueB = it2.next();
			while(it2.hasNext()) {
				Integer complementary = 2020-(valueA+valueB);
				if (puzzleInput.contains(complementary)) {
					return valueA*valueB*complementary;
				}
				valueB=it2.next();
			}
			valueA=it1.next();
		}
		
		return solutionError;
	}

}
