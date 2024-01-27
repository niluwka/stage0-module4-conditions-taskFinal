package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result;
        int multiply;
        if (dividend % 2 == 0 && divider % 2 == 0 ) {
result = dividend / divider;
multiply = result * divider;
if ( multiply == divider){
    System.out.println("can be divided completely");
}else {
    System.out.println("cannot be divided completely");
}
        }
    }
}
