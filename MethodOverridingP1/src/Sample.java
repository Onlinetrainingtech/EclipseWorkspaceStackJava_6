
class person
{
  void showDetails()
  {
   System.out.println("This ShowDetails on BaseClass");
  }
}
class employee extends person
{
  void showDetails()
  {
	  System.out.println("This ShowDetails on Employee");
  }
}
class student extends person
{
  void showDetails()
  {
	  System.out.println("This ShowDetails on student");
  }
}
public class Sample
{
	public static void main(String as[])
	{
		//you have creating object all the class
		  person p=new person();
		  employee e=new employee();
		  student  s=new student();

		  person ref;
		  ref=p;
		  ref.showDetails();

		  ref=e;
		  ref.showDetails();
		  
		  ref=s;
		  ref.showDetails();
	}
  
}