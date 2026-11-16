package com.moloco.sdk.internal;

import android.net.Uri;
import defpackage.kk2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements q0 {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j a;

    public r0(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j jVar) {
        jVar.getClass();
        this.a = jVar;
    }

    public final boolean a(String str, long j, e0 e0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar;
        str.getClass();
        if (e0Var != null) {
            try {
                cVar = e0Var.b;
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            String strA = cVar.a();
            strA.getClass();
            str = kk2.I(str, "[ERROR_CODE]", strA, false);
        }
        Uri uriBuild = Uri.parse(kk2.I(str, "[HAPPENED_AT_TS]", String.valueOf(j), false)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j jVar = this.a;
        String string = uriBuild.toString();
        string.getClass();
        ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) jVar).a(string);
        return true;
    }
}
