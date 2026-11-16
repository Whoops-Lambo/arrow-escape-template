package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import defpackage.az2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements zr0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(WebView webView, Modifier modifier, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t tVar, int i) {
        this.d = webView;
        this.b = modifier;
        this.e = tVar;
        this.c = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return k.a((String) obj4, (ContentScale) obj3, this.b, this.c, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int i2 = this.c | 1;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d.a((WebView) obj4, this.b, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t) obj3, (Composer) obj, i2);
                return az2.a;
        }
    }

    public /* synthetic */ l0(String str, ContentScale contentScale, Modifier modifier, int i) {
        this.d = str;
        this.e = contentScale;
        this.b = modifier;
        this.c = i;
    }
}
