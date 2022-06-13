import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.required

fun parseCli(args: Array<String>){
    val parser = ArgParser("kotlinx-cli-test")
    val input by parser.option(ArgType.String, shortName = "i", description = "Input string").required()
    parser.parse(args)
    val received = hello(hello = input)
    println(received)
}