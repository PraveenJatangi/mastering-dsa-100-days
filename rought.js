// // const person = {
// //   name: "John",
// //   greet() {
// //     console.log(`Hello, I am ${this.name}`);
// //   }
// // };

// //  person.greet();

// // var name = "praveen";
// // {
// // const name = "ramehs";
// // console.log(name);}
// // console.log(name);
// //  let val = 2+2+2+"cahr"+2;
// //  console.log(val);
//  let row="";
// for(let i=1;i<5;i++){
//   row+=i;
//   //console.log(row);
// }

// a=10;
// console.log(a);
// var a;


// function counter(){
//     let count=0;
//     return function inner(){
//         count++;
//         console.log(count);
//     }
// }
// const count=counter();
// count();
// count();

function outer() {
  let a = 1;
  return {
     increament: ()=>  a++,
     decreament: ()=>a--
      };
}
const fn = outer();
console.log(fn.increament()); // ?
console.log(fn.increament()); // ?
console.log(fn.increament()); // ?
console.log(fn.decreament()); // ?
console.log(fn.decreament()); // ?

