public class Armstrong{
    public static void main (String []args){
        String number=args[0]; //command line argument input
        char value[]=number.toCharArray();
        int sum=0;
        for(int i=0;i<number.length();i++){
            int base=value[i]-'0';
             for(int j=1,sum1=1;j<=number.length();j++){
            sum1*=base;
				if(j==number.length()){
					sum=sum+sum1;
				}
            }
        }
        if(sum==(Integer.parseInt(number))){
            System.out.println("provided number "+number+" is Armstrong Number");
        }else{
			 System.out.println("provided number "+number+" is not a Armstrong Number");
		}
    }
}


// Armstrong number is a number that is equal to the sum of cubes of its digits. 
    // For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
/*  public static void main (String []args){
        String number=args[0];
		String finalLine="";
        char value[]=number.toCharArray();
        int sum=0;
        for(int i=0;i<number.length();i++){
            int base=value[i]-'0';
             for(int j=1,sum1=1;j<=number.length();j++){
            sum1*=base;
            System.out.println(sum1);
            if(j==number.length()){
                sum=sum+sum1;
				System.out.println(base+" to the power of "+number.length()+" : "+sum1);
				finalLine=finalLine+" + "+sum1;
            }
            }
        }
		System.out.println(finalLine.substring(2)+" = "+sum);
        if(sum==(Integer.parseInt(number))){
            System.out.println("provided number "+number+" is Armstrong Number");
        }else{
			 System.out.println("provided number "+number+" is not a Armstrong Number");
		}
       
    }
}*/