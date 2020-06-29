import java.util.Scanner;

class Calc {
    public static void main ( String [] args )
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение");
        String text = in.nextLine();
        System.out.println("Вы ввели " + text);
        String str[] = text.split(" ");
        String num1=str[0], num2=str[1], num3=str[2];

        ArabianNumbers arab = new ArabianNumbers();
        RomanianNumbers rom = new RomanianNumbers();


        int b1 = 0 ;                                         // наше первое число
        int b2 = 0 ;                                         // наше второе число
        int s= 0 ;                                           // результат вычисления


        int z1 = arab.arabNum (num1) ;
        int z2 = arab.arabNum (num3) ;
        int r1 = rom.romNum (num1) ;
        int r2 = rom.romNum (num3) ;
        int rim = 0;                                            // дополнительная переменная для римских цифр
        int rez = 0;                                            // дополнительная переменная для вывода ответа

        if ( z1>0 && z1 <= 10 && z2 > 0 && z2 <= 10)           // проверка соответствия чисел
        {
            b1 = z1 ;
            b2 = z2 ;
        }
        else if ( r1>0 && r1 <= 10 && r2 > 0 && r2 <= 10)
        {
            b1 = r1 ;
            b2 = r2 ;
            rim++ ;
        }
        else
        {
            System.out.println ("Вы ввели неверное число") ;
            rez++;
        }
        try {                                                          // перехват деления на ноль при неправильно введенных данных
                switch (num2)                                         // Начинаем считать - выбор знака
                {
                case "+":
                    s = b1 + b2;
                    break;
                case "-":
                    s = b1 - b2;
                    break;
                case "*":
                    s = b1 * b2;
                    break;
                case "/":
                    s = b1 / b2;
                    break;
                default: {
                    System.out.println("Вы ввели некорректный знак");
                    rez++;
                }
            }
            }
        catch (Exception e )
        {
            System.out.println("Ошибка введенных данных");
        }

        if (rim != 0)
        {
            System.out.println ("Итог вычисления = "+rom.answerRomanian(s)) ;
        }
        else if (rez == 0 ) {
               System.out.println("Итог вычисления = " + s);        
             }
    }
}
