package Week02;

public class Gauss {

    public static double Gauss(int n) {
        return (((n * (n+1)) / 2.0));
    }

    public static void main(String[] args) {
        System.out.println(Gauss(1000));
    }
}
