// Decimal: 0,1,2,3,4,5,6,7,8,9
// Binario: 0,1




// Bit: Valores posibles -->   0 o 1

// Byte: Valores posibles --> 8 bits
// Byte: 00000000 -> 0
// Byte: 00000001 -> 1
// Byte: 00000010 -> 2
// Byte: 00000011 -> 3
// Byte: 00000100 -> 4
// Byte: 00000101 -> 5
// Byte: 00000110 -> 6


// Operador OR

console.log(1|3)

console.log(1|4)
console.log(10| 51)
/**
 * Valor del 1 en Bitwise =  00000001
 * Valor del 3 en Bitwise =  00000011
 * 
 * Valor devuelto = 00000011 = 3
 * 
 * Nota: compara los 0's y 1's de ambos números
 * 
 * Si son 1's se sobreponen sobre los 0's, como si fuera una suma
 **/




// Operador de AND

console.log(1 & 3)
/**
 * Valor del 1 en Bitwise =  00000001
 * Valor del 3 en Bitwise =  00000011
 * 
 * Valor devuelto = 00000001 = 1
 * 
 * Nota: compara los 0's y 1's de ambos números
 * 
 * Si en ambos hay 1's, se pone un 1
 **/

console.log(1 & 4) // 00000000
console.log(3 & 5) // 00000001