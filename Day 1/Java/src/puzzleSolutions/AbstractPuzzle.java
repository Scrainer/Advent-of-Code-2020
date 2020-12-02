package puzzleSolutions;

import java.util.ArrayList;

public abstract class AbstractPuzzle {
	protected final ArrayList<Integer> puzzleInput;
	protected final Integer solutionError = -1;

	public AbstractPuzzle(ArrayList<Integer> puzzInput) {
		this.puzzleInput = puzzInput;
		
	}
	
	public ArrayList<Integer> getPuzzleInput() {
		return puzzleInput;
	}
	
	public Integer solvePuzzle() {
		return solutionError;
	}
}
