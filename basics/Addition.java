public class Addition {
    static int add(int a,int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        int a = add(4,7);
        System.out.println(a);
        double b = add(2.7,6.2);
        System.out.println(b);
    }
}
