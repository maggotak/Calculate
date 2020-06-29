class ArabianNumbers {

    public static int arabNum ( String number )
    {
      String num = number;
      int numb = calculater (num);
      return numb;
    }
    private static int calculater (String num)    // обрабатываем арабские цифры
    {
        int num11 = 0;
        switch (num) {
            case "1":
                num11 = 1;
                break;
            case "2":
                num11 = 2;
                break;
            case "3":
                num11 = 3;
                break;
            case "4":
                num11 = 4;
                break;
            case "5":
                num11 = 5;
                break;
            case "6":
                num11 = 6;
                break;
            case "7":
                num11 = 7;
                break;
            case "8":
                num11 = 8;
                break;
            case "9":
                num11 = 9;
                break;
            case "10":
                num11 = 10;
                break;
        }
        return num11;
    }
}
