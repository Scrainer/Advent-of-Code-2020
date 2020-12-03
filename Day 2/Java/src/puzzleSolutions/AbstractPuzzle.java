package puzzleSolutions;

import java.util.ArrayList;

public abstract class AbstractPuzzle {
	protected final ArrayList<String> puzzleInput;
	protected final Integer solutionError = -1;

	public AbstractPuzzle(ArrayList<String> puzzInput) {
		this.puzzleInput = puzzInput;
		
	}
	
	public ArrayList<String> getPuzzleInput() {
		return puzzleInput;
	}
	
	public Integer solvePuzzle() {
		return solutionError;
	}
}
