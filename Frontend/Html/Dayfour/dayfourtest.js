//const body = document.body;
//const header = document.createElement(`h1`);
let div = documet.querySelector(`.main`)

const header = document.createElement(`h1`);
const p = document.createElement(`p`);
const button = document.createElement(`button`);

div.appendChild(header);
div.appendChild(p);
div.appendChild (button);
header.innerText = `Test`;
p.innerText = `more about the story`;
button.innerText = `Click Me`;


header.setAttribute(`class`, `mainheader`);

header.addEventListener(`click`, () => {
    header.style.color ===`black` ? (header.style.color = `red`)
});

function addParagraph() {
    const para1 = document.createElement(`p`);
    div.appendChild(para1);
    para1.innerText = " I'm a paragraph";

}


button.addEventListener(`click `, addParagraph )

body.append(header);
header.innerText = `Test`;
header.innerHTML(); // <p> some words here </p>
header.textContent();

header.setAtt

 //let div = document.querySelector(`.main`);
 //const header = document.createElement(`h1`);
 //const p = document.createElement(`p`);

 //div.appendChild(header);
 //div.appendChild(p);

 //header.innerText = `Story`;
 //p.innerText = `more about the story`;
 //button.innerText = `Click Me`;

 //header.setAttrribute(`class`,`mainHeader`);

 ///eader


 