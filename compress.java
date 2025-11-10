class compress{
    public static void main(string[] args){
        String str="aaabbcc";//a=3;b=2;c=2;
        StringBuilder result=new StringBuilder();
        int count =1;
        for(int i=1;i<str.length();i++){
            if(Str.charAt(i)==str.charAt(i-1))
            cout++;
        }
        else{
            result.append(str.charAt(i-1)).append(count);
            count=1;
        }
    }
    result.append(str.charAt(str.length()-1).append(count));
    system.out.println(result);
}