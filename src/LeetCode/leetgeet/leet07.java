package LeetCode.leetgeet;

public class leet07 {

    /*

    #276

    there is a fence with n posts.
    each post can be painted with one of the k colors.
    You have to paint all the posts such that no more than 2 adjacent posts have the same color
    return the total number of ways you can paint the fence

    NOTE: n and k are non-negative integers.

     */

    /*

    ex:

    input: n = 3, k = 2
    output = 6
    explanation: take c1 as color 1, c2 as color 2, all possible ways are:

        post 1  post2   post3
    --------------------------
    1   2      1      1
    2   1      2      1
    3   1      1      2

    4   2      2      1
    5   1      2      2
    6   2      1      2

    exclude: 1, 1, 1
            and 2, 2, 2
            etc...

     */

/*
    public int numWays(int n, int k) {
        if (k < 1 || n < 1) {
            return 0;
        } else {
            //get the total number of combinations that occurs normally through perm/comb
            //possibly generate each possibility

            //test each possibility if it has more than 2 of the one variable
        }
    }
*/
    public static void main(String[] args) {

    }

}
