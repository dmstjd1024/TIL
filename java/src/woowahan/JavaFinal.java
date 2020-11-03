package woowahan;

public class JavaFinal {
    public static void main(String[] args) {

    }


/*    public int addFromTo(final int a, final int b){
        int sum = 0;
        for(int i= a; i< b; i++){
            sum += i;
        }
        return sum;
    }*/

    public int addFromTo(final int a, final int b){
        return addFormOneTo(b) - addFormOneTo(a -1);
    }

    private int addFormOneTo(final int n){
        return ( n * (n + 1) ) /2;
    }
}
