package dev.dougsykes.aoc2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 extends AOCPuzzle
{
	public Day01()
	{
		super("1");
	}

	@Override
	void solve(List<String> input)
	{
		List<Integer> calories = convertToInts(input);

		//PART 1
		int currentMax = 0;
		int totalcalories = 0;
		List<Integer> elfTotals = new ArrayList<Integer>();
		for(int i = 1; i < calories.size(); i++) {
			if(calories.get(i) > 0 ) {
				totalcalories += calories.get(i);
			} else {
				if (totalcalories > currentMax) {
					currentMax = totalcalories;
				}
			    elfTotals.add(totalcalories);
				totalcalories = 0;
			}	
		}
		System.out.println("Top Elf : " + currentMax);
		//PART 2
		int topThree = 0;
		Collections.sort(elfTotals);
		Collections.reverse(elfTotals);
		for (int x = 0; x < 3; x++) {
			topThree += elfTotals.get(x);
		}
		System.out.println("Top Three : " + topThree);	
	}
}