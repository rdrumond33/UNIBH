//Questao 1
document.getElementById('aba').innerHTML = "Ola professor"

// Questao 2
const btnClick = document.getElementById('btnClick');
btnClick.addEventListener('click', () => {
  alert("AIA");
});

//Questao 3
const btnSomar = document.getElementById('btnSomar');
btnSomar.addEventListener('click', () => {
  alert(`2+2=${2+2}`)
});

//Questao 4
const btnComparar = document.getElementById('btnComparar');

btnComparar.addEventListener('click', () => {
  const txtComparacao = document.getElementById('txtComparacao');
  let numero = txtComparacao.value;
  if (numero >= 0 && numero < 10) {
    alert("Insuficiente");
  } else if (numero >= 10 && numero < 14) {
    alert("Bom");

  } else {
    alert("Muito Bom");
  }
});

// Questao 5
const x = 5, y = 6;

document.getElementById("resultadoSoma").innerHTML = `${x+y}`;

// Questao 6

document.getElementById("resultadomult").innerHTML = `${x*10}`;

// Questao 7

document.getElementById('span1').innerHTML = "Fiat"+147;

document.getElementById('span2').innerHTML = "Fiat" + 1 + 4 + 7;

document.getElementById('span3').innerHTML = 147 + "Fiat";

document.getElementById('span4').innerHTML = 1 + 4 + 7 + "Fiat";

// Questa 8
operacoes(10, 50);
function operacoes(numero1, numero2) {
  document.getElementById('resultOperacoes').innerHTML = `${numero1}+${numero2}=${numero1+numero2}\n${numero1}-${numero2}=${numero1-numero2}\n${numero1}*${numero2}=${numero1*numero2}\n${numero1}/${numero2}=${numero1/numero2}`;
}


//Questap 10

//Questao 11
let stringnome = "ola, qual o tamanha dessa string?"
document.getElementById('tamanhoString').innerHTML = `${stringnome}\n o resultado e: ${stringnome.length}`

//Questao 14 
document.getElementById('questao14').innerHTML = concatenacao('java','script');

function concatenacao(stringA,stringB){
  
  return stringA+stringB;
}



//Questão 16
document.getElementById('questao16').innerHTML = acrecentar('ola eu sou javasciprt');

function acrecentar(frase){

  return frase.replace(/ /g,'+');  
}


//Questao 18
const arr = ["1958 Brasil 3100", "1964 Veraneio", "1968 Opala", "1973 Chevette", "1975 Caravan", "1981 Marajó", "1982 Monza", "1982 Chevy 500", "1985 Chevrolet D20 e A20", "1989 Ipanema", "1989 Kadett", "1990 Bonanza", "1992 Omega", "1993 Omega Suprema", "1993 Vectra", "1994 Corsa",
  "1998 Astra", "2000 Celta", "2002 Meriva", "2003 Montana", "2006 Prisma", "2007 Vectra GT", "1973 Alfa Romeo 2300", "1976 147 L", "1977 147 Pick-up", "1978 147 Rallye", "1979 147 Álcool", "1980 Fiorino", "1980 Panorama C", "1981 147 C", "1982 Fiorino Furgão", "1983 Oggi", "1984 Uno", "1985 Prêmio", "1986 Elba", "1987 Uno 1.5R", "1988 Fiat Fiorino", "1989 Elba CSL", "1990 Uno Mille", "1991 Elba Weekend", "1991 Tempra", "1991 Uno Mille Brio", "1992 Uno Mille Electronic", "1993 Tipo",
  "1993 Tempra 16v", "1994 Uno Mille ELX", "1994 Uno Turbo i.e.", "1996 Palio", "1997 Siena", "1997 Palio Weekend", "1998 Marea", "1999 Brava", "1999 Strada Cabine Estendida", "1999 Palio Weekend Adventure", "1999 Palio Citymatic", "2000 Ducato", "2000 Marea 2.4 20v", "2001 Doblò", "2001 Pick-up Strada Adventure", "2001 Uno Mille Fire", "2002 Fiat Stilo", "2005 Idea", "2007 Punto", "2008 Fiat Linea", "2008 Fiat Idea", "2006 Fiat Idea Adventure"];
imprimir(arr);


function imprimir(arr) {

  const divimprimiArray = document.getElementById('imprimiArray');
  for (var i = 0; i < arr.length; i++) {
    const paragrafo = document.createElement('p');
    paragrafo.innerHTML = arr[i];
    divimprimiArray.appendChild(paragrafo);
  }

}

//Questao 19
quantidadeArray(arr);
function quantidadeArray(arr) {
  document.getElementById('quantidade').innerHTML = arr.length
}

//Queatao 20
upercaseArray(arr);
function upercaseArray(arr){
  const divupercase = document.getElementById('upercase');
  for (var i = 0; i < arr.length; i++) {
    const paragrafo = document.createElement('p');
    paragrafo.innerHTML = arr[i].toUpperCase();
    divupercase.appendChild(paragrafo);
  }
}