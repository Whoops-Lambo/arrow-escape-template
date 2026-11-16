package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dp1 implements zzbi {
    public final Object a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    public dp1 c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.c) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public void a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public dp1 d(String str) {
        byte[] bytes = str.toString().getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bytes, 0, bytes.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                f();
            }
            return this;
        }
        int iPosition = this.b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        f();
        while (byteBufferOrder.remaining() >= this.c) {
            e(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public void f() {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.c) {
            e(byteBuffer);
        }
        byteBuffer.compact();
    }

    public dp1(int i) {
        switch (i) {
            case 1:
                this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
                this.b = 16;
                this.c = 16;
                this.d = 0L;
                this.e = 0L;
                this.f = 0;
                break;
            case 2:
                this.a = new zzfov();
                this.b = 0;
                this.c = 0;
                this.f = 0;
                long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
                this.d = jCurrentTimeMillis;
                this.e = jCurrentTimeMillis;
                break;
            default:
                this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
                this.b = 16;
                this.c = 16;
                this.d = 0L;
                this.e = 0L;
                this.f = 0;
                break;
        }
    }

    public void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.d;
        this.d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.e;
        this.d = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.e = jRotateLeft3;
        this.e = ((Long.rotateLeft(jRotateLeft3, 31) + this.d) * 5) + 944331445;
        this.f += 16;
    }

    public void e(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.d;
        this.d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.e;
        this.d = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.e = jRotateLeft3;
        this.e = ((Long.rotateLeft(jRotateLeft3, 31) + this.d) * 5) + 944331445;
        this.f += 16;
    }
}
