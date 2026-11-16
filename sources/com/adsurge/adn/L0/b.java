package com.adsurge.adn.L0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Drawable implements Animatable, com.adsurge.adn.P0.b.j {
    public static final String k = "b";
    public static final boolean l;
    public static final boolean m;
    public final Paint a;
    public final com.adsurge.adn.P0.b b;
    public final DrawFilter c;
    public final Matrix d;
    public Bitmap e;
    public final Handler f;
    public final Runnable g;
    public boolean h;
    public final Set i;
    public boolean j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.invalidateSelf();
        }
    }

    public abstract com.adsurge.adn.P0.b a(com.adsurge.adn.S0.b bVar, com.adsurge.adn.P0.b.j jVar);

    @Override // com.adsurge.adn.P0.b.j
    public void b() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public com.adsurge.adn.P0.b c() {
        return this.b;
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        int i = 0;
        boolean z = false;
        for (WeakReference weakReference : new HashSet(this.i)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.i.remove((WeakReference) obj);
        }
        if (z) {
            return;
        }
        this.i.add(new WeakReference(callback));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.e;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.c);
        canvas.drawBitmap(this.e, this.d, this.a);
    }

    public final void e() {
        this.b.a(this);
        boolean z = this.h;
        com.adsurge.adn.P0.b bVar = this.b;
        if (z) {
            bVar.n();
        } else {
            if (bVar.k()) {
                return;
            }
            this.b.n();
        }
    }

    public final void f() {
        this.b.b(this);
        boolean z = this.h;
        com.adsurge.adn.P0.b bVar = this.b;
        if (z) {
            bVar.p();
        } else {
            bVar.q();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.j) {
            return -1;
        }
        try {
            return this.b.c().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.j) {
            return -1;
        }
        try {
            return this.b.c().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b.k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.b.k()) {
            this.b.p();
        }
        this.b.m();
        e();
    }

    static {
        boolean z;
        boolean z2 = true;
        if ((com.adsurge.adn.F0.b.b().a("apgreo", 7) & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        l = z;
        if ((com.adsurge.adn.F0.b.b().a("apgreo", 7) & 4) == 0) {
            z2 = false;
        }
        m = z2;
    }

    public b(com.adsurge.adn.S0.b bVar) {
        Paint paint = new Paint();
        this.a = paint;
        this.c = new PaintFlagsDrawFilter(0, 3);
        this.d = new Matrix();
        this.f = new Handler(Looper.getMainLooper());
        this.g = new a();
        this.h = true;
        this.i = new HashSet();
        this.j = false;
        paint.setAntiAlias(true);
        this.b = a(bVar, this);
    }

    @Override // com.adsurge.adn.P0.b.j
    public void a(ByteBuffer byteBuffer) {
        if (!isRunning()) {
            return;
        }
        Bitmap bitmap = this.e;
        if (bitmap == null || bitmap.isRecycled()) {
            try {
                this.e = Bitmap.createBitmap(this.b.c().width() / this.b.g(), this.b.c().height() / this.b.g(), Bitmap.Config.ARGB_8888);
            } catch (IllegalArgumentException e) {
                com.adsurge.adn.L0.a.a(11, e);
                if (m) {
                    f();
                    return;
                }
                throw e;
            } catch (OutOfMemoryError e2) {
                com.adsurge.adn.L0.a.a(4, e2);
                throw e2;
            }
        }
        byteBuffer.rewind();
        if (byteBuffer.remaining() < this.e.getByteCount()) {
            Log.e(k, "onRender:Buffer not large enough for pixels");
            return;
        }
        try {
            this.e.copyPixelsFromBuffer(byteBuffer);
            this.f.post(this.g);
        } catch (OutOfMemoryError e3) {
            com.adsurge.adn.L0.a.a(5, e3);
            throw e3;
        } catch (RuntimeException e4) {
            com.adsurge.adn.L0.a.a(6, e4);
            if (l) {
                f();
                return;
            }
            throw e4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.i).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int iG = this.b.g();
        int iC = this.b.c(getBounds().width(), getBounds().height());
        float f = iC;
        this.d.setScale(((getBounds().width() * 1.0f) * f) / this.b.c().width(), ((getBounds().height() * 1.0f) * f) / this.b.c().height());
        if (iC != iG) {
            try {
                this.e = Bitmap.createBitmap(this.b.c().width() / iC, this.b.c().height() / iC, Bitmap.Config.ARGB_8888);
            } catch (IllegalArgumentException e) {
                com.adsurge.adn.L0.a.a(10, e);
                if (!m) {
                    throw e;
                }
            } catch (OutOfMemoryError e2) {
                com.adsurge.adn.L0.a.a(3, e2);
                throw e2;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        d();
        if (this.h) {
            if (z) {
                if (!isRunning()) {
                    e();
                }
            } else if (isRunning()) {
                f();
            }
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        f();
    }

    @Override // com.adsurge.adn.P0.b.j
    public void a() {
    }

    public void a(int i) {
        this.b.b(i);
    }
}
