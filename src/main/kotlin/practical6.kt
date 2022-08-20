fun main() {
    val add = AO('+',111,2222,-222)
    println(add)
    val sub = AO('-',111,2222,-222)
    println(sub)
    val mul = AO('*',111,2222,-222)
    println(mul)
    val div = AO('/',2222,111)
    println(div)
}


fun AO(o:Char,vararg numArray: Int):String?{
    when(o){
        '+' -> {
            var msg = "Addition of"
            var result = 0
            var nums = ""
            for (num in numArray){
                result += num
                nums += "$num "
            }
            return msg + " " + nums + "is $result"
        }

        '-' ->{
            var msg = "Subtraction of"
            var result =  2*numArray[0]
            var nums = ""
            for (num in numArray){
                result -= num
                nums += "$num "
            }
            return msg + " " + nums + "is $result"
        }

        '*' -> {
            var msg = "Multiplication of"
            var result = 1
            var nums = ""
            for (num in numArray){
                result *= num
                nums += "$num "
            }
            return msg + " " + nums + "is $result"
        }

        '/' -> {
            var msg = "Division of"
            var result = numArray[0]*numArray[0]
            var nums = ""
            for (num in numArray){
                result /= num
                nums += "$num "
            }
            return msg + " " + nums + "is $result"
        }
    }
    return null
}
//fun AO(o:Char,vararg numArray:Int):Int{
//    when(o){
//        '+'->{
//            var result = 0
//            for (num in numArray){
//                result += num
//            }
//            return result
//        }
//        '-'->{
//            var result = 2*numArray[0]
//            for (num in numArray){
//                result -= num
//            }
//            return result
//        }
//        '*'->{
//            var result = 1
//            for (num in numArray){
//                result *= num
//            }
//            return result
//        }
//        '/'->{
//            var result = numArray[0]*numArray[0]
//            for (num in numArray){
//                result /= num
//            }
//            return result
//        }
//        else-> return -1
//    }
//    return -1
//}