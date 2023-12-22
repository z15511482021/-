package com.zsh.动态规划.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: Solution_LCP07
 * @Description:
 * @Author: 赵思豪
 */
public class Solution_LCP07 {
    public int numWays(int n, int[][] relation, int k) {
        // 构建有向图
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] rel : relation) {
            graph.get(rel[0]).add(rel[1]);
        }
        //开始深度优先遍历
        int count = dfs(graph, 0, k);
        return count;
    }

    private int dfs(List<List<Integer>> graph, int curr, int k) {
        int count = 0;
        if (k == 0 && curr == graph.size() - 1) {
            count++;
            return count;
        }
        if (k == 0) {
            return 0;
        }
        for (Integer next : graph.get(curr)) {
            count += dfs(graph, next, k - 1);
        }
        return count;
    }

    @Test
    public void test() {
        int[][] relation = {{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}};
        System.out.println(numWays(5, relation, 3));
    }
}
