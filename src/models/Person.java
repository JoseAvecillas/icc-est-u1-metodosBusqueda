package models;

public class Person {
    
    private int code;
    private String name;

    
//     @Override
// public String toString() {
        
//         return "Person [code=""]".toString()";
// }
// 
    public Person(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      
}
