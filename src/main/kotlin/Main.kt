fun main(){
    println(longString(0))
    var manyarrs =manyArrays(arrayOf(30,10,20,40,50))
    println(manyarrs)
    splitSt()
    arrayStrings()
    var number = Calculator(7,3,4,8)
    number


}

fun longString(index:Int):String{
    val string1 = "location"
    val string2 = "done"
    println(string1.length)
    println(string2.length)
    println(string1.get(index))
    return string1

    }
fun manyArrays(nums: Array<Int>):Array<Int>{
    var manyarrs = nums
    manyarrs.max()
    manyarrs.min()
    manyarrs.average()
    return manyarrs

}
fun splitSt(){
    var name = "parameter"
     name.split("paramater")
    println(name)
}

fun arrayStrings(){
    val names = arrayOf("dog","cat","fish")
    names.joinToString { names -> names  }
    println(names)
}

data class Calculator(var add: Int,var substract: Int,var multipy:Int,var divide:Int)
fun manynums(num1:Int,num2:Int){
    var num = num1 + num2


}
fun manynum(num3:Int,num4:Int){
    var num = num3 * num4

}
fun mannums(num5:Int,num6:Int){
    var num = num5 / num6


}
fun manums(num7:Int,num8:Int){
    var num = num7 - num8


}
