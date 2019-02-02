/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.
*/

public int close10(int a, int b) {
    int aVal = Math.abs(a - 10);
    int bVal = Math.abs(b - 10);

    if (aVal < bVal) {
        return a;
    } else if (aVal > bVal) {
        return b;
    }
    return 0;
}