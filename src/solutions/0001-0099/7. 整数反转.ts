function reverse(x: number): number {
  const isNegative = x < 0;
  const reversed = Math.abs(x).toString().split("").reverse().join("");

  const result = parseInt(reversed, 10) * (isNegative ? -1 : 1);
  const min = -Math.pow(2, 31);
  const max = Math.pow(2, 31) - 1;
  return result >= min && result <= max ? result : 0;
}
