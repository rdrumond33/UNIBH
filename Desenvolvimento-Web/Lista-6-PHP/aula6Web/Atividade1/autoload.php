<?php
spl_autoload_register(function($class_name){
     $filemane = $class_name . ".php";
    if(file_exists($filemane)){
        require_once($filemane);
    }
 });