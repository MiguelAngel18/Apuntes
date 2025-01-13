<?php // Opcional



echo "Hola PHP \n\r";

$my_string = "Hola PHP"."\n\r";

echo $my_string;

echo gettype($my_string). "\n";

$my_string = 6;

echo gettype($my_string). "\n";

$my_int = 7;
$my_int = $my_int + 4;
echo $my_int. "\n";


echo $my_int -1 . "\n"; // Imprime el valor de la variable $my_int menos uno, pero no cambia su valor real
echo $my_int. "\n";

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

$my_double = 6.5;

echo gettype($my_double). "\n";
echo $my_int + $my_double. "\n"; // Suma valores de distintos tipo sin problemas
// echo $my_int + $MY_double + $my_string. "\n";  Pero no todos los tipos son compatibles

$my_boolean = true;
echo $my_boolean."\n";
echo gettype($my_boolean); // Su valor es igual a 1


$my_boolean = false;
echo $my_boolean,"\n";
echo gettype($my_boolean); // No se imprime nada, pero es igual a 0

$my_boolean = true;
echo $my_boolean,"\n";
echo gettype($my_boolean); // Su valor es igual a 1

echo "El valoe de mi integer es $my_int y el de mi boolean es $my_boolean\n";


// Constantes


const constante = "Valor de la constante";
echo constante."\n";

//Definición de listas

$my_list = ["Lunes","Martes","Miércoles","Jueves","Viernes"];

echo gettype($my_list)."\n";

echo $my_list[0]."\n";
echo $my_list[4]."\n";
// echo $my_list[1]."\n";

array_push($my_list,"Sábado","Domingo");

print_r($my_list);

// Diccionario

$my_dict = array("String" => "Hola", "Integer" => 7, "Double" => 6.5, "Boolean" => true);

echo gettype($my_dict)."\n";

print_r($my_dict)."\n";

echo $my_dict["Integer"]."\n";