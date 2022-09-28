class CountOvelsAndConsonants{
	static String string;
	static int count;
	public static void main(String []args){
		string=args[0];
		System.out.println("Number of Ovels in given string :"+countOvelsAndConsonants(string));
		System.out.println("Number of Consonants in given string :"+(string.length()-count));
		System.out.println(string.length());
	}
	static int countOvelsAndConsonants(String string){
		string=string.toLowerCase();
		for(int i=0;i<string.length();i++){
			char character=string.charAt(i);
			int asciiValue=character;
			if(asciiValue==32){
			}else{
				if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
				count+=1;
				}
			}
			}
			return count;
		}
	}
