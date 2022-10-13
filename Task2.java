// Вывести все простые числа от 1 до 1000

package Seminars.Seminar1.HomeWork;
public class Task2 {
    public static boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; ++i) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }    
}