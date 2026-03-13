class Solution{
    public static void main(String[] args) {
        int x=121;
        int original =x;
        int reverse=0;
        while(x!=0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("NO");
        }
    }
}