public class Datatypes {
    public static void main(String args[]) {
        //Primitive Data Types
        byte by = 3;
        short sh = 345;
        int i = 3456;
        long l = 9834587l;
        float fl = 4.67f;
        double db = 45.4567;
        char c = 'R';
        boolean bl = true;

        //Type Promotion 
        byte a = 10;
        byte b = 30;
        int result = a*b; //as 300 is out of range value
        System.out.println(result);

        //Explicit Conversion- Type Casting, when not in range, trying to store the int value in byte 
        byte num = 127;
        int number = 278;
        num = (byte) number;   // (278%256)
        System.out.println(num);

        //Explicit Conversion- Type Casting, when in range, trying to store the int value in byte 
        byte x ;
        int y = 12;
        x = (byte)y;
        System.out.println(x);

        //Implicit Conversion- Type Conversion, trying to store the byte value in int 
        int r;
        byte m = 123;
        r = m;
        System.out.println(r);
    }
}