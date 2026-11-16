package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1227 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static AbstractC1227 f3729;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f3731 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final HashSet f3730 = new HashSet();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo886();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ArrayList m887() {
        return new ArrayList(this.f3730);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo888();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo889(Application application, Activity activity);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m890(C0966 c0966) {
        this.f3730.add(c0966);
    }

    static {
        StringFog.decrypt("lDXeWvEWoEy1PNJB8xaJaboqxV3+H552tivHUfMf\n", "01mxOJB67CU=\n");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized AbstractC1227 m885() {
        try {
            if (f3729 == null) {
                f3729 = new C1279();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3729;
    }
}
