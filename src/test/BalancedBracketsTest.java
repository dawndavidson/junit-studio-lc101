package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void wordHasNoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Line"));
    }

    @Test
    public void wordHasSymbolsAndOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code%"));
    }

    @Test
    public void wordHasBracketsFacingTheWrongWay() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch [Code"));
    }

    @Test
    public void wordHasNoBracketsAndANumber() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Code525"));
    }

    @Test
    public void bracketHasAllSpecialCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("$%^&**(@!"));
    }

    @Test
    public void lineOnlyHasBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void lineOnlyHasLetters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("abcdefghijklmnopqrst"));
    }

    @Test
    public void lineHasMultipleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("L][A[U[N[C[H"));
    }

    @Test
    public void lineIsCorrect() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
}






