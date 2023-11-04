const prompt = require("prompt-sync")({sigint:true});
const str = prompt("Type Input:");
function reverse(str){
    return str.split("").reverse("").join("");s
}
console.log('Reversed string is:', reverse(str))
