package patrycja.wisielec.refactoring;

import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import patrycja.wisielec.generator.generate;

public class refactor {
    public static class CurrentWord {
        String               word;
        String               refactoredWord;
        Integer              mistakes;
        Map<String,Boolean>  letters;
        Map<String,Boolean>  lettersGuessed;
        String               guessed;
    }

    private static CurrentWord myWord = new CurrentWord();

    public static String SetText(String text) {
        Map<String,Boolean> letters = new HashMap<String, Boolean>();
        Map<String,Boolean> lettersGuessed = new HashMap<String, Boolean>();
        UpdateWord(text);
        letters = CreateLettersMap(text);
        UpdateLetters(letters);
        String refactoredText = HideAllLetters();
        UpdateCurrentWordValues(text, refactoredText, 0, letters, lettersGuessed, "none");
        return myWord.refactoredWord;
    }

    public static String CheckText(String ch) {
        if(myWord.letters.containsKey(ch)) {
            Log.i("CHECK TEXT", "KEY: "+ ch + "founded");
            UpdateLettersGuessed(ch);
            UpdateRefactoredWord(HideLettersWithException());
            if (myWord.letters.size()==myWord.lettersGuessed.size()){
                String wordGuessed = "true";
                UpdateGuessed(wordGuessed);
            }
        } else {
            Log.i("CHECK TEXT", "KEY: "+ ch + "not founded");
            UpdateMistakes();
        }
        return myWord.refactoredWord;
    }

    public static void SetWord(TextView word){
        word.setText(myWord.word);
    }

    public static String CheckGeuessed(){
        return myWord.guessed;
    }

    private static void UpdateLetters(Map<String,Boolean> letters){
        myWord.letters = letters;
    }

    private static void UpdateWord(String word){
        myWord.word = word;
    }

    private static void UpdateMistakes(){
        myWord.mistakes++;
    }

    public static void UpdateGuessed(String guessed){
        myWord.guessed = guessed;
    }

    private static void UpdateLettersGuessed(String ch){
        myWord.lettersGuessed.put(ch,true);
    }

    private static void UpdateRefactoredWord(String word){
        myWord.refactoredWord = word;
    }

    private static Map<String,Boolean> CreateLettersMap (String text) {
        Map<String, Boolean> letters = new HashMap<String, Boolean>();
        Integer length = text.length();
        Character ch;
        for (int i=0; i<length; i++){
            ch = text.charAt(i);
            if(IsLetter(ch)){
                letters.put(ch.toString(),true);
            }
        }
        return letters;
    }

    public static int GetMistakes() {
        return myWord.mistakes;
    }

    private static String HideAllLetters() {
        String text = myWord.word;
        String newText = "";
        Integer lenght = text.length();
        Character ch;
        for (int i=0;i<lenght;i++){
            ch = text.charAt(i);
            if(Character.isSpaceChar(ch)){
                newText += "  ";
            } else {
                newText += "_ ";
            }
        }
        return newText;
    }

    private static String HideLettersWithException() {
        String newText = "";
        String text = myWord.word;
        Integer length = text.length();
        Character ch;
        for (int i=0;i<length;i++){
            ch = text.charAt(i);
            if(Character.isSpaceChar(ch)){
                newText += "  ";
            } else {
                if(myWord.lettersGuessed.containsKey(ch.toString())){
                    newText += ch + " ";
                } else {
                    newText += "_ ";
                }
            }
        }
        return newText;
    }

    private static Boolean IsLetter (Character ch) {
        if (Character.isLetter(ch) || ch == 'ą' || ch == 'Ą' || ch == 'ć' || ch == 'Ć' || ch == 'ę' || ch == 'Ę' || ch == 'ł' || ch == 'Ł' || ch == 'ń' || ch == 'Ń' || ch == 'ó' || ch == 'Ó' || ch == 'ś' || ch == 'Ś' || ch == 'ź' || ch == 'Ź' || ch == 'ż' || ch == 'Ż' ){
            return true;
        } else {
            return false;
        }
    }

    private static void UpdateCurrentWordValues(String word, String refactoredWord, Integer mistakes, Map<String,Boolean> letters, Map<String,Boolean> lettersGuessed, String guessed) {
        myWord.word = word;
        myWord.refactoredWord = refactoredWord;
        myWord.mistakes = mistakes;
        myWord.letters = letters;
        myWord.lettersGuessed = lettersGuessed;
        myWord.guessed = guessed;
    }



}
