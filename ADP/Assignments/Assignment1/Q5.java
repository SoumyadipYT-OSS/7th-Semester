import java.lang.System;

abstract class Marks {
    protected int markICP;
    protected int markDSA;
    protected double percentage;

    public Marks(int markICP, int markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    public abstract double getPercentage();
}

class CSE extends Marks {
    private int algoDesign;

    public CSE(int markICP, int markDSA, int algoDesign) {
        super(markICP, markDSA);
        this.algoDesign = algoDesign;
    }

    @Override
    public double getPercentage() {
        int totalMarks = markICP + markDSA + algoDesign;
        return (totalMarks / 300.0) * 100;
    }
}

class NonCSE extends Marks {
    private int enggMechanics;

    public NonCSE(int markICP, int markDSA, int enggMechanics) {
        super(markICP,markDSA);
        this.enggMechanics = enggMechanics;
    }

    @Override
    public double getPercentage() {
        int totalMarks = markICP + markDSA + enggMechanics;
        return (totalMarks / 300.0) * 100;
    }
}


public class Q5 {
    public static void main(String[] args) {
        CSE cseStudent = new CSE(80, 100, 90);
        NonCSE nonCseStudent = new NonCSE(90, 80, 70);

        System.out.println("CSE Student Percentage: " + cseStudent.getPercentage());
        System.out.println("Non-CSE Student Percentage: " + nonCseStudent.getPercentage());
    }    
}
