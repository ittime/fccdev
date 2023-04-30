const myString = "This is a {sample} string with {multiple} {placeholders}.";
const regex = /{([^}]+)}/g;
const matches = myString.match(regex);
console.log(matches); // Output: ["{sample}", "{multiple}", "{placeholders}"]
