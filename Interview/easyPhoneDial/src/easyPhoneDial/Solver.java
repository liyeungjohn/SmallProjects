package easyPhoneDial;

import java.util.ArrayList;

public class Solver {
	
	public static void main(String[] args){
		System.out.println("sfsd".split("")[1]);
	}
	
	public static boolean isEasyDialing(String input){
		ArrayList<Integer> numbers = parseInput(input);
		boolean result = true;
		int prev = numbers.get(0);
		int next = numbers.get(1);
		for(int i = 1; i < numbers.size() - 1; i ++){
			result = isNeighbor(prev, next) && result;
			prev = next;
			next = numbers.get(i + 1);
		}
		return result;
	}
	
	public static boolean isNeighbor(int prev, int next){
		int [] prevCoord = getCoordinates(prev);
		int [] nextCoord = getCoordinates(next);
		return Math.abs(prevCoord[0] - nextCoord[0]) <= 1 && Math.abs(prevCoord[1] - nextCoord[1]) <= 1;
	}
	
	public static ArrayList<Integer> parseInput(String input){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < input.length(); i ++){
			numbers.add(Integer.parseInt(input.substring(i, i + 1)));
		}
		return numbers;
	}
	
	public static int[] getCoordinates(int number){
		if(number == 0){
			number = 10;
		} else{
			number --;
		}
		int x = number % 3;
		int y = number / 3;
		return new int[]{x,y};
	}
	
	
	
}
