/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
*/

public String front22(String str) {
    int len = str.length() < 2 ? str.length() : 2;
    String front= str.substring(0, len);
    return front + str + front;
}