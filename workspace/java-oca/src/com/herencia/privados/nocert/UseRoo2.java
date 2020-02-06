package com.herencia.privados.nocert;

import com.herencia.privados.cert.Roo;

public class UseRoo2 {
	public void testIt() {
		Roo roo = new Roo();
		
		//No se le puede ver al metodo
		roo.doRootThings();
	}

}
