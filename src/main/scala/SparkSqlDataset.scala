import org.apache.log4j._
import org.apache.spark.sql._

object SparkSqlDataset {
  case class Person(id:Int, name: String, age: Int, friends:Int)

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession
      .builder
      .appName("SparkSql")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._
    val schemaPeople = spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("resources/data/fakefriends.csv")
      .as[Person]
//
//    schemaPeople.printSchema()
//
//    schemaPeople.createOrReplaceTempView("peoples")
//
//    val ten = spark.sql("Select * from peoples where age>=13")
//    val ten2 = schemaPeople.select("*").where(schemaPeople("age")>=13)
//    println(ten.count(), ten2.count())
//    val results = ten.collect()
//
//    results.foreach(println)

    schemaPeople.groupBy(schemaPeople("age")).avg("friends").show()
    spark.stop()
  }
}
