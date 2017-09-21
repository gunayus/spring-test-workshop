Build the project
mvn clean install

Run weather-service stubs as a standalone server
java -jar weather-service-stub-runner/target/weather-service-stub-runner-0.0.1-SNAPSHOT.jar --stubrunner.ids=org.springmeetup:weather-service:0.0.1-SNAPSHOT:8080 --server.port=8081

Open generated API docs:
open weather-service/target/generated-docs/index.pdf
open weather-service/target/generated-docs/index.html



