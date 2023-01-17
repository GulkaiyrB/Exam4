package task4;

public class Pet {
    private String name;

    public Pet() {
    }
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name;
    }
}
