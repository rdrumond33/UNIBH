const btnLimpar = document.querySelector(".btn_limpar");
const inputDados = document.querySelectorAll("input")
btnLimpar.addEventListener("click",()=>{
    for (const input of inputDados) {
        input.innerText="";
    }
})