public abstract class Character implements Destinationable, Talking {
    protected Destinationable localPlace;
    private final String name;

    public Destinationable destinto(){
        return localPlace;
    }

    Character(String name, Place place) {
        this.name = name;
        this.localPlace = place;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return this.name;
    }

    public void help() {
        System.out.println(this.getName() + " старается помочь");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character p = (Character) o;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    public abstract void say(String message);
}

