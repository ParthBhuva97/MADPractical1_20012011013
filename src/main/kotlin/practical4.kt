fun main() {
    print("Enter Number : ")
    val x = readLine()!!.toInt()
    println(
        if (x>=0){
            "Positive"
        }else{
            "Negative"
        }
    )
}