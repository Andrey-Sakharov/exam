class Professional extends Participant {
    public Professional(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getCategory() {
        return "Профессионал";
    }
}
