import io.vertx.core.net.impl.SocketAddressImpl;
import org.junit.Test;

import static io.vertx.core.Vertx.vertx;

public class SharedServerTest {
    @Test
    public void listenOnSocketAddress() {
        vertx().createNetServer()
                .connectHandler(x -> {})
                .listen(new SocketAddressImpl(-1, "0.0.0.0"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void unexpectedException_whenUsingInetSocketAddress() {
        vertx().createNetServer()
                .connectHandler(x -> {})
                .listen(-1, "0.0.0.0");
    }
}