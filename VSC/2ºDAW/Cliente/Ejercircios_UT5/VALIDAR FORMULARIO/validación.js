function validarFormulario()
{
    let nombre = document.getElementById('nombre').value;
    let apellidos = document.getElementById('apellidos').value;
    let expediente = document.getElementById('expediente').value;
    let edad = document.getElementById('edad').value;
    let fechaPermiso = document.getElementById('fechaPermiso').value;
    let matricula = document.getElementById('matricula').value;
    let importe = document.getElementById('importe').value;
    let mesExpiracion = document.getElementById('mesExpiracion').value;
    let anioExpiracion = document.getElementById('anioExpiracion').value;
    let tarjeta = document.getElementById('tarjeta').value;

    // Validar que ningún campo esté vacío
    if(!nombre || !apellidos || !expediente || !edad || !fechaPermiso || !matricula || !importe || !mesExpiracion || !anioExpiracion)
    {
        alert('Todos los campos son obligatorios.');
        return;
    }

    // Validar nombre y apellidos
    let nombreRegex = /^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/;
    if(!nombreRegex.test(nombre) || !nombreRegex.test(apellidos))
    {
        alert('Nombre y apellidos solo deben contener caracteres alfabéticos, espacios y tildes.');
        return;
    }

    // Validar expediente
    let expedienteNumero = parseInt(expediente, 10);
    if(isNaN(expedienteNumero) || expedienteNumero < 340000000000 || expedienteNumero > 349999999999)
    {
        alert('El expediente debe ser un número natural en el rango 340000000000 a 349999999999.');
        return;
    }

    // Validar edad
    let edadNumero = parseInt(edad, 10);
    if(isNaN(edadNumero) || edadNumero < 18 || edadNumero > 120)
    {
        alert('La edad debe ser un número entre el 18 a 120.');
        return;
    }

    // Validar matrícula
    let matriculaRegex = /^[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$/;
    if(!matriculaRegex.test(matricula))
    {
        alert('La matrícula no tiene el formato correcto.');
        return;
    }

    // Validar importe
    let importeNumero = parseFloat(importe);
    if(isNaN(importeNumero) || importeNumero < 0)
    {
        alert('El importe debe ser un número entero o real sin signo.');
        return;
    }

    // Validar mes de expiración
    let mesExpiracionNumero = parseInt(mesExpiracion, 10);
    if(isNaN(mesExpiracionNumero) || mesExpiracionNumero < 1 || mesExpiracionNumero > 12)
    {
        alert('El mes de expiración debe ser un número entero en el rango 1 a 12.');
        return;
    }

    // Validar año de expiración
    let anioExpiracionNumero = parseInt(anioExpiracion, 10);
    if(isNaN(anioExpiracionNumero) || anioExpiracionNumero < 2001 || anioExpiracionNumero > 2100)
    {
        alert('El año de expiración debe ser un número entero en el rango 2001 a 2100.');
        return;
    }

    // Validar tarjeta (simplificado)
    if(!['generica', 'americanExpress', 'dinersClub', 'masterCard', 'visa'].includes(tarjeta))
    {
        alert('Tipo de tarjeta no válido.');
        return;
    }

    alert('Formulario válido.');
}
