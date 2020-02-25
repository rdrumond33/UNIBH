<?php
session_start();

require_once('db.php');


    $query = "SELECT * FROM cadastro";

    $result = mysqli_query($conn, $query);
    
    if($result AND ($result->num_rows != 0 )){
        while($row = mysqli_fetch_assoc($result)){
            echo  '<p>';
                echo '<span>'.$row['nome'].'</span>';
                echo ' CPF:<span scope="row">'.$row['CPF'].'</span>';
            echo '</p>';
        }
    }
    ?>