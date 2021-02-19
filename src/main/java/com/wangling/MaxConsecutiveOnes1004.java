package com.wangling;

/**
 * @author lingwang
 * @since 1.0.0
 * Created on 2021-02-20 00:24
 */
public class MaxConsecutiveOnes1004 {

    public static void main(String[] args) {
        int[] A = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(A, 2));
    }

    public static int longestOnes(int[] A, int K) {
        int n = A.length;
        int left = 0, lsum = 0, rsum = 0;
        int ans = 0;
        for (int right = 0; right < n; ++right) {
            rsum += 1 - A[right];
            while (lsum < rsum - K) {
                lsum += 1 - A[left];
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
