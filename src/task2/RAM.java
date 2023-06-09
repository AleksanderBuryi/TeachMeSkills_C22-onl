package task2;

public class RAM {
    private String name;
    private int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "\n\t\tname = '" + name + '\'' +
                ", \n\t\tvolume = " + volume + '\'' +
                "\n\t}";
    }
}
