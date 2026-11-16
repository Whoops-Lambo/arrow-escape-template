package com.google.android.gms.internal.ads;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefa {
    public NativeAdOptions b;
    public VideoOptions c;
    public AdSize d = AdSize.BANNER;
    public String e = "";
    public String f = "";
    public boolean g = false;
    public AdRequest a = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, rl3.g("request_origin", "inspector_ooct")).build();
}
