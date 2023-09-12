package com.empower.hrms;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({MathematicsTest.class, MathematicsTest2.class})
@Categories.IncludeCategory(User.class)
public class MySuite {
	
}
