<?php

namespace App\Http\Controllers;
use App\Models\Nota;
use Illuminate\Http\Request;

class Controlador extends Controller
{
    function showVista()
    {
        return view('Vista');
    }

    public function showForm()
    {
        return view('Formulario');
    }

    public function saveNota(Request $request)
    {
        $validatedData = $request->validate([
            'email' => 'required|email',
            'module' => 'required',
            'subject' => 'required|string|max:50|not_regex:/^\d+$/',
            'description' => 'required|string|max:300',            
        ]);

        $email = $request -> input("email");
        $module = $request -> input("module");
        $subject = $request -> input("subject");
        $description = $request -> input("description");

        Nota :: create([

            'email' => $email,
            'module' => $module,
            'subject' => $subject,
            'description' => $description
        ]);

        return redirect()->route("formulario")->with('success','Nota creada correctamente.');
    }

    public function showNotas()
    {
        //Obtener todas las dudas
        $notas = Nota::all();

        //Retornar la vista con las dudas
        return view('notas', compact('notas'));
    }

    public function deleteNota($id)
    {
        $nota = Nota::findOrFail($id);
        $nota->delete();

        return redirect()->route('notas')->with('success', 'Nota eliminada correctamente.');
    }

    public function editNota($id)
    {
        $nota = Nota::findOrFail($id); 
        return view('Editar', compact('nota')); 
    }

    public function updateNota(Request $request, $id)
    {
        $validated = $request->validate([
            'email' => 'required|email',
            'module' => 'required',
            'subject' => 'required|string|max:50|not_regex:/^\d+$/',
            'description' => 'required|string|max:300',
        ]);

        $nota = Nota::findOrFail($id);
        $nota->update($validated);

        return redirect()->route('notas')->with('success', 'Nota actualizada correctamente.');
    }
}