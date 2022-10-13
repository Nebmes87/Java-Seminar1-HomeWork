// Реализовать простой калькулятор

package Seminars.Seminar1.HomeWork;
import java.util.*;
import java.util.regex.*;
public class Task3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scn.nextLine();

        // все это ради того, чтобы можно было вводить выражение без пробелов :)
        // по простому можно было String[] expression = scn.nextLine().split("\\s+");
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("([0-9.]+)|(\\-|\\+|\\*|\\/)");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            tokens.add(matcher.group().strip());
        }

        double result = 0.0;
        double x = Double.parseDouble(tokens.get(0));
        double y = Double.parseDouble(tokens.get(2));
        switch (tokens.get(1)){
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                result = Double.NaN;
        }

        if (Double.isNaN(result)) {
            System.out.println("Вы ввели неверное выражение");
        } else {
            System.out.println(expression + " = " + result);
        }

        scn.close();
    }
}