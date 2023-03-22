import com.sun.source.tree.IfTree;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int moneyInRegister = 150;
        int Bill = -5;

        int apoenA = 20;
        int apoenB = 10;
        int apoenC = 2;
        int apoenD = 1;

        int change = moneyInRegister - Bill;
        System.out.println("Change is " + change);

        int apoen20 = change / apoenA;
        System.out.println("20 KM = " + apoen20);

        int apoen10 = (change - (apoen20 * apoenA)) / apoenB;
        System.out.println("10 KM = " + apoen10);

        int apoen2 = (change - ((apoen20 * apoenA) + (apoen10 * apoenB))) / apoenC;
        System.out.println("2 KM = " + apoen2);

        int apoen1 = (change - ((apoen20 * apoenA) + (apoen10 * apoenB) + (apoen2 * apoenC))) / apoenD;
        System.out.println("1 KM = " + apoen1);

        if (moneyInRegister > 100) {
            System.out.println("You have too much money!");
        }
        if (Bill <= 0) {
            System.out.println("You didn't buy anything, did you?");
        }
        if (Bill < 0) {
            System.out.println("Did you maybe break something.");
}
    }

}