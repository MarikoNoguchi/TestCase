package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.Test;


public class SnakecamelTest {

	@Test
	public void test() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected  = "HopStepJump";
		String actual = sc.snakeToCamelcase("hop_step_jump");
		assertThat(actual, is(expected));
	}
	
	
	@Test
	public void スネイクからキャメルに() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected  = "i_thank_lucky_stars";
		String actual = sc.camelToSnakecase("IThankLuckyStars");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void 全て小文字に() {
	SnakeCamelUtil sc = new SnakeCamelUtil();
	String expected  = "Apple";
	String actual = sc.capitalize("apple");
	assertThat(actual, is(expected));
}
	
	@Test
	public void 先頭を大文字に() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected  = "bread";
		String actual = sc.uncapitalize("Bread");
		assertThat(actual, is(expected));
	}

}
