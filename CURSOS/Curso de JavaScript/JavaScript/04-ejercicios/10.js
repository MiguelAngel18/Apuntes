// Chungo

let longuitud = 7;


function crearArray(n)
{
    if(n<=0)
    {
        return []
    }
    else
    {
        let array = []
        for(let i=0;i<n;i++)
        {
            array[i] = ++i
        }
        return array
    }
}

let resultado = crearArray(longuitud)

console.log(resultado)