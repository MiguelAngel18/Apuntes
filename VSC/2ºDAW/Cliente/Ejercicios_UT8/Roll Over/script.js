document.getElementById('primaria1').addEventListener('mouseover', function()
{
    document.getElementById('primaria1').style.display = 'none';
    document.getElementById('primaria2').style.display = 'none';
    document.getElementById('secundaria1').style.display = 'block';
    document.getElementById('secundaria2').style.display = 'block';
});

document.getElementById('secundaria2').addEventListener('click', function()
{
    window.close();
});

document.getElementById('secundaria1').addEventListener('mouseout', function()
{
    document.getElementById('primaria1').style.display = 'block';
    document.getElementById('primaria2').style.display = 'block';
    document.getElementById('secundaria1').style.display = 'none';
    document.getElementById('secundaria2').style.display = 'none';
});
