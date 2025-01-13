const ROCK = "piedra";
const PAPER = "papel";
const SCISSORS = "tijeras";

const TIE = 0;
const WIN = 1;
const LOST = 2;

let isPlaying = false;

const rockBtn = document.getElementById("piedra");
const paperBtn = document.getElementById("papel");
const scissorsBtn = document.getElementById("tijeras");

//////////////////////////////////////////////////////////////////////////////////

const rockRadio = document.getElementById("piedra");
const paperRadio = document.getElementById("papel");
const scissorsRadio = document.getElementById("tijeras");

//////////////////////////////////////////////////////////////////////////////////

const resultText = document.getElementById("start-text");
const userImg = document.getElementById("user-img");
const machineImg = document.getElementById("machine-img");


//////////////////////////////////////////////////////////////////////////////////

rockRadio.addEventListener("click", () => {play(ROCK)});
paperRadio.addEventListener("click", () => {play(PAPER)});
scissorsRadio.addEventListener("click", () => {play(SCISSORS)});

//////////////////////////////////////////////////////////////////////////////////

function play(userOption)
{
    if(isPlaying) return "";

    isPlaying = true;

    userImg.src = userOption + ".png";

    resultText.innerHTML = "<strong>Fighting!</strong>";

    const interval = setInterval(function()
    {
        const machineOption = calcMachineOption();
        machineImg.src = machineOption + ".png";
    }, 200);

    setTimeout(function ()
    {

/////////////////////////////////////////////////////////////////////////////////////////////////

        clearInterval(interval);

        const machineOption = calcMachineOption();
        const result = calcResult(userOption, machineOption);

        machineImg.src = machineOption + ".png";

////////////////////////////////////////////////////////////////////////////////////////

        switch (result)
        {
            case TIE:
                resultText.innerHTML = "¡Empate!";
                break;
            case WIN:
                resultText.innerHTML = "¡Ganador: El jugador!";
                break;
            case LOST:
                resultText.innerHTML = "¡Ganador: La máquina!";
                break;
        }
        isPlaying = false;
    }, 2000);
}

function calcMachineOption()
{
    const number = Math.floor(Math.random() * 3);
    switch (number)
    {
        case 0:
            return ROCK;
        case 1:
            return PAPER;
        case 2:
            return SCISSORS;
    }
}

function calcResult(userOption, machineOption)
{
    if (userOption === machineOption)
    {
        return TIE;

    } else if (userOption === ROCK)
    {

        if (machineOption === PAPER) return LOST;
        if (machineOption === SCISSORS) return WIN;

    } else if (userOption === PAPER)
    {

        if (machineOption === SCISSORS) return LOST;
        if (machineOption === ROCK) return WIN;
    
    } else if (userOption === SCISSORS)
    {

        if (machineOption === ROCK) return LOST;
        if (machineOption === PAPER) return WIN;
    
    }
}