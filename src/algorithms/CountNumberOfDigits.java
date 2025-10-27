package algorithms;

public class CountNumberOfDigits {
    static int countDigits(int number){
        long[] numbers = {10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        int counter = 1;
        for (int i=0;i< numbers.length;i++){
            if (number > numbers[i]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1234554321)); // 1234554321 has 10 digits
    }
}
