function Usuario(nombre)
{
    this.nombre = nombre
}

let usuario = new Usuario("Miguel")

console.log(Usuario.name)
console.log(Usuario.length)

const U = Usuario
let usuario2 = new U("Felipe")

console.log(usuario)

function of(Fn,args)
{
    return new Fn(args)
}

let usuario3 = of(Usuario,"Antonio")
console.log(usuario3)

function returned()
{
    return function()
    {
        console.log("Hola Mundo")
    }
}

let saludo = returned()
saludo()
