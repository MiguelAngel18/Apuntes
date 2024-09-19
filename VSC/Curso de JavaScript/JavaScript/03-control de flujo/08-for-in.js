// For in

let user = {id: 7,name: "Jains Bond",edad: 18}

for(let prop in user) // De PROPiedad
{
    console.log(prop) // Así da el nombre de las variables dentro del objeto
}

console.log("")

for(let prop in user) // De PROPiedad
{
    console.log(user[prop]) // Así da los valores de las variables dentro del objeto
}

console.log("")

for(let prop in user) // De PROPiedad
{
    console.log(user["..."]) // Introduciendo el nombre de la variable de la que quieres  obtener los valores desde dentro del objeto
}

console.log("")

for(let prop in user) // De PROPiedad
{
    console.log(prop,user[prop]) // Así da los nombres y valores de las variables dentro del objeto
}

console.log("")


// Ejemplo: NO RECOMENDADO. Mejor usar el for-of.

let animales = ["Perro","Gato","Tortuga"]

for(let indice in animales)
{
    console.log(indice,animales[indice])
}