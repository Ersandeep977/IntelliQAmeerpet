int a = 10
byte b = 20
float c = 30
double d =20.24
char e = 'e'

println(a)
println(b)

println 1+2
println 2-1
println 1*2
println 1/2
println 1%2

data =10
if(data%2 == 0) {
    println "Even"
} else {
    println 'Odd'
}

data = 11
println data/2


println "java Home"+"hello"
println "java Home hello"-"hello"

for (int i; i<10; i++){
    println "sandeep-${i}"
}


for (int i=0; i<10; i++){
    println "sandeep-${i+1}"
}

def data = ["apple","grapes","Banana"]
data.each{
    println it
}
def data = ["apple","grapes","Banana"]
data.each{   x->
    println "food name is ${x}"
}
def data = ["apple","grapes","Banana"]
for (x in data){
    println("fruit name is ${x}")
}

10.times{
    println "java Home ${it}"
}

