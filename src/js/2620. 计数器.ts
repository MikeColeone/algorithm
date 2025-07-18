function createCounter(n: number): () => number {
    let x = n - 1;
    return function():number {
        x+=1;
        return x;
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */