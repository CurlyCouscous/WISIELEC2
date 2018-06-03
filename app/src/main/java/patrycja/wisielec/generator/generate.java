package patrycja.wisielec.generator;

import java.util.Random;

public class generate {
    private static Random generator = new Random();

    public static class WordContainer {
        String  []string;
        Integer count;
        Integer max;
    }

    public static void CreateWordContainer(WordContainer wc, Integer maxWords) {
        wc.count = 0;
        wc.max = maxWords;
        wc.string = new String[maxWords];
    }

    public static void WriteStringToContainer(WordContainer wc,String string){
        if(wc.count < wc.max ) {
            wc.string[wc.count] = string;
            wc.count++;
        }
    }

    public static String RandomWord(WordContainer word)  {
        Integer number = generator.nextInt(word.count);
        return word.string[number];
    }

}
