package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzj;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gz3 {
    public final zzg a;
    public final Context b;
    public final String c;
    public boolean f;
    public final Intent g;
    public final gx3 h;
    public na3 j;
    public IInterface k;
    public final ArrayList d = new ArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final mh3 i = new mh3(this, 1);

    public final void a(Runnable runnable) {
        c(new o64(7, this, runnable));
    }

    public final void b() {
        for (fq3 fq3Var : this.e) {
            fq3Var.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service disconnected");
            ((Handler) fq3Var.b.a.zza()).post(new o15(fq3Var, 16));
        }
    }

    public final void c(Runnable runnable) {
        ((Handler) this.a.zza()).post(new a72(runnable, 3));
    }

    public gz3(Context context, String str, Intent intent, gx3 gx3Var) {
        this.b = context;
        this.c = str;
        this.g = intent;
        this.h = gx3Var;
        this.a = zzj.a(new tx(str, 9));
    }
}
