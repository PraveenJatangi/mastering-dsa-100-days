
// roblem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

function floor( arr,k){

    let start=0; let end=arr.length-1;
     let num=-1;
    while(start<=end){
        let mid=Math.floor((start+end)/2);
      if(arr[mid]<=k){
        num=mid;
         start=mid+1
      }
      else{
        end=mid-1;
      }
    }
   return num !== arr.length ? arr[num] : -1;
}
function ceil( arr,k){

    let start=0; let end=arr.length-1;
     let num=arr.length;
    while(start<=end){
        let mid=Math.floor((start+end)/2);
      if(arr[mid]>=k){
        num=mid;
        end=mid-1;
      }
      else{
        start=mid+1
      }
    }
    return arr[num];
}
let arr=[1,2,3,4,5,7,8,9];
console.log(floor(arr,6));
console.log(ceil(arr,6));
