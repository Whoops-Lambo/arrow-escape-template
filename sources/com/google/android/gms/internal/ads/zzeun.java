package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ga4;
import defpackage.ia4;
import defpackage.y84;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeun implements AppEventListener, zzdhi, zzdfq, zzdef, zzdew, com.google.android.gms.ads.internal.client.zza, zzdec, zzdgt, zzdes, zzdmj {
    public final zzeaw j;
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicReference i = new AtomicReference();
    public final ArrayBlockingQueue k = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.za)).intValue());

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh d() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.a.get();
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        try {
            if (!this.f.get()) {
                Object obj = this.b.get();
                if (obj != null) {
                    try {
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zza(str, str2);
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e);
                    } catch (NullPointerException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                    }
                }
                return;
            }
            if (!this.k.offer(new Pair(str, str2))) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("The queue for app events is full, dropping the new event.");
                zzeaw zzeawVar = this.j;
                if (zzeawVar != null) {
                    zzeav zzeavVarA = zzeawVar.a();
                    zzeavVarA.b("action", "dae_action");
                    zzeavVarA.b("dae_name", str);
                    zzeavVarA.b("dae_data", str2);
                    zzeavVarA.c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdfq
    public final synchronized void zzg() {
        Object obj;
        Object obj2 = this.a.get();
        if (obj2 == null) {
            obj = this.d.get();
            if (obj != null) {
                try {
                    try {
                        ((com.google.android.gms.ads.internal.client.zzbk) obj).zza();
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                } catch (NullPointerException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                }
            }
            this.h.set(true);
            H();
        } else {
            try {
                try {
                    ((com.google.android.gms.ads.internal.client.zzbh) obj2).zze();
                } catch (NullPointerException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e3);
                }
            } catch (RemoteException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e4);
            }
            obj = this.d.get();
            if (obj != null) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zza();
            }
            this.h.set(true);
            H();
        }
        throw th;
    }

    public final void H() {
        if (this.g.get() && this.h.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.k;
            for (Pair pair : arrayBlockingQueue) {
                Object obj = this.b.get();
                if (obj != null) {
                    try {
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zza((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e);
                    } catch (NullPointerException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
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
        zzfiw.a(this.a, ga4.f);
        AtomicReference atomicReference = this.e;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcs) obj).zzb();
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
            ((zzcs) obj2).zzd();
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        zzfiw.a(this.a, ia4.f);
        Object obj = this.e.get();
        if (obj != null) {
            try {
                ((zzcs) obj).zzc();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        zzfiw.a(this.i, y84.g);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void W() {
        Object obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zc)).booleanValue() && (obj = this.a.get()) != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = this.e.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzcs) obj2).zze();
        } catch (RemoteException e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e3);
        } catch (NullPointerException e4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final void f(com.google.android.gms.ads.internal.client.zzt zztVar) {
        Object obj = this.c.get();
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

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void i0() {
        Object obj = this.a.get();
        if (obj == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
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
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(zzeVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbh) obj2).zzb(zzeVar.zza);
            } catch (RemoteException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
            } catch (NullPointerException e4) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e4);
            }
        }
        Object obj3 = this.d.get();
        if (obj3 != null) {
            try {
                ((com.google.android.gms.ads.internal.client.zzbk) obj3).zzb(zzeVar);
            } catch (RemoteException e5) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e5);
            } catch (NullPointerException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e6);
            }
        }
        this.f.set(false);
        this.k.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Object obj = this.e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzcs) obj).zza(zzeVar);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zc)).booleanValue() || (obj = this.a.get()) == null) {
            return;
        }
        try {
            ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    public final void x(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.b.set(zzclVar);
        this.g.set(true);
        H();
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
        this.f.set(true);
        this.h.set(false);
    }

    public zzeun(zzeaw zzeawVar) {
        this.j = zzeawVar;
    }
}
