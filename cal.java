class  cal
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		String operation="mult";
		switch(operation){
			case "add":
				System.out.println(a+b);
			break;
			case "sub":
				System.out.println(a-b);
			break;
			case "mult":
				System.out.println(a*b);
			break;
			case "division":
				System.out.println(a%b);
			break;
			default:
				System.out.println("Enter valid operation");
		}
	}
}




				 