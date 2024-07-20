let calc='';
let input = calc;
const result = calc;
function show() {
  if(calc !== 'Calculator'){
    console.log(calc);
    document.querySelector('.js-input').innerHTML = `${calc}`;
  } else {
    calc = '0';
    console.log(calc);
    document.querySelector('.js-input').innerHTML = `${calc}`;
  }
  
}
function showAnswer() {
  console.log(calc);
  document.querySelector('.js-input').innerHTML = `${calc}`;
}
function removeZero() {
  if (calc === '0') {
    calc = '';
  }
}