//console.log("Hello");

//for (let i = 0; i < 10; i++) {

    /////console.log(i);}
//console.log("hi");
//let condition = NaN;

for (let i = 0; i < 10; i++) {
    for (let j = 1; j <= 10; j++) {
      console.log(j);
    }
 }  

 for (let a = 100; a <= 200; a++) {
    console.log(`a = ${a}`);
  }

  for (let a = 100; a <= 200; a++) {
    if (a % 2 == 0) {
      console.log("-");
    } else {
      console.log("*");
    }
  }
  let now = new Date(); 
let day = now.getDay();
switch (day) {
  case 0:
    console.log(`It's Sunday`);
    break;
  case 6:
    console.log(`It's Saturday`);
    break;
  case 1:
    console.log(`It's Monday`);
  case 2:
  case 3:
  case 4:
  case 5:
    console.log(`It's a weekday`);
    break;
  default:
    console.log(`Excuse me?`);
    break;
}


let age = 100;
let result = age >= 50 ? "50 or over" : "Under 50";
console.log(result);

let d =["apple","strawberries","banana", "grapes", "pear"];
console.log(d); // ["apple", "strawberries", "banana", "grapes", "pear"]
console.log(d.sort()); 


let grades = [
  {name: 'John', grade: 8, sex: 'M'},
  {name: 'Sarah', grade: 12, sex: 'F'},
  {name: 'Bob', grade: 16, sex: 'M'},
  {name: 'Johnny', grade: 2, sex: 'M'},
  {name: 'Cyrus', grade: 4, sex: 'M'},
  {name: 'Paula', grade: 18, sex: 'F'},
  {name: 'Jeff', grade: 5, sex: 'M'},
  {name: 'Jennifer', grade: 13, sex: 'F'},
  {name: 'Courtney', grade: 15, sex: 'F'},
  {name: 'Jane', grade: 9, sex: 'F'}
];
let isBoy = student => student.sex === "M";
let isGirl = student => student.sex === "F";

let getBoys = grades => (grades.filter(isBoy));
let getGirls = grades => (grades.filter(isGirl));

let average = grades => (grades.reduce((acc,curr) => (acc + curr.grade), 0) / grades.length);

let maxGrade = grades => (Math.max(...grades.map(student => student.grade)));
let minGrade = grades => (Math.min(...grades.map(student => student.grade)));
let classRoomAverage = average(grades);
let boysAverage = average(getBoys(grades));
let girlsAverage = average(getGirls(grades));



console.log(boysAverage);
console.log(girlsAverage);
console.log(classRoomAverage);
console.log('Highest Grade:' + highestGrade);
console.log('Lowest Grade:' + lowestGrade);
console.log('Highest Boys Grade:' + highestBoysGrade);
console.log('Lowest Boys Grade:' + lowestBoysGrade);
console.log('Highest Girls Grade:' + highestGirlsGrade);
console.log('Lowest Girls Grade:' + highestGirlsGrade);







console.log(grades.sort());
let highestGrade = maxGrade(grades);


  

