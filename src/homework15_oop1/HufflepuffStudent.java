package homework15_oop1;

class HufflepuffStudent extends HogwartsStudents {
    private final int loyalty;
    private final int dedication;
    private final int patience;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int loyalty, int dedication, int patience) {
        super(name, magicPower, transgressionDistance);
        this.loyalty = loyalty;
        this.dedication = dedication;
        this.patience = patience;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getDedication() {
        return dedication;
    }

    public int getPatience() {
        return patience;
    }
    @Override
    public String toString() {
        return getName();
    }
}
