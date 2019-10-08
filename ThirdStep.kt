package com.example.kotlinbasics



///////////////////////////// DEMONSTRATION OF HOW TO USE FUNCTION IN KOTLIN. //////////////////////////////////////////////




// MAIN FUNC
fun main (args:Array<String>)
{

// CALLING RETURN TYPE FUNC
    WithReturnType()


 // BY DEFAULT READ LINE RETURN IS STRING toInt FOR INT CONVERSION.
 var num1 = readLine()!!.toInt()
 var num2 = readLine()!!.toInt()
 println(sum(num1,num2))



 //CALLING THIRD JAVA FUNCTION IN KOTLIN, BECAUSE KOTLIN IS COMPLETELY JAVA  INTEROPERATABLE.

    println(JavaTest().checkMassage())

}




// USER FUNC
/**
 *  WHERE SUM IS A FUNC AND ACCEPTING TWO INT VALUES
 */
fun sum(a:Int,b:Int) = a+b;




//WHERE UNIT WORKS THE SAME AS VOID.
fun DisplayTodayInfo():Unit{

println("first statement ")
println("second statement ")
//SAME AS JAVA
}


//DEFINE THE RETURN TYPE TO FUNC.
fun WithReturnType():String
{
    return println("this is it....... ").toString()
}


/**
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FourthStep.kt <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */

