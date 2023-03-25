package org.cn.zhuxin.biz.activity.study.broadview;

/**
 * 49. 把字符串转换成整数
 *
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0 输入一个字符串,包括数字字母符号,可以为空
 * ps：此题，没有科学计数法
 */
public class StrToInt {

    public int strToInt(String str) {
        if(str==null || str.length()==0)return 0;
        char[] ch = str.toCharArray();
        int flag = 1;//无符号默认是1
        if(ch[0] == '-'){
            flag = -1;
            ch[0] = '0';
        }
        if(ch[0] == '+'){
            ch[0] = '0';//+-号置为零
        }
        int res = 0;
        for(int i=0; i<=str.length()-1; ++i){
            res *= 10;//乘10放在+之前就不用判断了
            int num = ch[i]-'0';
            if(0<=num && num<=9){
                res += num;
            }
            else return 0;//出现非法字符
        }
        return res*=flag;
    }
}
