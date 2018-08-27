/** JAVA.Level1.Lesson1
 *
 * @author Iliya Anufriev
 * @version Aug 11, 2018
 */
public class HomeWork_Lesson1 {

    public static void main(String[] args) {
        System.out.println(calcNum(1, 2, 3, 4));
        System.out.println(checkNum(11));
        highORlow(5);
        System.out.println(isNegativeNum(4));
        helloName("User");
        whatIsYear(800);
        whatIsYear(900);
        whatIsYear(80);
        whatIsYear(90);
    }
    static void iniAll(){//Задание 2
       byte a=1;
       short b=1;
       int c=1;
       long d=1;
       boolean e=true;
       float f=1f;
       double g=1D;
       char v='v';
       String s= "Инициализация Закончена: "+a+b+c+d;
       System.out.println(s);
    }

    static float calcNum(int a, int b, int c, int d) {//Задание 3
        float s = (float)(a * (b + c / d));
        return s;
    }

    static boolean checkNum(int a) {//Задание 4
        return (a >= 10 && a <= 20);
    }

    static void highORlow(int a) {//Задание 5
        if (a >= 0) {
            System.out.println("Положительное "+a);
        } else {
            System.out.println("Отрицательное "+a);
        }

    }

    static boolean isNegativeNum(int a) {//Задание 6
        boolean b = a < 0;
        return b;
    }

    static void helloName(String s) {//Задание 7
        System.out.println("Привет "+s);
    }

    static void whatIsYear(int y) {// Задание 8
        boolean f = y % 4 == 0;
        boolean h = y % 100==0;
        boolean hf = y % 400 == 0;
        if (f && (h == hf)) {
            System.out.println(y+" Год Высокосный");
        } else {
            System.out.println(y+"Год Невысокосный");
        }

    }
}
