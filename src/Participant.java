abstract class Participant {
    private int id;
    private String name;
    private int age;

    public Participant(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public abstract String getCategory();

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Возраст: " + age + ", Категория: " + getCategory();
    }
}
