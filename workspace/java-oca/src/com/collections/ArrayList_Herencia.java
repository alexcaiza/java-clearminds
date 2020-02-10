package com.collections;

import java.util.ArrayList;

interface Comestible{}

class Animal{}
class Perro extends Animal {}
class Gato extends Animal implements Comestible{}

class GatoPersa implements Comestible{}
class GatoSiames implements Comestible{}

public class ArrayList_Herencia {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Animal> listAnimal = new ArrayList<>();
    	
    	listAnimal.add(new Animal());
    	listAnimal.add(new Perro());
    	listAnimal.add(new Gato());
    	//listAnimal.add(new Comestible());
    	
    	
    	ArrayList<Gato> listGato = new ArrayList<>();
    	
    	Comestible cgato = new Gato();
    	
    	listGato.add(new Gato());
    	//listGato.add(cgato);
    	
    	ArrayList<Comestible> listComestible = new ArrayList<>();
    	
    	listComestible.add(cgato);
    	listComestible.add(new Gato());
    	listComestible.add(new GatoPersa());
    	listComestible.add(new GatoSiames());
    	
    	
        
    	System.out.println("list: " + list);
                
        int remove_object = list.remove(1);
        
        System.out.println("list: " + list);
        System.out.println("bool_remove_object: " + remove_object);

    }

}
