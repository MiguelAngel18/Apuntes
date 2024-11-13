function validar()
{
    let resultado = prompt("Introduce una palabra clave:");

    try
    {
        if(!isNaN(resultado))
        {
            alert("El número introducido no es válido.");
        }

        if(resultado.length <= 1)
        {
            alert("No has introducido nada.");
        }

        

    }
    catch(err)
    {
        document.getElementById("demo") = err.name;
    }
}