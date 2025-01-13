function Usuario()
{
    this.id = 1
    this.nombre = "Miguel"
    this.apellido = "Cabello"
    this.email = ""
    this.recuperaClave = function ()
    {
        console.log("Recuperando clave...")
    }
}

let usuario = new Usuario() // Método: Función que fue asignada a la propiedad de un objeto

console.log(usuario)