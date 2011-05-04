package com.example.android.test;

import android.test.ActivityInstrumentationTestCase2;
import com.example.android.CountUpActivity;

public class CountUpActivityTest extends ActivityInstrumentationTestCase2<CountUpActivity> {

	public CountUpActivityTest(){
		super("com.example.android", CountUpActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPlus() throws Exception {
		CountUpActivity activity = getActivity();
		assertEquals(2,activity.plus(1,1));
	}
}
