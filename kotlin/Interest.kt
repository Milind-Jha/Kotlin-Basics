import java.util.*

class Account( var balance: Int, var rate:Float) {

    fun deposit(amount:Int)
    {
        balance = balance + amount
    }
    fun withdraw(amount:Int)
    {
        balance = balance - amount
    }
    fun addInterest()
    {
        balance = (balance * (1 + rate)).toInt()
    }

}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val balance = read.nextInt()
    val rate = read.nextFloat()

    val account = Account(balance,rate)

    var input = read.nextInt()
    while (input != -1) {
        when(input) {
            1 -> {
                var amt = read.nextInt()
                account.deposit(amt)
            }
            2 -> {
                var amt = read.nextInt()
                account.withdraw(amt)
            }
            3 -> account.addInterest()
        }
        input = read.nextInt()
    }
    print(account.balance)
}