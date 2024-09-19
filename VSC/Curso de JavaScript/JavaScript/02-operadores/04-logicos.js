// Operadores lógicos

// AND, OR , NOT


// Ejemplos con AND:

console.log(true && true)    // TRUE
console.log(true && false)   // FALSE
console.log(false && true)   // FALSE
console.log(false && false)  // FALSE


let mayor = true
let suscrito = true
let catalogoInfantil = !mayor

console.log("Operador AND", suscrito && mayor)



// Ejemplos con OR

console.log(true || true)    // TRUE
console.log(true || false)   // TRUE
console.log(false || true)   // TRUE
console.log(false || false)  // FALSE

console.log("Operador OR", suscrito || mayor)



// Ejemplos con NOT

console.log("Operador NOT", !mayor)