class PrimeNumber{
	public static void main(String []args){
	int n=6,count=0;
	if(n<2){
		count+=1;
	}
	for(int i=2;i<n;i++){
		if(n%i==0){
		count+=1;
		}
	}
	if(count>0){
		System.out.println("not prime number");
	}else{
		System.out.println(" prime number");
	}
	}
}