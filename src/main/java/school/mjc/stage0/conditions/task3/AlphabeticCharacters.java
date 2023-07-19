package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int asciiNumber = (int)character;
        String result = "wrong alphabet!";

        if((asciiNumber>=65 && asciiNumber<=90) || (asciiNumber>=97 && asciiNumber<=122))
        {
            if(character == 'A' || character == 'a' || character == 'E' || character == 'e'
            || character == 'I' || character == 'i' || character == 'Y' || character == 'y'
            || character == 'U' || character == 'u' || character == 'O' || character == 'o'){
                result = "Vowel";
            } else {
                result = "Consonant";
            }
        }

        System.out.println(result);
    }
}
