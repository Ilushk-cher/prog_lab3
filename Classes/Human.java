package Classes;

import Abstracts.Character;
import Enums.BodyPosition;
import Enums.WhatReal;
import Interfaces.AbleToImagine;

public class Human extends Character implements AbleToImagine {
    private WhatReal whatReal = WhatReal.REAl;
    public Human(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Human(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }

    public void startImagine() {
        if (whatReal == WhatReal.REAl) {
            whatReal = WhatReal.UNREAL;
            System.out.println(this.getName() + " начинает воображать...");
        }
        else System.out.println(this.getName() + " все еще воображает...");
    }

    public void endImagine() {
        if (whatReal == WhatReal.UNREAL) {
            whatReal = WhatReal.REAl;
            System.out.println(this.getName() + " возвращается в реальность...");
        }
        else System.out.println(this.getName() + " все еще находится в реальности...");
    }

    public WhatReal getWhatReal() {
        return this.whatReal;
    }

    public void say(String message) {
        System.out.println(this.getName() + " созывает: \"" + message + "\"");
    }
}
