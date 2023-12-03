public class main {
    public static void main(String[] args) {
        Place point = new Place("место");
        Pig pig = new Pig("Пятачок", point, State.COMPLETELY_AWAKE);

        pig.say("ебаный рооот");
        String string = point.toString();
        System.out.println(string);
    }
}
