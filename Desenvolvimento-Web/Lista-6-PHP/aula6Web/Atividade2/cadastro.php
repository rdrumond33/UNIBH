<?php
session_start();

require_once('db.php');


$query = "CREATE TABLE cadastro (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
    rg VARCHAR(20),
	escolaridade VARCHAR(20),
	telefone VARCHAR(20),
    email VARCHAR(50),
    nascimento VARCHAR(10),
    CPF VARCHAR(20) unique,
    mae VARCHAR(50),
	profissao VARCHAR(30),
	celular VARCHAR(20)
)";
mysqli_query($conn, $query);



$nome = trim(filter_input(INPUT_POST,'nome',FILTER_SANITIZE_STRING));
$rg = trim(filter_input(INPUT_POST,'rg',FILTER_SANITIZE_STRING));
$escolaridade = trim(filter_input(INPUT_POST,'escolaridade',FILTER_SANITIZE_STRING));
$telefone = trim(filter_input(INPUT_POST,'telefone',FILTER_SANITIZE_STRING));
$email = trim(filter_input(INPUT_POST,'email',FILTER_SANITIZE_EMAIL));
$nascimento = trim(filter_input(INPUT_POST,'nascimento',FILTER_SANITIZE_STRING));
$CPF = trim(filter_input(INPUT_POST,'CPF',FILTER_SANITIZE_STRING));
$mae = trim(filter_input(INPUT_POST,'mae',FILTER_SANITIZE_STRING));
$profissao = trim(filter_input(INPUT_POST,'profissao',FILTER_SANITIZE_STRING));
$celular = trim(filter_input(INPUT_POST,'celular',FILTER_SANITIZE_STRING));


if(empty($nome)){
    $_SESSION['Validar_nome'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($rg)){
    $_SESSION['Validar_rg'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($escolaridade)){
    $_SESSION['Validar_escolaridade'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($telefone)){
    $_SESSION['Validar_telefone'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($email)){
    $_SESSION['Validar_email'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($nascimento)){
    $_SESSION['Validar_nascimento'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($CPF)){
    $_SESSION['Validar_CPF'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($mae)){
    $_SESSION['Validar_mae'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($profissao)){
    $_SESSION['Validar_profissao'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}if(empty($celular)){
    $_SESSION['Validar_celular'] = "NAO PODE SER VAZIO!!";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
}
else{
    $query =  "INSERT INTO cadastro (nome,rg,escolaridade,telefone,email,nascimento,CPF,mae,profissao,celular) VALUES ('$nome','$rg','$escolaridade','$telefone','$email','$nascimento','$CPF','$mae','$profissao','$celular');";
    $result = mysqli_query($conn, $query);
  var_dump($query);
    if($result){
        $_SESSION['Validar_cadastrado'] = "cadastrado com sucesso  ";
        echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';

    }else{
        $_SESSION['error'] = 'Ja existente esse CPF!!';
        echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';

    }
}