package main.java.jdk8;

public class InheritD implements InheritC,InheritB{


    public static void main(String[] args){
        InheritB inheritD = new InheritD();
        inheritD.hello();
    }

    @Override
    public void hello() {
        InheritC.super.hello();
    }
}
