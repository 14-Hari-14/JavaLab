interface sports
{
	float sportswt = 6.0F;
	abstract void putwt();
}
class Student
{
	int rollno;
	public void putNumber(rollno)
	{
		this.rollno = rollno;
	}
	public void getNumber(rollno)
	{
		System.out.println("Roll number: "+rollno);
	}
}
class Test extends Student
{
	double term1, term2;
	public void getMarks(double term1, double term2)
	{
		this.term1 = term1;
		this.term2 = term2;
	}
	public void putMarks()
	{
		System.out.println("Term1: "+term1+"\nTerm2: "+term2);
	}
}
class Results extends Test implements sports
{
	public static void main(String[] args)
	{
		Test s1 = new Test();
		System.out.println("Roll number: "+s1.rollno+"\nMarks obtained\nTerm1: "+s1.term1+"\nTerm2: "+s2.term2+"\nSports weightage: "+s1.sportswt+"\nTotal score: "+(s1.term1+s1.term2+s1.sportswt));		
	}
}

