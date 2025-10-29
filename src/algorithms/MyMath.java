package algorithms;

@SuppressWarnings("unused")
public class MyMath {

    public static int floor(double a){
        return (int) a;
    }

    public static int ceil(double a){
        return (int) a + 1;
    }

    public static double round(double a){
        int floor = floor(a);
        double decimalNumber = a - floor;
        if (decimalNumber >= 0.5) return a + 0.1;
        else return a;
    }

}
