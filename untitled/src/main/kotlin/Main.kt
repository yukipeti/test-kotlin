fun main() {
    var num = "hello"
    println("num = $num")
    num = "nunti"
    println("num = $num")

    var sum = 0
    for(i in 0 ..< 5){
        sum += 1
        println("sum = $sum")
    }
    println("sum = $sum")

    val array = arrayOf("湊あくあ","number",1,"IDOL")
    array.forEach { print(it) }
    println()

    val array2 = arrayOf("りんご","ごりら","らっぱ")
    for(i in 0..2){
        println(array2[i])
    }
}