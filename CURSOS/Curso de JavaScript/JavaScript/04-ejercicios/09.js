// Chungo


let pares =              // Par o Pares: Este es un Array de Array's
[
    [1,{id:1,name:"Antonio"}],
    [2,{id:2,name:"Felipe"}],
    [3,{id:3,name:"Miguel Ángel"}]
]

function topCollection(vector)
{
    let collection = []

    for(idx in vector)
    {
        let elemento = vector[idx]
        collection[idx] = elemento[1]
        collection[idx].id = elemento[0]
    }
    return collection
}

let resultado = topCollection(pares)

console.log(resultado)