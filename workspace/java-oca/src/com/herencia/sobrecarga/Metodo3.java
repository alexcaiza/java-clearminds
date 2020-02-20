package com.herencia.sobrecarga;

public class Metodo3 {
	public static void main(String[] args) {
		
/*

Pregunta 8
Given:
Person.java:
public class Person{
	String name;
	int age;
	public Person(String m, int a){
		name=n;
		age=a;
	} 
	public String getName(){
		return name;
	} 
	public int getAge(){
		return age;
	}
}

Test.java
public static void checkAge(List<Person> list, Predicate<Person> predicate) {
	for(Person p:list){
		if(predicate.test(p)){
			System.out.println(p.name+" ");
		}
	}
} 
public static void main(String[] args){
	List<Person> lst=Arrays.asList(new Person("p1", 44),
	new Person("p2",40),
	new Person("p3",35));
	//line 1
} 
Which code fragment, when inserted at line 1, enables the code to print p1?
A. checkAge (lst, ( ) -> p. get Age () > 40);
B. checkAge(lst, Person p ->p.getAge() > 40);
C. checkAge (lst, p ->p.getAge() > 40);
D. checkAge(lst, (Person p) -> { p.getAge() > 40; });

Pregunta 7
Given the code fragment:
public static void main(String[] args){
LocalDate ld=LocalDate.of(2017,02,28);
ld.plusDays(4);
System.out.println(ld);
}
What is the result?
A. 2017-03-4
B. 2017-02-28
C. Compilation fails
D. A Exception is thrown at runtime

Pregunta 6
Given the following:
LocalDate d1=LocalDate.now();
LocalDate d2=LocalDate.of(2017,11,30);
LocalDate d3=LocalDate.parse("2017-11-30",DateTimeFormatter.ISO_DATE);
System.out.println("Date 1= "+d1);
System.out.println("Date 2= "+d2);
System.out.println("Date 3= "+d3);
Assume that the system date is November 30, 2017. What is the result?
A.Date 1 = 2017-11-30
Date 2 = 2017-11-30
Date 3 = 2017-11-30
B. Date 1 = 30/11/2017
Date 2 = 2017-11-30
Date 3 = Nov 30, 2017
C.Compilations fails
D.A DateParseException is thrown at runtime

Pregunta 5
Given the code fragment:
public static void main(String[] args){
	List<String> data=new ArrayList<>();
	data.add("one");
	data.add("two");
	data.add("three");
	data.add("two");
	if(data.remove("two")){
		data.remove("four");
	} 
	System.out.println(data);
} 
What is the result?
A. [one, three, two]
B. [one, three]
C. [one, two, three, two]
D. An exception is thrown at runtime.

Pregunta 4
Given the code fragment:
public class CCMask {
	public static String maskCC(String card){
		String x="XXXX-XXXX-XXXX-";
		//line 1
	} 
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-7241-5900"));
	}
} 
You must ensure that the maskcc method returns a string that hides all digits of
the credit card number except the four last digits (and the hyphens that separate
each group of four digits).

Which two code fragments should you use at line 1, independently, to achieve this requirement?
A. StringBuilder sb=new StringBuilder(card);
sb.substring(15,19);
return x+sb;
B. return x+card.substring(15,19);
C. StringBuilder sb=new StringBuilder(x);
sb.append(card,15,19);
return sb.toString();
D. StringBuilder sb=new StringBuilder(card);
StringBuilder s=sb.insert(0,x);
return s.toString();

Pregunta 3
Given:
public static void main(String[] args) {
	String str="A ";
	str=str.concat("B ");
	String str2="C ";
	str=str.concat(str2);
	str.replace('C','D');
	str=str.concat(str2);
	System.out.println(str);
}
What is the result?
A. A B C D
B. A C D
C. A B C C
D. A B D
E. A B D C

Pregunta 1
Given the following:
public static void main(String[] args){
	String cad=" ";
	cad.trim();
	Sustem.out.println(cad.equals("")+" : "+cad.isEmpty());
}
What is the result?
A. true : true
B. true : false
C. false : true
D. false : false

Pregunta 2
Given the code fragment:
String[] cads=new String[2];
int i=0;
for(String s:cads){
	cads[i].concat(" index"+i);
	i++;
} 
for(i=0;i<cads.length;i++){
	System.out.println(cads[i]);
}
What is the result?
A. index 0
index 1
B. Null index 0
Null index 1
C. Null
Null
D. A NullPointerException is thrown at runtime

Pregunta 6
Given:
public class Test {
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		int sum = 0;
		try {
			for (int pos = 0; pos <= 4; pos++) {
				sum = sum + arr[pos];
			} 
		} catch (Exception e) {
			System.out.println("Invalid index");
		} 
		System.out.println(sum);
	} 
} 
What is the result?
A. 12
B. Invalid Index 12
C. Invalid Index
D. Compilation fails

Pregunta 5
Given:
public class Test {
	public static void main(String[] args) {
		int ax = 10, az = 30;
		int aw = 1, ay = 1;
		try {
			aw = ax % 2;
			ay = az / aw;
		} catch (ArithmeticException e1) {
			System.out.println("Invalid Divisor");
		} catch (Exception e2) {
			aw = 1;
			System.out.println("Divisor Changed");
		} 
		ay = az /aw; // Line 14
		System.out.println("Succesful Division " + ay);
	}
} What is the result?
A. Invalid Divisor
Divisor Changed
Successful Division 30
B. Invalid Divisor
Successful Division 30
C. Invalid Divisor
Exception in thread "main" java.lang.ArithmeticException: / by zero at test.Teagle.main(Teagle.java:14)
D. Invalid Divisor
Exception in thread "main" java.lang.ArithmeticException: / by zero at test.Teagle.main(Teagle.java:14)
Successful Division 1

Pregunta 4
Which two are Java System Exception classes?
A. SercurityException
B. DuplicatePathException
C. IllegalArgumentException
D. TooManyArgumentsException

Pregunta 3
Given the following classes:
public class TestException extends RuntimeException {}
public class Test{
	public static void main(String[] args){
		try{
			myMethod();
		} catch(TestException ex){
			System.out.print("A");
		}
	} 
	public static void myMethod(){ //line 1
		try{
			throw (Math.random()>0.5)?new TestException():new RuntimeException();
		} catch(RuntimeException ex){
			System.out.print("B");
	}
	}
}
What is the result?
A. A
B. B
C. Either A or B
D. AB
E. Compilation fails at line 1

Pregunta 2
Given the following:
public static void main(String[] args) {
	ArrayList lst=new ArrayList();
	String[] mr;
	try{
		while(true){
			lst.add(new String("cad"));
		}
	} catch(RuntimeException ex){
		Sustem.out.println("Is a RuntimeException");
	} catch(Exception ex){
		Sustem.out.println("Is a Exception");
	} 
	Sustem.out.println("End");
}

What is the result?
A. Execution terminates in the first catch statement, and caught a RuntimeException is printed to the console.
B. Execution terminates In the second catch statement, and caught an Exception is printed to the console.
C. A runtime error is thrown in the thread "main".
D. Execution completes normally, and "End" is printed to the console.
E. The code fails to compile because a throws keyword is required

Cual es el resultado?
A. La ejecución termina en la primera instrucción catch y se captura una excepción RuntimeException en la consola.
B. La ejecución termina en la segunda instrucción catch, y se captura una excepción que se imprime en la consola.
C. Se produce un error de tiempo de ejecución en el hilo "principal".
D. La ejecución se completa normalmente y se imprime "Fin" en la consola.
E. El código no se compila porque se requiere una palabra clave throws

Pregunta 1
Which three are advantages of the Java exception mechanism?
A. Improves the program structure because the error handling code is
separated from the normal program function
B. Provides a set of standard exceptions that covers all the possible errors
C. Improves the program structure because the programmer can choose
where to handle exceptions
D. Improves the program structure because exceptions must be handled
in the method in which they occurred
E. Allows the creation of new exceptions that are tailored to the
particular program being created

A. Mejora la estructura del programa porque el código de manejo de errores está separado de la función normal del programa.
B. Proporciona un conjunto de excepciones estándar que cubre todos los posibles errores.
C. Mejora la estructura del programa porque el programador puede elegir dónde manejar las excepciones.
D. Mejora la estructura del programa porque las excepciones deben manejarse en el método en el que ocurrieron
E. Permite la creación de nuevas excepciones que se adaptan a la
programa particular que se crea

Pregunta 10
Given the following class declarations:
public abstract class Animal
public interface Hunter
public class Cat extends Animal implements Hunter
public class Tiger extends Cat
Which answer fails to compile?
A. ArrayList<Animal> ml=new ArrayList<>()
ml.add(new Tiger());
B. ArrayList<Hunter> ml=new ArrayList<>()
ml.add(new Cat());
C. ArrayList<Hunter> ml=new ArrayList<>()
ml.add(new Tiger());
D. ArrayList<Tiger> ml=new ArrayList<>()
ml.add(new Cat());
E. ArrayList<Animal> ml=new ArrayList<>()
ml.add(new Cat());

D. Tiger es un Cat y no al revés, por ello, en una variable de tipo Tiger (o en
una colección de tipo Tiger), no se pueden almacenar directamente referencias a
objetos Cat. Tiger es un Animal, por lo que A es correcta, Cat es un Hunter al
implementar la interfaz, por lo que B es correcta. Tiger es un Hunter porque hereda
Cat, por lo que C es correcta, y Cat es un Animal, lo que implica que E es también
correcta.

Pregunta 9
Which two are benefits of polymorphism?
A. Faster code at runtime
B. More efficient code at runtime
C. More dynamic code at runtime
D. More flexible and reusable code
E. Code that is protected from extension by other classes

Given the code:
public static void main(String[] args){
	Short a=100;
	Integer b=300;
	Long c=(long)a+b; //line 1
	String d=(String)(c*b); //line 2
	System.out.println("Result: "+d)
} 
	What is the result?
A. Sum is 400
B. Compilation fails at line 1.
C. Compilation fails at line 2.
D. A ClassCastException is thrown at line 1.
E. A ClassCastException is thrown at line 2.


Pregunta 7
Given the following:
abstract class Car{
	protected void run(){} //line 1
	abstract Object stop(); //line 2
} 
class MyCar extends Car{
	void run(){} //line 3
	protected void stop(){} //line 4
}
Which two modifications are necessary to enable the code to compile?
A. Make the method at line 1 public.
B. Make the method at line 2 public.
C. Make the method at line 3 public.
D. Change the return type of method in line 4 to String.
E. Make the method at line 4 public

Pregunta 6
Given:
Class A { }
Class B { }
Interface X { }
Interface Y { }
Which two definitions of class C are valid?
A. class C extends A implements X { }
B. class C implements Y extends B { }
C. class C extends A, B { }
D. class C implements X, Y extends B { }
E. class C extends B implements X, Y { }

Pregunta 5
Given:
public class Test {
	void myMethod(){}
} 
class Exam extends Test{
	____ void myMethod(){}
} 
Which two of the following can fill in the blank in this code to make it compile?
A. abstract
B. int
C. private
D. protected
E. public

5. D y E. En la sobrescritura el ámbito debe ser igual o superior que el del método
original. Como el método original es default, los posibles ámbitos del nuevo método
pueden ser protected y public 
 
Pregunta 4
Given the following:
class Data1 {
	private int x;
	Data1(int x){
	this.x=x;
	}
} 
class Data2 extends Data1{
	int y;
	Data2(int x, int y){
	//line 1
	}
} 
And given the following fragment:
Data2 dt=new Data2(2,7);
Which code fragment should you use at line 1 to instantiate the dt object successfully?
A. super.x=x
this.y=y;
B. super(x);
this(y);
C. super(x);
this.y=y;
D. this.x=x;
super(y); 

Pregunta 3
Given the following:
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
	Data2(){
		super();
		this(5); //line 2
	} 
	Data2(int n){
		Data1(); //line 3
		this.y=n;
	} 
	public String toString(){
		return super.x+":"+this.y;
	}
} 
And given the following fragment:
Data2 dt=new Data2();
System.out.println(dt);
What is the result?
A. 100:5
B. 0:5
C. Compilation fails at line 1
D. Compilation fails at line 2
E. Compilation fails at line 2 and line 3

Pregunta 2
Given the following:
class ClaseOne{
	public ClaseOne (int n){
		System.out.println("Second constructor");
	}
} 
public class ClaseTwo extends ClaseOne{
	public ClaseTwo(){
		System.out.println("constructor one from object");
	} 
	public ClaseTwo (int p){
		System.out.println("constructor one from object");
	}
} And the following main method:
ClaseTwo cd = new ClaseTwo(10);
Which is the result?
A. constructor one from object Second constructor
B. Second constructor constructor two from object
C. constructor two from object
D. Compilations fails

Pregunta 1
Which statement is/are true?
I. Default constructor only contains "super();" call.
II. Only constructor with no parameters in the superclass can be called from subclass.
III. super o this call must be the first statement in all constructors.
A. Only I.
B. Only II.
C. Only I and II.
D. Only I and III.
E. AIl


Given the following:
public class Test {
	static int sum(Integer a, int b){return a+b;}
	static long sum(Long x, int y){return x+y+10;}
	static double sum(int n, double r){return n+r;}
	public static void main (String []args) {
		System.out.println(sum(3,2));
	}
}
What is the result?
A. The output is 5
B. The output is 15
C. The output is 5.0
C. Compilation will fail
D. It will throw an Exception

Pregunta 8
Which are true? (choose 2)
A. Default constructor should be always there for any class.
B. Default constructor must have parameters
C. When defining our own constructor we can’t use any access modifier.
D. A constructor should not have a return type.
E. We can have more than one constructor in a class. 
 
Given:
C1.java
package p1;
class C1{
	int p;
	private int k;
	public int s;
} 
C2.java
package p2;
import p1.C1;
public class C2{
	public static void main(String[] args){
		C1 obj=new C1();
	}
} 
Which statement is true?
A. Both p and s are accesible by obj
B. Only s is accesible by obj
C. None of the variables are accesible by obj
D. Compilation fails 
 
Given the following:
class Vehicle {
	String name;
	void setName (String name) {
		this.name = name;
	} 
	String getName() {
		return name;
	}
} Which action would apply encapsulation in this class?
A. Define name variable as public
B. Define name variable as private
C. Define Vehicle class as public
D. Define setter and getter methods as public
E. Define setter and getter methods as private 

6. B. Se corresponde al principal principio de la encapsulación. En ese sentido, la A
no es correcta porque expresa todo lo contrario, C no es correcta porque el ámbito
de la clase es irrelevante para la encapsulación, D no es correcta porque setter y
getter no tienen que ser obligatoriamente public, pueden tener ámbito de paquete
como en este caso. Lo que no pueden es ser privados, por lo que E es incorrecta.
 
public class Test {
	public Test(){
		System.out.println("No params");
	} 
	public void Test(int j){
		System.out.println("Param "+j);
	}
	public static void main(String[] args) {
		Test t=new Test(3);
	}
} Which is the result? 
 
  class Test{
	int a;
	static int b;
	static{
		b++;
	} 
	Test(){
		while(a<5){
		b++;
		a++;
		}
	} 
	public static void main(String[] args){
		Test t1=new Test();
		Test t2=new Test();
		System.out.println(t1.a+":"+t2.b);
	}
  
//Which of the following methods can't be in the same class with: public void
//mt(long r)? (choose 2)
		

A. void mt(int s)
B. int mt(long a)
C. int mt()
D. public void mt(Long a)
E. void mt(long v)
X. public void mt(long r) 
*/
	}

}
