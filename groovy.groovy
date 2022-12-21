//data type
int a = 10
byte b = 20
float c = 30
double d =20.24
char e = 'e'

println(a)
println(b)

//opartion
println 1+2
println 2-1
println 1*2
println 1/2
println 1%2

// If Condition
data =10
if(data%2 == 0) {
    println "Even"
} else {
    println 'Odd'
}

// other one
data = 11
println data/2

// string interoption
println "java Home"+"hello"
println "java Home hello"-"hello"

// for loop in groovy
// 1st
for (int i; i<10; i++){
    println "sandeep-${i}"
}

// 2nd
for (int i=0; i<10; i++){
    println "sandeep-${i+1}"
}

// 3th
def data = ["apple","grapes","Banana"]
data.each{
    println it
}

//4th
def data = ["apple","grapes","Banana"]
data.each{   x->
    println "food name is ${x}"
}

//5th
def data = ["apple","grapes","Banana"]
for (x in data){
    println("fruit name is ${x}")
}

// 6th time function
10.times{
    println "java Home ${it}"
}

