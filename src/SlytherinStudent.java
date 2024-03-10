class SlytherinStudent extends HogwartsStudents {
    private final int ambition;
    private final int cunning;
    private final int resourcefulness;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int ambition, int cunning, int resourcefulness) {
        super(name, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.cunning = cunning;
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }
    @Override
    public String toString() {
        return getName();
    }
}