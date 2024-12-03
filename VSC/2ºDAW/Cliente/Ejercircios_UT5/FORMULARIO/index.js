// Lista con todos los usuarios inscritos
let list = [];

// Creción de los elementos de la lista
class User 
{
    constructor(firstName, lastName, email, gender, origin) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.origin = origin;
    }
}

// Crea Y añade elementos a la lista
function addData() 
{
    // Contenido del formulario
    let firstName = document.getElementById('firstName').value;
    let lastName = document.getElementById('lastName').value;
    let gender = document.querySelector('input[name="info"]:checked')?.value;
    let email = document.getElementById('email').value;

    let checkboxes = document.querySelectorAll('.checkboxs input[type="checkbox"]:checked');
    let interests = Array.from(checkboxes).map((checkbox) => checkbox.value).join(", ") || "Ninguno";

    validacion(firstName, lastName, email, origin);

    let user = new User(firstName, lastName, gender, email, origin);

    list.push(user);
    alert("Añadido con éxito");

    let dataList = document.getElementById('list'); // Obtener la lista


    let option = document.createElement('option'); // Crear un nuevo elemento option

    // Configurar los atributos del option
    option.name = 'element';
    option.className = 'element_list';
    option.textContent = `${user.firstName} ${user.lastName} - ${user.email}`;
        
    // Añadir el nuevo elemento a la lista
    dataList.appendChild(option);

    console.log(`${user.firstName}\n${user.lastName}\n${user.email}\n${user.origin}\n`);
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


function validacion()
{
    if (!lastName || !firstName || !email || !validateEmail(email))
    {
        alert("Por favor, completa todos los campos de forma váilda.");
        return;
    }
}

function validateEmail(email) 
{
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}

function validateCheckboxes() {
    // Seleccionar los checkboxes
    let checkboxes = document.querySelectorAll('.checkboxs input[type="checkbox"]');
    
    // Verificar si al menos uno está seleccionado
    let isChecked = Array.from(checkboxes).some(checkbox => checkbox.checked);
    
    // Si no hay ninguno seleccionado, mostrar una alerta y evitar el envío del formulario
    if (!isChecked) {
        alert('Por favor, seleccione al menos una opción.');
        return false; // Evitar el envío del formulario
    }
    
    return true; // Permitir el envío del formulario
}