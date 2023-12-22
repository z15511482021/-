package com.zsh.动态规划.leetcode;

import org.junit.Test;

/**
 * @version v1.0
 * @ClassName: Solution_LCR161
 * @Description:
 * @Author: 赵思豪
 */
public class Solution_LCR161 {
    public int maxSales(int[] sales) {
        int maxEndHere = sales[0];
        int maxSoFar = sales[0];
        for (int i = 1; i < sales.length; i++) {
            maxEndHere = Math.max(sales[i], maxEndHere + sales[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
    @Test
    public void test(){
        int [] sales = {-2,1,-3,4};
        maxSales(sales);
    }
}
