public class Question3 {

    public static boolean anagramChecker(String str1, String str2) {

//        return true if both strings are empty
//        works both for when all letters have been matched as well as for empty strings being anagrams of each other
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }

//        if strings have different lengths, return false
        if (str1.length() != str2.length()) {
            return false;
        }

//        take the first character of str1
        char firstChar = str1.charAt(0);

//        checks in what index firstChar is in str2, if not there, index = -1
        int index = str2.indexOf(firstChar);

//        if index = -1, then firstChar is not present in str2, therefore words are not anagrams
        if (index == -1){
            return false;
        }

//        remove firstChar from str2 and turns it into another string
        String newStr2 = str2.substring(0, index) + str2.substring(index + 1);

//        actual recursive method, excludes the first character and keeps going until strings are empty or a mismatch is found
        return anagramChecker(str1.substring(1), newStr2);
    }

    public static void main(String[] args) {

//        applying the method
        System.out.println(anagramChecker("silent", "listen")); //true
        System.out.println(anagramChecker("hello", "helli")); //false
    }
}
