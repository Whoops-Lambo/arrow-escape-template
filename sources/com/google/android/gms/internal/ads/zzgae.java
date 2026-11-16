package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.tj4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
public final class zzgae {
    public static zzazk a(Context context, String str, String str2) {
        zzazk zzazkVar;
        try {
            zzazkVar = (zzazk) new tj4(context, str, str2).d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzazkVar = null;
        }
        return zzazkVar == null ? tj4.b() : zzazkVar;
    }
}
