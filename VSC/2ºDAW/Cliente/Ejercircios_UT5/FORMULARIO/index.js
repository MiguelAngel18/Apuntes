// Lista con todos los usuarios inscritos
let list = [];

// Creción de los elementos de la lista
class User 
{
    constructor(firstName, lastName, email, origin) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.origin = origin;
    }
}

// Crea Y añade elementos a la lista
function addData() 
{
    // Contenido del formulario
    let firstName = document.getElementById('firstName').value;
    let lastName = document.getElementById('lastName').value;
    let email = document.getElementById('email').value;
    let origin = document.getElementById('origin').value;

    // validar(firstName, lastName, email, origin);

    if(!validateEmail(email)) 
    {
        alert('Por favor, introduzca una dirección de correo electrónico válida.');
        return;
    }

    let user = new User(firstName, lastName, email, origin);

    list.push(usuario);
    alert("Creado con éxito");
    document.getElementById('dataList').innerHTML += print `<li>${firstName} ${lastName} Correo electrónico ${email}</li>`;
}

// Visualiza elementos de la lista
function viewData() 
{
    let items = document.querySelectorAll('#dataList li');
    if(items.length === 0) 
    {
        alert('No hay datos para mostrar.');
        return;
    }

    let data = '';
    items.forEach(item => 
    {
        data += item.textContent + '\n';
    });

    alert(data);
}

// Elimina elementos de la lista
function deleteData() 
{
    let list = document.getElementById('dataList');
    let selectedItem = list.querySelector('li.selected');

    if(selectedItem) 
    {
        list.removeChild(selectedItem);
    }
    else if(list.lastChild) 
    {
        list.removeChild(list.lastChild);
    }
    else 
    {
        alert('No hay elementos para eliminar.');
    }
}

document.getElementById('dataList').addEventListener('click', function (event) 
{
    let items = document.querySelectorAll('#dataList li');
    items.forEach(item => item.classList.remove('selected'));
    event.target.classList.add('selected');
});


function validateEmail(email) 
{
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}