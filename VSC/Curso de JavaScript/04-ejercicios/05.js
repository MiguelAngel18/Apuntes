
let numeros = [2,4,68,95,22,11,4,67,7-57]

function mayorMenos(vector)
{
    let max=0,min=0

    for(num of vector)
    {
        min = min<num ? min : num
        max = max>num ? max : num
        
        // if(min>num)
        // {
        //     min=i
        // }

        // if(max<num)
        // {
        //     max=i
        // }
    }
    console.log("Maximo:",max,"Minimo:",min)
}

mayorMenos(numeros)