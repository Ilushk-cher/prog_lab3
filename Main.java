import Classes.*;
import Enums.*;

public class Main {
    public static void main(String[] args) {
        Place pond = new Place("водоем");
        Place coast = new Place("берег");
        Place dam = new Place("запруда");

        Human krisRob = new Human("Кристофер Робин", coast);
        krisRob.startImagine();

        Bear vinny = new Bear("Винни-Пух", coast);
        Kangaroo roo = new Kangaroo("Ру", coast);
        Pig pig = new Pig("Пятачок", coast, BodyPosition.LAY, Pig.State.NOT_AWAKE);
        Owl owl = new Owl("Сова", coast);
        Kangaroo kanga = new Kangaroo("Кенга", coast);
        Donkey donkey = new Donkey("Иа", coast);
        Rabbit rabbit = new Rabbit("Кролик", coast);

        vinny.countTo(10);

        roo.moveTo(pond);
        roo.startSwim();

        roo.say("пи-пи что ли", TypeOfSpeaking.SQUEAK);
        kanga.say("ёмаё, че случилось?", TypeOfSpeaking.SCREAM);

        vinny.help(Boolean.TRUE);
        krisRob.help(Boolean.TRUE);

        pig.setState(Pig.State.COMPLETELY_AWAKE);
        pig.setBodyPosition(BodyPosition.STAND);
        pig.help(Boolean.TRUE);
        pig.jump(TypeOfJump.ON_SPOT);
        pig.say("Ой, ой!");

        owl.help(Boolean.TRUE);
        owl.say("В случае неожиданного погружения в воду самое важное - это держать голову над поверхностью");

        kanga.help(Boolean.TRUE);
        kanga.jump(TypeOfJump.HUGE_LEAPS);

        kanga.sendMessage(roo, "Дорогой, ты действительно цел?");
        roo.answerMessage("Смотрите, как я плаваю!");

        donkey.help(Boolean.TRUE);
        donkey.moveTo(dam);
        donkey.setBodyPosition(BodyPosition.SIT);
        donkey.setTailPosition(TailPosition.DOWN);
        donkey.say("Все из-за этого мытья; но ты только держись за мой хвост, Ру, и все будет в порядке");

        krisRob.setSpeed(10);

        rabbit.help(Boolean.TRUE);
        rabbit.setSpeed(10);

        System.out.println(krisRob.getMovingContainer().toString());

        System.out.println();
        MessageHistory.printMessageHistory();

        MessageHistory.getMakedMessage(11);
    }
}
