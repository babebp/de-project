import org.apache.spark.sql.SparkSession

object Main extends App {

  val spark = SparkSession.builder()
    .appName("DE Project")
    .config("spark.master", "local")
    .getOrCreate()
  
  val driver = "org.postgresql.Driver"
  val url = "jdbc:postgresql://localhost:5432/sample-db"
  val user = "babebp"
  val password = "1234ab"

  val countryDF = spark.read
    .format("jdbc")
    .option("driver", driver)
    .option("url", url)
    .option("user", user)
    .option("password", password)
    .option("dbtable", "public.country")
    .load()

  countryDF.show()
}
