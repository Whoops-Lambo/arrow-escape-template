package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements zzihi {
    public static final a a = new a();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zza.EnumC0295zza enumC0295zza;
        switch (i) {
            case 0:
                enumC0295zza = zzbiw.zza.EnumC0295zza.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                enumC0295zza = zzbiw.zza.EnumC0295zza.BANNER;
                break;
            case 2:
                enumC0295zza = zzbiw.zza.EnumC0295zza.DFP_BANNER;
                break;
            case 3:
                enumC0295zza = zzbiw.zza.EnumC0295zza.INTERSTITIAL;
                break;
            case 4:
                enumC0295zza = zzbiw.zza.EnumC0295zza.DFP_INTERSTITIAL;
                break;
            case 5:
                enumC0295zza = zzbiw.zza.EnumC0295zza.NATIVE_EXPRESS;
                break;
            case 6:
                enumC0295zza = zzbiw.zza.EnumC0295zza.AD_LOADER;
                break;
            case 7:
                enumC0295zza = zzbiw.zza.EnumC0295zza.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                enumC0295zza = zzbiw.zza.EnumC0295zza.BANNER_SEARCH_ADS;
                break;
            case 9:
                enumC0295zza = zzbiw.zza.EnumC0295zza.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                enumC0295zza = zzbiw.zza.EnumC0295zza.APP_OPEN;
                break;
            case 11:
                enumC0295zza = zzbiw.zza.EnumC0295zza.REWARDED_INTERSTITIAL;
                break;
            default:
                enumC0295zza = null;
                break;
        }
        if (enumC0295zza != null) {
            return true;
        }
        return false;
    }
}
