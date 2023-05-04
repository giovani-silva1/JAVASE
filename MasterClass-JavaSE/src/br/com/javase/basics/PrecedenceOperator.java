package br.com.javase.basics;

public class PrecedenceOperator {

    public static void main(String[] args) {

        double variable = 20.00d;
        double variableTwo = 80.00d;

        double sumVariables = (variable + variableTwo) * 100;
        System.out.println("SumVariable is:" + sumVariables);
        double remainder = sumVariables % 40;
        System.out.println("Remainder is: " + remainder);

        boolean isValueZero =   (remainder == 0)? true:false;

        System.out.println("final result is zero? " + isValueZero);

        if(!isValueZero){
            System.out.println("got some remainder");
        }else{
            System.out.println("There are no remainder");
        }
    }
}
