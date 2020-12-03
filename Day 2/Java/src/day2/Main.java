package day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import puzzleSolutions.*;

public class Main {
	 public static void main(String[] args) {
		 ArrayList<String> passwordInput = new ArrayList<String>();
		 try {
			 FileInputStream fis=new FileInputStream("./resources/input.txt");       
			 Scanner sc=new Scanner(fis);    //file to be scanned  
			 while(sc.hasNextLine()) {
				 passwordInput.add(sc.nextLine());
			 }
			 sc.close();
		 }
		 catch(IOException e){  
		 e.printStackTrace();
		 }
		 //System.out.println(passwordInput);
		 System.out.println("Part 1 - Answer:");
		 Part1 sol1 = new Part1(passwordInput);
		 System.out.println(sol1.solvePuzzle());
		 System.out.println("----------------");
		 System.out.println("Part 2 - Answer:");
		 Part2 sol2 = new Part2(passwordInput);
		 System.out.println(sol2.solvePuzzle());
	 }
}
