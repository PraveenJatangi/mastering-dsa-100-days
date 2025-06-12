
function upperBound( arr,k){

    let start=0; let end=arr.length-1;
     let num=arr.length;
    while(start<=end){
        let mid=Math.floor((start+end)/2);

      if(arr[mid]>k){
        num=mid;
        end=mid-1;
      }
      else{
        start=mid+1
      }
    }
    return num;

}

let arr=[1,2,3,4,5,6,7,8,9];
console.log(upperBound(arr,6));
