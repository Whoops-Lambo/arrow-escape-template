package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziff;
import com.google.android.gms.internal.ads.zzifg;
import defpackage.ez4;
import defpackage.gz4;
import defpackage.jy4;
import defpackage.jz4;
import defpackage.py4;
import defpackage.q63;
import defpackage.qy4;
import defpackage.rl3;
import defpackage.vq2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzifg<MessageType extends zzifg<MessageType, BuilderType>, BuilderType extends zziff<MessageType, BuilderType>> implements zziii {
    protected transient int zzq = 0;

    @Override // com.google.android.gms.internal.ads.zziii
    public final zzifx e() {
        try {
            int iK = ((zzihc) this).k(null);
            jy4 jy4Var = zzifx.b;
            byte[] bArr = new byte[iK];
            py4 py4Var = new py4(bArr, iK);
            ((zzihc) this).f(py4Var);
            py4Var.b();
            return new jy4(bArr);
        } catch (IOException e) {
            vq2.n(m("ByteString"), e);
            return null;
        }
    }

    public final byte[] h() {
        try {
            int iK = ((zzihc) this).k(null);
            byte[] bArr = new byte[iK];
            py4 py4Var = new py4(bArr, iK);
            ((zzihc) this).f(py4Var);
            py4Var.b();
            return bArr;
        } catch (IOException e) {
            vq2.n(m("byte array"), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziii
    public final void d(OutputStream outputStream) {
        zzihc zzihcVar = (zzihc) this;
        int iK = zzihcVar.k(null);
        if (iK > 4096) {
            iK = 4096;
        }
        qy4 qy4Var = new qy4(outputStream, iK);
        zzihcVar.f(qy4Var);
        if (qy4Var.d > 0) {
            qy4Var.D();
        }
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public static void l(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzihx) {
            List listZza = ((zzihx) iterable).zza();
            zzihx zzihxVar = (zzihx) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzihxVar.size() - size;
                    String strK = rl3.k(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = zzihxVar.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            zzihxVar.remove(size3);
                        } else {
                            defpackage.d.w(strK);
                            return;
                        }
                    }
                } else if (obj instanceof zzifx) {
                    zzihxVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzifx.H(0, bArr.length, bArr);
                    zzihxVar.zzb();
                } else {
                    zzihxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof ez4) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof gz4) {
                gz4 gz4Var = (gz4) list;
                int i = gz4Var.c + size4;
                int length = gz4Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = rl3.f(length, 3, 2, 1, 10);
                        }
                        gz4Var.b = Arrays.copyOf(gz4Var.b, length);
                    } else {
                        gz4Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size6 = list2.size();
            for (int i2 = 0; i2 < size6; i2++) {
                Object obj2 = list2.get(i2);
                if (obj2 != null) {
                    list.add(obj2);
                } else {
                    zziff.k(size5, list);
                    throw null;
                }
            }
            return;
        }
        for (Object obj3 : iterable) {
            if (obj3 != null) {
                list.add(obj3);
            } else {
                zziff.k(size5, list);
                throw null;
            }
        }
    }

    public int k(jz4 jz4Var) {
        return j();
    }

    public final String m(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        q63.y(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
