class Persona 
{
    constructor(pNombre, pApellidos, pDireccion)
    {
        this.Nombre = pNombre;
        this.Apellidos = pApellidos;
        this.Direccion = pDireccion;
        this.toString = Persona_toString;
        this.NombreCompleto = Persona_NombreCompleto;
    }
}

function Persona_toString()
{
  	return (this.Apellidos+" "+this.Direccion);
}

function Persona_NombreCompleto()
{
  	return (this.Nombre+" "+this.Apellidos+" "+this.Nombre);
}

class Coche
{
    constructor(pMatricula, pMarca, pModelo, pPropietario)
    {
        this.Matricula = pMatricula;
        this.Marca = pMarca;
        this.Modelo = pModelo;
        this.Propietario = pPropietario;
        this.toString = Coche_toString();
    }
}

function Coche_toString()
{
	return (this.Matricula+" "+this.Marca+" "+this.Modelo+"<br>"+"<b>Propietario:</b> "+this.Propietario);
}

let Jorge=new Persona("Jorge","Washington Usa","Casa Blanca s/n");
let Barbara=new Persona("Bárbara","Streissand Cine","c/ Hollywood 345, 60 B");

let coches=new Array();
coches.push(new Coche("GC1234SG","Audi","TT",Jorge));
coches.push(new Coche("1234SDF","Volkwagen","Golf GTI",Barbara));

// document.write("<h2>Listado de coches</h2>");
// document.write("<table border='1'>");
// 	for (let i=0;i<coches.length;i++)
// 	{
// 		document.write(`<tr><td>${coches[i]}</td>`);
// 	  	document.write("</tr>");
// 	}
// document.write("</table>");

document.write("<h2>Otro listado de coches</h2>");
document.write("<table border='1'>");
	for (let i=0;i<coches.length;i++)
	{
		document.write("<tr><td>",coches[i].Matricula,"</td>");
		document.write("<td>",coches[i].Marca,"</td>");
		document.write("<td>",coches[i].Modelo,"</td>");
		document.write("<td>",coches[i].Propietario,"</td>");
		document.write("</tr>");
	}
document.write("</table>");

document.write("<h2>Otro listado de coches más</h2>");
document.write("<table border='1'>");
	for (let i=0;i<coches.length;i++)
	{
		document.write("<tr><td>",coches[i].Matricula,"</td>");
	  	document.write("<td>",coches[i].Marca,"</td>");
	  	document.write("<td>",coches[i].Modelo,"</td>");
	  	document.write("<td>",coches[i].Propietario.NombreCompleto(),"</td>");
	  	document.write("</tr>");
	}
document.write("</table>");

document.write("<h2>No se cuantos listados de coches</h2>");
document.write("<table border='1'>")
	for (let i=0;i<coches.length;i++)
	{
		document.write("<tr><td>",coches[i].Matricula,"</td>");
		document.write("<td>",coches[i].Marca,"</td>");
		document.write("<td>",coches[i].Modelo,"</td>");
		document.write("<td>",coches[i].Propietario.Nombre,"</td>");
		document.write("<td>",coches[i].Propietario.Apellidos,"</td>");
		document.write("<td>",coches[i].Propietario.Direccion,"</td>");
		document.write("</tr>");
	}
document.write("</table>");