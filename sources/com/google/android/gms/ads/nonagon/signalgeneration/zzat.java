package com.google.android.gms.ads.nonagon.signalgeneration;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.google.android.gms.internal.ads.zzbiw;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzat {
    private final String zza;

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final zzbiw.zza.EnumC0295zza zzc() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbiw.zza.EnumC0295zza.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals(AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL)) {
                    return zzbiw.zza.EnumC0295zza.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbiw.zza.EnumC0295zza.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return zzbiw.zza.EnumC0295zza.BANNER;
                }
                break;
        }
        return zzbiw.zza.EnumC0295zza.AD_INITIATER_UNSPECIFIED;
    }
}
