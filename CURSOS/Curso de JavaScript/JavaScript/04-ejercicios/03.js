// Índice que valide que no sea menor a cero y que el elmento exista dentro del array

let vector = [0,1,2,3]

function validar(cadena, id)
{
    if(id<0 || id>= vector.length)
    {
        console.log("ID no válido")
    }
    else
    {
        
        console.log("Existe dentro del vector:",cadena[id])
    }
}

validar(vector,1)

