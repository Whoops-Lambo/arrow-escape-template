package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcly;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
public final class zzj {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzj(zzcly zzclyVar) throws zzh {
        this.zzb = zzclyVar.getLayoutParams();
        ViewParent parent = zzclyVar.getParent();
        this.zzd = zzclyVar.v();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzclyVar.zzE());
            viewGroup.removeView(zzclyVar.zzE());
            zzclyVar.a0(true);
            return;
        }
        throw new zzh("Could not get the parent of the WebView for an overlay.");
    }
}
