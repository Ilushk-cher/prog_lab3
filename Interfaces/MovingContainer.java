package Interfaces;

import Classes.Place;
import Enums.TypeOfGo;

public interface MovingContainer {
    int getSpeed();
    TypeOfGo getTypeOfGo();
    Place getLocalPlace();
}
