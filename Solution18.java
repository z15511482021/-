package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: Solution18
 * @Description:
 * @Author: 赵思豪
 */
public class Solution18 {
    @Test
    public void test(){
        int [] nums = {1000000000,1000000000,1000000000,1000000000};

        fourSum(nums,-294967296);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        dfs(4, 0, nums.length - 1, target, nums, new LinkedList<>(), res);
        return res;
    }

    private void dfs(int n, int i, int j, int target, int[] nums,
                     LinkedList<Integer> stack,
                     List<List<Integer>> res) {
        if (n == 2) {
            twoSum(i, j, nums, target, stack, res);
            return;
        }
        for (int k = i; k < j - (n - 2); k++) {
            if (k > i && nums[k] == nums[k - 1]) {
                continue;
            }
            stack.push(nums[k]);
            dfs(n - 1, k + 1, j, target - nums[k], nums, stack, res);
            stack.pop();
        }
    }

    public void twoSum(int i, int j, int[] nums, int target, LinkedList<Integer> stack,
                       List<List<Integer>> res) {
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                ArrayList<Integer> list = new ArrayList<>(stack);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                i++;
                j--;
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }
        }
    }
}
