

    fun main(args: Array<String>) {
        println("Enter your cuurent salary")
        var salary=readLine()!!.toDouble()
        println("Enter your performance ratio: 1,2,3")
        var performanceRatio=readLine()!!.toInt()
        if(performanceRatio == 1){
            var raise:Double = salary *0.06
            var newSalary = salary + raise
            println("The raise of your salary is ${raise}\nThe new salary is ${newSalary}")
        }else if(performanceRatio == 2){
            var raise:Double = salary *0.04
            var newSalary = salary + raise
            println("The raise of your salary is ${raise}\nThe new salary is ${newSalary}")
        }else if(performanceRatio == 3){
            var raise:Double = salary * 0.015
            var newSalary = salary + raise
            println("The raise of your salary is ${raise}\nThe new salary is ${newSalary}")
        }
    }
}