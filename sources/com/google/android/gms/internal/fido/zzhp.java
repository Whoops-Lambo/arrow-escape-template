package com.google.android.gms.internal.fido;

import defpackage.os2;
import defpackage.pv1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhp implements Comparable {
    public int a() {
        return 0;
    }

    public abstract int zza();

    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static void d(String str) {
        new zzhn(str);
    }

    public static zzhp e(byte... bArr) {
        bArr.getClass();
        zzhs zzhsVar = new zzhs(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return os2.J(zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public final zzhp b(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(pv1.o("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
