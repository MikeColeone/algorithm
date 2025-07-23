//计数器Ⅱ

type Counter = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): Counter {
    let temp = init;
    return {
    increment: function (): number {
        temp++;
        return temp;
    },
    decrement: function (): number {
        temp--;
        return temp;
    },
    reset: function (): number {
        temp = init;
        return temp;
    }
}
};
