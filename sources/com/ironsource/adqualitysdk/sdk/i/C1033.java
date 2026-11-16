package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.jc1;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1033 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public boolean f3009;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public boolean f3010;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public boolean f3011;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object f3012;

    public final String toString() {
        if (!(this.f3012 instanceof String)) {
            return jc1.p(new StringBuilder(), this.f3012, "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Wg==\n", "eGeUleBzHTU=\n"));
        sb.append(this.f3012);
        return AbstractC1156.m868("Kg==\n", "CDz2lmto8RQ=\n", sb);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Number m754() {
        Object obj = this.f3012;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m755() {
        Object obj = this.f3012;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        return true;
    }

    public C1033(Object obj) {
        this.f3012 = obj;
    }
}
