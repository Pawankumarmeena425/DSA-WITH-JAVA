public class practive {
    public static boolean isDigit(String str){
        boolean check = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                continue;
            }
            else{
                check = false;
                break;
            }
        }
        if(check){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isDigit("65665656dsf5656"));
    }
}
