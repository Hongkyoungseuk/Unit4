public class Main {
    public static void main(String[] args) {

    }
    //_1
    public static double converLireEuro(int n) {
        // TODO 돈을 유로(Euro)로 환전
        return (double)n;
    }
    //_2
    public static boolean sumOverflow(byte x, byte y) {
        // TODO overflow가 일어나면 true 

        return true;
    }
    //_4
    public static boolean even(long x) {
        // TODO 숫자가 짝수면 true 홀수면 false

        return true;
    }
    //_5
    // TODO error가 안 생기게 하시세요
    public static void exercise_5() {
        short x = 22;
        byte y = x;
        System.out.println(y);
    }
    //_6_7
    public static void exercise() {
        byte b; short s; int i; long l; float f; double d; char c; boolean b1, b2;
        //_6
        // TODO 각 표현의 대하여 어떠한 유형(types)을 가지는지 쓰시오.
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
        // TODO 다음중 어떤것이 compiler error를 일으키는지 말하시오.
        a = 65L;
        f = i+100;
        i = 2*b +l;
        b1 = s;
        b2 = s >= 57;
        c = b;
        c = 'b';
    }
    //_8 -> Account.java , Exercise_4_8.java
    //_9 -> Product.java , TestProduct.java
    //_10
    public static char lastCharater(String s) {
        //TODO 문자열(string) 의 마지막 문자를 return하게 작성
        return ;
    }    
}
