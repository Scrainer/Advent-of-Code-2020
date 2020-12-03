package puzzleSolutions;

import java.util.ArrayList;
import java.util.Iterator;

public class Part2 extends AbstractPuzzle{

	public Part2(ArrayList<String> puzzInput) {
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
			policyRange[0]=Integer.parseInt(policy[0].split("-")[0])-1;
			policyRange[1]=Integer.parseInt(policy[0].split("-")[1])-1;
			String policyChar = policy[1];
			if ((Character.toString(password.charAt(policyRange[0])).equals(policyChar) && !Character.toString(password.charAt(policyRange[1])).equals(policyChar))||(!Character.toString(password.charAt(policyRange[0])).equals(policyChar) && Character.toString(password.charAt(policyRange[1])).equals(policyChar))) {
				numValid++;
			}
		}
		return numValid;
	}

}
