public class StringCount {
    static int count=0;
    public static void main(String []args) {
        String string=args[0];//get command line argument
        System.out.println("Number of Characters in given string with space    :"+string.length());
        System.out.println("Number of Characters in given string without space :"+countWithoutSpace(string));
    }
    public static int countWithoutSpace(String string){
            for(int i=0;i<string.length();i++){
                int temp=string.charAt(i);
                if(temp==32){
                }else{
                count+=1;
                }
            }
        return count;
    }
}
