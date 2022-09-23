package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Rabbit4 связывается с Duck5 через сеттер setDuck и аннотации @Autowired над ней.
@Component
public class Rabbit4 {
    private Duck5 duck;

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
