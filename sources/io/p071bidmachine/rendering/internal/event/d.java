package io.p071bidmachine.rendering.internal.event;

import android.graphics.Bitmap;
import defpackage.az2;
import defpackage.qo;
import io.p071bidmachine.rendering.internal.screenshot.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo b;

    public /* synthetic */ d(qo qoVar, int i) {
        this.a = i;
        this.b = qoVar;
    }

    @Override // io.p071bidmachine.rendering.internal.screenshot.a
    public final void a() {
        int i = this.a;
        qo qoVar = this.b;
        switch (i) {
            case 0:
                qoVar.resumeWith(az2.a);
                break;
            default:
                qoVar.resumeWith(null);
                break;
        }
    }

    @Override // io.p071bidmachine.rendering.internal.screenshot.a
    public void a(Bitmap bitmap) {
        this.b.resumeWith(bitmap);
    }
}
