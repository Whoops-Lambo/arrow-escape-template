package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzrh implements zzrl {
    @Override // com.google.android.gms.internal.measurement.zzrl
    public final boolean a(zzrg zzrgVar) {
        zzrgVar.getClass();
        String str = "false";
        try {
            str = (String) zzrm.a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return str.equals("true");
    }
}
