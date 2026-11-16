package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.g63;
import defpackage.nc3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            String strA = b.a(contextD).a("b", "");
            String strA2 = b.a(contextD).a("c", "");
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.foundation.same.a.V = strA;
            }
            if (TextUtils.isEmpty(strA2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.g = strA2;
        } catch (Throwable th) {
            q0.b("MBIdsMergeStoreUtil", th.getMessage());
        }
    }

    public void a(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g63(str, str2, 2));
    }

    public void a() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new nc3(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.a(contextD).b("b", str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            b.a(contextD).b("c", str2);
        } catch (Throwable th) {
            q0.b("MBIdsMergeStoreUtil", th.getMessage());
        }
    }
}
