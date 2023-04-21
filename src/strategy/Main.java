package strategy;

import java.util.Scanner;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/21 17:17
 */
public class Main {

    //生成两个选手，采取不同的策略
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int seed1 = scanner.nextInt();
        // int seed2 = scanner.nextInt();
        Player player1 = new Player("Taro", new WinningStrategy(0));
        Player player2 = new Player("Hana", new ProbStrategy(1));
        for (int i = 0; i < 100; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}