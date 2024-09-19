

function createUser(name,email)
{
    return {
        name,
        email,
        activo: true,
        recuperarClave: function ()
        {
            console.log("Recuperando clave...")
        }
    }
}

let user1 = createUser("Nico","nico@gmail.com")
let user2 = createUser("Felipe","felipe@gmail.com")

