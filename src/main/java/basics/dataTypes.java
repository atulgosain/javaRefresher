package basics;

public class dataTypes {

    public static void main(String[] args) {
        String s = "*";
        System.out.println(s+s);

        char c ='*';

        System.out.println(c);

        System.out.println(c+c);

        float f = 3.14f;

        double d = 7.454545788d;

        System.out.println(Math.pow(3,15));

        //Unicodes
        char cr = '\u263A';
        int b1 = 101;
        int b2 = 0101;
        int b3= 0xface;
        int b4= 0b101;

        String s1 = null;


        System.out.println("Character "+cr);
        System.out.println("Integer "+b1);
        System.out.println("OCTA Code "+b2);
        System.out.println("Hexa "+b3);
        System.out.println("Binary "+b4);



    }
}
