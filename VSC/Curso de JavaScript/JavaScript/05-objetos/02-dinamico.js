
const user= {id:1,name:"Nico"}

user.name = "Nicolás"

// Creación de un  método de una clase
user.guardar = function ()
{
    console.log("Guardando:", user.name)
}

user.guardar()

delete user.id

console.log(user)

const user1 = Object.freeze({id: 1}) // Creamos un objeto inmutable
const user2 = Object.seal({id: 2}) // Creamos un objeto del que podemos modificar sus propiedades pero no añadir ni eliminarla


user1.name = "Nico" // No se puede modificar

console.log(user1)

