package com.bidimencionales;

public class IteracionBidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arreglo [][] = {{3,4},{5,6,7},{1}};
		
		for (int i= 0; i<arreglo.length; i++) {
			for (int j=0; j<arreglo[i].length; j++) {
				System.out.print(arreglo[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("End handset for");
		
		for (int celda[] : arreglo) {
			for (int valor: celda) {
				System.out.print(valor + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//Principal con for normal y cada celada con enhanced for
		
		for (int i = 0; i< arreglo.length; i++) {
			for (int valor : arreglo[i]) {
				System.out.print(valor + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//Principal con enhanced for y cada celda  con for normal
		for (int[] celda: arreglo) {
			for (int i = 0; i<celda.length; i++) {
				int valor = celda[i];
				System.out.print(valor + " ");
			}
			System.out.println("");
		}
	}

}
