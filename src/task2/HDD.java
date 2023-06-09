package task2;

public class HDD {
    private String name;
    private int volume;
    private String type;

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "\n\t\tname = '" + name + '\'' +
                ", \n\t\tvolume = " + volume +
                ", \n\t\ttype = '" + type + '\'' +
                "\n\t}";
    }
}
