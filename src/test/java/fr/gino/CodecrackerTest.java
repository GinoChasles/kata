package fr.gino;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CodecrackerTest {

    @Test
    public void chooseYourKeyTest(){
        String[] defaultKey = {"!", ")","\"","(","£","*","%","&",">","<","@","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
        String[] arrayExpected= {"f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r"};
        assertArrayEquals(arrayExpected, Codecracker.chooseYourKey("franck"));
        assertArrayEquals(defaultKey,Codecracker.chooseYourKey(""));
    }

    @Test
    public void codeYourWordTest(){
        assertEquals("%>cd", Codecracker.codeYourWord("gino", ""));
        assertEquals("*g!c\"@", Codecracker.letterIndexOfWord2("franck", ""));
        assertEquals("kkfrac", Codecracker.codeYourWord("franck", "franck"));
        assertEquals("fara", Codecracker.codeYourWord("gino", "franck"));
        assertEquals("iiginn", Codecracker.codeYourWord("franck", "gino"));
        assertEquals("ngin", Codecracker.codeYourWord("gino", "gino"));
    }
    @Test
    public void letterIndexOfWord2(){
        assertEquals("%>cd", Codecracker.letterIndexOfWord2("gino", ""));
        assertEquals("*g!c\"@", Codecracker.letterIndexOfWord2("franck", ""));
        assertEquals("kkfrac", Codecracker.letterIndexOfWord2("franck", "franck"));
        assertEquals("fara", Codecracker.letterIndexOfWord2("gino", "franck"));
        assertEquals("iiginn", Codecracker.letterIndexOfWord2("franck", "gino"));
        assertEquals("ngin", Codecracker.letterIndexOfWord2("gino", "gino"));


    }
}

// a b c d e f g h i j k l m n o p q r s t u v w x y z
// ! ) " ( £ * % & > < @ a b c d e f g h i j k l m n o
//  franck donne * g ! c  " @
// franck donne k k f r a c
//  gino donne f a r a

// a b c d e f g h i j k l m n o p q r s t u v w x y z
// g i n o g i n o g i n o g i n o g i n o g i n o g i

// franck donne i i g i n n
// gino donne n g i n

