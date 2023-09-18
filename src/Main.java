public class Main {
    public static void main(String[] args) {

    }
    //_1
    public static double converLireEuro(int n) {
        // TODO 돈을 유로로 환전
        return (double)n;
    }
    //_2
    public static boolean sumOverflow(byte x, byte y) {
        // TODO 오버플로가 일어나면 true 

        return true;
    }
    //_4
    public static boolean even(long x) {
        // TODO 숫자가 짝수면 true 홀수면 false

        return true;
    }
    //_5
    // TODO 에러가 안생기게 하시세요
    public static void exercise_5() {
        short x = 22;
        byte y = x;
        System.out.println(y);
    }
    //_6_7
    public static void exercise() {
        byte b; short s; int i; long l; float f; double d; char c; boolean b1, b2;
        //_6
        /*
         b + 10L
         (b+i)+l
         (b+i)*l+f
         s/f + Math.sin(f)
         c == 'b'
         l+1.5f
         i<10
         b1 == (f >= 5.0)
         b1 && !b2
         */

        //_7
        a = 65L;
        f = i+100;
        i = 2*b +l;
        b1 = s;
        b2 = s >= 57;
        c = b;
        c = 'b';
    }
    
    
}

//_8
public class Account {
    public int bal;
    public Account(int x) {
        bal = x;
    }
}
public class Exercise_4_8 {
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *=2;
    }
    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        System.out.println(c + " " + r.bal);
    }
}
//_9

