package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void hasBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    //The string may contain non-bracket characters as well.
    @Test
    public void hasNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasNonBracketCharacters("[]"));
    }

    @Test
    public void hasStringWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasStringWithBalancedBrackets("[]"));
    }

    @Test
    public void hasStrWithBalancedBrackets() {
        assertFalse(BalancedBrackets.hasStrWithBalancedBrackets("[]"));


    }
}
