package ExerciciosOperadoresAritmeticosJava;

public class ExercicioOperadoresAritmeticos {
    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k = 13;

        int i = ++k; // 14
        int j = k--; // 14
        int z = k; //13



        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("z: "+z);


    }

    private static void aritmetico() {

        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;
        int e = 30;

        int x1 = a+b;
        int x2 = b-c;
        int x3 = c*d;
        int x4 = d/e;
        int x5 = e%a;

        System.out.println("a+b: "+x1);
        System.out.println("b-c: "+x2);
        System.out.println("c*d: "+x3);
        System.out.println("d/e: "+x4);
        System.out.println("e%a: "+x5);

    }

    private static void atribuicao() {

        int i = 13000;
        short s = 13;
        long l = 500L;
        int k = 650;
        double d = 6.5;

        i += 30;
        s -= 15;
        l *= 5;
        k /= 2;
        d %= 3;

        System.out.println("i: " +i);
        System.out.println("s: " +s);
        System.out.println("l: " +l);
        System.out.println("k: " +k);
        System.out.println("d: " +d);

    }

    private static void precedencia() {

        int i = 5;
        int j = 10;
        int k = 15;

        int a = i * j++ - --k; // 5 * 10++ - --15 -> 5 * 10 - 14 -> 36


        System.out.println("i * j++ - --k: " +a);
        System.out.println("k: " +k);
        System.out.println("j: " +j); //11

        int b = 3;

        b -= k *= 3; // b = 3 - k; k = k * 3; b = 3 - 42 -> -39

        System.out.println("b: " + b);
        System.out.println("k: " + k);



    }


}
