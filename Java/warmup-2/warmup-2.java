/*
stringTimes
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/

public String stringTimes(String str, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        result += str;
    }
    return result;
}

/*
frontTimes
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
*/

public String frontTimes(String str, int n) {
    String result = "";
    String front = str.length() > 3 ? str.substring(0, 3) : str;
    for (int i = 0; i < n; i++) {
        result += front;
    }
    return result;
}