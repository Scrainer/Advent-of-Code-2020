package puzzleSolutions;

import java.util.ArrayList;
import java.util.Iterator;

public class Part1 extends AbstractPuzzle{

	public Part1(ArrayList<Integer> puzzInput) {
		super(puzzInput);
	}
	
	@Override
	public Integer solvePuzzle() {
		Iterator<Integer> it1 = puzzleInput.iterator();
		Integer valueA = it1.next();
		while (it1.hasNext()) {
			Integer complementary = 2020-valueA;
			if (puzzleInput.contains(complementary)) {
				return valueA*complementary;
			}
			valueA=it1.next();
		}
		
		return solutionError;
	}

}
