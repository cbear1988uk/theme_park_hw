package Behaviours;

import Visitors.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);
}
