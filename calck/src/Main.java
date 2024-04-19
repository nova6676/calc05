import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите пример");
        String primer = new Scanner(System.in).nextLine();
        String string = calc(primer);
        System.out.println(string);

    }

    public static String calc(String input) throws Exception {
        String pervoe;
        String vtoroe;
        String operator;
        String Result = "";
        int num2;
        int num1;
        String[] strings = input.split(" ");
        if (strings.length > 3) {
            throw new Exception("введите пример в формате число;операция;число");
        } else if (strings.length < 3) {
            throw new Exception("строка не является математическим примером");
        }
        int ResultatNum;
        operator = strings[1];
        pervoe = strings[0];
        vtoroe = strings[2];
        try {
            num1 = Integer.parseInt(pervoe);
            num2 = Integer.parseInt(vtoroe);
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Число должно быть меньше 10 и больше 0");

            }
            else {

                switch (operator) {
                    case "+":
                        ResultatNum = num1 + num2;
                        break;
                    case "-":
                        ResultatNum = num1 - num2;
                        break;
                    case "/":
                        ResultatNum = num1 / num2;
                    case "*":
                        ResultatNum = num1 * num2;
                        break;
                    default:
                        throw new Exception("не подходящий знак действий ");
                }
                System.out.println(ResultatNum);
            }
        } catch (NumberFormatException e) {
            switch (vtoroe) {
                case "I" -> num2 = 1;
                case "II" -> num2 = 2;
                case "III" -> num2 = 3;
                case "IV" -> num2 = 4;
                case "V" -> num2 = 5;
                case "VI" -> num2 = 6;
                case "VII" -> num2 = 7;
                case "VIII" -> num2 = 8;
                case "IX" -> num2 = 9;
                case "X" -> num2 = 10;
                default -> throw new Exception("смешанные числа");
            }
            switch (pervoe) {
                case "I" -> num1 = 1;
                case "II" -> num1 = 2;
                case "III" -> num1 = 3;
                case "IV" -> num1 = 4;
                case "V" -> num1 = 5;
                case "VI" -> num1 = 6;
                case "VII" -> num1 = 7;
                case "VIII" -> num1 = 8;
                case "IX" -> num1 = 9;
                case "X" -> num1 = 10;
                default -> throw new Exception("смешанный числа");
            }
            switch (operator) {
                case "+":
                    ResultatNum = num1 + num2;
                    break;
                case "-":
                    ResultatNum = num1 - num2;
                    break;
                case "/":
                    ResultatNum = num1 / num2;
                    break;
                case "*":
                    ResultatNum = num1 * num2;
                    break;
                default:
                    throw new Exception("не подходящий знак действий ");
            }
            if (ResultatNum < 1) {
                throw new Exception("Римские числа должны быть больше < 1");
            }

            int[] num = {100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] figure = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            Result = "";
            for (int i = 0; i < num.length; i++) {
                while (ResultatNum >= num[i]) {
                    Result = Result + figure[i];
                    ResultatNum = ResultatNum - num[i];
                }
            }
        }
        return Result;
    }
}


