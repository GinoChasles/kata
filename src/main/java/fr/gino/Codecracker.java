package fr.gino;

import java.util.Arrays;
import java.util.List;

public class Codecracker {

    public static void main(String[] args) {}

    public static String[] letterIndexOfWord(String word) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
        String[] defaultKey = {"!", ")","\"","(","£","*","%","&",">","<","@","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};

        List<String> alphabetList = Arrays.asList(alphabet);

        String[] letterOfWord = word.split("");
        int[] positionOfLetter = new int[letterOfWord.length];

        for (int i = 0; i < letterOfWord.length; i++) {
            positionOfLetter[i] = alphabetList.indexOf(letterOfWord[i]);
        }

        String[] codedWord = new String[letterOfWord.length];

        for (int i = 0; i < letterOfWord.length; i++) {
            codedWord[i] = defaultKey[positionOfLetter[i]];
        }
        return codedWord;
    }

    public static String[] chooseYourKey(String key){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
        String[] defaultKey = {"!", ")","\"","(","£","*","%","&",">","<","@","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
        String[] keyConvert = key.split("");
        String[] finalKey = new String[alphabet.length];
            if(key.equals("")){
                finalKey = defaultKey;
            }else {
            for(int i=0; i <=finalKey.length -1; i++){
                finalKey[i] = keyConvert[i%keyConvert.length];
            }
        }
            return finalKey;
        }

        public static String codeYourWord(String wordForConvert, String key){
            chooseYourKey(key);
            return letterIndexOfWord(wordForConvert).toString();

        }



        public static String letterIndexOfWord2(String word, String key) {
            String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",};
            String[] keyUse = chooseYourKey(key);
            List<String> alphabetList = Arrays.asList(alphabet);
            String wordConverted = "";
    
            String[] letterOfWord = word.split("");
            int[] positionOfLetter = new int[letterOfWord.length];
    
            for (int i = 0; i < letterOfWord.length; i++) {
                positionOfLetter[i] = alphabetList.indexOf(letterOfWord[i]);
            }
    
            String[] codedWord = new String[letterOfWord.length];
    
            for (int i = 0; i < letterOfWord.length; i++) {
                codedWord[i] = keyUse[positionOfLetter[i]];
            }

            for(int j=0; j<codedWord.length; j++){
                wordConverted += codedWord[j] + "";
            }            
            // wordConverted = Arrays.asList(codedWord).toString();
            // return Arrays.toString(codedWord);
            return wordConverted;
        }
    
    }

