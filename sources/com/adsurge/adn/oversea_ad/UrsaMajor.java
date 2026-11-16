package com.adsurge.adn.oversea_ad;

import defpackage.pv1;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class UrsaMajor {
    public String b = "GBK";
    public ByteBuffer a = ByteBuffer.allocate(128);

    public final void a(Object obj, int i) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0, i);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i);
            return;
        }
        if (obj instanceof Long) {
            a(i, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i);
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            a(10);
            b((byte) 5, i);
            this.a.putDouble(dDoubleValue);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i);
            return;
        }
        if (obj instanceof UrsaMinor) {
            a((UrsaMinor) obj, i);
            return;
        }
        if (obj instanceof byte[]) {
            a(i, (byte[]) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            a(8);
            b((byte) 9, i);
            a(zArr.length, 0);
            for (boolean z : zArr) {
                a(z ? (byte) 1 : (byte) 0, 0);
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            a(8);
            b((byte) 9, i);
            a(sArr.length, 0);
            for (short s : sArr) {
                a(s, 0);
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            a(8);
            b((byte) 9, i);
            a(iArr.length, 0);
            for (int i2 : iArr) {
                a(i2, 0);
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            a(8);
            b((byte) 9, i);
            a(jArr.length, 0);
            for (long j : jArr) {
                a(0, j);
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            a(8);
            b((byte) 9, i);
            a(fArr.length, 0);
            for (float f : fArr) {
                a(f, 0);
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            a(8);
            b((byte) 9, i);
            a(dArr.length, 0);
            for (double d : dArr) {
                a(10);
                b((byte) 5, 0);
                this.a.putDouble(d);
            }
            return;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                a((Collection) obj, i);
                return;
            }
            throw new Taurus("write object error: unsupport type. " + obj.getClass());
        }
        Object[] objArr = (Object[]) obj;
        a(8);
        b((byte) 9, i);
        a(objArr.length, 0);
        for (Object obj2 : objArr) {
            a(obj2, 0);
        }
    }

    public final void b(byte b, int i) {
        if (i < 15) {
            this.a.put((byte) (b | (i << 4)));
        } else {
            if (i >= 256) {
                throw new Taurus(pv1.k(i, "tag is too large: "));
            }
            this.a.put((byte) (b | 240));
            this.a.put((byte) i);
        }
    }

    public final void a(byte b, int i) {
        a(3);
        if (b == 0) {
            b((byte) 12, i);
        } else {
            b((byte) 0, i);
            this.a.put(b);
        }
    }

    public final void a(short s, int i) {
        a(4);
        if (s >= -128 && s <= 127) {
            a((byte) s, i);
        } else {
            b((byte) 1, i);
            this.a.putShort(s);
        }
    }

    public final void a(int i, int i2) {
        a(6);
        if (i >= -32768 && i <= 32767) {
            a((short) i, i2);
        } else {
            b((byte) 2, i2);
            this.a.putInt(i);
        }
    }

    public final void a(int i, long j) {
        a(10);
        if (j >= -2147483648L && j <= 2147483647L) {
            a((int) j, i);
        } else {
            b((byte) 3, i);
            this.a.putLong(j);
        }
    }

    public final void a(float f, int i) {
        a(6);
        b((byte) 4, i);
        this.a.putFloat(f);
    }

    public final void a(String str, int i) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i);
            this.a.putInt(bytes.length);
            this.a.put(bytes);
        } else {
            b((byte) 6, i);
            this.a.put((byte) bytes.length);
            this.a.put(bytes);
        }
    }

    public final void a(Map map, int i) {
        a(8);
        b((byte) 8, i);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public final void a(int i, byte[] bArr) {
        a(bArr.length + 8);
        b((byte) 13, i);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.a.put(bArr);
    }

    public final void a(Collection collection, int i) {
        a(8);
        b((byte) 9, i);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public final void a(UrsaMinor ursaMinor, int i) {
        a(2);
        b((byte) 10, i);
        ursaMinor.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public final void a(int i) {
        if (this.a.remaining() < i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.a.capacity() + i) * 2);
            byteBufferAllocate.put(this.a.array(), 0, this.a.position());
            this.a = byteBufferAllocate;
        }
    }
}
