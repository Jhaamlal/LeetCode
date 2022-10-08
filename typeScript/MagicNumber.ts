const findMagic=(nums:number):number=>{
    let ans=0;
    let base=5
    while (nums >0) {
      let last =nums &1;
      nums =nums >>1;
      ans +=base*last
      base=base*5

    }
    return ans;
}