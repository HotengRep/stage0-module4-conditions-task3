package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        int asciiNumber = (int)symbol;
        String result = "Non English";

        if((asciiNumber>=65 && asciiNumber<=90) || (asciiNumber>=97 && asciiNumber<=122))
        {
            result = "English";
        }

        System.out.println(result);

    }
}
