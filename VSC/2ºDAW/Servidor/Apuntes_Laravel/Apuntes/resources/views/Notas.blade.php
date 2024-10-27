<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notas</title>
    <link rel="stylesheet" href="{{ asset('css/app.css') }}">
</head>
<body>
    
    @if (session('success'))
        <div class="alert alert-success">
            {{ session('success') }}
        </div>
    @endif

    <div>
        <h1>Notas</h1>
        <a href="{{ route('formulario') }}" id="new">Nueva Nota</a>
    </div>

    @if ($notas->isEmpty())
        <p>No hay notas registradas.</p>
    @else
        <table>
            <thead>
                <tr>
                    <th>Correo</th>
                    <th>Módulo</th>
                    <th>Asunto</th>
                    <th>Descripción</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($notas as $nota)
                    <tr>

                        <td>{{ $nota->email }}</td>
                        <td>{{ $nota->module }}</td>
                        <td>{{ $nota->subject }}</td>
                        <td>{{ $nota->description }}</td>

                        <td>
                            <form action="{{ route('delete', $nota->id) }}" method="POST" onsubmit="confirmDelete(event)">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="button">Eliminar</button>
                            </form>
                        </td>
                        <td>
                            <form action="{{ route('edit', $nota->id) }}" method="PUT">
                                <button type="submit" class="editar">Editar</button>
                            </form>
                        </td>   
                    </tr>
                @endforeach
            </tbody>
        </table>
    @endif

</body>
</html>