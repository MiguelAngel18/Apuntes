// Short-circuit

/* Valores Falsy (Se evalúan en falso)
   
   - false
   - 0
   - "" O ''
   - null
   - undefined
   - NaN

*/

let nombre = "Mangel"
let userName = nombre || "Anonimous"

console.log(userName)




function fn1()
{
    console.log("Función 1")
    return false
}


function fn2()
{
    console.log("Función 2")
    return true
}

let x = fn1() && fn2()
