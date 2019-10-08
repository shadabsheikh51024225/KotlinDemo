package com.example.kotlinbasics


/**
 *     MAIN PILLARS FACTOR OF OPPS PROGRAMING VS KOTLIN ....
 *
 *
 *
 *     - CLASS
 *
 *
 *
 *
 *     - DATA :- NO PRIMITIVE DATA TYPE ONLY REFERENCE TYPE. ALL WRAP CLASS ARE SAME ONLY  ...
 *
 *                                                                      INTEGER = INT
 *                                                                      VOID = UNIT
 *
 *
 *
 *
 *     - BEHAVIOUR
 *
 *     - OBJECT.
 *
 *     - VARIABLE   ; - THERE ARE TWO TYPE OF VARIABLE
 *
 *                                              -MUTABLE.  >> VAR
 *
 *                                              -IMMUTABLE. >> val
 *
 *
 */



    fun main (args:Array<String>)
{


    //type variable is considered as value defined.

    var name = " "

    name = "shadab"


    //SIMPLE PRINT STATEMENT DEMONSTRATION.
    println(name)

    //ALSO SUPPORTS ALL JAVA PRINT FEATURES AND LINE STATEMENTS.
    println("\nSTRING CONCATENATION WORKS THE SAME: "+name)


    //TO GET THE VALUE INSIDE THE DOUBLE "" , ANOTHER WAY TO WRITE THINGS.
    println("\nTHIS WILL WOKS THE SAME: $name ")



    println("\n EHTER PHONE NUMBER \n")
    //READ LINE FUNCTION TO GET INPUT FROM THE USER. YOU DONT NEED SCANNER CLASS OBJECT LIKE JAVA JUST CALL THE FUNCTION DIRECTLY.
    var phone = readLine()

    println("THE PHONE NUMBER WILL BE: $phone")    //GO TO RUM CONSOLE AND ENTER THE PHONE NUMBER.


    //VARIABLE OPERATIONS

    //TO SPECIFY THE TYPE ,,, DEFAULT TYPE FOR NUMBERS IN KOTLIN IS INTEGER.

    var number:Byte = 1

    println("ADDITION OPERATIONS $number + 1")

    // THE PROPER SYNTAX TO ABOVE ADDITION OPERATION,

    println("FINAL RESULT:  ${number+1} ")



    //THE NULL INITIALIZATION FOR VARIABLE OBJECTS.

    // HAVE TO USE ? MARK TO TELL COMPILER THAT ITS GONNA INITIALIZE LATTER IN PROGRAM.

    var month:String? = null


    // YOU CAN CALL NULL VARIABLE IN KOTLIN BUT CAN NOT PERFORM ANY OPERATION ON IT. TO ACHIVE THAT WE USE !! MARK TO ALLOW USE OF NULL OBJECTS
    println("\n EHTER MONTH \n")
    month = readLine()
    println("MONTH LENGTH IS BE ${month!!.length}")


    /**
     * //////////////////////////////// READ ThirdStep
     */


}

