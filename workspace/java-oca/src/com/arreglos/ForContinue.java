// Documentacion
package com.arreglos;

public class ForContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names [][]={{"Juan"},{"Paco","Pedro"},{"Mario"}};
		
		for(int i=0; i<names.length;i++) {
			for(int j=0; j<names[i].length;j++) {
				System.out.println("" + names[i][j] + " ");
				if (names[i][j].equals("Paco")) {
					break;
				}
			}
			continue;
		}

	}

}
