package io.p071bidmachine.media3.exoplayer.video;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import defpackage.h3;
import io.p071bidmachine.media3.common.b1;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.audio.h;
import io.p071bidmachine.media3.exoplayer.m;
import io.p071bidmachine.media3.exoplayer.mediacodec.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ h b;

    public final void a(long j) {
        Surface surface;
        h hVar = this.b;
        if (this != hVar.j1 || hVar.K == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            hVar.v0 = true;
            return;
        }
        try {
            h hVar2 = hVar.E0;
            hVar.r0(j);
            b1 b1Var = hVar.e1;
            if (!b1Var.equals(b1.d) && !b1Var.equals(hVar.f1)) {
                hVar.f1 = b1Var;
                hVar2.b(b1Var);
            }
            hVar.x0.e++;
            r rVar = hVar.H0;
            boolean z = rVar.e != 3;
            rVar.e = 3;
            rVar.l.getClass();
            rVar.g = x.L(SystemClock.elapsedRealtime());
            if (z && (surface = hVar.R0) != null) {
                Handler handler = hVar2.a;
                if (handler != null) {
                    handler.post(new h3(hVar2, surface, SystemClock.elapsedRealtime(), 6));
                }
                hVar.U0 = true;
            }
            hVar.Z(j);
        } catch (m e) {
            hVar.w0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = x.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }

    public g(h hVar, k kVar) {
        this.b = hVar;
        Handler handlerM = x.m(this);
        this.a = handlerM;
        kVar.r(this, handlerM);
    }
}
