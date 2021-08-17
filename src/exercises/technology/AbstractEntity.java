package exercises.technology;

public class AbstractEntity {
    public int id;
    public static int nextId = 1;

    public AbstractEntity() {
        id = nextId;
        nextId++;
    }


}
