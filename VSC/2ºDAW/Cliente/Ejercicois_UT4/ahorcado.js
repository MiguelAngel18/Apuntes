const password_1 = prompt("Usuario 1. Introduce una palabra clave:").toUpperCase();
// const password_2 = prompt("Usuario 2. Introduce una palabra clave:").toUpperCase();

let resultado_1 = password_1.replace(/./g, "_ ");
document.getElementById('result_1').innerHTML = resultado_1;
let fallos_1 = 0;
let encontrada = false;

// let resultado_2 = password_2.replace(/./g, "_ ");
// document.getElementById('result_2').innerHTML = resultado_2;
// let fallos_2 = 0;

function validar_1()
{
    try
    {
        let letra = document.getElementById("letra_1").value.toUpperCase();
        if(letra==='')
        {
            return;
        }

        if(resultado_1 === password_1.replace(/./g, "_ "))
        {
            resultado_1 = password_1.replace(/./g, "_ ").split(" ");
        }

        for(let i=0; i<password_1.length; i++)
        {
            if(password_1[i] === letra)
            {
                resultado_1[i] = letra;
                encontrada = true;
            }
        }

        if(encontrada === true)
        {
            alert("Letra encontrada: " + letra);
            encontrada === false;
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
                default: break;
            }

            // switch(fallos_1)
            // {
            //     case 1: document.getElementById('ahorcado').src = 'img/6.png'; break;
            //     case 2: document.getElementById('ahorcado').src = 'img/5.png'; break;
            //     case 3: document.getElementById('ahorcado').src = 'img/4.png'; break;
            //     case 4: document.getElementById('ahorcado').src = 'img/3.png'; break;
            //     case 5: document.getElementById('ahorcado').src = 'img/2.png'; break;
            //     case 6: document.getElementById('ahorcado').src = 'img/1.png'; alert("Usuario 1 pierde"); break;
            // }
        }
        
        document.getElementById('result_1').innerHTML = resultado_1;

        if(!resultado_1.includes("_"))
        {
            alert("Usuario 1 gana.");
        }
    }
    catch(err)
    {
        alert("ERROR");
    }
}