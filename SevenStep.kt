package com.example.kotlinbasics

///////////////////////////////////////      ARRAY AND COLLECTION      //////////////////////////////////////////////


/**
 * TO define THE ARRAY
 *
 *
 *   - STRING TYPE ARRAY:-
 *
 *    var value:Array< String >
 *
 *
 *   - ANOTHER TYPE ARRAY:-
 *
 *     var value:IntArray
 *
 *
 *
 *
 *
 *
 *
 *   - INTI ARRAYS
 *
 *     var value:Array<String> = arrayOf(value1,value2,value3.....)
 *
 *    -----for int -------------------
 *
 *    var value:IntArray = IntArrayOf(value1,value2,value3.......)
 *
 *
 *
 */


fun main (args:Array<String>)
{

     var day:Array<String> = arrayOf("day1","day2","day3","day4")
     var number:IntArray = intArrayOf(1,2,3,4)


    for(day in day)
    {
        println("$day")

    }
    for (number in number)
    {
        println("$number")
    }



    //COLLECTION IN KOTLIN

    /**
     *   MAIN FOUR FACTORS IN COLLECTION IS
     *
     *
     *
     *   - LIST
     *
     *   - SET
     *
     *   - QUEUE    >>kotlin does not support que
     *
     *   - MAP
     *
     *
     *    
     */



    
    
    println("\n LIST DEMO \n")


    var dayList:List<String> = listOf("monday","tuesday","wednesday")




    for (day in dayList)
    {
        println("$day")

    }

    // TO MAKE LIST MUTABLE

    var monthList:MutableList<Int> = mutableListOf(1,2,3,4)

    monthList.add(5)

    for(months in monthList)
    {
        println("$months")
    }









    //TO MAKE SETS


    var yearS:Set<Int> = setOf(1,2,3,4)

    //TO MAKE SETS MUTABLE


    var yearSet:MutableSet<Int> = mutableSetOf(1,2,3,4)






    /////////////////////////  SAME WAY YOU AN USE MAPS ALSO /////////////////////////////////////////



}
