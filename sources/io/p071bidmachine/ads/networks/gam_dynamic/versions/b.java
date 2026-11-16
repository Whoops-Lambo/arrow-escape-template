package io.p071bidmachine.ads.networks.gam_dynamic.versions;

import android.content.Context;
import com.facebook.ads.a;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.ads.networks.gam_dynamic.e;
import io.p071bidmachine.ads.networks.gam_dynamic.p;
import io.p071bidmachine.ads.networks.gam_dynamic.w;
import io.p071bidmachine.protobuf.Waterfall;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface b {
    p a(e eVar, w wVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, a aVar);

    void b(Context context);

    boolean c(Context context);

    io.p071bidmachine.utils.version.a getVersion();
}
