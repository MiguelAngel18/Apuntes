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
  	return (this.Nombre+" "+this.Apellidos);
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

let Jorge=new Persona("Jorge","McDonald","Casa Blanca");
let Barbara=new Persona("Bárbara","McDonald","c/ Hollywood 345, 60 B");
let Barby=new Persona("Barby","McDonald","c/ Hollywood 123, 365 A");

let coches=new Array();
coches.push(new Coche("GC1234SG","Audi","TT",Jorge));
coches.push(new Coche("1234SDF","Volkwagen","Golf GTI",Barbara));
coches.push(new Coche("1234SDF","Volkwagen","Golf",Barby));

document.write("<h1>Listado de coches</h1>");
document.write("<table border='1'>")
	for (let i=0;i<coches.length;i++)
	{
		document.write("<tr>");
			document.write("<td>",coches[i].Matricula,"</td>");
			document.write("<td>",coches[i].Marca,"</td>");
			document.write("<td>",coches[i].Modelo,"</td>");
			document.write("<td>",coches[i].Propietario.NombreCompleto(),"</td>");
			document.write("<td>",coches[i].Propietario.Direccion,"</td>");
		document.write("</tr>");
	}
document.write("</table>");