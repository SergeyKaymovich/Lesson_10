package by.teachmeskills.kaymovich.homework10;
public class WorkWithString {
    public static String removingSpaces(String input) {
        input.trim();
        while (input.contains("  ")) {
            input = input.replace("  ", " ");
        }
        return input;
    }

    public static String bankcardNumber(String input) {
        if (input.length() != 16) {
            throw new IllegalArgumentException("Bad card number!");
        }
        char[] string = input.toCharArray();
        for (int i = 0; i < string.length-4 ; i++) {
            if (string[i] >= '0' && string[i] <= '9') {
                    string[i] = '*' ;
                }
                    else {
                    throw new IllegalArgumentException("Enter correct number which contains 16 numerals");
                }
            }
            System.out.println(string);
        return input;
        }
        public static  String formatName(String surName,String name,String  name2){
            if (surName.length() == 0 || name.length() == 0) {
                throw new IllegalArgumentException("Input surname and name.");
            }
            name = name.substring(0, 1).toUpperCase() + ".";
            if (name2 != "") {
                name2 = name2.substring(0, 1).toUpperCase() + ".";
            }
            String shortName = surName.substring(0, 1).toUpperCase() + surName.substring(1) + " " + name + name2;
            return shortName;
        }
    public static boolean isBelarusPassport(String inputString) {

        if (inputString.length() != 9) {
            return false;
        }

        char[] stringToCharArray = inputString.toCharArray();

        if (!isUpperAndLatin(stringToCharArray[0]) || !isUpperAndLatin(stringToCharArray[1])) {
            return false;
        }

        for (int i = 2; i < stringToCharArray.length; i++) {
            if (!Character.isDigit(stringToCharArray[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isStrongPassword(String inputString) {

        if (inputString.length() < 8) {
            return false;
        }

        char[] stringToChar = inputString.toCharArray();

        boolean hasDigit = false;
        boolean hasUpperLetter = false;
        boolean hasLowerLetter = false;

        for (char c : stringToChar) {
            if (isLatinOrCyrillicUpperCase(c)) hasUpperLetter = true;
            if (isLatinOrCyrillicLowerCase(c)) hasLowerLetter = true;
            if (Character.isDigit(c)) hasDigit = true;

            if (hasDigit && hasLowerLetter && hasUpperLetter) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmail(String inputString) {

        if (inputString.contains("@") && (inputString.indexOf('@') == inputString.lastIndexOf('@'))
                && !inputString.contains(" ")) {
            return inputString.indexOf('@') < inputString.length() - 1 && inputString.indexOf('@') > 0;
        }
        return false;
    }

    private static String getPreparedString(String inputString) {

        String tmpString = removingSpaces(inputString);
        char[] stringToCharArray = tmpString.toCharArray();

        if (Character.isLowerCase(stringToCharArray[0])) {
            stringToCharArray[0] = Character.toUpperCase(stringToCharArray[0]);
            return new String(stringToCharArray);
        }
        return new String(stringToCharArray);
    }

    private static boolean isUpperAndLatin(char inputChar) {

        return Character.isUpperCase(inputChar) && ((inputChar >= 'A' && inputChar <= 'Z') ||
                (inputChar >= 'a' && inputChar <= 'z'));
    }

    private static boolean isLatinOrCyrillicUpperCase(char inputChar) {

        return ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'А' && inputChar <= 'Я')
                || inputChar == 'Ё');
    }

    private static boolean isLatinOrCyrillicLowerCase(char inputChar) {

        return ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'а' && inputChar <= 'я')
                || inputChar == 'ё');
    }
    }
