package com.javen.kit;

public abstract class TestA {
	public TestA()
    {
       System.out.println("testa-----");
    }
	protected abstract void processInTextMsg();

    protected abstract void processInImageMsg();

    protected abstract void processInVoiceMsg();

    protected abstract void processInVideoMsg();
    
    public void study()
    {
       System.out.println("study---");
    }
}
