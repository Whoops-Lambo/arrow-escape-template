package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.c94;
import defpackage.ga4;
import defpackage.ia4;
import defpackage.q94;
import defpackage.tc4;
import defpackage.y84;
import defpackage.y94;
import defpackage.z94;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfhp implements zzdef, zzdgb, zzfje, com.google.android.gms.ads.internal.overlay.zzr, zzdgt, zzdes, zzdmj {
    public final zzfnu a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public zzfhp i = null;

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void i0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void W() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.W();
        } else {
            zzfiw.a(this.d, c94.h);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final void d(zzfje zzfjeVar) {
        this.i = (zzfhp) zzfjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final void f(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.f(zztVar);
            return;
        }
        Object obj = this.g.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void m(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.m(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbhn) obj).zzc(zzeVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzbhn) obj2).zzb(zzeVar.zza);
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.n(zzeVar);
            return;
        }
        Object obj = this.d.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbhr) obj).Y1(zzeVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void x(zzcwl zzcwlVar) {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.x(zzcwlVar);
            return;
        }
        Object obj = this.b.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbhn) obj).M(zzcwlVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void z() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.z();
            return;
        }
        tc4 tc4Var = this.a.a;
        if (tc4Var != null) {
            zzfou zzfouVar = (zzfou) tc4Var.b;
            synchronized (zzfouVar) {
                zzfouVar.e = 1;
                zzfouVar.a();
            }
        }
        Object obj = this.c.get();
        if (obj != null) {
            try {
                ((zzbho) obj).zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.d.get();
        if (obj2 != null) {
            try {
                ((zzbhr) obj2).zzc();
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.h.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((zzfut) obj3).a();
        } catch (RemoteException e5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.zzdW();
        } else {
            zzfiw.a(this.f, y94.f);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.zzdX(i);
            return;
        }
        Object obj = this.f.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdX(i);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.zzdw();
        } else {
            zzfiw.a(this.f, z94.g);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.zzh();
            return;
        }
        zzfiw.a(this.f, ga4.h);
        ia4 ia4Var = ia4.h;
        AtomicReference atomicReference = this.d;
        zzfiw.a(atomicReference, ia4Var);
        zzfiw.a(atomicReference, y84.i);
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzl() {
        zzfhp zzfhpVar = this.i;
        if (zzfhpVar != null) {
            zzfhpVar.zzl();
        } else {
            zzfiw.a(this.e, q94.f);
        }
    }

    public zzfhp(zzfnu zzfnuVar) {
        this.a = zzfnuVar;
    }
}
