// check if it cycle  will occures.
// by finding slow for one time and finding squre of it by  two times 
// to check is there any repeataion or not.
public class leetcode202 {
    public static void main(String[] args) {
        
    }
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findsquare(slow);// getting square of element for onces
            fast=findsquare((findsquare(fast)));// gettting square of element for two times move two step ahead
        }while(slow!=fast);// checking the cycle is present or not
        if(slow==1){
            return true;
        }
        return false;
    }
    public int findsquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
