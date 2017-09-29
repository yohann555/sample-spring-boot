package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void myTest(){
assertTrue(true);
}

	@Test
	public void additionner_should_give_a_number_with_two_intergers()throws Exception {
Integer result = DemoApplication.additionner(1,2);
Integer expected = 3;

if (result==expected){
assertTrue(true);
}
else {
assertTrue(false);
}
}

}
