import getClasses from './getClasses';

console.log("Ran from main.js");
getClasses();

const obj={a:'apple', b:'ball'};
const newobj={...obj,c:'camel'};
console.log(newobj)