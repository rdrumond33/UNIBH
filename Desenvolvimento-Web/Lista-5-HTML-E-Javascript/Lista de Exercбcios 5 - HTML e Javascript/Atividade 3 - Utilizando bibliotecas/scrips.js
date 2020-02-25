let JsonChart = '{"type":"line","data":{"labels":["January","February","March","April","May","June","July"],"datasets":[{"label":"grafico 1","backgroundColor":"rgb(255, 99, 132)","borderColor":"rgb(255, 99, 132)","data":[0,10,5,2,20,30,45]}]}}'
let JsonTabulator = '{"height":"311px","columns":[{"title":"Name","field":"name"},{"title":"Progress","field":"progress","sorter":"number"},{"title":"Gender","field":"gender"},{"title":"Rating","field":"rating"},{"title":"Favourite Color","field":"col"},{"title":"Date Of Birth","field":"dob","align":"center"}]}'


let objetctJson = JSON.parse(JsonChart);
let cxt = document.getElementById('Chart_1');
let grafigo = new Chart(cxt, objetctJson);
/** */
let Chart2 = document.getElementById('Chart_2');
let objetctJson2 = JSON.parse(JsonChart);
objetctJson2.type = "bar"
let grafigo2 = new Chart(Chart2, objetctJson2);
/********************************** */
let Chart3 = document.getElementById('Chart_3');
let objetctJson3 = JSON.parse(JsonChart);
objetctJson3.type = "radar"
let grafigo3 = new Chart(Chart3, objetctJson3);
/********************************************************* */
