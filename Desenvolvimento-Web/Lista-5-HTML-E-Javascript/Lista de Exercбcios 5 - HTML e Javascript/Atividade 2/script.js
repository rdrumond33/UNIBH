var q = document.getElementById('quadrado');
var btn = document.getElementById('btn');
var red = document.getElementById('btn-red');

let verde =document.getElementById('btn_verde')
let azul =  document.getElementById('btn_azul')
let amarelo = document.getElementById('btn_amarelo')

btn.addEventListener('click', function () {
    q.style.transition = 'all 1s' // transicao
    q.style.width = '200px' // altera largura
    q.style.height = '150px' // altera altura
});
red.addEventListener('click', function () {
    q.classList.add('vermelho');
    q.classList.remove('amarelo'); 
    q.classList.remove('azul'); 
    q.classList.remove('verde'); 
});
verde.addEventListener("click",()=>{
    q.classList.add('verde');
    q.classList.remove('amarelo'); 
    q.classList.remove('azul'); 
    q.classList.remove('vermelho'); 

})
azul.addEventListener('click',()=>{
    q.classList.add('azul');
    q.classList.remove('amarelo'); 
    q.classList.remove('verde'); 
    q.classList.remove('vermelho'); 

})
amarelo.addEventListener('click',()=>{
    q.classList.add('amarelo');
    q.classList.remove('azul'); 
    q.classList.remove('verde'); 
    q.classList.remove('vermelho'); 
  
})