package org.cn.zhuxin.biz.activity.study.tencent.qiuzhao2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tencent2021Qiuzhao01 {
    public void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine().trim());
        String s = read.readLine().trim();
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i=0;i<s.length();i++){
            String s1 = s.substring(i,i+1);
            if ("0".equals(s1)){
                cnt0++;
            }else {
                cnt1++;
            }
        }
        int sameCnt = Math.max(cnt0, cnt1);
        String sameNum = cnt0 > cnt1 ? "0" : "1";
        int leftCnt = 0;
        for (int i=0;i<s.length();i++){
            String s1 = s.substring(i,i+1);
            if (sameNum.equals(s1)){
                break;
            }else {
                leftCnt++;
            }
        }
        int rightCnt = 0;
        for (int i = s.length();i>0;i--){
            String s1 = s.substring(i-1,i);
            if (sameNum.equals(s1)){
                break;
            }else{
                rightCnt++;
            }
        }
        int result = value(leftCnt)+value(rightCnt)+value(sameCnt);
        System.out.println(result);
    }
    private int value(int count){
        int value = 0;
        for (int i=1;i<=count;i++){
            value = value+i;
        }
        return value;
    }
}
