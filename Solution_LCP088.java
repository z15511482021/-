package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @version v1.0
 * @ClassName: Solution_LCP088
 * @Description:LCR 088. 使用最小花费爬楼梯
 * @Author: 赵思豪
 */
public class Solution_LCP088 {
    public int minCostClimbingStairs(int[] cost) {
       int a = cost[0];
       int b = cost[1];
       for(int i = 2; i < cost.length;i++){
           int c = Math.min(a,b)+cost[i];
           a = b;
           b = c;
       }
       return Math.min(a,b);
    }

    @Test
    public void test() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
