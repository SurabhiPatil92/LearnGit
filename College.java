class  College
{
	public static void main(String[] args)
	{
	Student s1 = new Student(101, "Abc", "BTech", 2000.0, new Address(34,"75e","HYD") );
	System.out.println("\n"+s1.sno + " " + s1.sname+  " " + s1.course+  " " + s1.fee +  " " + s1.addr.ad());

	Exam[] ex=new Exam[7];
	s1.ex=ex;

	ex[0]=new Exam();
	s1.ex[0].setEname("Unit-I");
	s1.ex[0].setEng(50.70);
	s1.ex[0].setHindi(60.70);
	s1.ex[0].setSocial(70.03);
	s1.ex[0].setMaths(80.06);
	s1.ex[0].setScience(90.07);

	ex[1]=new Exam();
	s1.ex[1].setEname("Unit-II");
	s1.ex[1].setEng(20.90);
	s1.ex[1].setHindi(30.70);
	s1.ex[1].setSocial(76.00);
	s1.ex[1].setMaths(88.30);
	s1.ex[1].setScience(80.60);

	ex[2]=new Exam();
	s1.ex[2].setEname("Quarterly");
	s1.ex[2].setEng(70.30);
	s1.ex[2].setHindi(80.60);
	s1.ex[2].setSocial(75.90);
	s1.ex[2].setMaths(92.20);
	s1.ex[2].setScience(40.30);

	ex[3]=new Exam();
	s1.ex[3].setEname("Unit-III");
	s1.ex[3].setEng(90.90);
	s1.ex[3].setHindi(90.90);
	s1.ex[3].setSocial(85.09);
	s1.ex[3].setMaths(92.09);
	s1.ex[3].setScience(90.90);

	ex[4]=new Exam();
	s1.ex[4].setEname("Half-yearly");
	s1.ex[4].setEng(95.00);
	s1.ex[4].setHindi(80.05);
	s1.ex[4].setSocial(95.00);
	s1.ex[4].setMaths(92.07);
	s1.ex[4].setScience(90.00);

	ex[5]=new Exam();
	s1.ex[5].setEname("Pre-Final");
	s1.ex[5].setEng(80.50);
	s1.ex[5].setHindi(90.70);
	s1.ex[5].setSocial(95.90);
	s1.ex[5].setMaths(92.10);
	s1.ex[5].setScience(80.90);

	ex[6]=new Exam();
	s1.ex[6].setEname("Final");
	s1.ex[6].setEng(95.20);
	s1.ex[6].setHindi(90.50);
	s1.ex[6].setSocial(95.80);
	s1.ex[6].setMaths(92.08);
	s1.ex[6].setScience(90.06);

	/*
	s1.ex[0].getReport();
	s1.ex[1].getReport();
	s1.ex[3].getReport();
	s1.ex[4].getReport();
	s1.ex[5].getReport();
	s1.ex[6].getReport();
	*/

	//s1.getProgressReport(ex[]);

	s1.ex[0].getReport();

	System.out.println("This line is only for practicing git.");
	}

}
