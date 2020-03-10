package com.lighthouseshavedice.home.practice;

import java.util.List;

public class practicefile {

public static void main(String args[]){
    System.out.println("Hello");
    fizzBuzz();
}

    //Fizz Buzz
    //    But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
    public static void fizzBuzz(){
        for(int i=0; i <= 100; i++){
            if (i  % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz :)");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0 ){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }


    }


}
