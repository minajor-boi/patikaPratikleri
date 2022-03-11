
let isim1 = prompt("Lütfen isminizi girin:", "Anon");

document.getElementById("myName").innerHTML = isim1;

function showTime(){
    var zaman = new Date();
    const gunler = ["Pazar","Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi"]
    document.getElementById("myClock").innerHTML= zaman.getHours()+":"+zaman.getMinutes()+":"+zaman.getSeconds()+" "+gunler[zaman.getUTCDay()];
    setTimeout(showTime,1000);
}
showTime();
