public class Control {
    private FibonacciNumbers numbers;
    public Control(FibonacciNumbers numbers){
        this.numbers = numbers;
    }
    public String showNumber(int n){
        return String.valueOf(n) + "-е число: " + String.valueOf(this.numbers.number(n)) + "\n\n";
    }
    public String showNumbers(int n, int m){
        String numbersText = "";
        for (int i = n; i<m+1;i++)
            numbersText = numbersText.concat(String.valueOf(i) + ": " + String.valueOf(this.numbers.number(i)) + "\n");
        numbersText = numbersText.concat("\n");
        return numbersText;
    }

    public String getSum(int n, int m){
        return "Сумма чисел от " + String.valueOf(n) + "-го до " + String.valueOf(m) + "-го: " + String.valueOf(numbers.sum(n,m)) + "\n\n";
    }
    public String getOdd(int n, int m){
        return "Сумма нечётных чисел от " + String.valueOf(n) + "-го до " + String.valueOf(m) + "-го: " +String.valueOf(numbers.odd(n,m)) + "\n\n";
    }
    public String getEven(int n, int m){
        return "Сумма чётных чисел от " + String.valueOf(n) + "-го до " + String.valueOf(m) + "-го: " +String.valueOf(numbers.even(n,m)) + "\n\n";
    }

    public String divide(int n, int m){
        return String.valueOf(numbers.number(n)) + "/" + String.valueOf(numbers.number(m)) + ": " +  String.format("%.3f",((double)(numbers.number(n))/(double)(numbers.number(m)))) + "\n\n";
    }
    public int getAmount(){
        return numbers.getAmount();
    }

}
