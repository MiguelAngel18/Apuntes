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

    list.push(user);
    alert("Añadido con éxito");

    let dataList = document.getElementById('dataList'); // Obtener la lista


    let option = document.createElement('option'); // Crear un nuevo elemento de lista

    // Configurar los atributos del option
    option.type = 'text';
    option.name = 'element';
    option.className = 'element_list';
    option.value = `${user.firstName} ${user.lastName} - ${user.email}`;
    option.disabled = true;
        
    // Añadir el nuevo elemento a la lista
    dataList.appendChild(option);
}

// Visualiza elementos de la lista
function viewData() 
{
    // Seleccionar el botón
    let viewButton = document.getElementById('viewButton');
    
    // Crear una función que se ejecutará cuando se haga clic en el botón
    function view()
    {
        alert('¡Botón!');
    }
    
    // Asociar la función al evento 'click' del botón
    viewButton.addEventListener('click', view);
}

// Elimina elementos de la lista
function deleteData() 
{

}

function validateEmail(email) 
{
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}