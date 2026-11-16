package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import defpackage.jc1;
import defpackage.lm3;
import defpackage.pm3;
import defpackage.rl3;
import defpackage.rm3;
import defpackage.ro3;
import defpackage.to3;
import defpackage.vq2;
import defpackage.zo3;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzacb<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafc {
    protected transient int zza = 0;

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzacr b() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int i = zzaduVar.i();
            lm3 lm3Var = zzacr.b;
            byte[] bArr = new byte[i];
            boolean z = zzada.b;
            pm3 pm3Var = new pm3(bArr, i);
            zzaduVar.j(pm3Var);
            pm3Var.e();
            return new lm3(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            vq2.n(jc1.o("Serializing ", name, new StringBuilder(name.length() + 72), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] d() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int i = zzaduVar.i();
            byte[] bArr = new byte[i];
            boolean z = zzada.b;
            pm3 pm3Var = new pm3(bArr, i);
            zzaduVar.j(pm3Var);
            pm3Var.e();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            vq2.n(jc1.o("Serializing ", name, new StringBuilder(name.length() + 72), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int h(zo3 zo3Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void a(OutputStream outputStream) {
        zzadu zzaduVar = (zzadu) this;
        int i = zzaduVar.i();
        boolean z = zzada.b;
        if (i > 4096) {
            i = 4096;
        }
        rm3 rm3Var = new rm3(outputStream, i);
        zzaduVar.j(rm3Var);
        if (rm3Var.e > 0) {
            rm3Var.G();
        }
    }

    public static void k(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzaen) {
            List listZza = ((zzaen) iterable).zza();
            zzaen zzaenVar = (zzaen) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzaenVar.size() - size;
                    String strK = rl3.k(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = zzaenVar.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            zzaenVar.remove(size3);
                        } else {
                            defpackage.d.w(strK);
                            return;
                        }
                    }
                } else if (obj instanceof zzacr) {
                    zzaenVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.r(0, bArr.length, bArr);
                    zzaenVar.zzb();
                } else {
                    zzaenVar.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof ro3)) {
            if (iterable instanceof Collection) {
                int size4 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size4);
                } else if (list instanceof to3) {
                    to3 to3Var = (to3) list;
                    int i = to3Var.c + size4;
                    int length = to3Var.b.length;
                    if (i > length) {
                        if (length != 0) {
                            while (length < i) {
                                length = rl3.f(length, 3, 2, 1, 10);
                            }
                            to3Var.b = Arrays.copyOf(to3Var.b, length);
                        } else {
                            to3Var.b = new Object[Math.max(i, 10)];
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
                        zzaca.d(size5, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj3 : iterable) {
                if (obj3 != null) {
                    list.add(obj3);
                } else {
                    zzaca.d(size5, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }
}
