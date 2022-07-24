import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sig = new Scanner(System.in);
        int login, first, second, result;
        System.out.println("Введите Ваш ответ");
        login = sig.nextInt();


        switch (login){
            case 2:
                System.out.println("Вы получаете 23 балла");
                break;
            case 456 :
                System.out.println("Вы получаете 10 баллов");
                break;
            default:
                System.out.println("Вы проиграли");

        };





       int pervoe, vtoroe, resultat;
        Scanner muradScan = new Scanner(System.in);
        System.out.println("Это калькулятор для сложения чисел и деления их на два");
        System.out.println("___________________");
        System.out.println("ВВедите певрое чилсо для сложения");
        pervoe = muradScan.nextInt();
        System.out.println("Введите второе число для сложения");
        vtoroe = muradScan.nextInt();
        resultat = pervoe + vtoroe;
        resultat /=2;
        System.out.println("Резултат: " + resultat);


        float first1, second2, result3;
        Scanner ccr = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        first1 = ccr.nextInt();

        System.out.println("Введите второе число : ");
        second2 = ccr.nextInt();
        result3 = first1 + second2;
        System.out.println("Сумма : " + result3);



//код ниже скрыт
        String str = "Hello world? my name is murad. i'm developer it's application";
        System.out.println(str);

        Scanner murad = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        System.out.println("Ваше имя : " + murad.nextLine());
        System.out.println("Введите Ваш возраст");
        System.out.println("Ваш возрсат : " + murad.nextLine());
        System.out.println("Регистрация Завершена");

//  Код ниже скрыт
              {

        System.out.println("Калькулятор");
        System.out.println("_____________");


        double a = 0;
        double b = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число ");
        in.useLocale(Locale.US);
        a = in.nextDouble();

        System.out.print("второе число ");
        b = in.nextDouble();
        System.out.println("Сумма : " + (a + b));


    }

    }

}
