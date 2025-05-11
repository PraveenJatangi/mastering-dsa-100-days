//Base Case

//Counter

let count=0;
function counter(){
   
    if(count===5){
        return ;
    }
    count++;
    counter();
}
counter();
console.log(count);

//Print Name N times Using recursion

function printName(a,b){

if(a>b){
    return ;
}
console.log("Praveen");

printName(a+1,b);
}
printName(1,10);

//Print 1 to N Using Recursion

function printN(start,num){

    if(start>num){
        return
    }
    console.log(start);
    printN(start+1,num)
}
printN(1,5);

//Print N to 1 Using Recursion
function printNumToOne(start){

    if(start<1){
        return
    }
    console.log(start);
    printNumToOne(start-1);
}
printNumToOne(5);

// Sum of First N Numbers

function sumOfN(num){

    if(num==0) return 0;
     return num+sumOfN(num-1);
}

console.log(sumOfN(5));


//Factorial Of N Numbers

function factorial(num){

     if(num==0) return 1;
     return num*factorial(num-1);
}

console.log(factorial(5));

// Reverse an Array 

function reverseArray(arr,start=0,end=arr.length-1){

    if(start>=end) return;

    [arr[start],arr[end]]=[arr[end],arr[start]]

    reverseArray(arr, start+1,end-1);
}
arr=[1,2,3,4,5];
reverseArray(arr);
console.log(arr);

//Check if a String is a Palindrome or not

function reverseStringIterative(s) {
    // let reversed = "";
    // for (let i = str.length - 1; i >= 0; i--) {
    //     reversed += str[i];
    // }
    // return reversed;
    // if(str==="")return " ";
    // return reverseStringIterative(str.substring(1)) + str[0];
     s = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();

    function check(start, end) {
        if (start >= end) return true;
        if (s[start] !== s[end]) return false;
        return check(start + 1, end - 1);
    }

    return check(0, s.length - 1);
}



//Fibonacci

function fibonacci(n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    fib =[];
    fib[0] = 0;
    fib[1] = 1;
    for (let i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
}
  console.log(fibonacci(5)); 
  