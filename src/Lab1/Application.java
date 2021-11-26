package Lab1;

public class Application {

    public static void main(String[] args) {
//        ifthenelse1();
//        ifthenelse2();
//        loop1();
//        loop2();
        loop3();
    }


    public static void ifthenelse1() {
        int i = 1, j = 1;
        if (i <= j)
            System.out.println("A");
        if (i == j)
            System.out.println("B");

    }

    public static void ifthenelse2() {
        int i = 1, j = 1;
        if (i < j)
            System.out.println("A");
         else if (i == j)
            System.out.println("B");

    }

//    //    FOR LOOPS
//    public static void loop1() {
//        int i;
//        for (i = 0; i < 3; i++)
//            System.out.println("During : " + i);
//
//        System.out.println("After : " + i);
//    }
////
//    public static void loop2() {
//        int i;
//        for (i = 0; i <= 3; i++)
//            System.out.println("During : " + i);
//
//        System.out.println("After : " + i);
//    }

//    public static void loop3() {
//        int i;
//        for (i = 0; i == 3; i++)
//            System.out.println("During : " + i);
//
//        System.out.println("After : " + i);
//    }
//
//    /*DO WHILE LOOPS
//    * */
    public static void loop1() {
        int i = 0;
        while (i < 3)
            System.out.println("During : " + i);
            i++;

        System.out.println("After : " + i);
    }

    public static void loop2() {
        int i = 3;
        while (i < 3) {
            System.out.println("During : " + i);
            i++;
        }
        System.out.println("After : " + i);
    }

    public static void loop3() {
        int i = 3;
        do {
            System.out.println("During : " + i);
            i++;
        } while (i < 3);
        System.out.println("After : " + i);
    }



}
