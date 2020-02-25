const btn = document.getElementById('limparid');

function limparCampos() {
    document.getElementById('nomeid').value = "";
    document.getElementById('rgid').value = "";
    document.getElementById('escolaridadeid').value = "";
    document.getElementById('telefoneid').value = "";
    document.getElementById('emailid').value = "";
    document.getElementById('nascimentoid').value = "";
    document.getElementById('cpfid').value = "";
    document.getElementById('maeid').value = "";
    document.getElementById('profissaoid').value = "";
    document.getElementById('celularid').value = "";
}

btn.addEventListener('click',()=>{
    limparCampos()
});
