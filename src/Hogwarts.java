public class Hogwarts {
    public void compare(HogwartsStudents student1, HogwartsStudents student2) {

        int totalStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int totalStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (totalStudent1 > totalStudent2) {
            System.out.println(student1 + " более скилловый студент, чем " + student2);
        }
        if (totalStudent1 == totalStudent2) {
            System.out.println(student1 + " равные по навыкам с " + student2);
        }
        if (totalStudent1 < totalStudent2) {
            System.out.println(student2 + " более скилловый студент, чем " + student1);
        }
    }

    public void compare(GryffindorStudent student1, GryffindorStudent student2) {
        if (student1 == student2) {
            System.out.println(" происходит сравнение одного и того же студента ");
        } else {
            int totalStudent1 = student1.getBravery() + student1.getNobility() + student1.getHonor();
            int totalStudent2 = student2.getBravery() + student2.getNobility() + student2.getHonor();
            if (totalStudent1 > totalStudent2) {
                System.out.println(student1 + " лучший гриффиндорец, чем " + student2);
            }
            if (totalStudent1 == totalStudent2) {
                System.out.println(student1 + " равные гриффиндорцы c " + student2);
            }
            if (totalStudent1 < totalStudent2) {
                System.out.println(student2 + " лучший гриффиндорец, чем " + student1);
            }
        }
    }
    public void compare(SlytherinStudent student1, SlytherinStudent student2) {
        if (student1 == student2) {
            System.out.println(" происходит сравнение одного и того же студента ");
        } else {
            int totalStudent1 = student1.getAmbition() + student1.getCunning() + student1.getResourcefulness();
            int totalStudent2 = student2.getAmbition() + student2.getCunning() + student2.getResourcefulness();
            if (totalStudent1 > totalStudent2) {
                System.out.println(student1 + " лучший слизеринец, чем " + student2);
            }
            if (totalStudent1 == totalStudent2) {
                System.out.println(student1 + " равные слизеринцы c  " + student2);
            }
            if (totalStudent1 < totalStudent2) {
                System.out.println(student2 + " лучший слизеринец, чем " + student1);
            }
        }
    }
    public void compare(RavenclawStudent student1, RavenclawStudent student2) {
        if (student1 == student2) {
            System.out.println(" происходит сравнение одного и того же студента ");
        } else {
            int totalStudent1 = student1.getIntelligence() + student1.getCreativity() + student1.getWisdom();
            int totalStudent2 = student2.getIntelligence() + student2.getCreativity() + student2.getWisdom();
            if (totalStudent1 > totalStudent2) {
                System.out.println(student1 + " лучший когтевранец, чем " + student2);
            }
            if (totalStudent1 == totalStudent2) {
                System.out.println(student1 + " равные когтевранцы c  " + student2);
            }
            if (totalStudent1 < totalStudent2) {
                System.out.println(student2 + " лучший когтевранец, чем " + student1);
            }
        }
    }
    public void compare(HufflepuffStudent student1, HufflepuffStudent student2) {
        if (student1 == student2) {
            System.out.println(" происходит сравнение одного и того же студента ");
        } else {
            int totalStudent1 = student1.getPatience() + student1.getLoyalty() + student1.getDedication();
            int totalStudent2 = student2.getPatience() + student2.getLoyalty() + student2.getDedication();
            if (totalStudent1 > totalStudent2) {
                System.out.println(student1 + " лучший пуффендуец, чем " + student2);
            }
            if (totalStudent1 == totalStudent2) {
                System.out.println(student1 + " равные пуффендуйцы c " + student2);
            } else {
                System.out.println(student2 + " лучший пуффендуец, чем " + student1);
            }
        }
    }
}

