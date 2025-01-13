// Lista con todos los usuarios inscritos
let list = [];

// Creción de los elementos de la lista
class User 
{
    constructor(firstName, lastName, email, gender, origin, interests) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.origin = origin;
        this.interests = interests;
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
    let origin = document.getElementById('origin').value;

    let checkboxes = document.querySelectorAll('div.checkboxs>input[type="checkbox"]:checked.checkbox');
    let interests = Array.from(checkboxes).map((checkbox) => checkbox.value).join(", ") || "Ninguno";

    validacion(firstName, lastName, email);

    let user = new User(firstName, lastName, email, gender, origin, interests);

    list.push(user);
    alert("Añadido con éxito");

    let dataList = document.getElementById('list'); // Obtener la lista
    let option = document.createElement('option'); // Crear un nuevo elemento option para esa lista

    // Configurar los atributos del option
    option.name = 'element';
    option.className = 'element_list';
    option.textContent = `${user.firstName} ${user.lastName} - ${user.email}`;
        
    // Añadir el nuevo elemento a la lista
    dataList.appendChild(option);

    console.log(`Nombre: ${user.firstName}\nApellidos: ${user.lastName}\nEmail: ${user.email}\nGénero: ${user.gender}\nOrigen: ${user.origin}\nIntereses: ${user.interests}\n`);
}

// Visualiza elementos de la lista

    // Asociar la función al evento 'click' del botón
    let viewButton = document.getElementById('viewButton');
    viewButton.addEventListener('click', viewData);

function viewData()
{
    let users = 'Usuarios:\n\n';

    for(let i=0; i<list.length; i++)
    {    
        users += `${list[i].firstName} ${list[i].lastName} - ${list[i].email} \n`;
    }
    
    alert(users);
}

// Elimina elementos de la lista
function deleteData()
{
    let dataList = document.getElementById('list');
    let selectedOption = dataList.options[dataList.selectedIndex];

    if (selectedOption)
        {
        let confirmDelete = confirm(`¿Estás seguro de que deseas eliminar a ${selectedOption.textContent}?`);
        
        if (confirmDelete)
            {
            // Eliminar del array 'list'
            let userIndex = Array.from(dataList.options).indexOf(selectedOption);
            list.splice(userIndex, 1);

            // Eliminar del select
            dataList.removeChild(selectedOption);

            alert("Eliminado con éxito");
        }
    } else
    {
        alert("Por favor, selecciona un elemento para eliminar.");
    }
}

function validacion()
{
    if (lastName==='' || firstName==='' || email==='' || validateEmail(email))
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