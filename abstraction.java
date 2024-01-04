abstract class Marks
{
	abstract double getPercentage(double... marks);
}

class studentA extends Marks {
    double m1, m2, m3;

    public studentA(double... marks) {
        this.m1 = marks[0];
        this.m2 = marks[1];
        this.m3 = marks[2];
    }

    @Override
    double getPercentage(double... marks) {
        return (m1 + m2 + m3) / 3;
    }

}

class studentB extends Marks {
    double m1, m2, m3, m4;

    public studentB(double... marks) {
        this.m1 = marks[0];
        this.m2 = marks[1];
        this.m3 = marks[2];
        this.m4 = marks[3];
    }

    @Override
    double getPercentage(double... marks) {
        return (m1 + m2 + m3 + m4) / 4;
    }
}

public class abstraction
{
	public static void main(String[] args)
	{
		Marks s1 = new studentA(90, 90, 90);
		Marks s2 = new studentB(80, 80, 80, 80);
		System.out.println(s1.getPercentage());
		System.out.println(s2.getPercentage());
	}
}
