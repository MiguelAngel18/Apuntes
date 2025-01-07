let imagen = document.getElementById('imagen');

function moverImagen()
{
    let mitadPantalla = window.innerWidth / 2 - imagen.width / 2;

    imagen.style.left = `${mitadPantalla}px`;

    setTimeout(() => {
        imagen.classList.add('invertida');
        setTimeout(() => {
            imagen.style.left = '0px';
        }, 2000);
    }, 2000);
}

function situarImagen()
{
    imagen.style.left = '0px';
    imagen.classList.remove('invertida');
}

function desplazarImagenOrigen()
{
    imagen.style.left = '0px';
}