package ru.spbu.apmath.prog.hw2.task2;

public class NumberTranslator {
    public static String translate(int number){
        String[] firtsten = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] secondten = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
                        "восемьдесят", "девяносто"};
        String[] hundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
                            "восемьсот", "девятьсот", "тысяча"};
        if(1 <= number && number <= 9) {
            return firtsten[number - 1];
        }else if(10 <= number && number <= 99){
            if ((int)Math.floor(number/10) == 1){
                return secondten[number%10];
            }else{
                if(number%10 == 0){
                    return tens[(int)Math.floor(number/10) - 2];
                }else{
                    return tens[(int)Math.floor(number/10) - 2] + firtsten[number%10 - 1];
                }
            }
        }else if(100 <= number && number <= 999){
            if ((int)Math.floor(number/10)%10 == 1){
                    return hundreds[(int)Math.floor(number/100) - 1] + secondten[number%10];
            }else{
                if(number%10 == 0){
                    if(((int)Math.floor(number/10)%10) == 0){
                        return hundreds[(int)Math.floor(number/100) - 1];
                    }else{
                        return hundreds[(int)Math.floor(number/100) - 1] +
                                tens[(int)Math.floor(number/10)%10 - 2];
                    }
                }else{
                    if((int)Math.floor(number/10)%10 == 0){
                        return hundreds[(int)Math.floor(number/100) - 1] + firtsten[number%10 - 1];
                    }else{
                        return hundreds[(int)Math.floor(number/100) - 1] +
                                tens[(int)Math.floor(number/10)%10 - 2] + firtsten[number%10 - 1];
                    }
                }
            }
        }else{
            return hundreds[9];
        }
    }
}
