package com.javen.kit;

public class TestC extends TestB {
	
	public TestC(){
		
		System.out.println("testc----");
	}
	@Override
	protected void processInTextMsg() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInImageMsg() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInVoiceMsg() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInVideoMsg() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void processInTextMsgB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void processInImageMsgB() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TestC c = new TestC();
	}

}
