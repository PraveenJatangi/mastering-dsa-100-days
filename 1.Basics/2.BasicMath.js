//Count Digits
 function countDitigts(num){ 
    
   let count=0;
   while(num>0){
 
    //    let lastVal=num%10;
    //    count=count*10+lastVal
    num=num/10|0;
    count++; 
    
    //optimal 
    // let count=Math.floor(Math.log10(num)+1)
   }
    return count;

 }
 


//Reverse a Number

function reverseNumber(num){ 
    
    let count=0;
    while(num>0){

        let lastVal=num%10;
        count=count*10+lastVal
        num=num/10|0;

    }
     return count;
 
  }
  
  //Check Palindrome

  function checkPalindrome(num){

    let originalValue= num;
    let reverseNum=0;
    while(num>0){
      let last = num%10;
      reverseNum=reverseNum*10+last;
      num=num/10|0;
    }
    if(originalValue===reverseNum){
        console.log("The given number is palindrome")
    }
    else  console.log("The given number is not a palindrome");
      
  }
  
  // GCD of two numbers

  function gcd(a,b){

     if(b===0) return a;
     while(b!==0){
         let temp= b;
         b=a%b;
         a=temp

     }
     return a;
  }

  //Armstrong number

  function findArmstrong(num){

    let original=num;
    let finalNum=0;
    const digits = num.toString().length;
    while(num>0){
         let last = num%10;
         finalNum=finalNum+ Math.pow(last, digits); 
         num=num/10|0;

    }
    if(original===finalNum){
        console.log("the given num is a Armstrong")
    }
    else{console.log(" Not a Armstrong")}
  }
  
  // All Divisors

  function divisor(num){
    let arr=[];
    let val= Math.floor(Math.sqrt(num)
  )
    for (let i = 1;i<=val;i++){
         if( num%i===0){
             arr.push(i)
            if(!arr.includes(num/i)) arr.push(num/i)
         }
    }
    return arr;
  }

  // IsPrime
  function isPrime(num) {
    if (num <= 1) return false; 
    if (num === 2) return true; 
    if (num % 2 === 0) return false; 
  
    for (let i = 3; i <= Math.sqrt(num); i += 2) {
      if (num % i === 0) return false;
    }
  
    return true;
  }
  
 
  