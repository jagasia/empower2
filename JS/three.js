var str=`The syntax for filter is 
similar to map, 
except the callback function should
 return true to keep the element, 
 or false otherwise. 
 In the callback, 
 only the element is required.`;

let i=100;
var x=20;
var x=30;

var arr=[];
arr.push("india");
arr.push("pakistan");
arr.push("canada");
arr.push("china");
arr.push("sri lanka");
arr.push("bangladesh");
// arr.pop();
// console.log(arr)
// arr.map((x)=>{
//     console.log(x+" : "+x.length)
// });

var arr2=arr.filter((x)=>{
    return x.length<6
});

console.log(arr2);