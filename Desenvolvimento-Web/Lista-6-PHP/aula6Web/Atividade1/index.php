<?php
session_start();
?>
<!DOCTYPE html>
<html lang="en">

<head>


    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario</title>
    <link rel="stylesheet" href="css/style.css">
    <style>
    </style>
</head>

<body>
    <header>
        <h3>Lista 6</h3>
    </header>
    
    <section>
        <?php
        echo '<div>';
        if(!empty($_SESSION['nao_encontrado'])){
            echo $_SESSION['nao_encontrado'];
            unset($_SESSION['nao_encontrado']);
            echo'</div>';
        }?>

        <div id="div_form">
            <form action="login.php" method="POST">

                <label for="login">Login:<br></label>
                <?php
            if(!empty($_SESSION['Validar_user'])){
                echo $_SESSION['Validar_user'][0];
                unset($_SESSION['Validar_user']);
            }
            ?>
                <input type="text" name="login" id="loginid" placeholder="Login">
                <label for="password">Password:<br></label>
                <?php
            if(!empty($_SESSION['Validar_senha'])){
                echo $_SESSION['Validar_senha'];
                unset($_SESSION['Validar_senha']);
            }
            ?>
                <input type="password" name="password" id="passwordid" placeholder="Senha">
                <br>
                <div class="btns">
                    <button type="submit" class="btn_logar" id='idbtnLogar'>Logar</button>
                    <input name='limpar' type="button" value="limpar" class='btn_limpar' id='btn_limpar'>

                    <div>
            </form>

        </div>

    </section>
        <script src="./script/main.js"></script>
</body>

</html>