package day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import puzzleSolutions.*;

public class Main {
	 public static void main(String[] args) {
		 ArrayList<Integer> numberInput = new ArrayList<Integer>();
		 try {
			 FileInputStream fis=new FileInputStream("./resources/input.txt");       
			 Scanner sc=new Scanner(fis);    //file to be scanned  
			 while(sc.hasNextInt()) {
				 numberInput.add(sc.nextInt());
			 }
			 sc.close();
		 }
		 catch(IOException e){  
		 e.printStackTrace();
		 }
		 //System.out.println(numberInput);
		 System.out.println("Part 1 - Answer:");
		 Part1 sol1 = new Part1(numberInput);
		 System.out.println(sol1.solvePuzzle());
		 System.out.println("----------------");
		 System.out.println("Part 2 - Answer:");
		 Part2 sol2 = new Part2(numberInput);
		 System.out.println(sol2.solvePuzzle());
	 }
}
