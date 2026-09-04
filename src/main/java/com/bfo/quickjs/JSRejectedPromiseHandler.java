package com.bfo.quickjs;

/**
 * An interface which can be implemented to handle rejected promises
 */
public interface JSRejectedPromiseHandler {
    /**
     * Handle the rejected promise.
     * @param rejected The promise that was rejected.
     * @param exception The exception that the promise was rejected with.
     */
    void handle(JSPromise rejected, JSException exception);
}
