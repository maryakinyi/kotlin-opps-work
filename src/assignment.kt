fun main(){
var Aisha=Human("Katu",20,67.6)
    Aisha.eat(2)
    Aisha.speak("Discipline is key for each work doors,so be discipline and work hard .")
    Aisha.birthday()

var details=user("Mary","Owuor","owuor@gmail.com",24778905,757878)
    println(details.email)
    println(details.passWord)



}
class Human(var name:String,var age:Int,var Weight:Double){
    fun eat(foodWeight: Int){
        var eatFood=("I am eating $foodWeight Kgs of food")
        println(eatFood)
        var newWeight=foodWeight+Weight
        println(newWeight)
    }
    fun speak(speech:String){
println("$speech")
    }
    fun birthday(){
        var newAge=++age
        println(newAge)
    }
}
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var passWord:Int)

