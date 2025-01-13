// Este archivo contiene la lógica principal del proyecto, gestionando los eventos y el almacenamiento de datos en cookies.

import Articulo from './articulo.js';

let articulos = [
    new Articulo('001', 'Artículo 1', 10.00, 0, 'imagen1.jpg'),
    new Articulo('002', 'Artículo 2', 15.00, 0, 'imagen2.jpg'),
    new Articulo('003', 'Artículo 3', 20.00, 0, 'imagen3.jpg')
];

// Función para añadir un objeto Articulo al array articulos
function addArticuloToArray(codigo, descripcion, precio, cantidad, imagen)
{
    let nuevoArticulo = new Articulo(codigo, descripcion, precio, cantidad, imagen);
    articulos.push(nuevoArticulo);
    nuevoArticulo.saveInCookie();
}

// Ejemplo de uso de la función
addArticuloToArray('004', 'Artículo 4', 25.00, 0, 'imagen4.jpg');

// Recorrer el array de artículos y crear una cookie para cada uno
articulos.forEach(articulo => {
    articulo.saveInCookie();
});
