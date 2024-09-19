// Chungo


let vectorDeEjemplo = [{}] // Array de objetos


let array = 
[
    {id: 1,name: "Antonio"},
    {id: 2,name: "Felipe"},
    {id: 3,name: "Miguel Ángel"},
]


let paresEjemplo =              // Par o Pares: Este es un Array de Array's
[
    [1,{id:1,name:"Antonio"}],
    [2,{id:2,name:"Felipe"}],
    [3,{id:3,name:"Miguel Ángel"}]
]

function toPairs(vector)
{
    let pares = []

    for(i in vector)
    {
        pares[i] = [vector[i].id,vector[i]]
    }
    return pares
}

let resultado = toPairs(array)

console.log(resultado)