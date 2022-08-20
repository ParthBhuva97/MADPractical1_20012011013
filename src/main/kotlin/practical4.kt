fun main() {
    print("Enter Number : ")
    val x = readLine()!!.toInt()
    println(
        if (x%2==0){
            " $x is Even"
        }else{
            "$x is Odd"
        }
    )
}