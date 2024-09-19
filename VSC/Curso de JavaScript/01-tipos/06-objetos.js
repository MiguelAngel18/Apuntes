// Tipos de objetos y su declaración

let nombre = "Goku"
let anime = "Dragon Ball"
let raza = "Saiyajing"

let personaje = {nombre: "Goku", anime:"Dragon Ball",raza:"saiyajing"}

/* Otra forma de ponerlo

let personaje = 
{
    nombre: "Goku", 
    anime:"Dragon Ball",
    raza:"saiyajing"
}
*/

console.log(personaje)

// Valores dentro del objeto
console.log(personaje.nombre)
console.log(personaje.anime)
console.log(personaje.raza)

// Otra forma de obtener el valor de un objeto
console.log(personaje["anime"])

// Formas de modificar un valor de un objeto
personaje.nombre = "Kakaroto"
personaje["nombre"] = "Goku-sama"

// Forma de borrar una de las propiedades de los objetos
delete personaje.anime

console.log(personaje)
