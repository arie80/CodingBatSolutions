/*
Given a string, return a new string where the first and last chars have been exchanged.
*/

public String frontBack(String str) {
    if (str.length() > 1) {
        String mid = str.substring(1, str.length() -1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
    return str;
}