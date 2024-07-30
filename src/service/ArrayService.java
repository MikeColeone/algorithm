package service;

import java.util.Scanner;

public class ArrayService {

    //读入二维数组
    public static void inputNums(int[][] a){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        }
    }
}
