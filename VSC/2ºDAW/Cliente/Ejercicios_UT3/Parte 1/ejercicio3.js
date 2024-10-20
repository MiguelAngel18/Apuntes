let juegos = ["Mario Party","Minecraft","CS GO","Call ol duty","WOW","League of Legends","Clash Royale","Candy Crush","Cuphead","Among Us"];

// For(); Admite Break y Continue;
for(let i; i < juegos.length; i++)
{
    console.log(juegos[i]);
}

// ForEach(); No admite Break y Continue;
juegos.forEach(element => {console.log(element)});

// ForIn(); Admite Break y Continue;
juegos.add = "Just Dance";
for(let i in juegos)
{
    console.log(juegos[i]);
}

// ForOf(); Admite Break y Continue;
for(juego of juegos)
{
    console.log(juego);
}