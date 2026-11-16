package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import android.webkit.WebView;
import defpackage.dt1;
import defpackage.eu;
import defpackage.f21;
import defpackage.gd1;
import defpackage.n30;
import defpackage.pd1;
import defpackage.vk3;
import defpackage.wr0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    public volatile zr0 a;

    public final void a(WebView webView, int i, com.vungle.ads.internal.ui.q qVar) {
        Activity activity;
        Window window;
        qVar.getClass();
        this.a = qVar;
        if (webView == null) {
            boolean z = u.a;
            t.c("BlackScreenDetector", "Black screen detection failed: View not available");
            zr0 zr0Var = this.a;
            if (zr0Var != null) {
                zr0Var.invoke(-1, "View not available");
            }
            this.a = null;
            return;
        }
        i iVar = new i(webView, this, i);
        if (this.a == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = webView.getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            if (window == null) {
                boolean z2 = u.a;
                t.c("BlackScreenDetector", "Activity/Window not found for PixelCopy");
                iVar.invoke(null);
                return;
            } else {
                Context context2 = webView.getContext();
                context2.getClass();
                gd1 gd1VarV = eu.v(pd1.a, new f(context2));
                Handler handler = y.a;
                y.a(new g(webView, gd1VarV, this, window, iVar));
                return;
            }
        }
        Handler handler2 = y.a;
        y.a(new e(webView, iVar));
    }

    public static final /* synthetic */ void a(j jVar, Window window, Rect rect, Bitmap bitmap, wr0 wr0Var) {
        jVar.getClass();
        a(window, rect, bitmap, wr0Var);
    }

    public static final com.vungle.ads.internal.executor.a a(gd1 gd1Var) {
        return (com.vungle.ads.internal.executor.a) gd1Var.getValue();
    }

    public static void a(Window window, Rect rect, Bitmap bitmap, wr0 wr0Var) {
        try {
            PixelCopy.request(window, rect, bitmap, new f21(2, wr0Var, bitmap), new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "PixelCopy request failed", th);
            bitmap.recycle();
            wr0Var.invoke(null);
        }
    }

    public static final void a(wr0 wr0Var, Bitmap bitmap, int i) {
        wr0Var.getClass();
        bitmap.getClass();
        if (i == 0) {
            wr0Var.invoke(bitmap);
            return;
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "PixelCopy failed: " + i);
        bitmap.recycle();
        wr0Var.invoke(null);
    }

    public static dt1 a(Bitmap bitmap, int i) {
        if (bitmap != null) {
            int iA = a(bitmap, 0.1d, i, 0.5d);
            return new dt1(Integer.valueOf(iA), iA == -1 ? "Internal calculation error" : "");
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "Black screen detection failed: Snapshot capture failure");
        return new dt1(-1, "Snapshot capture failure");
    }

    public static int a(Bitmap bitmap, double d, int i, double d2) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = (int) (((double) width) * d);
        int i5 = (int) (((double) height) * d);
        int i6 = width - (i4 * 2);
        int i7 = height - (i5 * 2);
        if (i6 <= 0 || i7 <= 0) {
            return -1;
        }
        long j = ((long) i6) * ((long) i7);
        if (j > 2147483647L) {
            if (d >= d2) {
                return -1;
            }
            return a(bitmap, d * 2.0d, i, d2);
        }
        int i8 = (int) j;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, i6, i4, i5, i6, i7);
        int i9 = i8 - 1;
        if (i > 0) {
            int iN = vk3.n(0, i9, i);
            if (iN >= 0) {
                int i10 = 0;
                i2 = 0;
                i3 = 0;
                while (true) {
                    i2++;
                    int i11 = iArr[i10];
                    int i12 = (i11 >> 24) & 255;
                    int i13 = (i11 >> 16) & 255;
                    int i14 = (i11 >> 8) & 255;
                    int i15 = i11 & 255;
                    if (i12 > 0 && i13 < 10 && i14 < 10 && i15 < 10) {
                        i3++;
                    }
                    if (i10 == iN) {
                        break;
                    }
                    i10 += i;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (i2 > 0) {
                return (int) ((((long) i3) * 100) / ((long) i2));
            }
            return 0;
        }
        defpackage.d.r(n30.k("Step must be positive, was: ", i, '.'));
        return 0;
    }
}
