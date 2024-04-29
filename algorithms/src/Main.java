
class Fibonacci {

    // Recursive
    public int RecursiveFibonacci(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return RecursiveFibonacci(n-1) + RecursiveFibonacci(n-2);
    }

    // Iterative
    public int IterativeFibonacci(int n) {
        if(n <= 1)
        {
            return n;
        }
        int a = 1;
        int b = 1;

        for(int i=2; i<n; i++)
        {
            int c = a;
            a = a + b;
            b = c;
        }
        return a;
    }

    public static void main(String args[])
    {
        int fib1,fib2;
        Fibonacci fibo = new Fibonacci();


        System.out.println("Recursive:");
        long startTime = System.nanoTime();
        fib1 = fibo.RecursiveFibonacci(47);
        long endTime = System.nanoTime() - startTime;
        System.out.println("The time is "+endTime/1000000000+"seconds");


        System.out.println("Iterative:");
        startTime = System.nanoTime();
        fib2 = fibo.IterativeFibonacci(43);
        endTime = System.nanoTime() - startTime;
        System.out.println("The time is "+endTime/1000000000+" nano seconds");
        
    }
}