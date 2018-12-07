public class Main {
    static byte a0;
    static short a1;
    static int a2;
    static long a3;
    static char a4;
    static double a5;
    static float a6;

    public static void main(String[] args) {
        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

       /* насколько я поняла задание, теперь создаем локальные переменные без инициалицации.
       В этом случае вывести на экран уже не получится
        byte a00;
        short a11;
        int a22;
        long a33;
        char a44;
        double a55;
        float a66;

        System.out.println(a00);
        System.out.println(a11);
        System.out.println(a22);
        System.out.println(a33);
        System.out.println(a44);
        System.out.println(a55);
        System.out.println(a66);
       */

        float b0 = 1f;
        float b1 = 1f;
        float b2 = 0x1;
        float b3 = 0b1;
        float b4 = 1.0e1f;
        float b5 = 01f;

        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        sumShort();
        square();
        number();
        even();
        simple();
        abc(4, 2, 6);
        range(23, 2);
        bank(1000, 0.36, 1);
    }

    public static void sumShort() {
        short c;
        c = 7 + 3;
        System.out.println("Short " + c);
        c = 6 + (short) 5.4;
        System.out.println("Short " + c);
        c = (short) 5.2f + 798;
        System.out.println("Short " + c);
        c = (byte) 5 + 5;
        System.out.println("Short " + c);
        c = (short) 6.4f + (short) 4.2;
        System.out.println("Short " + c);
    }

    public static void square() {
        int k1 = 3;
        int k2 = 4;
        int g = 5;
        String squarRes = (k1 * k1 + k2 * k2 == g * g) ? "yes" : "no";
        System.out.println("Is this triangles right-angled? " + squarRes);
    }

    public static void number() {
        int temp = 1;
        int sum = 0;
        while (temp <= 20) {
            sum += temp++;
        }
        System.out.println("Total sum from 1 to 20 is " + sum);
    }

    public static void even() {
        int sumEven = 0;
        int temp = 1;
        while (temp <= 20) {
            if ((temp % 2) == 0) {
                sumEven += temp;
            }
            temp++;
        }
        System.out.println("Sum of even numbers is " + sumEven);
    }

    public static void simple() {
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
        System.out.println("Sum of simple numbers " + sum3);
    }

    public static void abc(int a, int b, int c) {
        boolean resalt = false;
        boolean first1 = (a + b) == c;
        boolean first2 = (a + c) == b;
        boolean first3 = (c + b) == a;
        if (first1 || first2 || first3) {
            resalt = true;
        }
        System.out.println("True of false? " + resalt);
    }

    public static void range(int a, int b) {
        if (a < b) {
            System.out.println("a must be > b");
        } else {
            System.out.println("Average value is " + (a + b) / 2);
        }
    }

    public static void bank(int sum, double percent, int time) {
        //Общая сумма с процентами
        System.out.println("Sum Payment: " + (sum + (sum * (percent/12)*time)));
        //Общая сумма выплаченых процентов
        System.out.println("Total per cent: " + (sum * (percent/12)*time));
        //Сумма выплаты в месяц вмечте с процентами
        System.out.println("Month Payment: " + (((sum * ((percent/12)*time)) + sum) / time));
    }
}

