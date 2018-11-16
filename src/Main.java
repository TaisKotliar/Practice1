import java.sql.SQLInvalidAuthorizationSpecException;

public class Main {
    static byte a;
    static short a1 = 4;
    static int a2 = 5;
    static long a3 = 6;
    static char a4 = '5';
    static double a5 = 5.3;
    static float a6 = 5.4f;

    public static void main(String[] args) {

        float b1 = 1f;
        float b2 = 1f;
        float b3 = 0x1;
        float b4 = 0b1;
        float b5 = 1.0e1f;

        sumShort();
        square();
        simple();
        number();
        even();
        abc(4, 2, 6);
        range(23, 2);
        bank(100,0.05, 2);
        /*System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);*/


    }

    public static void sumShort() {
        short c;
        c = 7 + 3;
        System.out.println(c);
        c = 6 + (short) 5.4;
        System.out.println(c);
        c = (short) 5.2f + 798;
        System.out.println(c);
    }

    public static void square() {
        int k1 = 3;
        int k2 = 4;
        int g = 5;
        String squarRes = (k1 * k1 + k2 * k2 == g * g) ? "yes" : "no";
        //if?then:else
        System.out.println(squarRes);
    }

    public static void number() {
        int temp = 1;
        int sum = 0;
        while (temp <= 20) {

            sum += temp++;
            //temp++;
        }
        System.out.println(sum);
    }

    public static void even() {
        int sum1 = 0;
        for (int temp1 = 0; temp1 <= 20; temp1 = temp1 + 2) {
            sum1 += temp1;
        }
        System.out.println(sum1);
    }
    public static void  simple(){
        int sum3 = 0;
        for (int temp3 = 0; temp3 <= 20; temp3++) {
            switch (temp3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                case 17:
                case 19:
                    sum3 += temp3;
                    break;
            }
        }
        System.out.println("Simple sum " + sum3);
    }
    public static void abc(int a, int b, int c) {
        boolean resalt = false;
        boolean first1 = (a + b) == c;
        boolean first2 = (a + c) == b;
        boolean first3 = (c + b) == a;
        if (first1 || first2 ||first3) {
            resalt = true;
        }
       System.out.println(resalt);

    }

    public static void range(int a, int b) {
        if (a < b) {
            System.out.println("a must be > b");
        } else {
            System.out.println((a + b) / 2);
        }
    }

    public static void bank(int Sum, double P, int Time){
        System.out.println("Sum Paymant: " + (Sum * P));
        System.out.println("Month Payment: " + ((Sum + (Sum * P))/Time));
        System.out.println("Month %: " + ((Sum * P)/Time));
    }

}

