fun main() {
    // Создать приложение, которое подсчитывает количество подряд идущих
    // одинаковых символов во введенной строке.
    // На вход подается, например, строка AAADSSSRRTTHAAAA.
    // На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов
    // меньше двух, то мы не пишем единицу

    val inputVal = readln()
//    val inputVal = "AAADSSSRRTTHAAAA"
    var result = ""
    var countChar = 1

    var previousChar = inputVal[0]

    for(i in 1.. inputVal.length - 1) {
        if(inputVal[i] == previousChar){
            countChar++
        } else{
            if (countChar>1){
                result = result+previousChar+countChar
            }else{
                result = result+previousChar
            }
            countChar = 1
            previousChar = inputVal[i]
        }
    }
    println(result)
}