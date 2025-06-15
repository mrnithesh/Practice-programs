// OOP PRACTICE - ENCAPSUALTION

class bankAccount {
    private int accountNo;
    private int accountBal;

    public int getAccNo(){
        return  this.accountNo;
    }
    public void setAccNo(int accNo){
        this.accountNo = accNo;
    }
    public int getAccBal(){
        return this.accountBal;
    }
    public void depositAmount(int amount){
        this.accountBal += amount;
    }
    public void withdrawAmount(int amount){
        if (amount > this.accountBal){
            System.out.println("Insufficient Balance"); 
        }
        else{
            this.accountBal -= amount;
            System.out.println("Withdrawal success"); 
        }
    }

}

public class bankAccountSystem {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        account.setAccNo(1210);
        account.depositAmount(5000);
        System.out.println("Account Number: " + account.getAccNo());
        System.out.println("Account Balance: "+ account.getAccBal());
        account.depositAmount(500);
        System.out.println("Account Balance after deposit :"+ account.getAccBal());
        account.withdrawAmount(7000);
        System.out.println("Account Balance after withdrawal :"+ account.getAccBal());
    }
    
}
