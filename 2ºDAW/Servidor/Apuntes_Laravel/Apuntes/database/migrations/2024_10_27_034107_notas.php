<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Creación de la tabla duda
     */
    public function up(): void
    {
        Schema::create('notas', function (Blueprint $table)
        {
            $table->id();
            $table->timestamps();

            $table->string('email');
            $table->string('module');
            $table->string('subject');
            $table->longText('description');
        });
    }
    
    /**
     * Eliminación de la tabla duda
     */
    public function down(): void
    {
        Schema::dropIfExists('notas');
    }
};
