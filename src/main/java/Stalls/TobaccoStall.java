package Stalls;

import Visitors.Visitor;

public class TobaccoStall {

    public boolean minAge(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        }
        return false;
    }
}
