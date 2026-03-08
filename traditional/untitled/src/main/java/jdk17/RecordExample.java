package main.java.jdk17;

public record RecordExample(String name,String id) implements ISealedExample{


    public void printDetails(){
        String dept;
        System.out.println(name + " : " + id);
        System.out.println(this.hashCode());

    }
    public static void main(String[] args){
        RecordExample recordExample = new RecordExample("Sindhu","10660436");
        recordExample.printDetails();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
