package HomeWork82;

public class Entry < T extends Comparable<?>> {
    int value;
    Entry <T> left;
    Entry <T> right;

    public Entry(int value) {
        this.value = value;
    }
}
