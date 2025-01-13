<?php

$nombre = $_POST['nombre'] . "<br>";
$apellidos = $_POST['apellidos'] . "<br>";
$email = $_POST['email'] . "<br>";

echo "Datos de $_POST: <br>";

echo "<pre>";
print_r($_POST);
echo "</pre>";


echo "Datos de $_GET: <br>";

echo "<pre>";
print_r($_GET);
echo "</pre>";
?>
