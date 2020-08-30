package Java_Fundamentals_Exercises.Exercises_on_simple_algorithms;

import lombok.Data;




@Data
public class Algorithm {

    private int n ;
    private long l;
    private float y;

    public Algorithm(int n, long l, float y) {
        this.n = n;
        this.l = l;
        this.y = y;
    }

    public Algorithm() {
    }

    public int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

    public int maxVal(){
        int calc;
        int w=0;
        do{
            w++;
           calc=factorial(w) ;

        }while(calc>0);
        return w-1;
    }

    public boolean primeNumber(int n){
        boolean prNum = false;
        if (n==1 || n==0){return true;}
        for(int i = 2; i <= n/2; ++i)
        {// condition for non prime number
            if(n % i == 0) {
                prNum = true;
                break;
            }
        }
        return prNum;
    }

    public float calcValue(){
        float sum=0;
        for(float i=1;i<=n;i++){
            sum +=(1/i);
        }
        return sum;
    }

    public int countDigits(){
        String s =String.valueOf(l);
        return s.length();
    }

    public float decimalPart(){
        int intY=(int) y;
        return y-intY;
    }
}
