class Calculator {
    int r;
    public int add(int n1, int n2) {
        r = n1+n2;
        return r;
    }
}
public class ObjClass{
    public static void main(String args[]){
        int num1=4, num2=5;
        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
    }
}