#include<cmath>//including cmath liberary
class Solution {
public:
    int mySqrt(int x) {
        //min.Runtime(0ms.) T(C(N)=O(log(n)) and S(C(N)=O(1)) as it requires non additional space
        if(x==0 || x==1)return x;//Initialize x to 0 or 1 and print x
        int start=1;int mid=-1;int end=x;//varibles declare
        while(start<=end){//iterating x from its start till end 
            mid=start+(end-start)/2;//calcualting sqaure root val
            if(mid*(long)mid >(long)x)end=mid-1;//decrementing the val from square of its num
            else if(mid*mid==x)return mid;//printing the mid val to its square val
            else start=mid+1;//incrementing the mid val
        }return round(end);}};//printing the estimated val
