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