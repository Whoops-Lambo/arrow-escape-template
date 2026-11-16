package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ba0;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static final m a = new m();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(f fVar, float f, fy fyVar) throws Throwable {
        k kVar;
        Bitmap bitmap;
        Throwable th;
        if (fyVar instanceof k) {
            kVar = (k) fyVar;
            int i = kVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.u = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, fyVar);
            }
        } else {
            kVar = new k(this, fyVar);
        }
        Object obj = kVar.s;
        int i2 = kVar.u;
        if (i2 == 0) {
            wz2.a0(obj);
            int width = fVar.getWidth();
            int height = fVar.getHeight();
            if (width <= 0 || height <= 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewRenderingChecker", "Skipping rendering check: WebView has zero size (" + width + 'x' + height + ')', null, false, 12, null);
                return Boolean.FALSE;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            try {
                fVar.draw(new Canvas(bitmapCreateBitmap));
                ba0 ba0Var = xc0.a;
                l lVar = new l(bitmapCreateBitmap, f, null);
                kVar.r = bitmapCreateBitmap;
                kVar.u = 1;
                Object objE = tb5.E(ba0Var, lVar, kVar);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
                bitmap = bitmapCreateBitmap;
                obj = objE;
            } catch (Throwable th2) {
                bitmap = bitmapCreateBitmap;
                th = th2;
                bitmap.recycle();
                throw th;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap = kVar.r;
            try {
                wz2.a0(obj);
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                throw th;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        bitmap.recycle();
        return bool;
    }
}
