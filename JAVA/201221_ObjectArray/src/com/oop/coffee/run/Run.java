package com.oop.coffee.run;

import com.oop.coffee.controller.CoffeeManager;
/**
 *    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
 *
 */

public class Run {

	public static void main(String[] args) {
		CoffeeManager cm = new CoffeeManager();
		cm.inputCoffee();
		System.out.println("<세계3대커피>\n" + 
				"---------------------------\n" + 
				"원산지           지역\n" + 
				"---------------------------");
		cm.outputCoffee();

	}

}