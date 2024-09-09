using System;

abstract class Marks {
    // three instance variables
    protected float markICP;
    protected float markDSA;
    protected float percentage;

    // method getPercentage() to calculate the percentage
    public abstract void getPercentage();
}

class CSE : Marks {
    float algoDesign;

    public CSE(float ICP, float DSA, float algo) {
        markICP = ICP;
        markDSA = DSA;
        algoDesign = algo;
    }

    public override void getPercentage() {
        percentage = (markICP + markDSA + algoDesign) / 3;
        System.Console.WriteLine("Percentage: " + percentage);
    }

    public override string ToString() {
        return $"CSE Student: ICP={markICP}, DSA={markDSA}, AlgoDesign={algoDesign}";
    }
}

class NonCSE : Marks {
    float enggMechanics;

    public NonCSE(float ICP, float DSA, float engg) {
        markICP = ICP;
        markDSA = DSA;
        enggMechanics = engg;
    }

    public override void getPercentage() {
        percentage = (markICP + markDSA + enggMechanics) / 3;
        System.Console.WriteLine("Percentage: " + percentage);
    }

    public override string ToString() {
        return $"Non-CSE Student: ICP={markICP}, DSA={markDSA}, EnggMechanics={enggMechanics}";
    }
}

class q2 {
    static void Main(string[] args) {
        CSE csStudent1 = new CSE(7.8f, 8.9f, 8.5f);
        NonCSE itStudent2 = new NonCSE(8.8f, 9.4f, 8.7f);

        System.Console.WriteLine(csStudent1);
        csStudent1.getPercentage();
        System.Console.WriteLine(itStudent2);
        itStudent2.getPercentage();
    }
}
