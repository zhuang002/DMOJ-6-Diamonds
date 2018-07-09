/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamonds;

import java.util.Scanner;

/**
 *
 * @author zhuang001
 */
public class Diamonds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDiamond(n);
    }

    private static void printDiamond(int n) {
        for (int i = 0; i < n; i++) {
            printLine(n, i);
        }
    }

    private static void printLine(int n, int a) {
        int padding;
        if (a > n/2) {
            a = (n - 1) - a;
        }
        if (a == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print('*');
            }
        } else {
            padding = a * 2 - 1;

            padding = (n - padding) / 2;
            for (int i = 0; i < padding; i++) {
                System.out.print('*');
            }
            for (int i = 0; i < n - 2 * padding; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < padding; i++) {
                System.out.print('*');
            }
        }
        System.out.println();
    }

}
