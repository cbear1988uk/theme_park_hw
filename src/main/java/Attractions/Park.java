package Attractions;

import Behaviours.ISecurity;
import Visitors.Visitor;

public class Park {

    public boolean maxAge(Visitor visitor){
        if(visitor.getAge() <= 15){
            return true;
        }
        return false;
    }


}
