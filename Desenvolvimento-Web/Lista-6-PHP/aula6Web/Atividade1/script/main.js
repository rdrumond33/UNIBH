

function limparCampos() {
    document.getElementById('loginid').value = "";
    document.getElementById('passwordid').value = "";
   
}

const btn = document.getElementById('btn_limpar');

btn.addEventListener('click',()=>{
    limparCampos()
})