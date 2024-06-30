package oops.classes.level1

/**
 * **Class with Encapsulation**
 *
 * Create a BankAccount class with properties accountNumber, accountHolder, and balance.
 * Make balance a private property and provide public methods deposit(amount: Double) and withdraw(amount: Double) to manipulate it.
 * Ensure that the balance cannot go negative.
 * */

class BankAccount(private var accountHolder: String, private var accountNumber: Long) {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount < 1) {
            println("Negative amount is not allowed deposit")
            return
        } else {
            balance += amount
        }
    }

    fun withdraw(amount: Double): Double {
        return if (amount < 1) {
            println("Negative amount is not allowed to withdraw")
            0.0
        } else if (amount < balance) {
            balance -= amount
            amount
        } else {
            println("Insufficiant Balance. Currently available amount: $balance")
            0.0
        }
    }

    fun getAvailableBalance() = balance
    fun getAccountHolderDetail() =
        "\n Account Holder: $accountHolder\n Account Number: $accountNumber\n Available Balance: $balance"

}

fun main() {
    val bankAccount = BankAccount(accountHolder = "Prashant", accountNumber = 3203)
    bankAccount.deposit(2500.0)
    println(bankAccount.getAccountHolderDetail())
    bankAccount.withdraw(500.00)
    println(bankAccount.getAccountHolderDetail())

    println(" Available balance: ${bankAccount.getAvailableBalance()}")

}