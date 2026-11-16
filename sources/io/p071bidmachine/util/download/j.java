package io.p071bidmachine.util.download;

import android.content.Context;
import com.facebook.login.p;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.k52;
import defpackage.kc2;
import defpackage.qo;
import defpackage.wz2;
import defpackage.xe0;
import io.p071bidmachine.rendering.internal.event.k;
import io.p071bidmachine.util.log.b;
import io.p071bidmachine.util.network.f;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public final File a;
    public final b b;
    public final Context c;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, File file, xe0 xe0Var, fy fyVar) {
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
        Object objR = fVar.r;
        int i2 = fVar.t;
        int i3 = 1;
        if (i2 == 0) {
            wz2.a0(objR);
            fVar.t = 1;
            qo qoVar = new qo(1, kc2.q(fVar));
            qoVar.s();
            com.moloco.sdk.internal.error.crash.data.network.b bVar = new com.moloco.sdk.internal.error.crash.data.network.b(qoVar, new g(this, str, 0), new g(this, str, i3));
            Context context = this.c;
            context.getClass();
            file.getClass();
            p pVar = new p();
            pVar.a = file;
            pVar.b = this.a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            pVar.c = applicationContext;
            str.getClass();
            f fVar2 = new f(str, 1, new HashMap(), new HashMap(), 3, xe0Var != null ? new Long(xe0.e(xe0Var.a)) : null, null, pVar, bVar, null);
            bVar.e = fVar2;
            this.b.c("DownloadManager", new k(str, 3));
            fVar2.e(f.u);
            objR = qoVar.r();
            dz dzVar = dz.a;
            if (objR == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objR);
        }
        return ((k52) objR).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, xe0 xe0Var, fy fyVar) {
        h hVar;
        if (fyVar instanceof h) {
            hVar = (h) fyVar;
            int i = hVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.t = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, fyVar);
            }
        } else {
            hVar = new h(this, fyVar);
        }
        Object objR = hVar.r;
        int i2 = hVar.t;
        if (i2 == 0) {
            wz2.a0(objR);
            hVar.t = 1;
            qo qoVar = new qo(1, kc2.q(hVar));
            qoVar.s();
            com.moloco.sdk.internal.error.crash.data.network.b bVar = new com.moloco.sdk.internal.error.crash.data.network.b(qoVar, i.j, i.k);
            str.getClass();
            f fVar = new f(str, 3, new HashMap(), new HashMap(), 3, xe0Var != null ? new Long(xe0.e(xe0Var.a)) : null, null, new io.p071bidmachine.media3.extractor.text.j(12), bVar, null);
            bVar.e = fVar;
            fVar.e(f.u);
            objR = qoVar.r();
            dz dzVar = dz.a;
            if (objR == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objR);
        }
        return ((k52) objR).a;
    }

    public j(Context context, File file, b bVar) {
        context.getClass();
        file.getClass();
        bVar.getClass();
        this.a = file;
        this.b = bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
    }
}
