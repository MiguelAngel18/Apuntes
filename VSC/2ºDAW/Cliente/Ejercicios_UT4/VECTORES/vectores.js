let original;

function guardar()
{
    try
    {
        let input = document.getElementById("vector").value; // Se introduce el vector en forma de string

        if (input === '' && original == undefined) return; // Si está vacío no se hace nada

        // Si la variable está vacía, es la primera vez que introducimos el vector, por lo que se guarda en ésta
        if (original == undefined)
        {
            original = input;
        }
        else if (input == '')
        {
            input = original;
        }
    }
    catch(err)
    {
        alert(err);
    }
}

function ver()
{
    try
    {
        guardar();
        alert("Vector: [" + original + "]");
    }
    catch(err)
    {
        alert(err);
    }
}

function ordenar()
{
    try
    {
        let vector = document.getElementById("vector").value;
        vector = vector.split(",");
        let vectorOrdenado = [...vector].sort((a, b) => {
            let numA = parseFloat(a);
            let numB = parseFloat(b);

            if (!isNaN(numA) && !isNaN(numB))
            {
                return numA - numB;
            }

            if (!isNaN(numA)) return -1;
            if (!isNaN(numB)) return 1;

            return a.localeCompare(b);
        });
        alert("Vector Ordenado: [" + vectorOrdenado + "]");
    }
    catch(err)
    {
        alert("Error: " + err);
    }
}

function alReves()
{
    try
    {
        guardar();
        let vector = document.getElementById("vector").value;
        vector = vector.split(",");
        let vectorReves = [...vector].reverse();
        alert("Vector al Revés: [" + vectorReves.join(", ") + "]");
    }
    catch(err)
    {
        alert("Error: " + err);
    }
}