package fr.gino;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CodecrackerTest {

    @Test
    public void letterIndexOfWord() {
        String[] indexWord = { "%", ">", "c", "d" };        
        String[] codedWord2 = { "*", "g", "!", "c", "\"", "@" };
        assertArrayEquals(indexWord, Codecracker.letterIndexOfWord("gino"));
        assertArrayEquals(codedWord2, Codecracker.letterIndexOfWord("franck"));
    }
    
    @Test
    public void chooseYourKeyTest(){
        String[] defaultKey = {"!", ")","\"","(","£","*","%","&",">","<","@","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
        String[] arrayExpected= {"f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r"};
        assertArrayEquals(arrayExpected, Codecracker.chooseYourKey("franck"));
        assertArrayEquals(defaultKey,Codecracker.chooseYourKey(""));
    }
    
    @Test
    public void codeYourWordTest(){
        
        assertEquals("kkfrac", Codecracker.codeYourWord("franck", "franck"));
        assertEquals("fara", Codecracker.codeYourWord("gino", "franck"));
        assertEquals("igginn", Codecracker.codeYourWord("franck", "gino"));
        assertEquals("ngin", Codecracker.codeYourWord("gino", "gino"));
    }
    @Test
    public void letterIndexOfWord2(){
        String[] indexWord = { "%", ">", "c", "d" };
        assertArrayEquals(indexWord, Codecracker.letterIndexOfWord("gino"));
        assertEquals("kkfrac", Codecracker.letterIndexOfWord2("franck", "franck"));
        assertEquals("fara", Codecracker.letterIndexOfWord2("gino", "franck"));
        assertEquals("iiginn", Codecracker.letterIndexOfWord2("franck", "gino"));
        assertEquals("ngin", Codecracker.letterIndexOfWord2("gino", "gino"));

    }
}

// String[] arrayExpected= {"f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r", "a", "n", "c", "k","f", "r"};
// a b c d e f g h i j k l m n o p q r s t u v w x y z
// f r a n c k f r a n c k f r a n c k f r a n c k f r 

// franck donne k k f r a c
//  gino donne f a r a

// a b c d e f g h i j k l m n o p q r s t u v w x y z
// g i n o g i n o g i n o g i n o g i n o g i n o g i n

// franck donne i i g i n n
// gino donne n g i n

