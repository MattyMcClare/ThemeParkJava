package Interface;

import sun.reflect.generics.visitor.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
