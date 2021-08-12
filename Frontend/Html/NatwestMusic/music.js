console.log(numS(8,22));
function numS(num1, num2) {
    return num1 - num2;
}

console.log(numS(8,22));


const person = {
    first: `Felix`,
    last: `Cited`,
    age: `20`,
    gender: `male`,
};
let{first,last,age,gender} = person;
console.log (`Welcome ${first} ${last} ${age} ${gender}`);

powerUp = (n1,n2) => Math.pow(n1,n2);

console.log(powerUp(3,3));

let check = false;

function changeCheck() {
  check = true;
}
changeCheck();
console.log(check); // True


function someFunction() {
  hello = "Billy Bob Joe";
}
someFunction();
console.log(hello); // Billy Bob Joe
hello = "Who is Billy?";
console.log(hello); // Who is Billy?

function test() {
  flag = true;
  alert(flag);
  test1();
  alert(flag);
}
function test1() {
  flag = false;
  return;
}

//function myFunc() {
  //let x = foo 
 // let check = false;
//function changeCheck() {
 //// check = true;

//changeCheck();
  //console.log(check);

  // Some code to be executed


//function myFuncs() {
  //let x = "foo";
  //if (x == "foo") {
  //let y = "nothing";
  
//console.log(x);
//console.log(y);

//myFuncs();

//function doSomething() {
 // console.log(a);
  //console.log(foo());
  //let a = 1;
  //function foo() {
  //  return 2;
  ///}
//}
//doSomething();
//// this throws a reference Error on the console as A is not defined. i never noticed this answer first time.

////const increase = (val) => {
 //////// alert(`The new value is ${val+10}`);
//}

//const parent = (child) => {
 // let value = parseInt(prompt("Please enter a value"));
 //// child(value);
//}
//parent(increase);

//let things = [ `golf`,`Football`,`rugby`,`Tennis`,`Basketball`,`hockey`, `running`];

//things.sort(function(a,b) {
//let x= a.toLowercase(),
 //y=b.toLowercase();

////if (x < y) { return-1; }
////if (y < x) { return 1; }
//return 0;


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
]
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
let highestGrade = maxGrade(grades);
 let lowestGrade = minGrade(grades);
 let highestBoysGrade = maxGrade(getBoys(grades));
 let lowestBoysGrade = minGrade(getBoys(grades));
 let highestGirlsGrade = maxGrade(getGirls(grades));
 let lowestGirlsGrade = minGrade(getGirls(grades));

 
console.log(boysAverage);
console.log(girlsAverage);
console.log(classRoomAverage);
console.log('Highest Grade:' + highestGrade);
console.log('Lowest Grade:' + lowestGrade);
console.log('Highest Boys Grade:' + highestBoysGrade);
console.log('Lowest Boys Grade:' + lowestBoysGrade);
console.log('Highest Girls Grade:' + highestGirlsGrade);
console.log('Lowest Girls Grade:' + highestGirlsGrade);

let div = document.querySelector(`.main`)

const header = document.createElement(`h1`);
const p = document.createElement(`p`);
const button = document.createElement(`button`);
 
div.appendChild(header);
div.appendChild(p);
div.appendChild (button);


header.innerText = `Test`;
p.innerText = `more about the story`;
button.innerText = `Click Me`;
 
//button.addEventListener(`click `,  );

//exercise 1 PM 05/08
fetch('https://reqres.in/api/users?page=2')
     .then((response) => {
         if (response.status !== 200) {
             console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
             return;
         }
     response.json()
     .then(data => console.log(data));         
     })
     .catch(err => console.error(`Fetch Error :-S ${err}`));

     //exercise 2
     fetch('https://reqres.in/api/users/2')
     .then((response) => {
         if (response.status !== 200) {
             console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
             return;
         }
     response.json()
     .then(data => console.log(`i like hide and seek`));         
     })
     .catch(err => console.error(`Fetch Error :-S ${err}`)); 


     function fetchData() {
 
      fetch("https://reqres.in/api/users?page=2")
          .then(responce => {
              if (!responce.ok) {
                  throw Error("Error");
              }
              return responce.json();
          })
          .then(data => {
              console.log(data.data);
              const html = data.data
                  .map(user => {
                      return `<p>Email: ${user.email}</p>`;
                  })
                  .join("");
              console.log(html);
              document.querySelector("#app").insertAdjacentHTML("afterbegin", html);
          })
          .catch(error => {
              console / log(eeror);
          })
  }
   
  fetchData();
      
  
  


     
     // exercise 3
     fetch("https://reqres.in/api/users", {
      method: 'post',
      headers: {
          "Content-type": "application/json"
      },
      body: JSON.stringify({
         name: "Morpheus",
         job: "Leader"
        })
      })
      .then(res => res.json())
      .then(data => console.log(`Request succeeded with JSON response ${`count to 100`}`))
      .catch(error => console.error(`Request failed ${`you got caught`}`));

      //exercise 4
      fetch("https://reqres.in/api/register", {
        method: 'post',
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({
            email: "eve.holt@reqres.in",
            password: "pistol"
          })
        })
        .then(res => res.json())
        .then(data => console.log(`Request succeeded with JSON response ${`too late you got caught`}`))
        .catch(error => console.error(`Request failed ${error}`));

        //exercise 5

        fetch("https://reqres.in/api/login", {
      method: 'post',
      headers: {
        "Content-type": "application/json"
      },
      body: JSON.stringify({
          email: "eve.holt@reqres.in",
          password: "cityslicka"
        })
    })
    .then(res => res.json())
    .then(data => console.log(`Request succeeded with JSON response ${data}`))
    .catch(error => console.error(`Request failed ${error}`));