package Chap01.Bank;

/**
 * 演示了面向对象对数据的管理
 * 模拟一个银行的数据结构
 *
 */
class BankAccount {
    private double balance;                   // 存款

    public BankAccount(double openingBalance) // 构造器，开户的时候默认存款是多少
    {
        balance = openingBalance;
    }

    public void deposit(double amount)        // 存入存款
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)       // 取出存款
    {
        balance = balance - amount;
    }

    public void display()                     // 显示存款
    {
        System.out.println("balance=" + balance);
    }
}  // end class BankAccount

////////////////////////////////////////////////////////////////
class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.00); // create acct

        System.out.print("Before transactions, ");
        ba1.display();                         // display balance

        ba1.deposit(74.35);                    // make deposit
        ba1.withdraw(20.00);                   // make withdrawal

        System.out.print("After transactions, ");
        ba1.display();                         // display balance
    }  // end main()
}  // end class BankApp
