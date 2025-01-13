<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Controlador;


// Original: Route::get('/', function () {return view('welcome');});


// GRUPO DE NOTAS


// Muestra las vistas
Route::get('/', [Controlador::class, 'showVista'])->name("vista");
Route::get('/notas', [Controlador::class, 'showNotas'])->name("notas");
Route::get('/formulario', [Controlador::class, 'showForm'])->name("formulario");

// Guarda notas
Route::post('/saveform', [Controlador::class, 'saveNota'])->name("save");

// Elimina notas
Route::delete('/notas/{id}', [Controlador::class, 'deleteNota'])->name("delete");

// Editar y guardar notas
Route::get('/notas/{id}/edit', [Controlador::class, 'editNota'])->name("edit");
Route::put('/notas/{id}', [Controlador::class, 'updateNota'])->name("update");
