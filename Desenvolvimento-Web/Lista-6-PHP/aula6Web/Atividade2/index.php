<?php
session_start();
?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formulario</title>
    <link rel="stylesheet" href="css/cadastro.css">
</head>

<body>
    <header>
        <h3>Lista 6</h3>
    </header>
    <section>
        <?php if(!empty($_SESSION['Validar_cadastrado'])):?>
        <div>
            cadatrou com sucesso
        </div>
        <?php  unset($_SESSION['Validar_cadastrado']); endif ?>
        <?php 
        if(!empty($_SESSION['error'])){
            echo $_SESSION['error'];
            unset($_SESSION['error']);
        }
        ?>
            <form action="cadastro.php" method='POST'>
            <h1>Cadastro</h1>
            <div id="coluna1">
                <p>
                    <label>Nome:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_nome'])){
                        echo $_SESSION['Validar_nome'];
                        unset($_SESSION['Validar_nome']);
                    }
                    ?>
                    <br />
                    <input type="text" name="nome" id="nomeid">
                </p>
                <p>
                    <label>RG:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_rg'])){
                        echo $_SESSION['Validar_rg'];
                        unset($_SESSION['Validar_rg']);
                    }
                    ?>
                    <br />
                    <input type="text" name="rg" placeholder="xxxxxx" id="rgid">

                </p>
                <p>
                    <label>Escolaridade:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_escolaridade'])){
                        echo $_SESSION['Validar_escolaridade'];
                        unset($_SESSION['Validar_escolaridade']);
                    }
                    ?>
                    <br />
                    <input type="text" name="escolaridade" id="escolaridadeid">
                </p>
                <p>
                    <label>Fone:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_telefone'])){
                        echo $_SESSION['Validar_telefone'];
                        unset($_SESSION['Validar_telefone']);
                    }
                    ?>
                    <br />
                    <input type="text" name="telefone" placeholder="(xx)xxxxx-xxxx" id="telefoneid">
                </p>
                <p>
                    <label>Email:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_email'])){
                        echo $_SESSION['Validar_email'];
                        unset($_SESSION['Validar_email']);
                    }
                    ?>
                    <br />
                    <input type="email" name="email" placeholder="mail@mail.com" id="emailid">

                </p>
            </div>
            <div id="coluna2">
                <br />
                <p>
                    <label>Data de Nascimento:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_nascimento'])){
                        echo $_SESSION['Validar_nascimento'];
                        unset($_SESSION['Validar_nascimento']);
                    }
                    ?>
                    <br />
                    <input type="date" name="nascimento" id="nascimentoid">
                </p>
                <p>
                    <label>CPF:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_CPF'])){
                        echo $_SESSION['Validar_CPF'];
                        unset($_SESSION['Validar_CPF']);
                    }
                    ?>
                    <br />
                    <input type="text" name="CPF" id="cpfid" placeholder="xxx.xxx.xxx-xx">
                </p>
                <p>
                    <label>Nome da mae:</label>
                    <?php 
                    if(!empty($_SESSION['Validar_mae'])){
                        echo $_SESSION['Validar_mae'];
                        unset($_SESSION['Validar_mae']);
                    }
                    ?>
                    <br />
                    <input type="text" name="mae" id="maeid">
                </p>
                <p>
                    <label>Profissão</label>
                    <?php 
                    if(!empty($_SESSION['Validar_profissao'])){
                        echo $_SESSION['Validar_profissao'];
                        unset($_SESSION['Validar_profissao']);
                    }
                    ?>
                    <br />
                    <input type="text" name="profissao" id="profissaoid">
                </p>
                <p>
                    <label>celular</label>
                    <?php 
                    if(!empty($_SESSION['Validar_celular'])){
                        echo $_SESSION['Validar_celular'];
                        unset($_SESSION['Validar_celular']);
                    }
                    ?>
                    <br/>
                    <input type="text" name="celular" id="celularid">
                </p>
            </div>
            <div class="clearfix">
                <p>
                    <button type="submit">Cadastrar</button>
                    <input type="button" value="Limpar" id='limparid'/>
                    <input type="button" name='listagem' value='Listar'
                        onclick="window.location.href='listar.php'" />
                </p>
            </div>

        </form>
        <form method="POST" action="Deletar.php">
            <div>
                <input type="text" name="delcpf" id="delcpf" placeholder='Digite o cpf à ser excluido' />
                <input type="submit" name='submit' value='Excluir' />
            </div>
        </form>
    </section>


    <script src="./script/main.js"></script>
</body>

</html>