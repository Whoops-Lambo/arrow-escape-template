package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.c3;
import com.applovin.impl.e3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import defpackage.n30;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final c3 a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final e3 f;
    private final List g;
    private final String h;
    private final String i;

    public String getEventId() {
        return this.i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.g;
    }

    public e3 getRequestParameters() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdWaterfallInfo{name=");
        sb.append(this.b);
        sb.append(", testName=");
        sb.append(this.c);
        sb.append(", networkResponses=");
        sb.append(this.d);
        sb.append(", latencyMillis=");
        return n30.o(sb, this.e, '}');
    }

    public MaxAdWaterfallInfoImpl(c3 c3Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(c3Var, c3Var.X(), c3Var.Y(), j, list, c3Var.Q(), c3Var.W(), str, c3Var.T());
    }

    public MaxAdWaterfallInfoImpl(@Nullable c3 c3Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, e3 e3Var, List<String> list2, String str3, String str4) {
        this.a = c3Var;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.d = list;
        this.f = e3Var;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }
}
