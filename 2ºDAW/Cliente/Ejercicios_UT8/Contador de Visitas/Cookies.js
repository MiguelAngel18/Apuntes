function leerCookie()
{
    alert(document.cookie.valueOf('Contador_Visitas'));
}

function borrarCookie(nombre)
{
    document.cookie = nombre + "=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
    document.getElementById('mensaje').innerText = 'Cookie borrada. Recargue la página para reiniciar el contador.';
}

function actualizarCookie(nombre)
{
    let visitas;
    let expiracion
    // Obtener la cookie si existe
    visitas = getCookieValue(nombre);
    
    // Si no existe la cookie, es la primera visita
    if (visitas === "")
    {
        visitas = 1;    
        let fecha = new Date();
        fecha.setTime(fecha.getTime() + (365 * 24 * 60 * 60 * 1000));
        let expiracion = "expires=" + fecha.toUTCString();
        document.cookie = nombre + "=" + visitas + "; " + expiracion + ";path=/";
    }
    else
    {
        // Convertir el valor de la cookie a número y sumar 1
        visitas = parseInt(visitas) + 1;
        document.cookie = nombre + "=" + visitas + "; " + expiracion + ";path=/";
    }
        
    // Mostrar el número de visitas en la página
    document.getElementById("mensaje").innerHTML = "Número de visitas: " + visitas;
}

// Función para obtener el valor de una cookie
function getCookieValue(cname)
{
    let name = cname + "=";
    let decodedCookie = decodeURIComponent(document.cookie);
    let cadena = decodedCookie.split(';');
    for(let i = 0; i < cadena.length; i++)
    {
        let value = cadena[i];
        while (value.charAt(0) == ' ')
        {
            value = value.substring(1);
        }
        if (value.indexOf(name) == 0)
        {
            return value.substring(name.length, value.length);
        }
    }
    return "";
}

document.addEventListener('load', actualizarCookie("Contador_Visitas"));