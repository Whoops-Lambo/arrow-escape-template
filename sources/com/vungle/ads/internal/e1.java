package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e1 extends rc1 implements sr0 {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.a = imageView;
        this.b = bitmap;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.a.setImageBitmap(this.b);
        return az2.a;
    }
}
