import java.util.ArrayList;

public class FibonacciNumbers {
    private ArrayList<Long> numbers;
    private int amount = 2;
    public FibonacciNumbers(){
        this.numbers = new ArrayList<>();
        this.numbers.add(0, 1L);
        this.numbers.add(1, 1L);
    }

    public int getAmount(){
        return amount;
    }
    public long number(int n){
        if (n==1||n==2)
            return 1;
        else {
            if (n>this.amount) {
                this.numbers = new ArrayList<>(n);
                this.numbers.add(0, 1L);
                this.numbers.add(1, 1L);
                for (int i = 2; i < n; i++) {
                    this.numbers.add(i, this.numbers.get(i-2)+this.numbers.get(i-1));
                }
            }
            if (n>this.amount)
                this.amount = n;
            return this.numbers.get(n-1);
        }
    }

    public long sum(int n, int m){
        if (n==1&&m==2)
            return 2;
        if (this.amount<m) {
            for (int i = amount-1; i < m; i++)
                numbers.add(i, numbers.get(i - 2) + numbers.get(i - 1));
        }
        long result = 0;
        for (int i = n-1; i<m; i++)
            result+=numbers.get(i);
        if (m>this.amount)
            this.amount = m;
        return result;
    }

    public long even(int n, int m){
        if (n==1&&m==2)
            return 1;
        if (this.amount<m) {
            for (int i = amount-1; i < m; i++)
                numbers.add(i, numbers.get(i - 2) + numbers.get(i - 1));
        }
        long result = 0;
        for (int i = n-1; i<m; i++)
            if (i%2==1)
                result+=numbers.get(i);
        if (m>this.amount)
            this.amount = m;
        return result;
    }
    public long odd(int n, int m){
        if (n==1&&m==2)
            return 1;
        if (this.amount<m) {
            for (int i = amount-1; i < m; i++)
                numbers.add(i, numbers.get(i - 2) + numbers.get(i - 1));
        }
        long result = 0;
        for (int i = n-1; i<m; i++)
            if (i%2==0)
                result+=numbers.get(i);
        if (m>this.amount)
            this.amount = m;
        return result;
    }
}
