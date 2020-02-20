package com.herencia;

class Data1 {
	int x;
	Data1(){
		this(100); //line 1
	}
	Data1(int n){
		this.x=n;
	}
} 
class Data2 extends Data1{
	int y;
	int x;
	Data2(){
		super();
		//this(5); //line 2
	} 
	Data2(int n){
		//Data1(); //line 3
		this.y=n;
	} 
	public String toString(){
		//return super.x+":"+this.y;
		return "this.x:"+this.x+" this.y:"+this.y+" super.x:"+super.x;
	}
} 

public class TestData {
	
    public static void main(String[] args) {
    	Data2 dt=new Data2();
    	System.out.println(dt);
    }

}
