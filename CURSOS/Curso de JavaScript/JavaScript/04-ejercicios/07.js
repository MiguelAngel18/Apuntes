

function precioCompleto(precio,impuestos)
{
    return precio + precio*impuestos
}

let resultado = precioCompleto(19.90, 0.20)

console.log(resultado)