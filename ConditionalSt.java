public class ConditionalSt {
    public static void main (String args[]) {
        //TERNARY OPERATOR
        int n = 1;
        int res;
        res = n>3?3:4;
        System.out.println(res);

        //SWITCH 
        String day = "Thur";
        String result;
        switch(day) {
            case "mon": result ="3 am";
            default: result ="5 am";
        }
        System.out.println(result);
        
    }
}