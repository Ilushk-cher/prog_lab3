package Exceptions;

public class NegativeSpeed extends RuntimeException {
    public NegativeSpeed(int speed) {
        super(speed + " < 0  =>  нельзя");
    }
}
