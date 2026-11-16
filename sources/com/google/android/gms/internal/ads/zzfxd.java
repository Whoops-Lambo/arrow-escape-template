package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxd {
    public static void a(Context context, String str, zzfwz zzfwzVar) {
        zzfxh zzfxhVarA;
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            zzfxb.a(context).getClass();
            zzfxi zzfxiVar = (zzfxi) zzfxb.c.get(str);
            if ((zzfxiVar != null ? zzfxiVar.b() : false) && (zzfxhVarA = zzfxc.a(context, str)) != null) {
                zzfxhVarA.a(zzfwzVar);
            }
        } catch (Exception e) {
            zzfyu.a("Error during attestation with mechanism: ".concat(str), e);
        }
    }
}
