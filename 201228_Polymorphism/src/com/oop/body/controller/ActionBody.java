package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	
	public static final int MAX_LENGTH = 5;
	
	public static void main(String[] args) {
		//신체부위별 객체를 담을 수 있는 Body타입의 객체배열[5] 생성.
		Body[] bodyArr = new Body[MAX_LENGTH];
		
		
		//임의의 신체객체를 각 인덱스별로 담는다.
		bodyArr[0] = new Head("갈색");
		bodyArr[1] = new Arm();
		bodyArr[2] = new Arm();
		bodyArr[3] = new Leg();
		bodyArr[4] = new Leg();
		
		//반복문을 통해서 각 객체별 고유메소드를 실행하세요.
		for(Body b : bodyArr)
			b.Action();
	}
	
}      
