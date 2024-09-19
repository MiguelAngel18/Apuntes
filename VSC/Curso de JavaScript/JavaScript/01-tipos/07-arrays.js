// Tipos de arrays y su declaración
// Los elementos de los array comienzan desde el 0

let animales = [] // Array literal
let mascotas = ["Perro","Gato"]

console.log(animales)
console.log(mascotas)

console.log(mascotas[0]) // Devolverá el valor "Perro"
console.log(mascotas[1]) // Devolverá el valor "Gato"

// Esto dará un valor undefined
console.log(mascotas[2])

// Introducción de nuevos valores
mascotas[3] = "Tortuga" // Añadirá el valor "Totuga" en la casilla 2
console.log(mascotas[2]) // Devolverá el valor "Totuga"

// Si dejamos una casilla sin valor se mostrará con el valor "empty"
console.log(mascotas)

console.log(typeof mascotas) // Devuelve el tipo Object

console.log(mascotas.length) // Devuelve la longuitud del array

console.log(typeof mascotas.length) // Devuelve el tipo al que pertenece el número de casillas del array


