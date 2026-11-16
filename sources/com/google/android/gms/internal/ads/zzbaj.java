package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import defpackage.kb3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbaj implements PackageManager$OnChecksumsReadyListener {
    public final zzhfd a = zzhfd.s();

    public final void onChecksumsReady(List list) {
        zzhfd zzhfdVar = this.a;
        if (list == null) {
            zzhfdVar.e("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumD = kb3.d(list.get(i));
                if (apkChecksumD.getType() == 8) {
                    zzhbw zzhbwVarJ = zzhbw.c.j();
                    byte[] value = apkChecksumD.getValue();
                    zzhfdVar.e(zzhbwVarJ.f(value.length, value));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        zzhfdVar.e("");
    }
}
