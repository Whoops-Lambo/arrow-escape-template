package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.vungle.ads.internal.util.g;
import defpackage.az2;
import defpackage.gd1;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends rc1 implements sr0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ gd1 b;
    public final /* synthetic */ j c;
    public final /* synthetic */ Window d;
    public final /* synthetic */ wr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WebView webView, gd1 gd1Var, j jVar, Window window, i iVar) {
        super(0);
        this.a = webView;
        this.b = gd1Var;
        this.c = jVar;
        this.d = window;
        this.e = iVar;
    }

    public final void a() {
        final int width = this.a.getWidth();
        final int height = this.a.getHeight();
        int[] iArr = new int[2];
        this.a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final Rect rect = new Rect(i, i2, i + width, i2 + height);
        com.vungle.ads.internal.executor.j jVar = ((com.vungle.ads.internal.executor.d) j.a(this.b)).c;
        final j jVar2 = this.c;
        final Window window = this.d;
        final wr0 wr0Var = this.e;
        jVar.execute(new Runnable() { // from class: id3
            @Override // java.lang.Runnable
            public final void run() {
                g.a(width, height, jVar2, window, rect, wr0Var);
            }
        });
    }

    @Override // defpackage.sr0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return az2.a;
    }

    public static final void a(int i, int i2, j jVar, Window window, Rect rect, wr0 wr0Var) {
        Bitmap bitmapCreateBitmap;
        jVar.getClass();
        rect.getClass();
        wr0Var.getClass();
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            try {
                j.a(jVar, window, rect, bitmapCreateBitmap, wr0Var);
            } catch (Throwable th) {
                th = th;
                boolean z = u.a;
                t.a("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                wr0Var.invoke(null);
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateBitmap = null;
        }
    }
}
