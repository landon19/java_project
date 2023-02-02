package test1

fun main() {        //設計function
//    println("Hello kotlin");
//    Human().hello()
    val h=Human()  //定義完這物件就不能改變值
    h.hello()
}

class Human{        //設計類別
    fun hello(){    //回傳值不需寫在function前面(void)
        println("Hello Kotlin")

    }


}