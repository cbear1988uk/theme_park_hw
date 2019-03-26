package Visitors;

public class Visitor {

    public Integer age;
    public Integer height;
    public Integer money;

    public Visitor(Integer age, Integer height, Integer money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public Integer getAge(){
        return this.age;
    }

    public Integer getHeight(){
        return this.height;
    }

    public Integer getMoney(){
        return this.money;
    }
}
