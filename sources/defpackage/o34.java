package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzcih;
import com.google.android.gms.internal.ads.zzckr;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzni;
import com.google.android.gms.internal.ads.zznn;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztn;
import com.google.android.gms.internal.ads.zztr;
import com.google.android.gms.internal.ads.zztt;
import com.google.android.gms.internal.ads.zztu;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzub;
import com.google.android.gms.internal.ads.zzuh;
import com.google.android.gms.internal.ads.zzvm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o34 implements zznn, zzckr {
    public final /* synthetic */ zzclg a;

    public /* synthetic */ o34(zzclg zzclgVar) {
        this.a = zzclgVar;
    }

    public /* synthetic */ void a(long j, boolean z) {
        zzcih zzcihVar = this.a.l;
        if (zzcihVar != null) {
            zzcihVar.d(j, z);
        }
    }

    public zzni[] b(Handler handler, e15 e15Var, e15 e15Var2) {
        cb5 cb5Var = cb5.a;
        Context context = this.a.c;
        zztu zztuVar = new zztu(context);
        zzgvz.f(!zztuVar.c);
        zztuVar.c = true;
        if (zztuVar.f == null) {
            zztuVar.f = new zztw(new zzcp[0]);
        }
        zztn zztnVar = zztuVar.e;
        zztr zztrVar = zztuVar.g;
        if (zztnVar == null) {
            if (zztrVar == null) {
                zztuVar.g = new zztr(context);
            }
            if (zztuVar.d == null) {
                zztuVar.d = zztt.a;
            }
            zztl zztlVar = new zztl(context);
            zzqp zzqpVar = context != null ? null : zztuVar.b;
            Context context2 = zztlVar.a;
            if (context2 == null) {
                zztlVar.b = zzqpVar;
            }
            zztr zztrVar2 = zztuVar.g;
            zztlVar.c = zztrVar2;
            if (zztrVar2 == null) {
                zztlVar.c = new zztr(context2);
            }
            zztuVar.e = new zztn(zztlVar);
        } else {
            zzgvz.f(zztrVar == null);
            zzgvz.f(zztuVar.d == null);
        }
        zzuh zzuhVar = new zzuh(context, new zzvm(context), handler, e15Var2, new zzub(zztuVar));
        zzadr zzadrVar = new zzadr(context);
        zzadrVar.c = cb5Var;
        zzadrVar.e = handler;
        zzadrVar.f = e15Var;
        zzgvz.f(!zzadrVar.b);
        Handler handler2 = zzadrVar.e;
        zzgvz.f((handler2 == null && zzadrVar.f == null) || !(handler2 == null || zzadrVar.f == null));
        zzadrVar.b = true;
        return new zzni[]{zzuhVar, new zzadu(zzadrVar)};
    }
}
