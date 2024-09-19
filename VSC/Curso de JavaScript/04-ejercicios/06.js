
let array = [2,-2,6,-77,-33,56,29]

function cuantosPositivos(vector)
{
    let cont=0
    for(num of vector)
    {
        if(num>=0)
        {
            cont++
        }
    }
    console.log("Números Positivos:",cont)
}

cuantosPositivos(array)