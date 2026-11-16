package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import defpackage.az2;
import defpackage.dy;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgds implements Serializer {
    public static final zzgds a = new zzgds();
    public static final zzgdp b;

    static {
        zzgdp zzgdpVarH = zzgdp.H();
        zzgdpVarH.getClass();
        b = zzgdpVarH;
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, dy dyVar) {
        try {
            return zzgdp.G((FileInputStream) inputStream);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, dy dyVar) {
        ((zzgdp) obj).d(outputStream);
        return az2.a;
    }

    private zzgds() {
    }
}
