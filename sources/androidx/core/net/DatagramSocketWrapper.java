package androidx.core.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class DatagramSocketWrapper extends Socket {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DatagramSocketImplWrapper extends SocketImpl {
        @Override // java.net.SocketImpl
        public final void accept(SocketImpl socketImpl) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final int available() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void bind(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void close() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(String str, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void create(boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public final Object getOption(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void listen(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void sendUrgentData(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public final void setOption(int i, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(SocketAddress socketAddress, int i) {
            throw new UnsupportedOperationException();
        }
    }
}
