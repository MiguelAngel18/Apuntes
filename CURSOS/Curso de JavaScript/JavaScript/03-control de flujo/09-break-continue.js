// Implementación de BREAK y CONTINUE (Parada y salto de iteración)

let i = 0
while(i<6)
{
    i++
    if(i%2===0)
    {
        continue // Si se cumplen las condiciones del IF y pasa por el CONTINUE, el proceso se saltará lo siguiente y subirá de vuelta al causante del bucle
    }

    if(i===5)
    {
        break // Si se cumplen las condiciones del IF y pasa por el BREAK saldrá del bucle
    }
    console.log(i) // Esto se lo saltaría
}

