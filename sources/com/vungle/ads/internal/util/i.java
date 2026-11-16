package com.vungle.ads.internal.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import defpackage.az2;
import defpackage.dt1;
import defpackage.eu;
import defpackage.pd1;
import defpackage.rc1;
import defpackage.vv;
import defpackage.wr0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends rc1 implements wr0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ j b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WebView webView, j jVar, int i) {
        super(1);
        this.a = webView;
        this.b = jVar;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_GENERATE] */
    public static final void a(j jVar, Bitmap bitmap, int i) {
        jVar.getClass();
        try {
            dt1 dt1VarA = j.a(bitmap, i);
            int iIntValue = ((Number) dt1VarA.a).intValue();
            String str = (String) dt1VarA.b;
            zr0 zr0Var = jVar.a;
            if (zr0Var != null) {
                zr0Var.invoke(Integer.valueOf(iIntValue), str);
            }
            if (bitmap != null) {
            }
        } catch (Throwable th) {
            try {
                boolean z = u.a;
                t.a("BlackScreenDetector", "Black screen detection failed", th);
                zr0 zr0Var2 = jVar.a;
                if (zr0Var2 != null) {
                    zr0Var2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                jVar.a = null;
            }
        }
    }

    @Override // defpackage.wr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Bitmap) obj);
        return az2.a;
    }

    public final void a(Bitmap bitmap) {
        Context context = this.a.getContext();
        context.getClass();
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) eu.v(pd1.a, new h(context)).getValue())).d().execute(new vv(this.b, bitmap, this.c, 10));
    }
}
