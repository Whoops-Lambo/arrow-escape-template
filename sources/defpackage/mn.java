package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mn {
    public final gd1 a;
    public final gd1 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final Headers f;

    public final void a(BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(this.c).writeByte(10);
        bufferedSink.writeDecimalLong(this.d).writeByte(10);
        bufferedSink.writeDecimalLong(this.e ? 1L : 0L).writeByte(10);
        Headers headers = this.f;
        bufferedSink.writeDecimalLong(headers.size()).writeByte(10);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            bufferedSink.writeUtf8(headers.name(i)).writeUtf8(": ").writeUtf8(headers.value(i)).writeByte(10);
        }
    }

    public mn(BufferedSource bufferedSource) throws IOException {
        ln lnVar = new ln(this, 0);
        pd1 pd1Var = pd1.c;
        this.a = eu.v(pd1Var, lnVar);
        this.b = eu.v(pd1Var, new ln(this, true ? 1 : 0));
        this.c = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.d = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.e = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int i = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            Bitmap.Config[] configArr = i.a;
            int iW = dk2.W(utf8LineStrict, ':', 0, 6);
            if (iW != -1) {
                builder.addUnsafeNonAscii(dk2.y0(utf8LineStrict.substring(0, iW)).toString(), utf8LineStrict.substring(iW + 1));
            } else {
                ak1.n("Unexpected header: ".concat(utf8LineStrict));
                throw null;
            }
        }
        this.f = builder.build();
    }

    public mn(Response response) {
        ln lnVar = new ln(this, 0 == true ? 1 : 0);
        pd1 pd1Var = pd1.c;
        this.a = eu.v(pd1Var, lnVar);
        this.b = eu.v(pd1Var, new ln(this, 1));
        this.c = response.sentRequestAtMillis();
        this.d = response.receivedResponseAtMillis();
        this.e = response.handshake() != null;
        this.f = response.headers();
    }
}
