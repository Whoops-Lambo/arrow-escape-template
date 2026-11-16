package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import defpackage.c94;
import defpackage.ga4;
import defpackage.ia4;
import defpackage.tc4;
import defpackage.y84;
import defpackage.z94;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfku implements OnAdMetadataChangedListener, zzdfq, zzdef, zzdec, zzdes, zzdgt, zzfje, zzdmj {
    public final zzfnu a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public zzfku j = null;

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void i0() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.A(zzccqVar, str, str2);
            return;
        }
        Object obj = this.d.get();
        if (obj != null) {
            try {
                ((zzcdp) obj).f3(new zzced(zzccqVar.zza(), zzccqVar.zzb()));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.f.get();
        if (obj2 != null) {
            try {
                zzcdu zzcduVar = (zzcdu) obj2;
                zzced zzcedVar = new zzced(zzccqVar.a, zzccqVar.b);
                Parcel parcelZzda = zzcduVar.zzda();
                zzbfh.e(parcelZzda, zzcedVar);
                parcelZzda.writeString(str);
                parcelZzda.writeString(str2);
                zzcduVar.zzdc(2, parcelZzda);
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.e.get();
        if (obj3 != null) {
            try {
                ((zzccz) obj3).x1(zzccqVar);
            } catch (RemoteException e5) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        Object obj4 = this.g.get();
        if (obj4 == null) {
            return;
        }
        try {
            zzccu zzccuVar = (zzccu) obj4;
            Parcel parcelZzda2 = zzccuVar.zzda();
            zzbfh.e(parcelZzda2, zzccqVar);
            parcelZzda2.writeString(str);
            parcelZzda2.writeString(str2);
            zzccuVar.zzdc(2, parcelZzda2);
        } catch (RemoteException e7) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.L();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccz) obj).zzj();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.N();
            return;
        }
        ia4 ia4Var = ia4.i;
        AtomicReference atomicReference = this.d;
        zzfiw.a(atomicReference, ia4Var);
        Object obj = this.e.get();
        if (obj != null) {
            try {
                ((zzccz) obj).zzf();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        zzfiw.a(atomicReference, z94.h);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.O();
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
        Object obj = this.d.get();
        if (obj != null) {
            try {
                ((zzcdp) obj).zzf();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.e.get();
        if (obj2 != null) {
            try {
                ((zzccz) obj2).zzh();
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.i.get();
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

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void W() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.W();
        } else {
            zzfiw.a(this.d, ga4.i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final void d(zzfje zzfjeVar) {
        this.j = (zzfku) zzfjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final void f(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.f(zztVar);
            return;
        }
        Object obj = this.h.get();
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
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.m(zzeVar);
            return;
        }
        int i = zzeVar.zza;
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcdt) obj).a(zzeVar);
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzcdt) obj2).zzf(i);
            } catch (RemoteException e3) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.e.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((zzccz) obj3).b(i);
        } catch (RemoteException e5) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e5);
        } catch (NullPointerException e6) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.n(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcdp) obj).F2(zzeVar);
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
            ((zzcdp) obj2).zzh(zzeVar.zza);
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.onAdMetadataChanged();
        } else {
            zzfiw.a(this.b, c94.i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.zze();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccz) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.zzf();
            return;
        }
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccz) obj).zzl();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        zzfku zzfkuVar = this.j;
        if (zzfkuVar != null) {
            zzfkuVar.zzg();
            return;
        }
        zzfiw.a(this.c, y84.j);
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzccz) obj).zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public zzfku(zzfnu zzfnuVar) {
        this.a = zzfnuVar;
    }
}
