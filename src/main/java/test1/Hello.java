package test1;

public class Hello {
    public static void main(String[] args) {  //psvm 設計程式main
//        System.out.println("Hello World");
        //new Persion().hello();  //將類別產生在記憶體
        Persion p = new Persion(); //物件Persion中建立p來代表Persion物件
        p.hello();

        int a = 1;
        Integer a_class = 1;  //int的類別就能有其他function
        a_class.byteValue();  //有功能性的資料稱為物件＆參照資料型態

        float b = 12.2f; //預設都為double
        Float bb = 12f;  //每個基本資料型態都有包裝類別wrapper class
        double c = 1.2;
        Double cc =1.2;
        boolean adult = true;

        char aa = 'C';
        byte aaa = 'C';
        String name = "Tom"; //字串


    }



}
