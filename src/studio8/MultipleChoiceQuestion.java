package studio8;

public class MultipleChoiceQuestion extends Question {
	
	protected String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		
		//Call the super class constructor, then create and set
		super(prompt, answer, points);
		//instance variables for any values that aren't handled
		//by the base class
		this.choices = choices;
	}
	
	public void displayPrompt() {
		//FIXME
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
		
		super.displayPrompt();
		for (int i = 1; i < this.choices.length+1; i = i + 1) {
			System.out.println(i + ". " + choices[i-1]);
		}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
