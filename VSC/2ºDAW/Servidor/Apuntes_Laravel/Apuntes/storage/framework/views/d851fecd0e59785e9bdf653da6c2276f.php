<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<?php echo e(asset('/css/estilos3.css')); ?>">
    <title>Editar Duda - 2º DAW</title>
</head>
<body>
    <h2>Editar Duda</h2>

    <?php if(session('success')): ?>
        <div class="alert alert-success">
            <?php echo e(session('success')); ?>

        </div>
    <?php endif; ?>

    <form action="<?php echo e(route('edit', $nota->id)); ?>" method="POST">
        <?php echo csrf_field(); ?>
        <?php echo method_field('PUT'); ?>
        <label for="email">Correo electrónico:</label>
        <input type="text" id="email" name="email" value="<?php echo e(old('email', $doubt->email)); ?>" required>

        <label for="module">Módulo:</label>
        <select id="module" name="module" required>
            <option value="DEW" <?php echo e($doubt->module === 'dew' ? 'selected' : ''); ?>>Desarrollo Web En Entorno Servidor</option>
            <option value="DSW" <?php echo e($doubt->module === 'dsw' ? 'selected' : ''); ?>>Desarrollo Web En Entorno Cliente</option>
            <option value="DPL" <?php echo e($doubt->module === 'dpl' ? 'selected' : ''); ?>>Empresa e Iniciativa Empresarial</option>
            <option value="DOR" <?php echo e($doubt->module === 'dor' ? 'selected' : ''); ?>>Despliegue de Aplicaciones Web</option>
            <option value="EMR" <?php echo e($doubt->module === 'emr' ? 'selected' : ''); ?>>Diseño de Interfaces Web</option>
        </select>

        <label for="asunto">Asunto:</label>
        <input type="text" id="asunto" name="asunto" value="<?php echo e(old('asunto', $nota->asunto)); ?>" required>

        <label for="descripcion">Descripción:</label>
        <textarea id="descripcion" name="descripcion" required><?php echo e(old('descripcion', $nota->descripcion)); ?></textarea>

        <button type="submit" class="button">Actualizar Duda</button>
    </form>

    <a href="<?php echo e(route('notas')); ?>">Notas</a>
</body>
</html><?php /**PATH C:\xampp\htdocs\ieselrincon\Repositorios_GitHub\Apuntes\VSC\2ºDAW\Servidor\Apuntes_Laravel\Apuntes\resources\views/editar.blade.php ENDPATH**/ ?>