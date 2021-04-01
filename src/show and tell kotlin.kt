import java.util.*

fun main() {
    word()
    sentence()//calling a function
    universitiesArray()
    var add=(addition(3,7,8))
    println(add)

}
fun word(){
    var text="BANANA"
    println(text.toLowerCase())
    println(text.startsWith("B"))
    println(text [1])
    println(text[3])//indexing
}
fun sentence (){
    var x="My name is Akello Olga Esther"
    var y="I am in Lisalab"
    println(x +" "+ y)//string concatenation

}
fun universitiesArray(){
    var uni=arrayOf("makerere","kyambogo","kenyatta","nairobi")
    for (elements in uni)//looping
        println(elements.capitalize())


}
fun addition(num1:Int,num2:Int,num3:Int):Int{
    var add=(num1+num3)
    return (add)//expecting a return value
}


    



