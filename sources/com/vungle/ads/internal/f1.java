package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f1 extends rc1 implements wr0 {
    public final /* synthetic */ ImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ImageView imageView) {
        super(1);
        this.a = imageView;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        ImageView imageView = this.a;
        if (imageView != null) {
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new e1(imageView, bitmap));
        }
        return az2.a;
    }
}
