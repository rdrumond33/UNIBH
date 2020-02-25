<?php
session_start();

require_once('db.php');


$cpf = trim(filter_input(INPUT_POST,'delcpf',FILTER_SANITIZE_STRING));

$query = "DELETE FROM cadastro WHERE CPF = '$cpf';";
$result = mysqli_query($conn, $query);
echo '<META HTTP-EQUIV=REFRESH CONTENT = 0;URL=index.php>';
 
