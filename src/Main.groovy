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