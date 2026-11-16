package com.explorestack.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class w extends l {
    public static final Logger a = Logger.getLogger(w.class.getName());
    public static final boolean b = c9.e;

    public abstract void A(int i, boolean z);

    public abstract void B(int i, byte[] bArr);

    public abstract void C(int i, ByteString byteString);

    public abstract void D(ByteString byteString);

    public abstract void F(int i, int i2);

    public abstract void G(int i);

    public abstract void H(int i, long j);

    public abstract void I(long j);

    public abstract void K(int i, int i2);

    public abstract void L(int i);

    public abstract void M(int i, MessageLite messageLite);

    public abstract void N(MessageLite messageLite);

    public abstract void O(int i, MessageLite messageLite);

    public abstract void P(int i, ByteString byteString);

    public abstract void Q(int i, String str);

    public abstract void R(String str);

    public abstract void S(int i, int i2);

    public abstract void T(int i, int i2);

    public abstract void U(int i);

    public abstract void V(int i, long j);

    public abstract void W(long j);

    public abstract int y();

    public abstract void z(byte b2);

    public static int m(int i) {
        if (i >= 0) {
            return u(i);
        }
        return 10;
    }

    public static int s(int i) {
        return u(i << 3);
    }

    public static int u(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void x(String str, e9 e9Var) throws u {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9Var);
        byte[] bytes = str.getBytes(l5.a);
        try {
            U(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (u e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new u(e2);
        }
    }

    public static int c(int i) {
        return s(i) + 1;
    }

    public static int d(int i, ByteString byteString) {
        return e(byteString) + s(i);
    }

    public static int e(ByteString byteString) {
        int size = byteString.size();
        return u(size) + size;
    }

    public static int f(int i) {
        return s(i) + 8;
    }

    public static int g(int i, int i2) {
        return m(i2) + s(i);
    }

    public static int h(int i) {
        return s(i) + 4;
    }

    public static int i(int i) {
        return s(i) + 8;
    }

    public static int j(int i) {
        return s(i) + 4;
    }

    public static int k(int i, MessageLite messageLite, t7 t7Var) {
        return ((c) messageLite).getSerializedSize(t7Var) + (s(i) * 2);
    }

    public static int l(int i, int i2) {
        return m(i2) + s(i);
    }

    public static int n(int i, long j) {
        return w(j) + s(i);
    }

    public static int o(int i, MessageLite messageLite) {
        return p(messageLite) + s(i);
    }

    public static int p(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return u(serializedSize) + serializedSize;
    }

    public static int q(int i, int i2) {
        return u((i2 >> 31) ^ (i2 << 1)) + s(i);
    }

    public static int r(String str) {
        int length;
        try {
            length = f9.d(str);
        } catch (e9 unused) {
            length = str.getBytes(l5.a).length;
        }
        return u(length) + length;
    }

    public static int t(int i, int i2) {
        return u(i2) + s(i);
    }

    public static int v(int i, long j) {
        return w(j) + s(i);
    }

    public final void E(int i, double d) {
        H(i, Double.doubleToRawLongBits(d));
    }

    public final void J(int i, float f) {
        F(i, Float.floatToRawIntBits(f));
    }
}
