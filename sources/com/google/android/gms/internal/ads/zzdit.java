package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzdit implements AppEventListener, OnAdMetadataChangedListener, zzdec, com.google.android.gms.ads.internal.client.zza, zzdgt, zzdew, zzdgb, com.google.android.gms.ads.internal.overlay.zzr, zzdes, zzdmj {
    public final zzdhs a = new zzdhs(this);
    public zzeun b;
    public zzeur c;
    public zzfhp d;
    public zzfku e;

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

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.A(zzccqVar, str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.L();
        }
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.N();
        }
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.O();
        }
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void W() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.W();
        }
        zzeur zzeurVar = this.c;
        if (zzeurVar != null) {
            zzeurVar.W();
        }
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.W();
        }
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.W();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgt
    public final void f(com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.f(zztVar);
        }
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.f(zztVar);
        }
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.f(zztVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final void i0() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.i0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.n(zzeVar);
        }
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.n(zzeVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.onAdClicked();
        }
        zzeur zzeurVar = this.c;
        if (zzeurVar != null) {
            zzeurVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.onAdMetadataChanged();
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzeun zzeunVar = this.b;
        if (zzeunVar != null) {
            zzeunVar.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.zzdW();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.zzdX(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.zzdw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
        zzfku zzfkuVar = this.e;
        if (zzfkuVar != null) {
            zzfkuVar.zzf();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzl() {
        zzfhp zzfhpVar = this.d;
        if (zzfhpVar != null) {
            zzfhpVar.zzl();
        }
    }
}
