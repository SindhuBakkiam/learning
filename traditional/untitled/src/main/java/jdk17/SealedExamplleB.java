package main.java.jdk17;

public non-sealed  class SealedExamplleB extends SealedExamplleA implements ISealedExample  {


    public void test(Object obj){
        if(obj instanceof String a){
            System.out.println(a);
        }
    }
    public record SealedExampleB(String value){};

    public static void main(String[] args){
        SealedExamplleB sealedExamplleB = new SealedExamplleB();
        sealedExamplleB.test("A");
    }


}
