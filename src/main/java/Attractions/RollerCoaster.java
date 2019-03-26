package Attractions;

import Visitors.Visitor;

public class RollerCoaster {

    public boolean minHeight(Visitor visitor){
        if(visitor.getHeight() >= 145){
            return true;
        }
        return false;
    }


}
