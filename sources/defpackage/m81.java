package defpackage;

import com.explorestack.protobuf.c9;
import com.google.protobuf.Internal;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m81 extends InputStream {
    public final /* synthetic */ int a;
    public Iterator b;
    public ByteBuffer c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public int i;
    public long j;

    public m81(Iterable iterable) {
        this.a = 0;
        this.b = iterable.iterator();
        this.d = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.d++;
        }
        this.e = -1;
        if (d()) {
            return;
        }
        this.c = Internal.EMPTY_BYTE_BUFFER;
        this.e = 0;
        this.f = 0;
        this.j = 0L;
    }

    public final boolean d() {
        switch (this.a) {
            case 0:
                this.e++;
                Iterator it = this.b;
                if (!it.hasNext()) {
                    return false;
                }
                ByteBuffer byteBuffer = (ByteBuffer) it.next();
                this.c = byteBuffer;
                this.f = byteBuffer.position();
                if (this.c.hasArray()) {
                    this.g = true;
                    this.h = this.c.array();
                    this.i = this.c.arrayOffset();
                    return true;
                }
                this.g = false;
                this.j = p03.b(this.c);
                this.h = null;
                return true;
            default:
                this.e++;
                Iterator it2 = this.b;
                if (!it2.hasNext()) {
                    return false;
                }
                ByteBuffer byteBuffer2 = (ByteBuffer) it2.next();
                this.c = byteBuffer2;
                this.f = byteBuffer2.position();
                if (this.c.hasArray()) {
                    this.g = true;
                    this.h = this.c.array();
                    this.i = this.c.arrayOffset();
                    return true;
                }
                this.g = false;
                this.j = c9.c.k(c9.g, this.c);
                this.h = null;
                return true;
        }
    }

    public final void f(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.f + i;
                this.f = i2;
                if (i2 == this.c.limit()) {
                    d();
                }
                break;
            default:
                int i3 = this.f + i;
                this.f = i3;
                if (i3 == this.c.limit()) {
                    d();
                }
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if (this.e == this.d) {
                    return -1;
                }
                int iLimit = this.c.limit();
                int i3 = this.f;
                int i4 = iLimit - i3;
                if (i2 > i4) {
                    i2 = i4;
                }
                if (this.g) {
                    System.arraycopy(this.h, i3 + this.i, bArr, i, i2);
                    f(i2);
                } else {
                    int iPosition = this.c.position();
                    this.c.position(this.f);
                    this.c.get(bArr, i, i2);
                    this.c.position(iPosition);
                    f(i2);
                }
                return i2;
            default:
                if (this.e == this.d) {
                    return -1;
                }
                int iLimit2 = this.c.limit();
                int i5 = this.f;
                int i6 = iLimit2 - i5;
                if (i2 > i6) {
                    i2 = i6;
                }
                if (this.g) {
                    System.arraycopy(this.h, i5 + this.i, bArr, i, i2);
                    f(i2);
                } else {
                    int iPosition2 = this.c.position();
                    this.c.position(this.f);
                    this.c.get(bArr, i, i2);
                    this.c.position(iPosition2);
                    f(i2);
                }
                return i2;
        }
    }

    public /* synthetic */ m81() {
        this.a = 1;
    }

    @Override // java.io.InputStream
    public final int read() {
        int iF;
        int iE;
        switch (this.a) {
            case 0:
                if (this.e == this.d) {
                    return -1;
                }
                if (this.g) {
                    iF = this.h[this.f + this.i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    f(1);
                } else {
                    iF = p03.c.f(((long) this.f) + this.j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    f(1);
                }
                return iF;
            default:
                if (this.e == this.d) {
                    return -1;
                }
                if (this.g) {
                    iE = this.h[this.f + this.i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    f(1);
                } else {
                    iE = c9.c.e(((long) this.f) + this.j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    f(1);
                }
                return iE;
        }
    }
}
