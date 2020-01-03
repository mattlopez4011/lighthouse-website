// Start counting seconds of runtime
let d = new Date();
let startSeconds = d.getSeconds();

// Create string with alphabet
for(i=97,a='';i<123;){a+=String.fromCharCode(i++)};
console.log(`a variable ${a}`);

// Convert string into array alphabet
tempArray = [];
for (let i = 0; i < a.length ; i++){
    let letter = a.charAt(i);
    tempArray.push(letter);

}
console.log(`Array of letters = ${tempArray}`);

// Compare list of random letters to array of alphabet
let randomLetters = ["a", "m", "r","t","s"];
let abcArray = ["d", "j", "k","g","w"];
let letterCounter = 0;
// For Loop
for (let i=0; i<abcArray.length; i++){
console.log(abcArray[i]);
console.log(i);
    for (let a=0; a<tempArray.length; a++){
        if (abcArray[i] === tempArray[a] && letterCounter < a){
            console.log(`${tempArray[a]} matched!`);
            letterCounter = a;
        }
    }
} // end of loop

console.log("==============================================");

// Foreach loop
let letCount = 0;
tempArray.forEach((letter, index) => {
    console.log(randomLetters[index]);
    console.log(index);
    console.log(letter);

    for (let i=0; i<randomLetters.length; i++){

        if (letter === randomLetters[i] && letCount < index){
            console.log(`${letter} matched === ${randomLetters[i]}`);
            letCount = index;
        }
    }
});

console.log(`Foreach counter = ${letCount}`);
console.log( `last letter in alphabet = ${tempArray[letCount]}`);
console.log('============================================================');
console.log(`For loop letterCounter = ${letterCounter}`);
console.log(`last letter in alphabet = ${tempArray[letterCounter]}`);
let endSeconds = d.getSeconds();
let finalTime = endSeconds + startSeconds;
console.log(`Total runtime in seconds = ${finalTime}'s`);





