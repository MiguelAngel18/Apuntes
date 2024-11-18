function precio()
{
    let fecha = new Date(); // Fecha actual
    let hora_actual = new fecha.getHours; // Hora actual


    let entrada = document.getElementById("entrada").value;
    entrada = entrada.split("T");
    
    let entrada_fecha = entrada[0]; // Fecha de entrada dd/mm/aaaa
    alert(entrada_fecha)
    let entrada_hora = entrada[1]; // Hora de entrada hh:mm
    alert(salida_hora)

    let salida = document.getElementById("salida").value;
    salida = salida.split(" ");
    
    let salida_fecha = entrada[0];
    let salida_hora = entrada[1];



    let precio = 0.0;

    if(entrada_fecha > salida_fecha || entrada_fecha == null || salida_fecha == null)
    {
        return;
    }
    if(entrada_hora > salida_hora || entrada_hora == salida_hora || entrada_hora == null || salida_hora == null || entrada_hora === hora_actual)
    {
        return;
    }
    else if(salida_fecha - entrada_fecha >= 1)
    {
        let dias = salida_fecha - entrada_fecha;
        precio += 20 * dias;
    }
    else if(salida_hora - entrada_hora <= 60)
    {
        let horas = salida_hora - entrada_hora;
        if(horas === 1)
        {
            precio += 1,20;
        }
        else
        {
            precio += 1,20;
            precio += 1,50 * (horas-1);
        }
    }
    document.getElementById(""). precio + "€";
}