import com.sun.source.tree.IfTree;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //zadatak 1
       /* int moneyInRegister = 150;
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
            System.out.println("Did you maybe break something.");*/

        //zadatak2

        /*double Pi = 3.14;
        double semidiameter = 5;
        double SurfaceOfACircle = Pi*(semidiameter*semidiameter);
        System.out.println(SurfaceOfACircle );*/

        //zadatak3
       /* int A = 99;
        int B = 4;
        if(A>10 && A<10000 && A%3==0 && A%B==0) {
            System.out.println("It is possible to divide number " + A + " with " + B);
        }else {
                System.out.println("Number " +A+ "is not divisible by number" +B);
        }*/
        //zadatak4
      /*  int A = 10;
        int B = 10;

        if (A>B) {
            System.out.println(A*B);
        }else if (B>A) {
            System.out.println(A - B);
        }else if (B==A){
            System.out.println(A*B);
        }*/
//zadatak5
        int AA = 49;
        int BB = 100;
        int CC = 30;
        int DD = 20;
        int plus = AA+BB+CC+DD;
        if (AA+BB>0||CC+DD>0){
            System.out.println("When we add all variables result is " +plus);
        }else{
            System.out.println("Variables are smaller than zero");;
        }
        if (plus>100&&plus%2==0) {
            System.out.println("All variables added and then divided by 2 are " + plus / 2);
        }else if ((plus-1)%2==0){
                System.out.println((plus-1)/2);
                //Nemoguce je ovaj treci uslov da bude ispunjen "Ukoliko nije ispisati “The number is still not divisible by 2”" jer ako je gore rezultat neparan
            // ispod kada oduzmemo 1 mora postati paran i biti djeljiv sa dva. Ako je bio paran onda je na minus 1 neparan i opet je ranije  zadovoljen uslov

    }
}
}


