
    
class length{
    public static void main (String[] args){
        String str="world is beautifull";
        String a[]=str.split(" ");
        String largest ="";
        for(String val:a){
            if(val.length()>largest.length()){
                largest=val;
            
        }       
    }
     System.out.println(largest);

    }
}
