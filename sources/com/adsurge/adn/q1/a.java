package com.adsurge.adn.q1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.LruCache;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.I0.h;
import com.adsurge.adn.Y0.i;
import java.io.File;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final LruCache a = new LruCache(5);

    /* JADX INFO: renamed from: com.adsurge.adn.q1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0132a implements Runnable {
        public final /* synthetic */ Bitmap a;
        public final /* synthetic */ float b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ b e;

        /* JADX INFO: renamed from: com.adsurge.adn.q1.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class RunnableC0133a implements Runnable {
            public final /* synthetic */ Bitmap a;

            public RunnableC0133a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0132a.this.e.a(new f.a().a(this.a).b(false).a());
            }
        }

        public RunnableC0132a(Bitmap bitmap, float f, String str, boolean z, b bVar) {
            this.a = bitmap;
            this.b = f;
            this.c = str;
            this.d = z;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Bitmap bitmapA = a.a(this.a, this.b);
            SystemClock.elapsedRealtime();
            i iVar = new i(2130002);
            iVar.b(SystemClock.elapsedRealtime() - jElapsedRealtime);
            com.adsurge.adn.w1.b.a(iVar);
            if (this.d) {
                a.a.put(this.c, new SoftReference(bitmapA));
            }
            g.a(new RunnableC0133a(bitmapA));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(f fVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ab A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0 A[DONT_GENERATE] */
    public static Bitmap a(Bitmap bitmap, float f) {
        Throwable th;
        BaseObj baseObj;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateFromBitmap2;
        Matrix matrix = new Matrix();
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float fMin = Math.min(iMin > 0 ? 150.0f / iMin : 1.0f, 0.25f);
        matrix.preScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCopy.getWidth(), bitmapCopy.getHeight(), config);
        bitmap.getWidth();
        bitmap.getHeight();
        bitmapCreateBitmap2.getWidth();
        bitmapCreateBitmap2.getHeight();
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(com.adsurge.adn.s1.a.b().a());
            try {
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
                try {
                    allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
                        scriptIntrinsicBlurCreate.setRadius(f);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                        if (renderScriptCreate != null) {
                            renderScriptCreate.destroy();
                        }
                        bitmapCreateBitmap.recycle();
                        bitmapCopy.recycle();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateFromBitmap2.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                        return bitmapCreateBitmap2;
                    } catch (Throwable th2) {
                        th = th2;
                        baseObj = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        try {
                            th.getMessage();
                            return bitmapCreateBitmap2;
                        } finally {
                            if (renderScript != null) {
                                renderScript.destroy();
                            }
                            bitmapCreateBitmap.recycle();
                            bitmapCopy.recycle();
                            if (allocationCreateFromBitmap != null) {
                                allocationCreateFromBitmap.destroy();
                            }
                            if (allocationCreateFromBitmap2 != null) {
                                allocationCreateFromBitmap2.destroy();
                            }
                            if (baseObj != null) {
                                baseObj.destroy();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocationCreateFromBitmap2 = null;
                    renderScript = renderScriptCreate;
                    baseObj = allocationCreateFromBitmap2;
                    th.getMessage();
                    return bitmapCreateBitmap2;
                }
            } catch (Throwable th4) {
                th = th4;
                allocationCreateFromBitmap = null;
                allocationCreateFromBitmap2 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            baseObj = null;
            allocationCreateFromBitmap = null;
            allocationCreateFromBitmap2 = null;
        }
    }

    public static void a(boolean z, String str, Bitmap bitmap, float f, b bVar) {
        SoftReference softReference;
        Bitmap bitmap2;
        if (bitmap == null) {
            return;
        }
        if (z && (softReference = (SoftReference) a.get(str)) != null && (bitmap2 = (Bitmap) softReference.get()) != null) {
            bVar.a(new f.a().a(bitmap2).b(true).a());
        } else {
            com.adsurge.adn.x1.g.b.submit(new RunnableC0132a(bitmap, f, str, z, bVar));
        }
    }

    public static void a(Object obj, Bitmap bitmap, float f, b bVar) {
        if (!(obj instanceof String) && !(obj instanceof File)) {
            a(false, null, bitmap, f, bVar);
        } else {
            a(true, a(obj, f), bitmap, f, bVar);
        }
    }

    public static String a(Object obj, float f) {
        String strA;
        if (obj instanceof String) {
            strA = h.a((String) obj);
        } else if (obj instanceof File) {
            strA = h.a(((File) obj).getAbsolutePath());
        } else {
            strA = "";
        }
        return strA + "_" + f;
    }
}
