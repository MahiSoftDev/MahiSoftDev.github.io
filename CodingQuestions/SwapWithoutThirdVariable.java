class SwapWithoutThirdVariable{
	public static void main(String []args){
		int a=4;
		int b=8;
		
		System.out.println("Value of a before swap "+a);
		System.out.println("Value of b before swap "+b);
		
		a=a+b;  //a=4+8 =12
		b=a-b;  //b=12-8=4
		a=a-b;  //a=12-4= 8
		
		System.out.println("Value of a after swap "+a);
		System.out.println("Value of b after swap "+b);
		
	}
}