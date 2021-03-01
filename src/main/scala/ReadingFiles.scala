import scala.io.Source

object ReadingFiles extends App {

  println("Reading files")

  // file is a bit of an abstraction but idea is that we have data(bytes) stored in our computer(meaning SSD, or HDD,
  // or other permanent storage) in some sort of sequence

  // there are many many different formats but the simplest one is a text file (which also covers such things as
  // XML, CSV, JSON etc, these are the format we will look later on in the course)

  // our scala programs are text files

  // about finding files, there are two ways of locating files: absolute and relative

  // ABSOLUTE PATH
  val absolute_path = "C:/Users/zte/Documents/itemi_uz_tube_laser.txt"
//  for (line <- Source.fromFile(absolute_path).getLines) {
//  println(line)
//  }
//  val lines = Source.fromFile(absolute_path).getLines.toArray // after reading, the good practice is to close the file
//  lines.foreach(println)  // after reading, the good practice is to close the file
  // better get reference to file buffer(stream) and the close it when done
  val bufferedSource = Source.fromFile(absolute_path)
  val lines = bufferedSource.getLines().toArray
  bufferedSource.close // now files is properly CLOSED (assuming no exceptions)
  // now we can work with file contents
  lines.foreach(println)
  // thus we can split each line into individual words, in this case by whitespace
  val lines_tokenized = lines.map(line => line.split(""))
  lines_tokenized.foreach(line => {line.foreach(println); println("*"*20)})

  // RELATIVE PATH


}
