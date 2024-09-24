<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
</head>
<body>

<?php 

$a = 1;
$b = 2;

function test()
{
    global $a;
    echo "Valor de a:",$a, "<br>";
}

echo "<h1>Hola Mundo</h1>;"

?>


</body>
</html>
