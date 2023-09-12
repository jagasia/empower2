package com.empower.hrms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathematicsTest {
	Mathematics aut=new Mathematics();
	int no1, no2;
	float expectedResult;
	
	public MathematicsTest(int no1, int no2, float expectedResult) {
		this.no1=no1;
		this.no2=no2;
		this.expectedResult=expectedResult;
	}

	@Parameterized.Parameters
	public static Collection anything()
	{
		return Arrays.asList(new Object[][] {
			 { 2, 3, 5 },
	         { 6, 3, 9 },
	         { 19, 1, 20 },
	         { 22, 1, 23 },
	         { 23, 1, 24 },
	         {1,2,3},
	         { 2, 11, 13 },
	         { 21, 1, 22 }
		});
	}
	
	
	@Test
	public void testSum()
	{
		aut.setNo1(no1);
		aut.setNo2(no2);
		aut.sum();
		float result = aut.getResult();
		assertEquals(expectedResult, result);
	}
	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	

//	@Test
//	@Category(Admin.class)
//	public void testAdd() {
//		aut.setNo1(2);
//		aut.setNo2(3);
//		aut.sum();
//		
//		assertEquals(5, aut.getResult());
//	}
//
//	@Test
////	@Ignore
//	@Category(User.class)
//	public void testSubtract() {
//		aut.setNo1(2);
//		aut.setNo2(3);
//		aut.difference();
//		assertEquals(1, aut.getResult());
//	}
//
//	@Test
//	@Category({Admin.class,User.class})
//	public void testProduct() {
//		aut.setNo1(2);
//		aut.setNo2(3);
//		aut.product();
//		assertEquals(6, aut.getResult());
//	}
	

}
