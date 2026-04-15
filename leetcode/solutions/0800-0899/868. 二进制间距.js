/**
 * @param {number} n
 * @return {number}
 */
var binaryGap = function (n) {
  const binaryStr = toBinary(n);
  let maxGap = 0;
  let lastOneIndex = -1;

  binaryStr.split("").forEach((char, index) => {
    if (char === "1") {
      if (lastOneIndex !== -1) {
        const currentGap = index - lastOneIndex;
        maxGap = Math.max(maxGap, currentGap);
      }
      lastOneIndex = index;
    }
  });

  return maxGap;
};

const toBinary = (num) => {
  let result = "";
  if (num === 0) return "0";
  while (num > 0) {
    result = (num % 2) + result;
    num = Math.floor(num / 2);
  }
  return result;
};
