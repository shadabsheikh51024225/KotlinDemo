package com.example.kotlinbasics



///////////////////////////// DEMONSTRATION OF HOW TO USE CONSTRUCTOR IN KOTLIN. //////////////////////////////////////////////


/**
 *     - PRIMARY CONSTRUCTOR ;- ONLY ONE PER CLASS
 *
 *     - SECONDARY  CONSTRUCTOR  :- MULTIPLE PER CLASS
 *
 *
 *
 *     ---YOU CAN EITHER CREATE PRIMARY CONSTRUCTOR FOR THE CLASS OR SECONDARY CONSTRUCTOR NOT BOTH FOR SINGLE CLASS ---------------------------
 *
 *
 *
 *
 *
 *
 */





fun main (args:Array <String>)
{

    //PRIMARY CONSTRUCTOR CALLING.
    var x = primayConsDemo(7)


    //SECONDARY CONSTRUCTOR CALLING.
    var y = SecondaryConstructor(7)
    var z =  SecondaryConstructor("SEVEN")

    x.ReturnResult()




}



/////////////////////////////////////////////PRIMARY CONSTRUCTOR. //////////////////////////////////////////////////////////////








// IF YOU DON'T LIKE TO INITIALIZE THE OBJECT AS VAR OR VAL , THEN USE INIT{ } TO INITIALIZE THE OBJECT AND THEN USE IT EVERY WHERE IN CLASS.
class primayConsDemo(var date:Int){


    fun ReturnResult() = println("TODAY IS "+date)


}


// YOU CAN CREATE N NUMBER OF SECONDARY CONSTRUCTOR FOR ANY  CLASS

class SecondaryConstructor{


    constructor(day:Int)
    {
        println("DAY IS $day")
    }
    constructor(day:String)
    {
        println("DAY IS $day")
    }


}


/**
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FifthStep.kt <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */