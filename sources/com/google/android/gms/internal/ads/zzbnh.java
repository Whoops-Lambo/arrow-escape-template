package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbnh extends NativeAd.Image {
    public final zzbng a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public zzbnh(zzbng zzbngVar) {
        Drawable drawable;
        double dZzc;
        int iZzd;
        this.a = zzbngVar;
        Uri uriZzb = null;
        try {
            IObjectWrapper iObjectWrapperZza = zzbngVar.zza();
            drawable = iObjectWrapperZza != null ? (Drawable) ObjectWrapper.z1(iObjectWrapperZza) : null;
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
        this.b = drawable;
        try {
            uriZzb = this.a.zzb();
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        this.c = uriZzb;
        try {
            dZzc = this.a.zzc();
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            dZzc = 1.0d;
        }
        this.d = dZzc;
        int iZze = -1;
        try {
            iZzd = this.a.zzd();
        } catch (RemoteException e4) {
            zzo.zzg("", e4);
            iZzd = -1;
        }
        this.e = iZzd;
        try {
            iZze = this.a.zze();
        } catch (RemoteException e5) {
            zzo.zzg("", e5);
        }
        this.f = iZze;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f;
    }
}
