package com.javen.kit;

public abstract class TestB extends TestA {
	
	public TestB(){
		System.out.println("testb----");
	}
	protected abstract void processInTextMsgB();

    protected abstract void processInImageMsgB();
	
}
