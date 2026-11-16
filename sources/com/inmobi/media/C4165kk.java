package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4165kk extends Q2 {
    public final WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165kk(View view, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        view.getClass();
        adQualityConfig.getClass();
        this.b = new WeakReference(view);
    }

    @Override // com.inmobi.media.O0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View view = (View) this.b.get();
        if (view != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
            System.currentTimeMillis();
            return a(bitmapCreateBitmap);
        }
        System.currentTimeMillis();
        return null;
    }
}
