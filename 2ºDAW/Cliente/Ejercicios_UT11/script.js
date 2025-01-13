document.getElementById('prepPizza').addEventListener('click', function()
{
    let ingredientes = [...document.querySelectorAll('input[name="ingredientes"]:checked')].map(el => el.value).join(', ');
    let masa = document.getElementById('masa').value;
    document.getElementById('resultado').textContent = 'Ingredientes: ' + ingredientes + ' | Masa: ' + masa;
});