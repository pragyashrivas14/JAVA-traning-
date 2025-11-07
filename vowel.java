

class vowel {
    public static void main(String[] args) {
        String str="powerfull";
        int v=0;
        for(char ch:str.toCharArray()){
            if ("aeuio".indexOf(ch)!=-1){
                v++;
            }
        }
        
        System.out.println("v");
    }
}