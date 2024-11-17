const password_1 = prompt("Usuario 1. Introduce una palabra clave:").toUpperCase(); // Introduce la palabra clave del usuario 2
const password_2 = prompt("Usuario 2. Introduce una palabra clave:").toUpperCase(); // Introduce la palabra clave del usuario 1

let resultado_1 = password_2.replace(/./g, "_ ");  // Se emcripta la palabra clave del usuario 2
let resultado_2 = password_1.replace(/./g, "_ ");  // Se emcripta la palabra clave del usuario 1

document.getElementById('result_1').innerHTML = resultado_1; // Se muestra la palabra clave encriptada del usuario 2
document.getElementById('result_2').innerHTML = resultado_2; // Se muestra la palabra clave encriptada del usuario 1

let fallos_1 = 0; let fallos_2 = 0; // Contador de fallos de los usuarios 1 y 2

let encontrada_1 = false; let encontrada_2 = false; // Variable que indica si se ha encontrado la letra introducida por los usuarios 1 y 2

function validar_1()
{
    try
    {
        let letra = document.getElementById("letra_1").value.toUpperCase(); // Se obtiene la letra introducida por el usuario 1
        
        if(letra==='')
        {
            return;
        }

        if(resultado_1 === password_2.replace(/./g, "_ "))
        {
            resultado_1 = password_2.replace(/./g, "_ ").split(" "); // Se separa la palabra clave si no ha sido separada antes
        }

        for(let i=0; i<password_2.length; i++) // Se recorre la palabra clave introducida por el usuario 2
        {
            if(password_2[i] === letra)
            {
                resultado_1[i] = letra; // Si se encuentra la letra introducida por el usuario 1, esta letra se introduce en la palabra clave
                encontrada_1 = true; // Se indica que se ha encontrado una letra
            }
        }

        if(encontrada_1 === true)
        {
            alert("Letra encontrada: " + letra);
            encontrada_1 = false;
        }
        else
        {
            alert("Letra no encontrada");
            fallos_1++;

            switch(fallos_1)
            {
                case 1: document.getElementById('img_0').style.display = 'none'; document.getElementById('img_6').style.display = 'block'; break;
                case 2: document.getElementById('img_6').style.display = 'none'; document.getElementById('img_5').style.display = 'block'; break;
                case 3: document.getElementById('img_5').style.display = 'none'; document.getElementById('img_4').style.display = 'block'; break;
                case 4: document.getElementById('img_4').style.display = 'none'; document.getElementById('img_3').style.display = 'block'; break;
                case 5: document.getElementById('img_3').style.display = 'none'; document.getElementById('img_2').style.display = 'block'; break;
                case 6: document.getElementById('img_2').style.display = 'none'; document.getElementById('img_1').style.display = 'block'; break;
                case 7: document.getElementById('container_1').style.display = 'none'; document.getElementById('perdedor_1').style.display = 'block'; break;
                default: break;
            }
        } 
        document.getElementById('result_1').innerHTML = resultado_1;
        if(!resultado_1.includes("_") && resultado_2.includes("_"))
        {
            alert("Usuario 1 gana.");
        }
    }
    catch(err)
    {
        alert("ERROR");
    }
}

function validar_2()
{
    try
    {
        let letra = document.getElementById("letra_2").value.toUpperCase();
        if(letra==='')
        {
            return;
        }

        if(resultado_2 === password_1.replace(/./g, "_ "))
        {
            resultado_2 = password_1.replace(/./g, "_ ").split(" ");
        }

        for(let i=0; i<password_1.length; i++)
        {
            if(password_1[i] === letra)
            {
                resultado_2[i] = letra;
                encontrada_2 = true;
            }
        }

        if(encontrada_2 === true)
        {
            alert("Letra encontrada: " + letra);
            encontrada_2 = false;
        }
        else
        {
            alert("Letra no encontrada");
            fallos_2++;

            switch(fallos_2)
            {
                case 1: document.getElementById('img_00').style.display = 'none'; document.getElementById('img_06').style.display = 'block'; break;
                case 2: document.getElementById('img_06').style.display = 'none'; document.getElementById('img_05').style.display = 'block'; break;
                case 3: document.getElementById('img_05').style.display = 'none'; document.getElementById('img_04').style.display = 'block'; break;
                case 4: document.getElementById('img_04').style.display = 'none'; document.getElementById('img_03').style.display = 'block'; break;
                case 5: document.getElementById('img_03').style.display = 'none'; document.getElementById('img_02').style.display = 'block'; break;
                case 6: document.getElementById('img_02').style.display = 'none'; document.getElementById('img_01').style.display = 'block'; break;
                case 7: document.getElementById('container_2').style.display = 'none'; document.getElementById('perdedor_2').style.display = 'block'; break;
                default: break;
            }
        } 
        document.getElementById('result_2').innerHTML = resultado_2;
        if(!resultado_2.includes("_") && resultado_1.includes("_"))
        {
            alert("Usuario 2 gana.");
        }
    }
    catch(err)
    {
        alert("ERROR");
        console.log(err);
    }
}