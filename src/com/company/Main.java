package com.company;

public class Main {
    //metodos fora do main
    static void myMethod(String fname) {
        int idade=23;
        System.out.println(fname + " Refsnes"+"  "+"idade é :"+idade);
    }// sobre carga dos metodos N metodos podem ter o mesmo nome com paremetros diferentes
    static int somametodo(int x,int y){
        return x + y;
    }
    static  double somametodo(double x,double y){
        return x+y;

    }
    public static void main(String[] args) {
	// write your code here
            myMethod("Liam");
            myMethod("Jenny");
            myMethod("Anja");

        int a=10;
        int b=10;

        double c=10.1;
        double d=15.5;
         somametodo(a,b);
         somametodo(c,d);
        System.out.println("o valor de a é :"+a);
        System.out.println("o valor de b é :"+d);

    }
}
