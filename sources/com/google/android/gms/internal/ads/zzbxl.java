package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbxl extends zzbwu {
    public final NativeAdMapper a;

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final zzbmz zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzA() {
        return this.a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzB() {
        return this.a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzC() {
        this.a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zze() {
        return this.a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final List zzf() {
        List<NativeAd.Image> images = this.a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbmr(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzg() {
        return this.a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final zzbng zzh() {
        NativeAd.Image icon = this.a.getIcon();
        if (icon != null) {
            return new zzbmr(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzi() {
        return this.a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzj() {
        return this.a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final double zzk() {
        NativeAdMapper nativeAdMapper = this.a;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzl() {
        return this.a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzm() {
        return this.a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzp() {
        View adChoicesContent = this.a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new ObjectWrapper(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzq() {
        View viewZza = this.a.zza();
        if (viewZza == null) {
            return null;
        }
        return new ObjectWrapper(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final Bundle zzs() {
        return this.a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final boolean zzt() {
        return this.a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final boolean zzu() {
        return this.a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzv() {
        this.a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzz() {
        return this.a.getMediaContentAspectRatio();
    }

    public zzbxl(NativeAdMapper nativeAdMapper) {
        this.a = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void G(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        HashMap map = (HashMap) ObjectWrapper.z1(iObjectWrapper2);
        HashMap map2 = (HashMap) ObjectWrapper.z1(iObjectWrapper3);
        this.a.trackViews((View) ObjectWrapper.z1(iObjectWrapper), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void S0(IObjectWrapper iObjectWrapper) {
        this.a.untrackView((View) ObjectWrapper.z1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void z(IObjectWrapper iObjectWrapper) {
        this.a.handleClick((View) ObjectWrapper.z1(iObjectWrapper));
    }
}
