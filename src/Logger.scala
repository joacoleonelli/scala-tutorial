import java.util.logging.Level

//singleton object
object Logger {
 def log(level: Level, string: String){
   printf("%s %s%n", level, string)
 }
 
 def main(args: Array[String]){
   Logger.log(Level.INFO, "scala versio")
 }
}