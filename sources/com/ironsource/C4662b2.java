package com.ironsource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.jc1;
import defpackage.q63;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4662b2 {
    private final E0 a;

    public void a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.a.a(B0.AUCTION_FAILED, map);
    }

    public void b(String str) {
        this.a.a(B0.AUCTION_REQUEST_WATERFALL, q63.m(IronSourceConstants.EVENTS_EXT1, str));
    }

    public void c(String str) {
        this.a.a(B0.AUCTION_RESULT_WATERFALL, q63.m(IronSourceConstants.EVENTS_EXT1, str));
    }

    public C4662b2(E0 e0) {
        this.a = e0;
    }

    public String a(int i, int i2, int i3, int i4) {
        StringBuilder sbT = jc1.t("interstitial=", i, ";rewarded=", i2, ";banner=");
        sbT.append(i3);
        sbT.append(";native=");
        sbT.append(i4);
        return sbT.toString();
    }

    public void a(@Nullable Double d) {
        HashMap map;
        if (d != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            map = null;
        }
        this.a.a(B0.AUCTION_REQUEST, map);
    }

    public void a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.a.a(B0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.a.a(B0.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        this.a.a(B0.AD_FORMAT_CAPPED, q63.m("auctionId", str));
    }
}
