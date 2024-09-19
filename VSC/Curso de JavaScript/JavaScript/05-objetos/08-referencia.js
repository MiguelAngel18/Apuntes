let a = 1
let b = a

b++

console.log(a,b)

/////////////////////////////////////////////////

let c = {}
let d = c

d.prop = 1

console.log(c,d)

/////////////////////////////////////////7

let e = {prop: 1}

function suma(n)
{
    n.prop++
}

suma(e)
console.log(e)