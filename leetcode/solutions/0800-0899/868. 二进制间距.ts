function binaryGap(n: number): number {
  let max = -1;
  let lastOne = -1;
  const binary = toBinary(n);
  binary.split("").forEach((char, index) => {
    if (char === "1") {
      if (lastOne !== -1) {
        max = Math.max(max, index - lastOne);
      }
      lastOne = index;
    }
  });
  return max === -1 ? 0 : max;
}

const toBinary = (n: number): string => {
  let result = "";
  while (n > 0) {
    result = (n % 2) + result;
    n = Math.floor(n / 2);
  }
  return result;
};
