package carparts;

public class Tyres {

    private String size;
    private String name;

    public Tyres(String size, String name) {
        super();
        this.size = size;
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
