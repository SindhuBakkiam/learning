package main.java.jdk17;

public sealed interface ISealedExample permits SealedExamplleA,SealedExamplleB,RecordExample{
    public static final String test= "TEST";
}
