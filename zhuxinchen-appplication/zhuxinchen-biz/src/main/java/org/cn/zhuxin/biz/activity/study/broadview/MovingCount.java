package org.cn.zhuxin.biz.activity.study.broadview;

/**
 * 66. 机器人的运动范围【二维dfs回溯+flag试错】
 *
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 * 【总体思路】dfs+剪枝
 */
public class MovingCount {
    //时间O(rows*cols)  空间O(rows*cols)
//不能用两层for循环来做是因为：本题需要相连的空间，所以必须bfs、dfs二选一
//感觉修改一下就是迷宫找路
    int count = 0;
    public int movingCount(int threshold, int rows, int cols) {
        boolean flag[][] = new boolean[rows][cols];//标记方格有没有来过，这里的flag不可逆
        dfs(threshold, rows, cols, 0, 0, flag);//从(0,0)开始探索。。
        return count;
    }
    public void dfs(int threshold, int rows, int cols, int i, int j, boolean flag[][]){
        if(0<=i && i<=rows-1 && 0<=j && j<=cols-1){
            if(flag[i][j] == false && i/10 + i%10 + j/10 + j%10 <= threshold){//i、j属于[0,99]
                ++count;
                flag[i][j] = true;//不用还原
                //如果一个块块不符合，它周围就不用再试了
                dfs(threshold, rows, cols, i+1, j, flag);
                dfs(threshold, rows, cols, i-1, j, flag);
                dfs(threshold, rows, cols, i, j+1, flag);
                dfs(threshold, rows, cols, i, j-1, flag);
            }
        }
    }
}
