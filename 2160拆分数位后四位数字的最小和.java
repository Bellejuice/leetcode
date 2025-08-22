package com.itheima.demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2160. 拆分数位后四位数字的最小和
 * 给你一个四位 正 整数 num 。请你使用 num 中的 数位 ，将 num 拆成两个新的整数 new1 和 new2 。new1 和 new2 中可以有 前导 0 ，且 num 中 所有 数位都必须使用。
 * 比方说，给你 num = 2932 ，你拥有的数位包括：两个 2 ，一个 9 和一个 3 。一些可能的 [new1, new2] 数对为 [22, 93]，[23, 92]，[223, 9] 和 [2, 329] 。
 * 请你返回可以得到的 new1 和 new2 的 最小 和。
 */

/**
 * 思路：拆成两位两位相加，和最小，所以先取出四位数，然后从小到大排序，最小的两个数字分别作十位，其余两位数做各位
 */
public class t2160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = num % 10;
            num=num/10;
        }
        Arrays.sort(arr);
        int result=0;
        result = 10*(arr[0]+arr[1]) +arr[2]+arr[3];
        System.out.println(result);
    }
}
