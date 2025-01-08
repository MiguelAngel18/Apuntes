// Este archivo contiene la lógica principal del proyecto, gestionando los eventos y el almacenamiento de datos en cookies.

import { Articulo } from './articulo.js';

let articulos = [
    new Articulo('001', 'Artículo 1', 10.00, 0, 'imagen1.jpg'),
    new Articulo('002', 'Artículo 2', 15.00, 0, 'imagen2.jpg'),
    new Articulo('003', 'Artículo 3', 20.00, 0, 'imagen3.jpg')
];

document.addEventListener('DOMContentLoaded', () => {
    let botonVerPedido = document.getElementById('ver-pedido');

    articulos.forEach(articulo => {
        let cantidadInput = document.getElementById(`cantidad-${articulo.codigo}`);
        cantidadInput.addEventListener('change', (event) => {
            articulo.cantidad = parseInt(event.target.value);
        });
    });

    botonVerPedido.addEventListener('click', () => {
        let cantidades = articulos.map(articulo => ({
            codigo: articulo.codigo,
            cantidad: articulo.cantidad
        }));

        document.cookie = `pedido=${JSON.stringify(cantidades)}; path=/`;
        window.location.href = 'MiniPedido.html';
    });
});