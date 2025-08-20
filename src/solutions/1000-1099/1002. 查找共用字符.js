/**
 * @param {string[]} words
 * @return {string[]}
 */
var commonChars = function(words) {
    const sortedWords = words.map(w => w.split('').sort());

    let base = sortedWords[0];
    let result = [];

    for (let char of base) {
        let found = true;
        for (let i = 1; i < sortedWords.length; i++) {
            let idx = sortedWords[i].indexOf(char);
            if (idx === -1) {
                found = false;
                break;
            }
            sortedWords[i].splice(idx, 1);
        }
        if (found) {
            result.push(char);
        }
    }

    return result;
};


