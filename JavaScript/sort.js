num1 = [4, 3, 5, 9, 6, 10, 9, 12, 15, 7, 3];
console.log(sort(num1));

function renderTodoList(toDoList) {
  sortObject(toDoList);
  let toDoListHTML = ``; 
  toDoList.forEach((todo) => {
    //bikin dulu dari 1010 jadi 10 Oktober
    const date = todo.date;
    const monthNumber = Math.floor(todo.date/100);
    const dateNumber = todo.date % 100;
    let monthString = "";

    if (monthNumber = 1) {
      monthString = " Januari";
    } else if (monthNumber = 2) {
      monthString = " Februari";
    } else if (monthNumber = 3) {
      monthString = " Maret";
    } else if (monthNumber = 4) {
      monthString = " April";
    } else if (monthNumber = 5) {
      monthString = " Mei";
    } else if (monthNumber = 6) {
      monthString = " Juni";
    } else if (monthNumber = 7) {
      monthString = " Juli";
    } else if (monthNumber = 8) {
      monthString = " Agustus";
    } else if (monthNumber = 9) {
      monthString = " September";
    } else if (monthNumber = 10) {
      monthString = " Oktober";
    } else if (monthNumber = 11) {
      monthString = " November";
    } else if (monthNumber = 12) {
      monthString = " Desember";
    }

    const dateString = str(dateNumber) + monthString;

    const html = `
      <div>${todo.todoName}</div>
      <div>${dateString}</div>
    `;
    toDoListHTML += html;
  }); 
}

function sort(num) {
  let lowest_num = num[0];
  for (let i=0; i < num.length; i++) {
    for (let j=i+1; j<num.length; j++) {
      if(num[i] > num[j]) {
        const temp = num[i];
        num[i] = num[j];
        num[j] = temp;
      }
    }
  }
  return num;
}

const num2 = [18, 7, 134, 69, 21, 88, 99];
console.log(sort(num2));

toDoList = [{
  'todoName' : 'wash dishes',
  'date' : 1010
 }, {
  'todoName' : 'meeting',
  'date' : 1008
 }, {
  'todoName' : 'practical test',
  'date' : 1021
 }, {
  'todoName' : 'theorytical test',
  'date' : 1028
 }, {
  'todoName' : 'study',
  'date' : 1017
 }]

 console.log(sortObject(toDoList));

function sortObject(todo) {
  for (let i=0; i < todo.length; i++) {
    for (let j=i+1; j<todo.length; j++) {
      if(todo[i].date > todo[j].date) {
        const temp = todo[i];
        todo[i] = todo[j];
        todo[j] = temp;
      }
    }
  }
  return todo;
}