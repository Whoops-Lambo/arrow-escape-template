package io.p071bidmachine.nativead.tasks;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.k52;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.tb5;
import defpackage.uy;
import defpackage.wz2;
import io.p071bidmachine.rendering.d;
import io.p071bidmachine.util.l;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements Runnable {
    public final Object a;
    public final d b;
    public final e c;
    public final String d;
    public final l e;
    public final dn f;
    public final WeakReference g;

    public h(Context context, Object obj, d dVar, e eVar, String str) {
        l lVar = l.c;
        context.getClass();
        obj.getClass();
        dVar.getClass();
        lVar.getClass();
        this.a = obj;
        this.b = dVar;
        this.c = eVar;
        this.d = str;
        this.e = lVar;
        this.f = kc2.a(qb5.l(tb5.a(), lVar.b()));
        this.g = new WeakReference(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        f fVar;
        if (fyVar instanceof f) {
            fVar = (f) fyVar;
            int i = fVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.t = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, fyVar);
            }
        } else {
            fVar = new f(this, fyVar);
        }
        Object objE = fVar.r;
        int i2 = fVar.t;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            uy uyVarA = this.e.a();
            b bVar = new b(this, dyVar, 13);
            fVar.t = 1;
            objE = tb5.E(uyVarA, bVar, fVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objE);
        }
        return ((k52) objE).a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        tb5.t(this.f, null, null, new g(this, null, 1), 3).invokeOnCompletion(new c(countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
    }
}
