import kotlin.math.pow
fun main()
{
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    when (a>b)
    {
        true -> a+=1
        false ->when (a==b)
        {
            true ->a=a.pow(3)
            false -> print("Число а меньше b");
        }
    }
    println("$a")
}
