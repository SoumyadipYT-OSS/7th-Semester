abstract class Marks {
    // three instance variables
    protected float markICP;
    protected float markDSA;
    protected float percentage;

    // method getPercentage() to calculate the percentage
    public abstract void getPercentage();
}

class CSE extends Marks {
    float algoDesign;

    public CSE(float ICP, float DSA, float algo) {
        markICP = ICP;
        markDSA = DSA;
        algoDesign = algo;
    }

    @Override
    public void getPercentage() {
        percentage = (markICP + markDSA + algoDesign) / 3;
        System.out.println("Percentage: " + percentage);
    }

    @Override
    public String toString() {
        return "CSE Student: ICP=" + markICP + ", DSA=" + markDSA + ", AlgoDesign=" + algoDesign;
    }
}

class NonCSE extends Marks {
    float enggMechanics;

    public NonCSE(float ICP, float DSA, float engg) {
        markICP = ICP;
        markDSA = DSA;
        enggMechanics = engg;
    }

    @Override
    public void getPercentage() {
        percentage = (markICP + markDSA + enggMechanics) / 3;
        System.out.println("Percentage: " + percentage);
    }

    @Override
    public String toString() {
        return "Non-CSE Student: ICP=" + markICP + ", DSA=" + markDSA + ", EnggMechanics=" + enggMechanics;
    }
}

public class q2 {
    public static void main(String[] args) {
        CSE csStudent1 = new CSE(7.8f, 8.9f, 8.5f);
        NonCSE itStudent2 = new NonCSE(8.8f, 9.4f, 8.7f);

        System.out.println(csStudent1);
        csStudent1.getPercentage();
        System.out.println(itStudent2);
        itStudent2.getPercentage();
    }
}
