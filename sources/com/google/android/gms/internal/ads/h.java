package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements zzihi {
    public static final h a = new h();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzd.zza zzaVar;
        switch (i) {
            case 0:
                zzaVar = zzbiw.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzaVar = zzbiw.zzd.zza.BANNER;
                break;
            case 2:
                zzaVar = zzbiw.zzd.zza.INTERSTITIAL;
                break;
            case 3:
                zzaVar = zzbiw.zzd.zza.NATIVE_EXPRESS;
                break;
            case 4:
                zzaVar = zzbiw.zzd.zza.NATIVE_CONTENT;
                break;
            case 5:
                zzaVar = zzbiw.zzd.zza.NATIVE_APP_INSTALL;
                break;
            case 6:
                zzaVar = zzbiw.zzd.zza.NATIVE_CUSTOM_TEMPLATE;
                break;
            case 7:
                zzaVar = zzbiw.zzd.zza.DFP_BANNER;
                break;
            case 8:
                zzaVar = zzbiw.zzd.zza.DFP_INTERSTITIAL;
                break;
            case 9:
                zzaVar = zzbiw.zzd.zza.REWARD_BASED_VIDEO_AD;
                break;
            case 10:
                zzaVar = zzbiw.zzd.zza.BANNER_SEARCH_ADS;
                break;
            default:
                zzaVar = null;
                break;
        }
        if (zzaVar != null) {
            return true;
        }
        return false;
    }
}
