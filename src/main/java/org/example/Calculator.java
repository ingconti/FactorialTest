package org.example;

public class Calculator {

    // BAD... start from here..
    int Factorial( int number ) {
        return number <= 1 ? number : Factorial( number - 1 ) * number;
    }


    /* good.. uncomment..

    int Factorial( int number ) {
        return number <= 1 ? 1 : Factorial( number - 1 ) * number;
    }
    */

}

