import java.util.Scanner;
public class Atm{
    int pin =1234;
    float balance=20000;


    public void checkpin(){
        System.out.print("Enter Your Pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin =sc.nextInt();
        if (enterpin==pin) {
            menu();
            
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1.Check Balance:");
        System.out.println("2.Withdraw Money:");
        System.out.println("3.Mini StateMent:");
        Scanner sc = new Scanner(System.in);

        int opt = sc.nextInt();
        
        if (opt==1) {
            checkbalance();
            
        }
        else if (opt==2) {
            withdrawmoney();
            
        }
        else if (opt==3) {
            ministatement();
            
        }
        else{
            System.out.println("Invalid Choice");
        }
        }
        void checkbalance(){
            System.out.println("Balance: "+balance);
            menu();
        }
        void withdrawmoney(){
            System.out.println("Enter Amount to withdraw");
            Scanner sc = new Scanner(System.in);
            float Amount =sc.nextFloat();
            if (Amount>balance) {
                System.out.println("Insufficent Balance");
            }
            else{
                balance =balance-Amount;
                System.out.println("Withdraw Succesfull");
            }
            menu();

        }
        void ministatement(){
            System.out.println("**********************");
            System.out.println("CARD NUMBER: ******67");
            System.out.println("TRANSCTION: MINISTATEMENT");
            System.out.println("");
            System.out.println("01/09   1500.00-To Transfer");
            System.out.println("10/09   1000.00-To Transfer");
            System.out.println("20/09   1500.00-By Transfer");
            System.out.println("25/09   20000.00-To Transfer");
            System.out.println("Available Balance:"+balance);
        }
        public static void main(String[] args) {
            Atm obj1 =new Atm();
            obj1.checkpin();
        }
}




