// Ejemplo de cómo crear funciones usando el constructor Function. NO RECOMENDADO


function Puntos(x,y)
{
    this.x=x
    this.y=y
    this.dibujar = funtion()
    {
        console.log("Dibujando...")
    }
}

const Point = new Function("x","y","this.x=x;this.y=y;this.dibujar=function(){console.log('Dibujando...')}")

const p = new Point(1,2)
console.log(p)

let punto = {z:7}

Punto.call(punto,1,2)
Punto.apply(punto,[1,2])

console.log(punto)

