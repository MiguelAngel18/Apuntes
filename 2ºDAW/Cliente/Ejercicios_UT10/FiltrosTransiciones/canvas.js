const canvas = document.getElementById('miCanvas');
const ctx = canvas.getContext('2d');
const img = new Image();
img.src = 'IMG/silueta.gif';

let x = 0;
let velocidad = 2;
let girado = false;
let requestId;

function animar()
{
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.save();
    if(girado)
    {
        // Rotar la imagen horizontalmente
        ctx.translate(x + img.width / 2, img.height / 2);
        ctx.scale(-1, 1);
        ctx.drawImage(img, -img.width / 2, -img.height / 2);
        ctx.restore();
    }
    else
    {
        ctx.drawImage(img, x, 0);
    }
    x += velocidad;
    // Si la imagen llega al borde
    if (x + img.width > canvas.width || x < 0)
    {
        velocidad = -velocidad;
        girado = !girado;
    }
    requestId = requestAnimationFrame(animar);
}

function detenerAnimacion()
{
    cancelAnimationFrame(requestId);
    x = 0;
    girado = false;
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.save();
    ctx.drawImage(img, x, 0);
    ctx.restore();
}

img.onload = function()
{
    animar();
};

document.getElementById('btnMover').addEventListener('click', () => {
    animar();
});

document.getElementById('btnSituar').addEventListener('click', () => {
    detenerAnimacion();
});