package com.adsurge.adn.oversea_ad;

import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import defpackage.vq2;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Triangulum {
    public ByteBuffer a;
    public String b = "GBK";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [float[], java.io.Serializable] */
    public final Serializable a(Object obj, int i, boolean z) {
        if (obj instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i, z));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(a(false, i, z));
        }
        if (obj instanceof Short) {
            return Short.valueOf(a((short) 0, i, z));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(a(0, i, z));
        }
        if (obj instanceof Long) {
            return Long.valueOf(a(0L, i, z));
        }
        if (obj instanceof Float) {
            return Float.valueOf(a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, z));
        }
        if (obj instanceof Double) {
            return Double.valueOf(a(0.0d, i, z));
        }
        if (obj instanceof String) {
            return b(i, z);
        }
        if (obj instanceof Map) {
            return a((Map) obj, i, z);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return new ArrayList();
            }
            Object[] objArrB = b(list.get(0), i, z);
            if (objArrB == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : objArrB) {
                arrayList.add(obj2);
            }
            return arrayList;
        }
        if (obj instanceof UrsaMinor) {
            return a((UrsaMinor) obj, i, z);
        }
        if (!obj.getClass().isArray()) {
            vq2.j("read object error: unsupport type.");
            return null;
        }
        if ((obj instanceof byte[]) || (obj instanceof Byte[])) {
            return a(i, z);
        }
        if (obj instanceof boolean[]) {
            if (a(i)) {
                ByteBuffer byteBuffer = this.a;
                byte b = byteBuffer.get();
                byte b2 = (byte) (b & 15);
                if (((b & 240) >> 4) == 15) {
                    byteBuffer.get();
                }
                if (b2 == 9) {
                    int iA = a(0, 0, true);
                    if (iA < 0) {
                        vq2.j(pv1.k(iA, "size invalid: "));
                        return null;
                    }
                    boolean[] zArr = new boolean[iA];
                    for (int i2 = 0; i2 < iA; i2++) {
                        zArr[i2] = a(zArr[0], 0, true);
                    }
                    return zArr;
                }
                if (b2 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return null;
        }
        if (obj instanceof short[]) {
            if (a(i)) {
                ByteBuffer byteBuffer2 = this.a;
                byte b3 = byteBuffer2.get();
                byte b4 = (byte) (b3 & 15);
                if (((b3 & 240) >> 4) == 15) {
                    byteBuffer2.get();
                }
                if (b4 == 9) {
                    int iA2 = a(0, 0, true);
                    if (iA2 < 0) {
                        vq2.j(pv1.k(iA2, "size invalid: "));
                        return null;
                    }
                    short[] sArr = new short[iA2];
                    for (int i3 = 0; i3 < iA2; i3++) {
                        sArr[i3] = a(sArr[0], 0, true);
                    }
                    return sArr;
                }
                if (b4 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return null;
        }
        if (obj instanceof int[]) {
            if (a(i)) {
                ByteBuffer byteBuffer3 = this.a;
                byte b5 = byteBuffer3.get();
                byte b6 = (byte) (b5 & 15);
                if (((b5 & 240) >> 4) == 15) {
                    byteBuffer3.get();
                }
                if (b6 == 9) {
                    int iA3 = a(0, 0, true);
                    if (iA3 < 0) {
                        vq2.j(pv1.k(iA3, "size invalid: "));
                        return null;
                    }
                    ?? r12 = new int[iA3];
                    for (int i4 = 0; i4 < iA3; i4++) {
                        r12[i4] = a((int) r12[0], 0, true);
                    }
                    return r12;
                }
                if (b6 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return null;
        }
        if (obj instanceof long[]) {
            if (a(i)) {
                ByteBuffer byteBuffer4 = this.a;
                byte b7 = byteBuffer4.get();
                byte b8 = (byte) (b7 & 15);
                if (((b7 & 240) >> 4) == 15) {
                    byteBuffer4.get();
                }
                if (b8 == 9) {
                    int iA4 = a(0, 0, true);
                    if (iA4 < 0) {
                        vq2.j(pv1.k(iA4, "size invalid: "));
                        return null;
                    }
                    ?? r13 = new long[iA4];
                    for (int i5 = 0; i5 < iA4; i5++) {
                        r13[i5] = a(r13[0], 0, true);
                    }
                    return r13;
                }
                if (b8 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return null;
        }
        if (obj instanceof float[]) {
            if (a(i)) {
                ByteBuffer byteBuffer5 = this.a;
                byte b9 = byteBuffer5.get();
                byte b10 = (byte) (b9 & 15);
                if (((b9 & 240) >> 4) == 15) {
                    byteBuffer5.get();
                }
                if (b10 == 9) {
                    int iA5 = a(0, 0, true);
                    if (iA5 < 0) {
                        vq2.j(pv1.k(iA5, "size invalid: "));
                        return null;
                    }
                    ?? r14 = new float[iA5];
                    for (int i6 = 0; i6 < iA5; i6++) {
                        r14[i6] = a((float) r14[0], 0, true);
                    }
                    return r14;
                }
                if (b10 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return null;
        }
        if (!(obj instanceof double[])) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length != 0) {
                return b(objArr[0], i, z);
            }
            vq2.j("unable to get type of key and value.");
            return null;
        }
        if (a(i)) {
            ByteBuffer byteBuffer6 = this.a;
            byte b11 = byteBuffer6.get();
            byte b12 = (byte) (b11 & 15);
            if (((b11 & 240) >> 4) == 15) {
                byteBuffer6.get();
            }
            if (b12 == 9) {
                int iA6 = a(0, 0, true);
                if (iA6 < 0) {
                    vq2.j(pv1.k(iA6, "size invalid: "));
                    return null;
                }
                ?? r15 = new double[iA6];
                for (int i7 = 0; i7 < iA6; i7++) {
                    r15[i7] = a((double) r15[0], 0, true);
                }
                return r15;
            }
            if (b12 != 11) {
                vq2.j("type mismatch.");
                return null;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return null;
        }
        return null;
    }

    public Triangulum(int i, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.a = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    public final String b(int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 != 6) {
                if (b2 != 7) {
                    if (b2 != 11) {
                        vq2.j("type mismatch.");
                        return null;
                    }
                } else {
                    int i2 = this.a.getInt();
                    if (i2 <= 104857600 && i2 >= 0) {
                        byte[] bArr = new byte[i2];
                        this.a.get(bArr);
                        try {
                            return new String(bArr, this.b);
                        } catch (UnsupportedEncodingException unused) {
                            return new String(bArr);
                        }
                    }
                    vq2.j(pv1.k(i2, "String too long: "));
                    return null;
                }
            } else {
                int i3 = this.a.get();
                if (i3 < 0) {
                    i3 += 256;
                }
                byte[] bArr2 = new byte[i3];
                this.a.get(bArr2);
                try {
                    return new String(bArr2, this.b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return null;
        }
        return null;
    }

    public Triangulum(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    public Triangulum() {
    }

    public final Object[] b(Object obj, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 9) {
                int iA = a(0, 0, true);
                if (iA >= 0) {
                    Object[] objArr = (Object[]) Array.newInstance(obj.getClass(), iA);
                    for (int i2 = 0; i2 < iA; i2++) {
                        objArr[i2] = a(obj, 0, true);
                    }
                    return objArr;
                }
                vq2.j(pv1.k(iA, "size invalid: "));
                return null;
            }
            if (b2 != 11) {
                vq2.j("type mismatch.");
                return null;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return null;
        }
        return null;
    }

    public final void a(byte b) {
        int i = 0;
        switch (b) {
            case 0:
                ByteBuffer byteBuffer = this.a;
                byteBuffer.position(byteBuffer.position() + 1);
                return;
            case 1:
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.position(byteBuffer2.position() + 2);
                return;
            case 2:
                ByteBuffer byteBuffer3 = this.a;
                byteBuffer3.position(byteBuffer3.position() + 4);
                return;
            case 3:
                ByteBuffer byteBuffer4 = this.a;
                byteBuffer4.position(byteBuffer4.position() + 8);
                return;
            case 4:
                ByteBuffer byteBuffer5 = this.a;
                byteBuffer5.position(byteBuffer5.position() + 4);
                return;
            case 5:
                ByteBuffer byteBuffer6 = this.a;
                byteBuffer6.position(byteBuffer6.position() + 8);
                return;
            case 6:
                int i2 = this.a.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                ByteBuffer byteBuffer7 = this.a;
                byteBuffer7.position(byteBuffer7.position() + i2);
                return;
            case 7:
                int i3 = this.a.getInt();
                ByteBuffer byteBuffer8 = this.a;
                byteBuffer8.position(byteBuffer8.position() + i3);
                return;
            case 8:
                int iA = a(0, 0, true);
                while (i < iA * 2) {
                    ByteBuffer byteBuffer9 = this.a;
                    byte b2 = byteBuffer9.get();
                    byte b3 = (byte) (b2 & 15);
                    if (((b2 & 240) >> 4) == 15) {
                        byteBuffer9.get();
                    }
                    a(b3);
                    i++;
                }
                return;
            case 9:
                int iA2 = a(0, 0, true);
                while (i < iA2) {
                    ByteBuffer byteBuffer10 = this.a;
                    byte b4 = byteBuffer10.get();
                    byte b5 = (byte) (b4 & 15);
                    if (((b4 & 240) >> 4) == 15) {
                        byteBuffer10.get();
                    }
                    a(b5);
                    i++;
                }
                return;
            case 10:
                break;
            case 11:
            case 12:
                return;
            case 13:
                ByteBuffer byteBuffer11 = this.a;
                byte b6 = byteBuffer11.get();
                byte b7 = (byte) (b6 & 15);
                if (((b6 & 240) >> 4) == 15) {
                    byteBuffer11.get();
                }
                if (b7 == 0) {
                    int iA3 = a(0, 0, true);
                    ByteBuffer byteBuffer12 = this.a;
                    byteBuffer12.position(byteBuffer12.position() + iA3);
                    return;
                }
                vq2.j(nj.i(b, b7, "skipField with invalid type, type value: ", ", "));
                return;
            default:
                vq2.j("invalid type.");
                return;
        }
        while (this.a.remaining() != 0) {
            ByteBuffer byteBuffer13 = this.a;
            byte b8 = byteBuffer13.get();
            byte b9 = (byte) (b8 & 15);
            if (((b8 & 240) >> 4) == 15) {
                byteBuffer13.get();
            }
            a(b9);
            if (b9 == 11) {
                return;
            }
        }
    }

    public final boolean a(boolean z, int i, boolean z2) {
        return a(z ? (byte) 1 : (byte) 0, i, z2) != 0;
    }

    public final byte a(byte b, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b2 = byteBuffer.get();
            byte b3 = (byte) (b2 & 15);
            if (((b2 & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b3 == 0) {
                return this.a.get();
            }
            if (b3 != 11) {
                if (b3 == 12) {
                    return (byte) 0;
                }
                vq2.j("type mismatch.");
                return (byte) 0;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return (byte) 0;
        }
        return b;
    }

    public final short a(short s, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 0) {
                return this.a.get();
            }
            if (b2 == 1) {
                return this.a.getShort();
            }
            if (b2 != 11) {
                if (b2 == 12) {
                    return (short) 0;
                }
                vq2.j("type mismatch.");
                return (short) 0;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return (short) 0;
        }
        return s;
    }

    public final int a(int i, int i2, boolean z) {
        if (a(i2)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 0) {
                return this.a.get();
            }
            if (b2 == 1) {
                return this.a.getShort();
            }
            if (b2 == 2) {
                return this.a.getInt();
            }
            if (b2 != 11) {
                if (b2 == 12) {
                    return 0;
                }
                vq2.j("type mismatch.");
                return 0;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return 0;
        }
        return i;
    }

    public final long a(long j, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 != 11) {
                if (b2 == 12) {
                    return 0L;
                }
                if (b2 == 0) {
                    return this.a.get();
                }
                if (b2 == 1) {
                    return this.a.getShort();
                }
                if (b2 == 2) {
                    return this.a.getInt();
                }
                if (b2 == 3) {
                    return this.a.getLong();
                }
                vq2.j("type mismatch.");
                return 0L;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return 0L;
        }
        return j;
    }

    public final float a(float f, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 4) {
                return this.a.getFloat();
            }
            if (b2 != 11) {
                if (b2 == 12) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                vq2.j("type mismatch.");
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return f;
    }

    public final double a(double d, int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 4) {
                return this.a.getFloat();
            }
            if (b2 == 5) {
                return this.a.getDouble();
            }
            if (b2 != 11) {
                if (b2 == 12) {
                    return 0.0d;
                }
                vq2.j("type mismatch.");
                return 0.0d;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return 0.0d;
        }
        return d;
    }

    public final HashMap a(Map map, int i, boolean z) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (a(i)) {
                ByteBuffer byteBuffer = this.a;
                byte b = byteBuffer.get();
                byte b2 = (byte) (b & 15);
                if (((b & 240) >> 4) == 15) {
                    byteBuffer.get();
                }
                if (b2 == 8) {
                    int iA = a(0, 0, true);
                    if (iA < 0) {
                        vq2.j(pv1.k(iA, "size invalid: "));
                        return null;
                    }
                    for (int i2 = 0; i2 < iA; i2++) {
                        map2.put(a(key, 0, true), a(value, 1, true));
                    }
                } else if (b2 != 11) {
                    vq2.j("type mismatch.");
                    return null;
                }
            } else if (z) {
                vq2.j("require field not exist.");
                return null;
            }
            return map2;
        }
        return new HashMap();
    }

    public final byte[] a(int i, boolean z) {
        if (a(i)) {
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 9) {
                int iA = a(0, 0, true);
                if (iA >= 0) {
                    byte[] bArr = new byte[iA];
                    for (int i2 = 0; i2 < iA; i2++) {
                        bArr[i2] = a(bArr[0], 0, true);
                    }
                    return bArr;
                }
                vq2.j(pv1.k(iA, "size invalid: "));
                return null;
            }
            if (b2 != 11) {
                if (b2 == 13) {
                    ByteBuffer byteBuffer2 = this.a;
                    byte b3 = byteBuffer2.get();
                    byte b4 = (byte) (b3 & 15);
                    if (((b3 & 240) >> 4) == 15) {
                        byteBuffer2.get();
                    }
                    if (b4 == 0) {
                        int iA2 = a(0, 0, true);
                        if (iA2 >= 0) {
                            byte[] bArr2 = new byte[iA2];
                            this.a.get(bArr2);
                            return bArr2;
                        }
                        StringBuilder sbT = jc1.t("invalid size, tag: ", i, ", type: ", b2, ", ");
                        sbT.append((int) b4);
                        sbT.append(", size: ");
                        sbT.append(iA2);
                        throw new Solar(sbT.toString());
                    }
                    StringBuilder sbT2 = jc1.t("type mismatch, tag: ", i, ", type: ", b2, ", ");
                    sbT2.append((int) b4);
                    throw new Solar(sbT2.toString());
                }
                vq2.j("type mismatch.");
                return null;
            }
        } else if (z) {
            vq2.j("require field not exist.");
            return null;
        }
        return null;
    }

    public final UrsaMinor a(UrsaMinor ursaMinor, int i, boolean z) {
        if (!a(i)) {
            if (!z) {
                return null;
            }
            vq2.j("require field not exist.");
            return null;
        }
        try {
            UrsaMinor ursaMinor2 = (UrsaMinor) ursaMinor.getClass().newInstance();
            ByteBuffer byteBuffer = this.a;
            byte b = byteBuffer.get();
            byte b2 = (byte) (b & 15);
            if (((b & 240) >> 4) == 15) {
                byteBuffer.get();
            }
            if (b2 == 10) {
                ursaMinor2.a(this);
                while (this.a.remaining() != 0) {
                    ByteBuffer byteBuffer2 = this.a;
                    byte b3 = byteBuffer2.get();
                    byte b4 = (byte) (b3 & 15);
                    if (((b3 & 240) >> 4) == 15) {
                        byteBuffer2.get();
                    }
                    a(b4);
                    if (b4 == 11) {
                        break;
                    }
                }
                return ursaMinor2;
            }
            vq2.j("type mismatch.");
            return null;
        } catch (Exception e) {
            vq2.j(e.getMessage());
            return null;
        }
    }

    public final boolean a(int i) {
        int i2;
        while (true) {
            try {
                ByteBuffer byteBufferDuplicate = this.a.duplicate();
                byte b = byteBufferDuplicate.get();
                byte b2 = (byte) (b & 15);
                int i3 = (b & 240) >> 4;
                if (i3 == 15) {
                    i3 = byteBufferDuplicate.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                if (b2 == 11 || i < i3) {
                    break;
                    break;
                }
                if (i == i3) {
                    return true;
                }
                ByteBuffer byteBuffer = this.a;
                byteBuffer.position(byteBuffer.position() + i2);
                a(b2);
            } catch (Solar | BufferUnderflowException unused) {
            }
        }
        return false;
    }
}
