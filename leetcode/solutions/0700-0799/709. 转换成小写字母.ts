// function toLowerCase(s: string): string {
//     return s.toLowerCase()
// };

// function toLowerCase(s: string): string {
//     return s.replace(/[A-Z]/g, (match) => match.toLowerCase())
// };

function toLowerCase(s: string): string {
    let result = ''
    for (let char of s) {
        if (char >= 'A' && char <= 'Z') {
            result += String.fromCharCode(char.charCodeAt(0) + 32)
        } else {
            result += char
        }
    }
    return result
};