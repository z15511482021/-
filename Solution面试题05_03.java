package com.zsh.动态规划.leetcode;

/**
 * @version v1.0
 * @ClassName: Solution面试题05_03
 * @Description:
 * @Author: 赵思豪
 */
public class Solution面试题05_03 {
    public int reverseBits(int num) {
        int cur = 0;
        int insert = 0;
        int res = 1;
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & num) != 0) {
                cur += 1;
                insert += 1;
            } else {
                insert = cur + 1;
                cur = 0;
            }
            res = Math.max(res, insert);
        }
        return res;
    }
}
