class RomanianNumbers {
    public static int romNum ( String number )
    {
        String num = number;
        int numb = calculater (num);
        return numb;
    }
    public static String answerRomanian (int answerRomNumber)
    {
        int answerRom = answerRomNumber;
        String answ = answer(answerRom) ;
        return answ;
    }

    private static int calculater (String num) {
        int num11 = 0;
        switch (num) {
            case "I":
                num11 = 1;
                break;
            case "II":
                num11 = 2;
                break;
            case "III":
                num11 = 3;
                break;
            case "IV":
                num11 = 4;
                break;
            case "V":
                num11 = 5;
                break;
            case "VI":
                num11 = 6;
                break;
            case "VII":
                num11 = 7;
                break;
            case "VIII":
                num11 = 8;
                break;
            case "IX":
                num11 = 9;
                break;
            case "X":
                num11 = 10;
                break;
        }
        return num11;
    }        //перевод римских цифр в натуральные числа

    private static String answer (int num)                  //перевод результата вычислений в римские цифры
    {

        String answerReady;
        String s = Integer.toString(num);
            char[] str = s.toCharArray();

            String sim1=null;
            String sim2=null;

            if (str.length==1)
            {
                switch (str[0]) {
                    case '1':
                        sim1 = "I";
                        break;
                    case '2':
                        sim1 = "II";
                        break;
                    case '3':
                        sim1 = "III";
                        break;
                    case '4':
                        sim1 = "IV";
                        break;
                    case '5':
                        sim1 = "V";
                        break;
                    case '6':
                        sim1 = "VI";
                        break;
                    case '7':
                        sim1 = "VII";
                        break;
                    case '8':
                        sim1 = "VIII";
                        break;
                    case '9':
                        sim1 = "IX";
                        break;
                }
                sim2="";
            }
            else if (str.length==3) {
                sim1="C" ;
                sim2="";
            }
            else if (str. length==2)
            {
                switch (str[0]) {

                    case '1':
                        sim1 = "X";
                        break;
                    case '2':
                        sim1= "XX";
                        break;
                    case '3':
                        sim1= "XXX";
                        break;
                    case '4':
                        sim1= "XL";
                        break;
                    case '5':
                        sim1= "L";
                        break;
                    case '6':
                        sim1= "LX";
                        break;
                    case '7':
                        sim1 = "LXX";
                        break;
                    case '8':
                        sim1= "LXXX";
                        break;
                    case '9':
                        sim1= "XC";
                        break;
                }


                switch (str[1]) {

                    case '0':
                        sim1 = "";
                        break;
                    case '1':
                        sim2= "I";
                        break;
                    case '2':
                        sim2= "II";
                        break;
                    case '3':
                        sim2= "III";
                        break;
                    case '4':
                        sim2= "IV";
                        break;
                    case '5':
                        sim2= "V";
                        break;
                    case '6':
                        sim2= "VI";
                        break;
                    case '7':
                        sim2 = "VII";
                        break;
                    case '8':
                        sim2= "VIII";
                        break;
                    case '9':
                        sim2="IX";
                        break;

                }}
            answerReady = (sim1+sim2);
            return answerReady;
        }
    }
