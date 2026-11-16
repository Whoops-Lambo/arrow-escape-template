package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public int a;
    public s b;

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract int e();

    public abstract boolean f();

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean l();

    public abstract ByteString m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract void s(int i, MessageLite.Builder builder, o3 o3Var);

    public abstract int t();

    public abstract long u();

    public abstract MessageLite v(g7 g7Var, o3 o3Var);

    public abstract void w(MessageLite.Builder builder, o3 o3Var);

    public abstract int x();

    public abstract int z();

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static n g(byte[] bArr, int i, int i2, boolean z) {
        n nVar = new n(bArr, i, i2, z);
        try {
            nVar.k(i2);
            return nVar;
        } catch (InvalidProtocolBufferException e) {
            defpackage.d.n(e);
            return null;
        }
    }

    public static r h(InputStream inputStream) {
        if (inputStream != null) {
            return new p(inputStream);
        }
        byte[] bArr = l5.c;
        return g(bArr, 0, bArr.length, false);
    }

    public static int y(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static r i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && c9.d) {
            return new q(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return g(bArr, 0, iRemaining, true);
    }
}
