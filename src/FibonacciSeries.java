public class FibonacciSeries {
    public static void main(String [] args){
        int n=10;
        int f=0,sec=1;
        System.out.print("Fibonacci series: "+f+ " "+sec);
        for(int i=2;i<n;i++){
            int next= f+sec;
            System.out.print(" "+next);
            f=sec;
            sec=next;
        }
    }
}
