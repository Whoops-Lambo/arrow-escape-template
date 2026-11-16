package io.p071bidmachine;

import android.view.View;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.unified.f;
import io.p071bidmachine.utils.a;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends m implements f {
    public final WeakReference b;

    public final void g(View view) {
        AdProcessCallback adProcessCallback = (AdProcessCallback) this.a;
        ViewAdObject viewAdObject = (ViewAdObject) this.b.get();
        if (viewAdObject == null) {
            adProcessCallback.processLoadFail(a.c("ViewAdObject is null"));
        } else {
            viewAdObject.setAdView(view);
            adProcessCallback.processLoadSuccess();
        }
    }

    public b1(ViewAdObject viewAdObject, AdProcessCallback adProcessCallback) {
        super(adProcessCallback);
        this.b = new WeakReference(viewAdObject);
    }
}
