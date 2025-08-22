package com.itheima.demo1;

import java.util.Scanner;

/**
 * 1281.整数的各位积和之差
 * 给你一个整数 n，请帮助计算 n 的各位数字之积与其各位数字之和的差。
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        int sum = 0;
        int temp = 0;
        while(n != 0){
            //取最后一位
            temp = n % 10;
            mul = mul*temp;
            sum = sum+temp;
            //去掉最后一位
            n=n/10;
        }

        int result=0;
        result = mul-sum;
        System.out.println(result);

    }
}
/**
 * 思路：依次取出每一位，n%10是取最后一位，n/10是去掉最后一位
 */
