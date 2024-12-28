function timer() {
let timer;
let running = false;
$('#start-timer').on('click', () =>{
  if(running == false) {
    running = true;
    timer = setInterval(() => {
      let seconds = parseInt($('#seconds').text());
      let minutes = parseInt($('#minutes').text());
      let hours = parseInt($('#hours').text());
  
      if(seconds == 59) {
        $('#seconds').text(0);
        $('#minutes').text(minutes+1);
      } else {
        $('#seconds').text(seconds+1);
      }
  
      if(minutes == 59) {
        $('#minutes').text(0);
        $('#hours').text(hours+1);
      }
  
      if(hours == 23 && minutes == 59 && seconds == 59) {
        $('#seconds').text(0);
        $('#minutes').text(0);
        $('#hours').text(0);
      }
    }, 1000);
  }
});
$('#stop-timer').on('click', () => {
  clearInterval(timer);
  running = false;
});
}