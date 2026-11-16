package defpackage;

import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o02 implements tr1 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final wl0 g;
    public static final wl0 h;
    public static final aa1 i;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final sr1 d;
    public final p02 e = new p02(this);

    @Override // defpackage.tr1
    public final tr1 b(wl0 wl0Var, boolean z) {
        g(wl0Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 c(wl0 wl0Var, int i2) {
        g(wl0Var, i2, true);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 d(wl0 wl0Var, double d) throws IOException {
        a(wl0Var, d, true);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 e(wl0 wl0Var, long j) throws IOException {
        h(wl0Var, j, true);
        return this;
    }

    @Override // defpackage.tr1
    public final tr1 f(wl0 wl0Var, Object obj) {
        i(wl0Var, obj, true);
        return this;
    }

    static {
        v9 v9Var = new v9(1);
        HashMap map = new HashMap();
        map.put(n02.class, v9Var);
        g = new wl0(C4664b4.i.W, Collections.unmodifiableMap(new HashMap(map)));
        v9 v9Var2 = new v9(2);
        HashMap map2 = new HashMap();
        map2.put(n02.class, v9Var2);
        h = new wl0("value", Collections.unmodifiableMap(new HashMap(map2)));
        i = new aa1(1);
    }

    public static int k(wl0 wl0Var) {
        n02 n02Var = (n02) ((Annotation) wl0Var.b.get(n02.class));
        if (n02Var != null) {
            return n02Var.tag();
        }
        throw new tg0("Field has no @Protobuf config");
    }

    public final void a(wl0 wl0Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(wl0Var) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(wl0 wl0Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        n02 n02Var = (n02) ((Annotation) wl0Var.b.get(n02.class));
        if (n02Var == null) {
            throw new tg0("Field has no @Protobuf config");
        }
        int iOrdinal = n02Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(n02Var.tag() << 3);
            l(i2);
        } else if (iOrdinal == 1) {
            l(n02Var.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((n02Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void h(wl0 wl0Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        n02 n02Var = (n02) ((Annotation) wl0Var.b.get(n02.class));
        if (n02Var == null) {
            throw new tg0("Field has no @Protobuf config");
        }
        int iOrdinal = n02Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(n02Var.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(n02Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((n02Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(wl0 wl0Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(wl0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(wl0Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, wl0Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(wl0Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            l((k(wl0Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(wl0Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            g(wl0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(wl0Var) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        sr1 sr1Var = (sr1) this.b.get(obj.getClass());
        if (sr1Var != null) {
            j(sr1Var, wl0Var, obj, z);
            return;
        }
        v43 v43Var = (v43) this.c.get(obj.getClass());
        if (v43Var != null) {
            p02 p02Var = this.e;
            p02Var.a = false;
            p02Var.c = wl0Var;
            p02Var.b = z;
            v43Var.a(obj, p02Var);
            return;
        }
        if (obj instanceof sf1) {
            g(wl0Var, ((sf1) obj).a, true);
        } else if (obj instanceof Enum) {
            g(wl0Var, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, wl0Var, obj, z);
        }
    }

    public final void j(sr1 sr1Var, wl0 wl0Var, Object obj, boolean z) throws IOException {
        zd1 zd1Var = new zd1();
        zd1Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = zd1Var;
            try {
                sr1Var.a(obj, this);
                this.a = outputStream;
                long j = zd1Var.a;
                zd1Var.close();
                if (z && j == 0) {
                    return;
                }
                l((k(wl0Var) << 3) | 2);
                m(j);
                sr1Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zd1Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    public o02(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, sr1 sr1Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = sr1Var;
    }
}
