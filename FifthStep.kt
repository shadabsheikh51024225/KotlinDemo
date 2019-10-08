package com.example.kotlinbasics


///////////////////////////////////////      CLASSES AND INTERFACE  //////////////////////////////////////////////


fun main(args:Array<String>)
{
  //CREATING THE OBJECT OF HR.CLASS AND CALLING THE OBJECTS AND FUNCTIONS OF EMPLOYEE_ID.CLASS.

    var a = Hr()

    a.employeeId = 4
    a.displayemployeeId()
}

// BY DEFAULT THE MODE WILL BE FINAL FOR CLASS.
//open WORKS SAME AS PUBLIC IN JAVA, THIS WILL SHOW THAT CLASS AND OBJECTS ARE OPEN FOR ACCESS.
open class employee
{

    var employeeId:Int? = null

    fun displayemployeeId()
    {
        println(" DISPLAY MASSAGE FOR EMPLOYEE CLASS")
    }


}




// CALLING DEFAULT CONSTRUCTOR OF employee.class.
// NO NEED TO CREATE DEFAULT CONSTRUCTOR IT WAS CREATED BY DEFAULT BY KOTLIN.
// NO NEED OF EXTENDS OR IMPLEMENTS KEY WORD JUST USE : TO SHOW INHERITANCE.

class Hr:employee(),employeeInsurance
{


    //SAME OVERRIDE CONCEPT FOR JAVA INTERFACE ,WE ARE USING SAME HERE.
    override fun displayInsurance() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("I AM INSIDE INTERFACE ")
    }


}


//SYNTAX TO CREATE A INTERFACE.
interface employeeInsurance
{
    fun displayInsurance()
}



/**
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SixthStep.kt <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 */