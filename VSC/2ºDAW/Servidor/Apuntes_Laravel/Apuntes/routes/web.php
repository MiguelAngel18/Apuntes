<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Controlador;


// Original: Route::get('/', function () {return view('welcome');});

// Muestra las vistas
Route::get('/', [Controlador::class, 'showVista'])->name("vista");
Route::get('/notas', [Controlador::class, 'showNotas'])->name("notas");
Route::get('/formulario', [Controlador::class, 'showForm'])->name("formulario");

// Guarda notas
Route::post('/saveform', [Controlador::class, 'saveNota'])->name("save");

// Elimina notas
Route::delete('/notas/{id}', [Controlador::class, 'deleteNota'])->name("delete");

// Editar notas
Route::put('/notas/{id}/edit', [Controlador::class, 'editNota'])->name("edit");

// Guardar notas editadas
Route::post('/notas/{id}/edit/saveEdit', [Controlador::class, 'saveNewNota'])->name("saveNewNota");
