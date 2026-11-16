package com.facebook.ads.redexgen.X;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2634c0 {
    public float A00;
    public EnumC2735dd A01;
    public Map<String, String> A02;

    public C2634c0(EnumC2735dd enumC2735dd) {
        this(enumC2735dd, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public C2634c0(EnumC2735dd enumC2735dd, float f) {
        this(enumC2735dd, f, null);
    }

    public C2634c0(@Nullable EnumC2735dd enumC2735dd, float f, Map<String, String> windowParams) {
        this.A01 = enumC2735dd;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC2735dd A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC2735dd.A0J;
    }
}
