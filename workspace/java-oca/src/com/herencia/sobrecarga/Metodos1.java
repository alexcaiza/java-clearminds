package com.herencia.sobrecarga;

/*

 Which of the following methods can't be in the same class with: public void mt(long r)? (choose 2)

Answers:

C. Al aplicar las reglas definidas para llamar a métodos sobrecargados,
encontramos una coincidencia exacta del primer parámetro en el tercero de los
métodos y del segundo parámetro en el primero y segundo de los métodos. Pero el
segundo de los métodos debemos descartarlo, porque para poder pasarla al 3, se
debería realizar una promoción de tipos más un autoboxing, y ambas cosas no son
posibles. De los métodos que quedan, en el primero habría que hacer un autoboxing
y en el tercero una promoción de tipos que, según las reglas definidas, tiene
prioridad sobre el autoboxing, por tanto, se ejecuta el tercero de los métodos. Como
el tipo de devolución es doble, se muestra como decimal.

 */

public class Metodos1 {
    
    //public void mt(long r)
    /*
    void mt(int s) {
    	System.out.println("int");
    }
    */
    /*
    int mt(Integer s) {   
    	System.out.println("Integer");
        return 0;
    }
    */
	/*
    int mt(long s) {
    	System.out.println("long");
        return 0;
    }
    */
	/*
	public int mt(float s) {
    	System.out.println("float");
        return 0;
    }
    */
    public int mt(Long s) {
    	System.out.println("Long");
        return 0;
    }
    /*
    public int mt(Number s) {
    	System.out.println("Number");
        return 0;
    }
    */
    /*
    public int mt(Object s) {
    	System.out.println("Object");
        return 0;
    }
    */
    public int mt(Object... s) {
    	System.out.println("Object[]");
        return 0;
    }
    
    int mt() {
        return 0;
    }
    
    public static void main(String[] args) {
    	Metodos1 m1 = new Metodos1();
    	m1.mt(new Integer(10));
	}
    
    
}
