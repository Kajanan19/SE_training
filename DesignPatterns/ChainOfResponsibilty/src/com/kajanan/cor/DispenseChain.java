package com.kajanan.cor;

public interface DispenseChain {
	
    void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
