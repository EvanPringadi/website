console.log("hello");
let num = [2, 2, 5, 1, 4];
let number = [55, 12, 4, 17, 12];

console.log(sort(num));
console.log(sort(number));

function getLowestNumber(num) {
  let lowest_num = num[0];
  for (let i=0; i < num.length; i++) {
    curr_num = num[i];
    if (lowest_num > curr_num) {
      lowest_num = curr_num;
    }
  }
  return lowest_num;
}

function sort(num) {
  let sorted_num = [];
  while (num.length > 0) {
    let lowest = getLowestNumber(num);
    sorted_num.push(lowest);
    // Remove all instances of the lowest number

    // Find the index of the first occurrence of the lowest number and remove it
    //let index = num.indexOf(lowest);
    let index;
    for (let i=0; i<num.length; i++) {
      if (num[i] == lowest){
        index = i;
      }
    }

    num.splice(index, 1);
  }
  return sorted_num;
}