class Student
{
	int id;
	String name;
	String branch;
	String universiity;

	void setDetails(int i,String n,String b,String uni)
	{
		id=i;
		name=n;
		branch=b;
		universiity=uni;
	}
	void showDetails()
	{
		System.out.println(id+" "+name+" "+branch+" "+universiity);
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setDetails(1,"Saurabh","Cse","Gehu");
		s.showDetails();
	}

}
