const findUnique=(nums:number[])=>{
    let unique=0;
    nums.forEach(element => {
        unique ^=element
    });
    return unique;
}

let nums=[1,3,4,4,3,1,2]
let x=findUnique(nums)
console.log(x);
