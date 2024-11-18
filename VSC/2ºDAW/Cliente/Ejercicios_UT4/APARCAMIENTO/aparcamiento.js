function precio()
{
    let entrada = document.getElementById("entrada").value;

    entrada = entrada.split("T");
    
    let fecha_entrada = entrada[0]; // Fecha de entrada yyyy-mm-dd
    let hora_entrada = entrada[1]; // Hora de entrada hh:mm

    let anio_entrada = fecha_entrada.split("-")[0];
    let mes_entrada = fecha_entrada.split("-")[1];
    let dia_entrada = fecha_entrada.split("-")[2];

    let horas_entrada = hora_entrada.split(":")[0];
    let min_entrada = hora_entrada.split(":")[1];

    fecha_entrada = new Date(anio_entrada, mes_entrada, dia_entrada, horas_entrada, min_entrada);

    let salida = document.getElementById("salida").value;
    salida = salida.split("T");

    let fecha_salida = salida[0]; // Fecha de salida yyyy-mm-dd
    let hora_de_salida = salida[1]; // Hora de salida hh:mm

    let anio_salida = fecha_salida.split("-")[0];
    let mes_salida = fecha_salida.split("-")[1];
    let dia_salida = fecha_salida.split("-")[2];

    let hora_salida = hora_de_salida.split(":")[0];
    let min_salida = hora_de_salida.split(":")[1];

    fecha_salida = new Date(anio_salida, mes_salida, dia_salida, hora_salida, min_salida);

    let dif = Math.abs(fecha_salida.getTime() - fecha_entrada.getTime());
    alert(dif);

    let dias = Math.floor(dif/(1000*60*60*24));
    alert(dias);

    let horas = dif/(1000*60*60) - Math.floor(dif/(1000*60*60));
    alert(horas); 

    let precio = 0.0;

    if(fecha_entrada > salida_fecha || fecha_entrada == null || salida_fecha == null)
    {
        return;
    }
    if(hora_entrada > salida_hora || hora_entrada == salida_hora || hora_entrada == null || salida_hora == null)
    {
        return;
    }
    else if(dias >= 1)
    {
        precio += 20 * dias;
    }
    else if(horas >= 1)
    {
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
    document.getElementById("precio").innerHTML = precio + "€";
}