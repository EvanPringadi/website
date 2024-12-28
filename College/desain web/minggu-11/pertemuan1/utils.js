function maxNumber() {
  let num1 = parseInt(prompt("First Number:"));
  let num2 = parseInt(prompt("Second Number:"));
  let num3 = parseInt(prompt("Third Number:"));
  if(num1<num2) {
    const temp = num1;
    num1 = num2;
    num2 = temp;
  } 
  if(num2<num3) {
    const temp = num2;
    num2 = num3;
    num3 = temp;
  } 
  if(num1<num2) {
    const temp = num1;
    num1 = num2;
    num2 = temp;
  } 
  document.querySelector(".max-number").innerHTML = `
  <p>bilangan ke 1 : ${num1}</p>
  <p>bilangan ke 2 : ${num2}</p>
  <p>bilangan ke 3 : ${num3}</p>
  <p>bilangan terbesar : ${num1}</p>
  `;
}
function arrayElement() {
  const length = prompt("Enter Element Quantity:");
  let array = [];
  for(let i = 0; i < length; i++) {
    array[i] = prompt("Enter Element " + (i+1));
  }
  const find = prompt("Enter Element to Find:");
  let found = false;
  for(let i = 0; i<array.length; i++) {
    let finding = false;
    if(array[i] == find) {
      finding = true;
    }
    if(finding) {
      found = true;
    }
  }
  document.querySelector(".array-element").innerHTML = `
  <p>${find} in  ${array}  is ${found}</p>
  `;
}
function factorial() {
  const a = parseInt(prompt("Enter a number:"));
  let b = 1;
  for (let index = a; index > 1; index--) {
    b *= index;
  }
  document.querySelector(".factorial").innerHTML = 
  `${a}! equals to ${b}`;
}