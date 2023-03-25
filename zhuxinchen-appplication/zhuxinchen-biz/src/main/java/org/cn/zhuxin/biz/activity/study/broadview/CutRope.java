package org.cn.zhuxin.biz.activity.study.broadview;

/**
 * 67. 剪绳子【1. 函数求导法 2. 递推型dp】
 *
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。（2 <= n <= 60）
 */
public class CutRope {
    int[] dp = new int[60];
    public int cutRope(int target) {
        if(target == 2) return 1;
        if(target == 3) return 2;//这里的策略不同，要单独拎出来
        dp[2] = 2;
        dp[3] = 3;//在target>=4的前提下，dp[]数组2~3对应的值（不必强制分两段）
        for(int i=4; i<=target; ++i){
            int max = Integer.MIN_VALUE;
            for(int j=2; j<=i-1; ++j){//果然，dp的本质是穷举
                if(max < dp[j]*(i-j)){
                    max = dp[j]*(i-j);//动态规划重点是找到=>【最优子结构的递推公式】
                }
            }//另一种递推：将上一行的（i-j）换成dp[i-j]
            dp[i] = max;
        }
        return dp[target];
    }
}
