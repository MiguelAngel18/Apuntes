// For of -> Como el for each de Java

let array = [".","..","..."]

for(let variable of array)
{
    if(array.includes(variable))
    {
        console.log(variable)
    }
}

console.log("")



// Ejemplo

let animales = ["Perro","Gato","Tortuga"]

for(let animal of animales)
{
    if(animal)
    {
        console.log(animal)
    }
}