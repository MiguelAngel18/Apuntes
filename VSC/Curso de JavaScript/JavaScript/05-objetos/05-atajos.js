let obj = {};

let obj2 = new Object();

obj.constructor()

obj2.constructor()

/**
 * new Array()
 * new String()
 * new Number()
 * new Boolean()
 */

function Usuario()
{
    this.nombre = "Miguel"
}

let usuario = new Usuario()
console.log(usuario.constructor)

typeof "" // Devuelve "string"

"".toString() // 

typeof new String() // Devuelve "object"