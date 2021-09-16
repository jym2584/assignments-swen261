# SWEN-261 Web Architecture Example

A simple Hello World webapp in Spark.


## Prerequisites

- Java 8
- Maven


## How to run it

1. Copy the zipfile and extract all the files into a directory.
2. cd to the top level directory that holds the pom.xml file.
3. Compile the applications by executing `mvn compile`
4. Start the web application running with `mvn exec:java@v1` or v2 
5. In your browser go to `http://localhost:4567/`
6. Enter a name to have the webapp say hello.
7. With the v2 webapp, when you return to the home page, you will see the
   list of everyone who the application has said hello to.


## License

MIT License

See LICENSE for details.
