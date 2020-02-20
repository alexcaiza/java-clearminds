// Documentacion
package com.arreglos;

public class ForOperador1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arreglo1[] ={4,5,6};
		
		for(int val:arreglo1 ){
			if (val==10) {
				break;
			}
			System.out.println(val++);
		}
		
		Integer arreglo2[] ={4,5,6};
		
		for(int val:arreglo2 ){
			if (val==10) {
				break;
			}
			System.out.println(val++);
		}

	}

}
