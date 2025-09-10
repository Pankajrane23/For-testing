// Define a class
class Person {
    String name
    int age

    // Method to print info
    void introduce() {
        println "Hi, my name is $name and I am $age years old."
    }
}

// Create a list of people
def people = [

        new Person(name: "Charlie", age: 22)
]

// Loop through the list and call the method
people.each { person ->
    person.introduce()
}

// Example of a closure
def square = { int x -> x * x }
println "Square of 5 is ${square(5)}"

// Example of using a map
def capitals = [France: "Paris", Japan: "Tokyo", India: "New Delhi"]
capitals.each { country, capital ->
    println "The capital of $country is $capital"
}

// Import JsonSlurper for parsing JSON
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

// 1. Write some text to a file
def file = new File("example.txt")
file.text = "Hello from Groovy!\n"

// Append more lines
file << "This is a second line.\n"

// Read file content
println "File content:"
println file.text

// 2. Create a Map and convert it to JSON
def user = [
        name: "Alice",
        age : 25,
        skills: ["Groovy", "Java", "Git"]
]

def jsonString = JsonOutput.prettyPrint(JsonOutput.toJson(user))
println "\nJSON representation:"
println jsonString

// 3. Parse JSON back into a Groovy object
def parsed = new JsonSlurper().parseText(jsonString)
println "\nParsed JSON object:"
println "Name: ${parsed.name}, Age: ${parsed.age}, Skills: ${parsed.skills}"