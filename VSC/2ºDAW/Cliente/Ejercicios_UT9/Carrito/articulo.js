class Articulo
{
    constructor(codigo, descripcion, precio, cantidad, imagen) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    modificarCantidad(nuevaCantidad)
    {
        this.cantidad = nuevaCantidad;
        this.guardarEnCookie();
    }

    guardarEnCookie()
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

    aniadirArticulo()
    {
        return  `<div class="articulo">
                    <img src="${this.imagen}" alt="${this.descripcion}">
                    <h3>${this.descripcion}</h3>
                    <p>Precio: $${this.precio}</p>
                    <p>Cantidad: ${this.cantidad}</p>
                 </div>
                `;
    }
}

export default Articulo;