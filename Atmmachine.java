import java.util.Scanner;


public class Atmmachine {
    
    public static void main(String[] args) {
            // int balance =0;
            // int deposit;
            int amount;
            

                
            
            Scanner scanner =new Scanner(System.in);
            Userbankaccount user1 =new Userbankaccount();
            System.out.println("welcome to the atm system machine");
            System.out.println(" ");
     while(true){
        System.out.println("Enter 1 if user want to deposit ");
        System.out.println(" ");
        System.out.println("Enter  2 if user want to withdraw");
        System.out.println(" ");
        System.out.println("Enter 3 if user want to check balance");
        System.out.println(" ");
        // System.out.println("Enter 0 if user want to terminate");
        int key =scanner.nextInt();

         switch (key) {
            case  1:
            System.out.println("Enter amount to be deposited");
            amount  =scanner.nextInt();
            user1.deposit(amount);
            break;

            case 2 :
            System.out.println("Enter amount to be withdrawn");
            amount =scanner.nextInt();
            user1.withdraw(amount );
            break;
            
            case 3 :
           int  balance =user1.checkbalance();
            System.out.println("your balance is"+balance);
            break;

            default:
                System.exit(0);;
         }
     }
    }





 }
 class Userbankaccount{
           int balance ;
        public void deposit(int amount)
        {

            balance =balance + amount;
            System.out.println("your amount is deposited successfully");
            System.out.println("your deposited amountn is"+amount );
            System.out.println("now your balance is"+balance);
            System.out.println(" ");
        }



        public void withdraw(int amount)
        {
            if(balance >= amount)
            {
                balance =balance -amount;
                System.out.println("your withdrawl is successful");
                System.out.println("your withdrawed amount is "+ amount );
                System.out.println("now your balance is"+balance);

            }
            else{
                System.out.println("Your transaction is failed");
            }
        }
        
        public int  checkbalance()
        {
            // System.out.println("the balance is" +balance);
            return balance;
        }
 }


