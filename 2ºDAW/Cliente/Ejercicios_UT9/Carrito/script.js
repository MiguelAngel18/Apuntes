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
    new Articulo('A001','Ordenador PIV',650.10,1,'Imagenes/ORDENADOR1.GIF'),
    new Articulo('A002','Ordenador PIV mod. 2',683.15,3,'Imagenes/ORDENADOR2.GIF'),
    new Articulo('B003','Impresora HP',150.88,1,'Imagenes/IMPRESORA.GIF'),
];

function verInventario()
{
    for(let i = 0; i < articulos.length; i++)
    {
        document.write(articulos[i].toString(i));
    }
    saveInCookie();
}

function imprimirTicket()
{
    let suma = 0;
    for(let i = 0; i < articulos.length; i++)
    {
        if (articulos[i].cantidad === 0) {
            continue;
        }
        let articuloData = {
            codigo: articulos[i].codigo,
            descripcion: articulos[i].descripcion,
            precio: articulos[i].precio,
            cantidad: articulos[i].cantidad,
            imagen: articulos[i].imagen
        };
        document.cookie = `articulo${i}=${JSON.stringify(articuloData)}; path=/;`;
        document.write(`<div class="articulo">
            <p>${articulos[i].cantidad} ud. ${articulos[i].descripcion} a <strong>${articulos[i].precio}</strong> €.</p>
        </div>`);
        suma += articulos[i].precio*articulos[i].cantidad;
    }
    document.write(`<div class="articulo"><p>Total: <strong>${suma}</strong> €.</p></div>`);
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
