<?php
session_start();

require_once('conexao.php');

$query = "CREATE TABLE User (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	loginuser VARCHAR(30) NOT NULL,
	senha VARCHAR(15)
);";

mysqli_query($conn, $query);
$query = "INSERT INTO user(loginuser,senha) VALUES('root','123');";
mysqli_query($conn, $query);



$login = trim(filter_input(INPUT_POST,'login',FILTER_SANITIZE_STRING));
$senha = trim(filter_input(INPUT_POST,'password',FILTER_SANITIZE_STRING));

$query = "SELECT * FROM user WHERE loginuser = '$login' AND senha = '$senha'";

if((empty($login) || strlen($login)<3)){
    $_SESSION['Validar_user'] = array("Campo login e obrigatorio e tem que ter mais que 3 caracter",$login );
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index>';
}if((empty($senha)||(strlen($senha)<3 &&strlen($senha)<=8))){
    $_SESSION['Validar_senha'] = "senha vazia ou maior que 8 carcter ou menor que 3 ";
    echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index>';
}else{
    $result = mysqli_query($conn, $query);

    if($result AND ($result->num_rows != 0 )){
        
        echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=../Atividade2/index.php>';
        
    }else{
        $_SESSION['nao_encontrado'] = 'usuario nao encontrado';
        echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';

    }
}

