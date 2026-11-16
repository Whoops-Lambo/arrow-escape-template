package io.p071bidmachine.rendering.internal.detector.brokencreative;

import android.graphics.Bitmap;
import defpackage.q7;
import io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b;
import io.p071bidmachine.rendering.model.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends io.p071bidmachine.rendering.utils.taskmanager.a {
    public final b c;
    public final Bitmap d;
    public final q7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Bitmap bitmap, q7 q7Var) {
        super(1);
        bVar.getClass();
        this.c = bVar;
        this.d = bitmap;
        this.e = q7Var;
    }

    @Override // io.p071bidmachine.rendering.utils.taskmanager.a
    public final void c() {
        Boolean boolB;
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVar = this.c;
        bVar.getClass();
        Bitmap bitmap = this.d;
        bitmap.getClass();
        try {
            boolB = bVar.b(bitmap);
        } catch (Throwable unused) {
            boolB = null;
        }
        q7 q7Var = this.e;
        if (boolB != null) {
            q7Var.invoke(this, new k(boolB.booleanValue(), bVar.a, System.currentTimeMillis() - jCurrentTimeMillis));
        } else {
            q7Var.invoke(this, null);
        }
    }
}
