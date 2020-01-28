package com.abstractas;

import java.io.Serializable;

import com.interfaces.Lavable;

//Serializable interface de marcada
/*
en una clase debe esta abs en los metodos y en la clase
En una interface no debe haber metodos implementados
Una clase puede heredar solo de un clase , pero varias interfaces
Un meotodo implementado no puede tener abastract
En una clase los metodos abstractor deben tener abs y la clase tambien

*/
public abstract class Papa extends Comible implements Lavable, Serializable {

}
