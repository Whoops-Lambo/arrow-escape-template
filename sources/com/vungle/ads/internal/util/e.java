package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends rc1 implements sr0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ wr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.a = webView;
        this.b = iVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Bitmap.Config.ARGB_8888);
            this.a.draw(new Canvas(bitmapCreateBitmap));
            this.b.invoke(bitmapCreateBitmap);
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.b.invoke(null);
        }
        return az2.a;
    }
}
