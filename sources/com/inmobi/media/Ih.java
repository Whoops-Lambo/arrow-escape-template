package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.f21;
import defpackage.h32;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ih extends Q2 {
    public final Window b;
    public final AtomicBoolean c;

    public static final void a(h32 h32Var, Ih ih, int i) {
        if (i == 0) {
            h32Var.a = true;
        }
        boolean z = h32Var.a;
        ih.c.set(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ih(Window window, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        window.getClass();
        adQualityConfig.getClass();
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.O0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Rect rect = new Rect(0, 0, width, height);
        h32 h32Var = new h32();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, bitmapCreateBitmap, new f21(0, h32Var, this), new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.b.getDecorView().setLayerType(layerType, null);
        if (!h32Var.a) {
            return null;
        }
        return a(bitmapCreateBitmap);
    }
}
