
function tentimes(func){
  for (let i= 0; i <10; i++) {
    func();
  }
}
function prin(){
  const str=Math.floor(Math.random() *6 +1);
  console.log(str)
}
