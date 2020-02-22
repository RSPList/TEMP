class Demo {

public static void main(string[] args) {
System.out.println("No greetings allowed");
String sentence = "Hi my name is Billy Bob.";
for (String s : sentence.split(" ")) {
if (s == "Hi") {
} else {
System.out.println(s);
}
}
}
}
