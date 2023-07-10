public class leetcode {
    public static String complexNumberMultiply(String nums1, String nums2) {
        int ind1 = nums1.indexOf('+');
        int ind2 = nums2.indexOf('+');
        String real1 = nums1.substring(0,ind1);
        String img1 = nums1.substring(ind1+1,nums1.length()-1);
        String real2  = nums2.substring(0,ind2);
        String img2 = nums2.substring(ind2+1,nums2.length()-1);

// Convert String into integer
        int r1=0,r2=0,im1=0,im2=0;
            boolean minus = false;
        for(int i=0;i<real1.length();i++){
            if(real1.charAt(i)=='-'){
                minus = true;
            }
            else{
                r1 = r1*10+real1.charAt(i)-'0';
            }

        }
        if(minus){
            r1 = r1*(-1);
        }
        minus = false;
        for(int i=0;i<real2.length();i++){
            if(real2.charAt(i)=='-'){
                minus = true;
            }
            else{
                r2 = r2*10+real2.charAt(i)-'0';
            }
        }
        if(minus){
            r2 = r2*(-1);
        }
        minus = false;
        for(int i=0;i<img1.length();i++){
            if(img1.charAt(i)=='-'){
                minus = true;
            }
            else{
                im1 = im1*10+img1.charAt(i)-'0';
            }

        }
        if(minus){
            im1 = im1*(-1);
        }
        minus = false;
        for(int i=0;i<img2.length();i++){
            if(img2.charAt(i)=='-'){
                minus = true;
            }
            else{
                im2 = im2*10+img2.charAt(i)-'0';
            }

        }
        if(minus){
            im2 = im2+(-1);
        }
        Integer resreal=0;
        Integer resimg=0;
        resreal =  (r1*r2)-(im1*im2);
        resimg =  (r1*im2)+(r2*im1);


        StringBuilder sb = new StringBuilder(resreal.toString());
        sb.append('+');
        sb.append(resimg.toString());
        sb.append('i');
        return sb.toString();


    }
    public static void main(String[] args) {
       String  num1 = "1+-1i", num2 = "1+-1i";
        System.out.println(complexNumberMultiply(num1,num2));
        System.out.println(0*(-1));
    }
}
