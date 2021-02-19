import java.util.Scanner;

public class Start {


    public static void main(String[] args) {
        System.out.println("Welcome!");

while (true){
        int num1 = getInt();
        int num2 = getInt();
        char operator = getOperation();
        int result = calculate(num1,num2,operator);
        System.out.println("Результат операции : "+ result);
}

    }

        public static int getInt() {

            Scanner scan = new Scanner(System.in);

            System.out.println("ВВОД Числа");
            int num;

            if (scan.hasNext()) {
                num = scan.nextInt();
            } else {
                System.out.println(" Не введено целое число! ");
                scan.next();
                num = getInt();
            }
            return num;

        }

        public static char getOperation(){
            Scanner scan = new Scanner(System.in);

            System.out.println("ВВОД оператора (+ - % *)");
            char operation;
            if (scan.hasNext()){
                operation = scan.next().charAt(0);
            }else {
                System.out.println("ВВОД не корректный!");
                scan.next();
                operation = getOperation();
            }
               return operation;
        }

        public static int calculate (int num1,int num2,char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println(" Ввод не корректный ");
                System.out.println(" Введите ( + либо - либо * либо / ) ");
                result = calculate (num1,num2,getOperation());
        }
        return result;

        }
}
