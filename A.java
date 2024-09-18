// class Human {

// 	int iq = 4;
// 	int altitude;

// 	void study() {

// 		iq++;
// 	}

// 	void getAltitude() {

// 		Airplane airplane = new Airplane();

// 		altitude = airplane.takeoff();
// 	}
// }

// class Airplane {

// 	int takeoff() {

// 		return 1000;
// 	}
// }

// class Main {

// 	public static void main(String args[]) {

// 		Human himanshu = new Human();
// 		System.out.println(himanshu.iq);
// 		System.out.println(himanshu.altitude);

// 		himanshu.getAltitude();

// 		System.out.println(himanshu.iq);
// 		System.out.println(himanshu.altitude);
// 	}
// }

/*
 * class Human {
 * 
 * int iq = 4;
 * int mascularStrength = 10;
 * static int j = 10;
 * 
 * void study() {
 * 
 * iq++;
 * }
 * 
 * void gyming() {
 * 
 * mascularStrength++;
 * }
 * }
 * 
 * class A {
 * 
 * static int j = 100;
 * }
 * 
 * 
 * class Main {
 * 
 * static int j = 1000;
 * 
 * 
 * public static void main(String args[]) {
 * 
 * Human himanshu = new Human();
 * System.out.println(himanshu.iq);
 * System.out.println(himanshu.mascularStrength);
 * 
 * himanshu.study(); himanshu.study();
 * 
 * System.out.println(himanshu.iq);
 * System.out.println(himanshu.mascularStrength);
 * 
 * 
 * System.out.println("The value of j is "+A.j);
 * System.out.println("The value of j is "+Human.j);
 * System.out.println("The value of j is "+Main.j);
 * }
 * }
 * 
 */

/*
 * class A {
 * 
 * int i = 4;
 * 
 * void print() {
 * 
 * System.out.println("Hello and the value of i is "+i);
 * }
 * }
 * 
 * 
 * 
 * class Main {
 * 
 * 
 * public static void main(String args[]) {
 * 
 * 
 * A a1 = new A();
 * System.out.println(a1.i);
 * 
 * a1.print();
 * }
 * 
 * }
 */

/*
 * class A {
 * 
 * int i = 4, j = 5, k;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A(); a1.add();
 * A a2 = new A(); a2.i = 100; a2.add();
 * 
 * }
 * void add() {
 * 
 * k = i + j;
 * 
 * System.out.println(k);
 * }
 * 
 * void statusCheck() {
 * 
 * k = i + j;
 * 
 * if( k % 2 == 0 ) {
 * 
 * System.out.println("The result is Even");
 * }
 * else {
 * 
 * System.out.println("The Result is Odd");
 * }
 * }
 * 
 * }
 */

/*
 * class A {
 * 
 * static int i = 4;
 * 
 * static {
 * 
 * i = 100;
 * }
 * 
 * 
 * 
 * public static void main(String args[]) {
 * 
 * System.out.println("Hello and the value is "+i);
 * }
 * 
 * }
 * 
 */

/*
 * class A {//You can access non-static as well as static member from the
 * non-static method but can not access non-static member from the
 * //static method......
 * 
 * int i = 4;
 * 
 * public static void main(String args[]) {
 * 
 * System.out.println(i);
 * 
 * print();
 * }
 * 
 * static void print() {
 * 
 * System.out.println("Hello and the value of i is "+i);//THis program will give
 * you error saying non-static variable can not be
 * //referenced from the static context. and the reason is you are trying to
 * access non-static variable from the static method...
 * 
 * }
 * 
 * }
 * 
 */

/*
 * class A {//Static variables will have just 1 copy per class and you can
 * access them without objcets or access directly...
 * 
 * int i = 4, j = 5;
 * static int k;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * a1.add();
 * 
 * A a2 = new A();
 * a2.add();
 * 
 * }
 * 
 * void add() {
 * 
 * k = i + j + k;
 * 
 * System.out.println("The value of k is "+k);
 * }
 * }
 */

// 10-09

/*
 * class A {
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * 
 * int i = 4, j = 5;
 * 
 * int returnedValue = a1.add(i, j);
 * System.out.println(returnedValue);
 * 
 * }
 * 
 * int add(int val1, int val2) {
 * 
 * return val1 + val2;
 * }
 * }
 * 
 * 
 */

/*
 * class A {
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * 
 * int i = 4, j = 5;
 * 
 * a1.add(i, j);
 * 
 * }
 * 
 * void add(int val1, int val2) {
 * 
 * System.out.println(val1 + val2);
 * }
 * }
 * 
 */

/*
 * class A {
 * 
 * int i = 4, j = 5;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * int returnedValue = a1.add();
 * 
 * System.out.println(returnedValue);
 * 
 * }
 * 
 * int add() {
 * 
 * return i + j;
 * }
 * }
 * 
 */

/*
 * class A {
 * 
 * int i = 4, j = 5;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * int returnedValue = a1.add();
 * 
 * System.out.println(returnedValue);
 * 
 * }
 * 
 * int add() {
 * 
 * int result = i + j;
 * 
 * return result;
 * }
 * }
 */

/*
 * class A {
 * 
 * int i = 4;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * 
 * a1.print();
 * 
 * }
 * 
 * void print() {
 * 
 * System.out.println(this.i);
 * }
 * 
 * }
 */

/*
 * class A {
 * 
 * int i = 4;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * 
 * a1.print();
 * 
 * }
 * 
 * void print() {
 * 
 * int i = 5;
 * 
 * System.out.println(this.i);
 * }
 * 
 * }
 */

/*
 * class A {
 * 
 * int i = 4;
 * 
 * public static void main(String args[]) {
 * 
 * A a1 = new A();
 * 
 * a1.print();
 * 
 * }
 * 
 * void print() {
 * 
 * int i = 5;
 * 
 * System.out.println(i);
 * }
 * 
 * }
 */

 class A {
 
 int i = 4;
 
 public static void main(String args[]) {
 
 A a1 = new A();
 
 a1.print();
 
 }
 
 void print() {
 
 int j = 5;
 
 System.out.println(i);
 System.out.println(j);
 
 }
 
 
 }
 

/* 
 class A {
 
 int i = 4;
 public static void main(String args[]) {
 
 A a1 = new A();
 A a2 = new A();
 
 a1.print();
 a2.print();
 }
 
 void print() {
 
 System.out.println(i);
 i++;
 System.out.println(i);
 }
 
 }
 
*/

/* 
  class A {
  
  int i = 4;  //instance variable
  
  public static void main(String args[]) {
  
  A a1 = new A();
  A a2 = new A();
  
  System.out.println(a1.i);
  System.out.println(a2.i);
  
  a2.i = 20;
  
  System.out.println("After update");
  
  System.out.println(a1.i);
  System.out.println(a2.i);
  
 }
 
 }
 */

/*
 * class A {
 * 
 * 
 * int i = 4;
 * public static void main(String args[]) {
 * 
 * A a = new A();
 * 
 * System.out.println(a.i);
 * 
 * }
 * 
 * 
 * }
 */

 //if we declare a variable or method is declared as static then it can be accessed without creating the object of the class and it will have only 1 copy per class...