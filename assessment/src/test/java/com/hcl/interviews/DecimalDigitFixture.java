package com.hcl.interviews;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Test;
import static com.hcl.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;


public class DecimalDigitFixture {

	private int inp;

	@Test
	public void decimalDigitAcceptanceTests() throws Exception {
		aBehaviouralTestRunner()
		.usingStepsFrom(this)
		.withStory("decimal-digit.story")
		.run();
	}

	@When("the input is $inp")
	public void whenTheInputIs(int inp) {

	}

	@Then("the output should look like $")
	public void thenOutputShouldLookLike(String theExpectedOutput) {

	}
	public static void main(String[] args) {
		if(true)System.out.println("hello");
			try{
				System.out.println("test");
			}catch(Exception e){
				
			}
	}
}