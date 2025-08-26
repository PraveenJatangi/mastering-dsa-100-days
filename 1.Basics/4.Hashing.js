//Count frequency of each element in the array
//bruteforce method using array

function countFrequencies(arr) {
    let visited = new Array(arr.length).fill(false);

   // boolean[] visited= new boolean(arr.length)
   
    for (let i = 0; i < arr.length; i++) {
        if (visited[i]) continue;

        let count = 1;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] === arr[j]) {
                count++;
                visited[j] = true;
            }
        }

        console.log(`${arr[i]} appears ${count} time(s)`);
    }
}

const arr = [2, 3, 2, 5, 3, 4, 2];

//Using Map()

function countFrequenciess(arr){
    let freqMap= new Map();

    for( let num of arr){
        if(freqMap.has(num)){
            freqMap.set(num,freqMap.get(num)+1)
        }
        else{
            freqMap.set(num,1);
        }   
    }
    return freqMap;
}

const val =countFrequenciess(arr);

for(let[key,value] of val){
    console.log(`${key} => ${value}`);
}

// //Finding highest and lowest frequence elements

function printHighestLowestElements(arr){
    let freqMap= new Map();
     for( let num of arr){
        if(freqMap.has(num)){
            freqMap.set(num,freqMap.get(num)+1)}
        else{ freqMap.set(num,1); }   
    }
        let maxFreq = 0, minFreq = arr.length,  maxElem = null,  minElem = null;

    for (let [element, freq] of freqMap.entries()) {
        if (freq > maxFreq) {
            maxFreq = freq;
            maxElem = element;
        }
        if (freq < minFreq) {
            minFreq = freq;
            minElem = element;
        }
    }
console.log(`maximum frequency element is ${maxElem} and min frequency element ${minElem}`)
}

printHighestLowestElements(arr);

//group by 
function printHighestFrequencies(arr){
    let freqMap= new Map();
    for( let num of arr){
        if(freqMap.has(num)){
            freqMap.set(num,freqMap.get(num)+1)
        }
        else{freqMap.set(num,1); }   
    }
    let maxFreq=0,maxElem=0;
    
    for(let[element,freq] of freqMap.entries()){
        if(freq>maxFreq){
            maxElem=element;
            maxFreq=freq;
        }}
    let result = [];
   for (let [key, val] of freqMap.entries()) {
    if (val === maxFreq) {
        result.push(key);
    }
}
console.log(`maximum frequency e is ${maxFreq} element is:${result.join(",")}` )
}
printHighestFrequencies(arr);