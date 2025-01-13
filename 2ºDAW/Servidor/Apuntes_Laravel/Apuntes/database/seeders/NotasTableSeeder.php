<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Nota;

class NotasTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $notas = [
            [
                'email' => 'migue.angel.c2005@gmail.com',
                'module' => 'DSW',
                'subject' => 'Duda',
                'description' => 'No sé si estoy haciendo bien el seeder',
            ],
            [
                'email' => 'migue.angel.c2005@gmail.com',
                'module' => 'DOR',
                'subject' => 'Duda',
                'description' => 'No sé BootStrap',
            ],
        ];

        foreach ($notas as $nota)
        {
            Nota::create($nota);
        }
    }
}
