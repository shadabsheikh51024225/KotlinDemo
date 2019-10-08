package com.example.kotlinbasics

/////////////////////////////////////////  CONTROL STATEMENT , RANGES , FOR-IN LOOP////////////////////////////////



fun main (args:Array<String>)
{


    var date_value:Int = readLine()!!.toInt()





    // WHEN STATEMENT IN KOTLIN SIMILAR TO SWITCH IN JAVA.



    when(date_value)
    {
        1-> println("TODAY IS SUNDAY")
        2-> println("TODAY IS MONDAY")

        3-> {println("TODAY IS WEDNESDAY")
            println("SALARY DAY ")}

        // ELSE STATEMENT WILL WORK AS DEFAULT STATEMENT FOR SWITCH.

        else-> println("KINDLY ENTER THE PROPER RESULTS")

    }



    //RANGES IN KOTLIN


    var values = 1..100

    //same as for in loop
    for (x in values)
    {
        println("$x")
    }

    //STEP THE VALUES IN LOOP USING STEP 2

    for (x in values step 2)
    {
        println("$x")
    }




}

/**
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SevenStep.kt <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */