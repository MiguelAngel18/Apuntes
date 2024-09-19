const punto = {x:1,y:2,z:3, dibujar(){console.log("Dibujando...")}}

delete punto.dibujar

if("dibujar" in punto)
{
    punto.dibujar()
}

console.log(Object.keys(punto)) // Lista los valores de un objeto


////////////////////////////////////////////////////////

// Forma vieja

for(let llave of Object.keys(punto)) // Métodos estático
{
    console.log(llave,punto[llave])
}

for(let entry of Object.entries(punto)) // Métodos estático
{
    console.log(entry)
}

/////////////////////////////////////////////////////////


for(let llave in punto)
{
    console.log(llave,punto[llave])
}