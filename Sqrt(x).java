class Solution {
    public int mySqrt(int x) {
        //min runtime(1ms) S(C(n))=O(1) and (T(C)=(O(log(n))) as it requires non additional space 
        if(x==0 || x==1)return x;//initializing x val to either 0 or 1 and printing it
        int start=1;int mid=-1;int end=x;//start ,mid,end val declare
        while(start<=end){//iterating start to end val 
            mid=start+(end-start)/2;//calculatings qare root val
            if(mid*(long)mid> (long)x)end=mid-1;//checking mid >x and declaring end val to mid's less val
            else if (mid*mid==x)return mid;//x to mid's square assigiment and priniting it 
            else start=mid+1;//incrementing start to mid 
        }return Math.round(end);}}//prinitng the estimated end's val    
