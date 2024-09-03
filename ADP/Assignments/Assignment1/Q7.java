class Student1 {
    private String name;
    private int roll;

    public void inputDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

class Test extends Student1 {
    private int mark1;
    private int mark2;

    public void inputDetails(String name, int roll, int mark1, int mark2) {
        super.inputDetails(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }

    // Add getter methods for mark1 and mark2
    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }
}



class Result implements Sports {
    private int score1;
    private int score2;
    private Test test;

    public Result(Test test) {
        this.test = test;
    }

    @Override
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    @Override
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    @Override
    public int getScore1() {
        return score1;
    }

    @Override
    public int getScore2() {
        return score2;
    }

    public void calculateGrandTotal() {
        // Use the getter methods to access mark1 and mark2
        int grandTotal = test.getMark1() + test.getMark2() + score1 + score2;
        System.out.println("Grand Total: " + grandTotal);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Test test = new Test();
        test.inputDetails("Programmer1", 90, 80, 85); // Pass all required parameters

        Result res = new Result(test);
        res.setScore1(95);
        res.setScore2(98);

        test.showDetails();
        System.out.println("Score 1: " + res.getScore1());
        System.out.println("Score 2: " + res.getScore2());
        res.calculateGrandTotal();
    }
}