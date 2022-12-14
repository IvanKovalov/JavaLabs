package org.example.lab3;


public class TextHandler {
    TextHandler() {
    }

    public void execute(String inputText) {
        if (inputText.length() == 0){
            return;
        }

        String[] splitText = inputText.split("([.?,:;!()\\s])");
        char lastSymbol;
        String word;
        String originalWord;
        for (int i = 0; i < splitText.length; i++) {
            word = splitText[i];
            originalWord = splitText[i];
            if (word.length() != 1 && word.length() != 0) {
                lastSymbol = word.charAt(word.length() - 1);
                word = word.replaceAll(String.valueOf(lastSymbol).toUpperCase(), "");
                word = word.replaceAll(String.valueOf(lastSymbol).toLowerCase(), "");
                word = word + lastSymbol;
                inputText = inputText.replaceAll(originalWord, word);
            }
            splitText[i] = word;
        }
        System.out.println(inputText);
    }
}
