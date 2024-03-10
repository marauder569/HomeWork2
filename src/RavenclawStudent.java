class RavenclawStudent extends HogwartsStudents {
    private final int intelligence;
    private final int creativity;
    private final int wisdom;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int creativity, int wisdom) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.creativity = creativity;
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWisdom() {
        return wisdom;
    }
    @Override
    public String toString() {
        return getName();
    }
}