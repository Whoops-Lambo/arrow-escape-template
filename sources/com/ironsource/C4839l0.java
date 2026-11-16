package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import defpackage.mb0;
import defpackage.oy0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4839l0 {

    @NotNull
    public static final C4839l0 a = new C4839l0();

    public static /* synthetic */ void b() {
    }

    private C4839l0() {
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return mb0.e(context.getSystemService(oy0.s()));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C4950r4.d().a(e);
            return 0;
        }
    }
}
