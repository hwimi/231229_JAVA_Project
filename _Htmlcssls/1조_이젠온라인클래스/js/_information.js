//전체 강의 파트
let pra = document.getElementById('pr');
let gamea = document.getElementById('game');
let doa = document.getElementById('do');
let maa = document.getElementById('ma');
let coa = document.getElementById('co');
let check=document.getElementById('check')
document.getElementById('pr').addEventListener('click', () => {

    let pra = `<li><button type="button" class="1">자바</button></li>`
    pra += `<li><button type="button"class="1">javascript</button></li>`
    pra += `<li><button type="button" class="1">html</button></li>`
    pra += `<li><button type="button" class="1">css</button></li>`
    document.getElementById("result2").innerHTML = pra;

})
document.getElementById('game').addEventListener('click', () => {

    let gamea = `<li><button type="button" class="1">피자</button></li>`
    gamea += `<li><button type="button" class="1">치킨</button></li>`
    gamea += `<li><button type="button" class="1">라면</button></li>`
    gamea += `<li><button type="button" class="1">삼겹살</button></li>`
    document.getElementById("result2").innerHTML = gamea;

})
document.getElementById('do').addEventListener('click', () => {

    let doa = `<li><button type="button" class="1">하늘</button></li>`
    doa += `<li><button type="button" class="1">땅</button></li>`
    doa += `<li><button type="button" class="1">바다</button></li>`
    doa += `<li><button type="button" class="1">산</button></li>`
    document.getElementById("result2").innerHTML = doa;

})
document.getElementById('ma').addEventListener('click', () => {

    let maa = `<li><button type="button" class="1">축구</button></li>`
    maa += `<li><button type="button"class="1" >농구</button></li>`
    maa += `<li><button type="button"class="1" >야구</button></li>`
    maa += `<li><button type="button" class="1">배구</button></li>`
    document.getElementById("result2").innerHTML = maa;

})
document.getElementById('co').addEventListener('click', () => {

    let coa = `<li><button type="button"class="1" >111</button></li>`
    coa += `<li><button type="button" class="1">222</button></li>`
    coa += `<li><button type="button"class="1" >333</button></li>`
    coa += `<li><button type="button" class="1">444</button></li>`
    document.getElementById("result2").innerHTML = coa;

})

const a = document.getElementById("check").innerHTML;
document.addEventListener('click',(e)=>{
    console.log(e.target.classList)
    if(e.target.classList.contains('1')){
        console.log('111');
        alert('확인');
        //let i=e.target.innerHTML;
        console.log(e.target.innerHTML);
        document.getElementById("check").innerHTML= a + e.target.innerHTML;
    }
})
// document.addEventListener('click',()=>{
//     document.getElementById('check')
//     if(id="check"){
//         alert("확인");
//     }
   
// })


