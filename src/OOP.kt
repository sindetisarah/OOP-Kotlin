fun main() {
    var girl=Human("Sarah",20,30)
    girl.eat(10)
    println(girl.weight)
    var boy=Human("Daniel",25,40)
    println(boy.speak("This is Kotlin Assignment"))

    var woman=Human("Shadya",23,50)
    println(woman.birthday())

//    Instance of data class (object)
    var applicant=User("Sarah","Sindet","sindetisarah@gmail.com","0791776135","sarah283")
    println(applicant.email)
    println(applicant.phoneNumber)

//    printing them out

}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int): Int {
        println("I am eating {$foodWeight} kgs of food")
        weight = weight + foodWeight
        return weight
    }

    fun speak(speech: String) {
        println(speech)

    }

    fun birthday(): Int {
        age = age + 1
        return age
    }
}
data class User(var firstName:String ,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}
