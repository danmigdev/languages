
function fibonacci(n) {
  if (n == 0) return 0;
  if (n == 1) return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}

var u = Number(process.argv[2]);
var r = 0;
for (let i = 1; i < u; i++) {
  r += fibonacci(i);
}
console.log(r);
