package io.p071bidmachine.iab.mraid;

import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.iab.a;
import io.p071bidmachine.iab.measurer.b;
import io.p071bidmachine.iab.utils.q;
import io.p071bidmachine.rendering.model.engagedclick.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MraidView$Builder {
    public final int a;
    public a b;
    public String c;
    public String d;
    public b0 e;
    public b f;
    public q g;
    public q h;
    public q i;
    public q j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public c r;

    public MraidView$Builder(int i) {
        this.k = 3.0f;
        this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.q = false;
        this.a = i;
        this.b = a.a;
        this.c = "https://localhost";
    }

    public MraidView$Builder() {
        this(1);
    }
}
