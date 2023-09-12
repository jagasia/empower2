package com.empower.hrms;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class MathematicsTest2 {
	Mathematics aut=new Mathematics();
	

	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Category(Admin.class)
	public void testAdd() {
		aut.setNo1(2);
		aut.setNo2(3);
		aut.sum();
		
		assertEquals(5, aut.getResult());
	}

	@Test
	@Category(User.class)
	public void testSubtract() {
		aut.setNo1(2);
		aut.setNo2(3);
		aut.difference();
		assertEquals(1, aut.getResult());
	}

	@Test
	@Category(User.class)
	public void testProduct() {
		aut.setNo1(2);
		aut.setNo2(3);
		aut.product();
		assertEquals(6, aut.getResult());
	}
	

}
