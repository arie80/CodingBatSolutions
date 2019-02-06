/*
makeBricks
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.
*/

public boolean makeBricks(int small, int big, int goal) {
    if (big * 5 + small < goal || goal % 5 > small) return false;
    return true;
}

/*
loneSum
Given 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values, it does not count towards the sum.
*/

public int loneSum(int a, int b, int c) {
    int sum = 0;
    // check a
    if (a != b && a != c) sum += a;
    // check b
    if (b != a && b != c) sum += b;
    // check c
    if (c != a && c != b) sum += c;
    return sum;
}

/*
luckySum
Given 3 int values, a b c, return their sum.
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.
*/

public int luckySum(int a, int b, int c) {
    int sum = 0;
    if (a == 13) return sum;
    if (a != 13) sum += a;
    if (b != 13) sum += b;
    if (b != 13 && c != 13) sum += c;
    return sum;
}

/*
noTeenSum
Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main noTeenSum().
*/

public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
}

public int fixTeen(int n ) {
    if (n >= 13 && n <= 19) {
        if (n == 15 || n == 16) return n;
        n = 0;
    } 
    return n;
}

/*
roundSum
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
Given 3 ints, a b c, return the sum of their rounded values.
To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
Write the helper entirely below and at the same indent level as roundSum().
*/

public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);  
}

public int round10(int n) {
    int rem = n % 10;
    n -= rem;
    if (rem >= 5) n  += 10;
    return n;
}

/*
closeFar
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.
*/

public boolean closeFar(int a, int b, int c) {
    int ab = Math.abs(a - b);
    int ac = Math.abs(a - c);
    int bc = Math.abs(b - c);
    return (ab <= 1 && ac >= 2 && bc >= 2 || 
            ac <= 1 && ab >= 2 && bc >= 2);
}

/*
blackJack
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.
*/
public int blackjack(int a, int b) {
    if (a > 21) a = 0;
    if (b > 21) b = 0;
    return a < b ? b : a;
}

/*
evenlySpaced
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
*/

public boolean evenlySpaced(int a, int b, int c) {
    int temp;
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    if(b > c) {
        temp = b;
        b = c;
        c = temp;
    }
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    return b - a == c - b;
}

/*
makeChocolate
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
*/

public int makeChocolate(int small, int big, int goal) {
    int x = goal - (big * 5);
    if (x <= small && x >= 0) return x;
    if (x < 0 && goal % 5 <= small) return goal % 5;
    return -1;
}