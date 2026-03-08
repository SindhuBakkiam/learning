package main.java.jdk8;

public sealed class SealedClassExample permits FunctionExample,PredicateExample{

    String json = """
    {
      "name": "John",
      "age": 30
    }
    """;
}
