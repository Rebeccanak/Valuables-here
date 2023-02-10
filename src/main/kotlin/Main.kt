fun main(){
    printName("Becky")
    var x =modulus(40, 50,)
    var y =addition(60, 90, 60, 30)
println(x)
println(y)
    Aboutmyself("I usually sympathise with people")
    Aboutmyself("I like bathing")
}
fun printName(Name:String){
    println("Hello $Name")

}
fun modulus(num1: Int, num2:Int):Int{
    var modulus = num1 % num2
    return modulus

}
fun addition(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var addition = num1+num2+num3+num4
    return addition
}

fun Aboutmyself(fact: String){
    println("One thing fun about me: $fact")
}