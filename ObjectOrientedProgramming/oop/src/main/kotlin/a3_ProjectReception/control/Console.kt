package a3_ProjectReception.control

class Console private constructor(){
    companion object {

        //WHAT'S YOUR AGE
        fun readInt(msg: String): Int{
            var return_: Int? = null

            do {
                //Reading data (age data)
                print(msg)
                val data = readlnOrNull()

                if (data != null && data != ""){
                    //If TRUE: int variable Else FALSE: null
                    return_ = data.toIntOrNull()

                    if (return_ == null || return_ <= 0)
                        println("It's incorrect. Try again")

                } else
                    println("Try again!")

            }while (return_ == null || return_ <= 0)

            return return_

        }

        //ANOTHER QUESTION
        fun readString(msg: String): String{
            var return_: String? = null

            do {
                print(msg)
                val data = readlnOrNull()

                if (data != null && data != "")
                    return data.lowercase()
                else
                    println("Try again!")

            }while (return_ == null)

            return return_
        }
    }

}