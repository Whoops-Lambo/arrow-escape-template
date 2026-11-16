package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.dk2;
import defpackage.kk2;
import defpackage.th1;
import defpackage.vh1;
import defpackage.w32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class s0 {
    public static final w32 a = new w32("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", 0);
    public static final w32 b = new w32("<!DOCTYPE\\b[^>]*>|<!--[\\s\\S]*?-->|<!\\[CDATA\\[[\\s\\S]*?]]>|</?[a-z][a-z0-9-]*\\b[^>]*>", 0);

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n a(String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar;
        String str2;
        str.getClass();
        vh1 vh1VarB = w32.b(a, str);
        if (vh1VarB != null && (str2 = (String) ((th1) vh1VarB.a()).get(1)) != null) {
            if (kk2.L(str2, "video", true)) {
                nVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.d;
            } else if (str2.equalsIgnoreCase("mraid")) {
                nVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.e;
            } else {
                boolean zEqualsIgnoreCase = str2.equalsIgnoreCase("static");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.f;
                if (!zEqualsIgnoreCase) {
                    com.moloco.sdk.acm.recorder.b.Companion.getClass();
                    com.moloco.sdk.acm.recorder.c cVarB = com.moloco.sdk.acm.recorder.a.b();
                    com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("unknown_creative_type");
                    eVar.a("template_name", str2);
                    cVarB.a(eVar);
                }
                nVar = nVar2;
            }
        } else {
            nVar = null;
        }
        if (nVar == null) {
            if (dk2.O(str, "<VAST", true)) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.a;
            }
            if (dk2.O(str, "mraid.js", true)) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.b;
            }
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n.c;
        }
        return nVar;
    }
}
