class Amateur extends Participant {
    public Amateur(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getCategory() {
        return "Любитель";
    }
}
