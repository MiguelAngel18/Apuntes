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

    setCantidad(nuevaCantidad)
    {
        this.cantidad = nuevaCantidad;
        this.saveInCookie();
    }

    saveInCookie()
    {
        let articuloData = {
            codigo: this.codigo,
            descripcion: this.descripcion,
            precio: this.precio,
            cantidad: this.cantidad,
            imagen: this.imagen
        };
        document.cookie = `articulo=${JSON.stringify(articuloData)}; path=/;`;
    }

    addArticulo()
    {
        this.saveInCookie();
        return `<div class="article">
                    <h3>${this.codigo}</h3>
                    <h3>${this.descripcion}</h3>
                    <p>Precio: $${this.precio}</p>
                    <p>Adquirir: ${this.cantidad} uds.</p>
                    <img src="${this.imagen}" alt="${this.descripcion}">
                </div>`;
    }
}

export default Articulo;