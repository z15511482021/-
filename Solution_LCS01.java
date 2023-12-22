package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution_LCS01
 * @Description:
 * @Author: 赵思豪
 */
public class Solution_LCS01 {
    public int leastMinutes(int n) {
        int bandwidth = 1;
        int count = 0;
        int minutes = 0;
        while (count < n) {
            if (count + bandwidth >= n) {
                count += bandwidth;
            } else {
                bandwidth *= 2;
            }
            minutes++;
        }
        return minutes;
    }
}
