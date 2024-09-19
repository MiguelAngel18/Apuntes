

let resolucion=0

function nombreResolucion(ancho,alto)
{
    if(ancho<= 1280 || alto>= 720)
    {
        return "HD"
    } 
    else if(ancho<= 1928 || alto>= 1080)
    {
        return "FHD"
    }
    else if(ancho<= 2560 || alto>= 1440)
    {
        return "WQHD"
    }
    else if(ancho<= 3840 || alto>= 2160)
    {
        return "4K"
    }
    else if(ancho<= 7680 || alto>= 4320)
    {
        return "8K"
    }
    else
    {
        return "Qué coño tienes en tu casa? Un cine!?"
    }
}

resolucion = nombreResolucion(7680,4320)

console.log(resolucion)