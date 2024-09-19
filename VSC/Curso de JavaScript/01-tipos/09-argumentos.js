let resultado

function sumar(num1,num2) // Parámetros dentro de la función
{
    console.log(arguments) // Imprime por parntalla un array con todos los argumentos (valores introducidos en la función)

    return num1 + num2; // Lo devuelve, pero no lo muestra por pantalla por lo que hay que usar el console.log()
}

console.log(sumar(2,2)) 


function sumar2(num1,num2) // Atributos dentro de la función
{
    console.log(num1+num2)
}

sumar2(2,2)

function sumar3(num1,num2) // Atributos dentro de la función
{
    resultado = num1 + num2
    console.log(resultado)
}

sumar3(2,2)

///////////////////////////////////////////////////////////////

function multiplicar(num1,num2) // Atributos dentro de la función
{
    let result = num1 * num2
    return result;
}

console.log(multiplicar(2,3)) 

console.log(typeof sumar)


