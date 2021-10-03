package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void generatePassword() {
        Solution37 test = new Solution37();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()_+{}[]<>?,.~";
        String digits = "1234567890";
        for (int j = 0; j < 100; j++) {
            String password = test.generatePassword(8, 2, 2);
            System.out.println("Password " + j + " is " + password);
            int letterCount = 0;
            int specialCount = 0;
            int numberCount = 0;
            for (int i = 0; i < password.length(); i++) {
                if (alphabet.contains(String.valueOf(password.charAt(i)))) {
                    letterCount++;
                }
                if (special.contains(String.valueOf(password.charAt(i)))) {
                    specialCount++;
                }
                if (digits.contains(String.valueOf(password.charAt(i)))) {
                    numberCount++;
                }
            }
            assertTrue(letterCount > numberCount + specialCount);
            assertTrue(password.length() >= 8);
            assertEquals(2, specialCount);
            assertEquals(2, numberCount);
        }
    }
}