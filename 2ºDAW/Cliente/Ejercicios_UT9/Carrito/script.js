class Articulo
{
    constructor(codigo, descripcion, precio, cantidad, imagen)
    {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    setCantidad(cantidad)
    {
        this.cantidad = cantidad;
    }

    toString(i)
    {
        return `<div class="articulo">
                    <p>
                        <strong>${this.codigo}</strong>
                        ${this.descripcion}
                        Precio: <strong>${this.precio}€</strong>
                        Adquirir: <input type="number" id="cantidad${i++}" minlength="0" value="${this.cantidad}"> uds.
                    </p>
                    <img src="${this.imagen}" alt="${this.descripcion}">
                </div>`;
    }
}

let articulos = [
    new Articulo('A001','Ordenador PIV',650.10,0,'Imagenes/ORDENADOR1.GIF'),
    new Articulo('A002','Ordenador PIV mod. 2',683.15,0,'Imagenes/ORDENADOR2.GIF'),
    new Articulo('B003','Impresora HP',150.88,0,'Imagenes/IMPRESORA.GIF'),
];

function verInventario()
{
    for(let i = 0; i < articulos.length; i++)
    {
        document.write(articulos[i].toString(i));
    }
}

function imprimirTicket() {
    let suma = 0;
    for (let i = 0; i < articulos.length; i++) {
        // Obtener datos guardados en la cookie
        const cookieStr = getCookie(`articulo${i}`);
        if (!cookieStr) continue;
        const cookieData = JSON.parse(cookieStr);
        
        // Actualizar cantidad del artículo con la de la cookie
        articulos[i].setCantidad(cookieData.cantidad);
        
        // Omitir si no hay cantidad
        if (articulos[i].cantidad === 0) {
            continue;
        }
        
        document.write(`<div class="articulo">
            <p>${articulos[i].cantidad} ud. ${articulos[i].descripcion} a <strong>${articulos[i].precio}</strong> €.</p>
        </div>`);
        suma += articulos[i].precio * articulos[i].cantidad;
    }
    document.write(`<div class="articulo"><p>Total: <strong>${suma}</strong> €.</p></div>`);
}

// Función auxiliar para obtener valor de la cookie
function getCookie(nombre) {
    let nameEQ = nombre + "=";
    let ca = document.cookie.split(';');
    for(let i=0; i < ca.length; i++) {
        let c = ca[i].trim();
        if (c.indexOf(nameEQ) === 0) {
            return c.substring(nameEQ.length, c.length);
        }
    }
    return null;
}

function saveInCookie()
{
    for(let i = 0; i < articulos.length; i++)
    {
        let nuevaCantidad = parseInt(document.getElementById(`cantidad${i}`).value);
        articulos[i].setCantidad(nuevaCantidad);

        let articuloData = {
            codigo: articulos[i].codigo,
            descripcion: articulos[i].descripcion,
            precio: articulos[i].precio,
            cantidad: articulos[i].cantidad,
            imagen: articulos[i].imagen
        };
        document.cookie = `articulo${i}=${JSON.stringify(articuloData)}; path=/;`;
    }
}
