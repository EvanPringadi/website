let date1 = 121;

let month1 = Math.floor(121/100);
date1 = 121%100;

console.log(month1 + " " + date1);

date = [930, 505, 210, 731, 1212, 723, 630, 422, 1111];

//consoleDate(date);

const sorted_date = sort(date);

consoleDate(sorted_date);
function consoleDate(date) {
  date.forEach((date2) => {
    let month2 = Math.floor(date2/100);
    date2 = date2%100;
  
    if (month2 == 1) {
      month2 = "Januari";
    } else if (month2 == 2) {
      month2 = "Februari";
    } else if (month2 == 3) {
      month2 = "Maret";
    } else if (month2 == 4) {
      month2 = "April";
    } else if (month2 == 5) {
      month2 = "Mei";
    } else if (month2 == 6) {
      month2 = "Juni";
    } else if (month2 == 7) {
      month2 = "Juli";
    } else if (month2 == 8) {
      month2 = "Agustus";
    } else if (month2 == 9) {
      month2 = "September";
    } else if (month2 == 10) {
      month2 = "Oktober";
    } else if (month2 ==11) {
      month2 = "November";
    } else if (month2 == 12) {
      month2 = "Desember";
    }
    
    console.log(date2 + " " + month2);
  });
}



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