package a1_OOP

class BankAccount(val holder: String, private var balance: Float = 1000f){

    init {
        if (balance < 0)
            throw IllegalArgumentException("Negative balance is not accepted")
    }

    fun getMoney(value: Float): String{
        if (value < 0)
            throw IllegalArgumentException("Negative value is not accepted")
        else if (this.balance < value)
            return "The Balance value is negative. Choose another value"
        else
            this.balance -= value
            return "Now you've got R$ ${this.balance}"
    }

    fun depositMoney(value: Float): String{
        if (value < 0)
            throw IllegalArgumentException("Negative balance is not accepted")
        this.balance += value
        return "Now you've got R$ ${this.balance}"
    }

}
fun main() {
    val bankAccount1 = BankAccount("Peter")
    println(bankAccount1.depositMoney(500f))
    println(bankAccount1.getMoney(2000f))
    print(bankAccount1.getMoney(500f))
}


