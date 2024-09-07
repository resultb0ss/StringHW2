fun main() {
    var phone = "+79293405657"
    var sev = "+7"
    var numberLength = phone.substring(2,phone.length)

    if (phone.substring(0,2) == sev && numberLength.length == 10){
        println("Номер введен верно true")
    } else {
        println("Номер введен неверно false")
    }

}