package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Actor;

public class ActorController {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("s.xml");

	 Actor ob=(Actor)	context.getBean("a");
	 System.out.println(ob.getActorId()+ob.getActorName()+ob.getMovie().getMovieName());
	}

}
