
public class Division {

    public static void main(String[] args) {
        //division(3, 5);
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        float x = division(3, 5);
        System.out.println(x);
    }

    public static float division(int numerator, int denominator) {
        float div = (float) numerator / (float) denominator;
        //System.out.println(div);
        
        return div;
    }
    // implement the method here
}
