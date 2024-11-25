document.getElementById('addButton').addEventListener('click', addData);
document.getElementById('viewButton').addEventListener('click', viewData);
document.getElementById('deleteButton').addEventListener('click', deleteData);

function addData() {
    const lastName = document.getElementById('lastName').value;
    const firstName = document.getElementById('firstName').value;
    const email = document.getElementById('email').value;
    const source = document.getElementById('source').value;

    if (!validateEmail(email)) {
        alert('Por favor, introduzca una dirección de correo electrónico válida.');
        return;
    }

    const listItem = document.createElement('li');
    listItem.textContent = `${lastName}, ${firstName} - ${email} (${source})`;
    document.getElementById('dataList').appendChild(listItem);

    document.getElementById('dataForm').reset();
}

function viewData() {
    const items = document.querySelectorAll('#dataList li');
    if (items.length === 0) {
        alert('No hay datos para mostrar.');
        return;
    }

    let data = '';
    items.forEach(item => {
        data += item.textContent + '\n';
    });

    alert(data);
}

function deleteData() {
    const list = document.getElementById('dataList');
    const selectedItem = list.querySelector('li.selected');

    if (selectedItem) {
        list.removeChild(selectedItem);
    } else if (list.lastChild) {
        list.removeChild(list.lastChild);
    } else {
        alert('No hay elementos para eliminar.');
    }
}

document.getElementById('dataList').addEventListener('click', function (event) {
    const items = document.querySelectorAll('#dataList li');
    items.forEach(item => item.classList.remove('selected'));
    event.target.classList.add('selected');
});

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}