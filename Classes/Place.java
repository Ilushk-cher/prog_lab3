package Classes;

public record Place(String name) {

    public Place whatPlace() {
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place p = (Place) o;
        return this.name.equals(p.name);
    }

}
