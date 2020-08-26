package Exercises_on_simple_algorithms;

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

    public int factorial(){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

   /* public int maxVal(){
        return 0;
    }*/

    public boolean primeNumber(){
        boolean prNum = false;
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
