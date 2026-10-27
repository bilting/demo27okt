public class MainRekursivDemo {
    static void main() {

        IO.println(fakultet(0));
        IO.println(fakultet(1));
        IO.println(fakultet(3));
        IO.println(fakultet(5));
        IO.println(fakultet(20));
    }
    // tveksamt om det blir klarare med rekursion, men OK
    static long fakultet(long l) {
        if (l<0) throw new RuntimeException("inte < 0 !");
        else if (l==0) return 1;
        else return l * fakultet(l-1);
    }
//  Utan rekursion
//    static long fakultetTråkig(long l) {
//        if (l<0) throw new RuntimeException("inte < 0 !");
//        long svar = 1;
//        for (long i = 1; i <= l; i++) {
//            svar = svar * i;
//        }
//        return svar;
//    }
}
