// While Loop Example
// Fibonacci Series
public class Practical10 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int nt;
        int i =3;
        int n = 10; // number of terms in Fibonacci series
        System.out.print("Fibonacci Series: " + n1 + " " + n2 + " ");
        while (i <= n) {
            nt = n1 + n2;
            System.out.print(nt + " ");
                nt = n1 + n2;
                n1 = n2;
                n2 = nt;
            i++;
            }
    }
}

/*

OUTPUT:
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
*/