function fn1()
{
    console.log("Fn1 function is called");
}

function sum(i,j)
{
    return i+j;
}

fn1();
fn1();
fn1();
fn1();
console.log(sum(2,3)+" is the answer");
// var no1=50;
// var no2=30;
// var sum=no1+no2;
// console.log(sum);
var arr=[22,10,70,80,65,96,39];
var i=0;
do
{
    console.log(arr[i]);
    i++;
    
}while(i<arr.length);
// for(var x of arr)
// {
//     console.log(x);
// }
// for(var i=0;i<arr.length;i++)
// {
//     console.log(arr[i]);
// }
// arr.sort();
// console.log(arr);
// var i=20;
// var j=40;
// if(i>j)
//     console.log("Yes");
// else
//     console.log("No");