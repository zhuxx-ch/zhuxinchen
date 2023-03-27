package org.cn.zhuxin.biz.activity.study.leetcode;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[1000][1000];
        String result = "";
        for(int len = 1; len <= s.length(); len++){
            for(int i = 0; i < s.length() ; i++){
                int j = i + len -1;
                if(j >= s.length()){
                    break;
                }
                if(len == 1){
                    dp[i][j] = true;
                }else if(len == 2){
                    dp[i][j] = (chars[i] == chars[j] );
                }else{
                    dp[i][j] = dp[i+1][j-1] && (chars[i] == chars[j]);
                }
                if(dp[i][j] && len > result.length()){
                    result=s.substring(i,j+1);
                }
            }
        }
        return result;
    }
}
