public class Main {
    public static void main(String[] args) {
        Place pond = new Place("водоем");
        Place coast = new Place("берег");
        Place dam = new Place("запруда");

        Kangaroo roo = new Kangaroo("Ру", dam);
        Pig pig = new Pig("Пятачок", coast, State.COMPLETELY_AWAKE);
        Owl owl = new Owl("Сова", coast);
        Kangaroo kanga = new Kangaroo("Кенга", coast);
        Donkey donkey = new Donkey("Иа", coast, Tail.UP);
        Rabbit rabbit = new Rabbit("Кролик", coast);
        Human krisRob = new Human("Кристофер Робин", coast);

        roo.moveTo(pond);
        roo.swim();

        pig.help();
        pig.jump();
        pig.say("Ой, ой!");

        owl.help();
        owl.say("в случае неожиданного погружения в воду самое важное - это держать голову над поверхностью");

        kanga.help();
        kanga.jump();
        Talking.ask(kanga, roo, "дорогой, ты действительно цел?");
        Talking.answer(roo, kanga, "смотрите, как я плаваю!");

        donkey.help();
        donkey.moveTo(dam);
        donkey.sit();
        donkey.setTailState(Tail.DOWN);
        donkey.say("Все из-за этого мытья; но ты только держись за мой хвост, Ру, и все будет в порядке");

        krisRob.help();
        krisRob.run();
        krisRob.say("все сюда!");

        rabbit.help();
        rabbit.run();
        rabbit.say("все сюда!");
    }
}
