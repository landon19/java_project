package test1

fun main() {        //設計function
//    println("Hello kotlin");
//    Human().hello()
    val h=Human()  //val定義完這物件就不能改變值   //var變數可以改變
    h.hello()

    val age: Int = 20;  // val 名稱：變數＝值
    var weigh = 60.5; // kolin會自行選擇資料型態（double)

    var name:String
    name = "Tom"


}

class Human{        //設計類別
    fun hello(){    //回傳值不需寫在function前面(void)
        println("Hello Kotlin")

    }


}