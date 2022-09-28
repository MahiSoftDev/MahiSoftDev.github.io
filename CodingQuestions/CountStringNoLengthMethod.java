class CountStringNoLengthMethod{
	static String originalString;
	static String originalString1;
	static int count;
	static int countWithoutSpace;
	public static void main(String []args){
		originalString=args[0];
		originalString1=args[0];
		System.out.println("Characters in given string with space : "+count(originalString));
		System.out.println("Characters in given string without considering space : "+countWithoutSpace(originalString1));
	}
	static int count(String originalString){
		if(originalString.isEmpty()){
		return count;
		}else{
			count+=1;
			count(originalString.substring(1));
		return count;
		}
	}
	static int countWithoutSpace(String originalString1){
		if(originalString1.isEmpty()){
		return countWithoutSpace;
		}else{
			char character=originalString1.charAt(0);
			int asciiValue=character;
			if(asciiValue==32){
			countWithoutSpace(originalString1.substring(1));
			}else{
			countWithoutSpace+=1;
			countWithoutSpace(originalString1.substring(1));
			}
		return countWithoutSpace;
		}
	}
}