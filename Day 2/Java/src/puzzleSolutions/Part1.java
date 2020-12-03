package puzzleSolutions;

import java.util.ArrayList;
import java.util.Iterator;

public class Part1 extends AbstractPuzzle{

	public Part1(ArrayList<String> puzzInput) {
		super(puzzInput);
	}
	
	@Override
	public Integer solvePuzzle(){
		Integer numValid = 0;
		Iterator<String> it1 = puzzleInput.iterator();
		while (it1.hasNext()) {
			String passInput = it1.next();
			String[] arr = passInput.split(": ");
			String password = arr[1];
			String[] policy = arr[0].split(" ");
			Integer[] policyRange = new Integer [2];
			policyRange[0]=Integer.parseInt(policy[0].split("-")[0]);
			policyRange[1]=Integer.parseInt(policy[0].split("-")[1]);
			String policyChar = policy[1];
			int count = 0;
			for (int i=0;i<password.length();i++) {
				if (Character.toString(password.charAt(i)).equals(policyChar)) {
					count++;
				}
			}
			if (count>=policyRange[0] && count<=policyRange[1]) {
				numValid++;
			}
		}
		return numValid;
	}

}
