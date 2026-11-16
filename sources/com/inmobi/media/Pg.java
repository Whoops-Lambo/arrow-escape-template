package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Pg implements Transformation {
    public final Bitmap.Config a;

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.a + ")";
    }

    public Pg(Bitmap.Config config) {
        config.getClass();
        this.a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap bitmapCopy = bitmap.copy(this.a, false);
        bitmap.recycle();
        bitmapCopy.getClass();
        return bitmapCopy;
    }
}
