<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Nota extends Model
{
    // protected $table = 'duda'; Denominación de la tabla en la base de datos

    use HasFactory;

    // Agrega los campos que deseas permitir para asignación masiva.
    protected $fillable = ['email', 'module', 'subject', 'description'];
}