# vertx-shared-server-reproducer

Per https://github.com/eclipse-vertx/vert.x/issues/3998,

I would expect to be able to create a shared NetServer by listening on a negative port in vert.x 4.2.0 
However, this fails due to `java.lang.IllegalArgumentException: port p must be in range 0 <= p <= 65535`

Interestingly, we get correct server sharing behavior when we create a SocketAddressImpl on a negative port ourselves.
