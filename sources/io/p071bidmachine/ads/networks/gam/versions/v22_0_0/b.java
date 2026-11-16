package io.p071bidmachine.ads.networks.gam.versions.v22_0_0;

import android.text.TextUtils;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.p071bidmachine.ads.networks.gam.j;
import io.p071bidmachine.ads.networks.gam.l;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static AdManagerAdRequest a(j jVar, l lVar) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String str = jVar.f;
        if (!TextUtils.isEmpty(str)) {
            builder.setRequestAgent(str);
        }
        for (Map.Entry entry : lVar.d.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                builder.addCustomTargeting(str2, str3);
            }
        }
        return builder.build();
    }
}
