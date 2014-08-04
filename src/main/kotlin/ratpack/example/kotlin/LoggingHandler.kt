package ratpack.example.kotlin

import ratpack.handling.Context
import ratpack.handling.Handler

/**
 * An example of a handler implicitly set up by a module
 *
 * @see ratpack.example.java.MyModule
 */
class LoggingHandler : Handler {
    override fun handle(context: Context) {
        System.out.println("Received: ${context.getRequest()?.getUri()}")
        context.next()
    }
}