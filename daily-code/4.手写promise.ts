type Status = "pending" | "fulfilled" | "rejected";

class MyPromise<T> {
  private status: Status = "pending";
  private value: T | undefined;
  private reason: any;
  private onFulfilledCallbacks: ((value: T) => void)[] = [];
  private onRejectedCallbacks: ((reason: any) => void)[] = [];

  constructor(executor: (resolve: (value: T) => void, reject: (reason: any) => void) => void) {
    const resolve = (value: T) => {
      if (this.status === "pending") {
        this.status = "fulfilled";
        this.value = value;
        this.onFulfilledCallbacks.forEach(fn => fn(value));
      }
    };

    const reject = (reason: any) => {
      if (this.status === "pending") {
        this.status = "rejected";
        this.reason = reason;
        this.onRejectedCallbacks.forEach(fn => fn(reason));
      }
    };

    try {
      executor(resolve, reject);
    } catch (err) {
      reject(err);
    }
  }

  private static resolvePromise<TResult>(
    result: any,
    resolve: (val: TResult) => void,
    reject: (err: any) => void
  ) {
    if (result instanceof MyPromise) {
      result.then(resolve, reject);
    } else {
      resolve(result);
    }
  }

  then<TResult1 = T, TResult2 = never>(
    onFulfilled?: (value: T) => TResult1 | MyPromise<TResult1>,
    onRejected?: (reason: any) => TResult2 | MyPromise<TResult2>
  ): MyPromise<TResult1 | TResult2> {
    onFulfilled = typeof onFulfilled === "function" ? onFulfilled : (v) => v as any;
    onRejected = typeof onRejected === "function" ? onRejected : (r) => { throw r };

    return new MyPromise<TResult1 | TResult2>((resolve, reject) => {
      const handleFulfilled = (value: T) => {
        setTimeout(() => {
          try {
            const result = onFulfilled!(value);
            MyPromise.resolvePromise(result, resolve, reject);
          } catch (err) {
            reject(err);
          }
        }, 0);
      };

      const handleRejected = (reason: any) => {
        setTimeout(() => {
          try {
            const result = onRejected!(reason);
            MyPromise.resolvePromise(result, resolve, reject);
          } catch (err) {
            reject(err);
          }
        }, 0);
      };

      if (this.status === "fulfilled") {
        handleFulfilled(this.value!);
      } else if (this.status === "rejected") {
        handleRejected(this.reason);
      } else if (this.status === "pending") {
        this.onFulfilledCallbacks.push(handleFulfilled);
        this.onRejectedCallbacks.push(handleRejected);
      }
    });
  }

  catch<TResult = never>(onRejected?: (reason: any) => TResult | MyPromise<TResult>) {
    return this.then(undefined, onRejected);
  }

  static resolve<U>(value: U | MyPromise<U>): MyPromise<U> {
    return new MyPromise<U>((resolve) => {
      if (value instanceof MyPromise) {
        value.then(resolve);
      } else {
        resolve(value);
      }
    });
  }

  static reject<U = never>(reason: any): MyPromise<U> {
    return new MyPromise<U>((_, reject) => reject(reason));
  }
}