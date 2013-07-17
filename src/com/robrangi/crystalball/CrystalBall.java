package com.robrangi.crystalball;

import java.util.Random;

public class CrystalBall {

	public String[] mAnswers = {
			"Don't count on it",
			"Outlook is not good",
			"Signs point to yes",
			"Cannot predict now",
			"Yes",
			"I'm thinking .. no",
			"Reply hazy, try again",
			"Very doubtful",
			"Outlook good",
			"The future is unclear",
			"Yes definitely",
			"Concentrate and ask again",
			"Without a doubt",
			"You may rely on it",
			"Most likely",
			"It is certain",
			"Now is not the time",
			"As I see it yes",
			"It is decidedly so",
			"My sources say no"
	};

	
	public String getAnAnswer() {
		
		Random randomGenerator = new Random();
		
		return mAnswers[randomGenerator.nextInt(mAnswers.length)];
	}
	
}
