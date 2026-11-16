package com.ironsource;

import android.content.Context;
import defpackage.rd1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4719e5 {

    @NotNull
    public static final C4719e5 a = new C4719e5();

    private C4719e5() {
    }

    public final int a(@NotNull Context context) {
        context.getClass();
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final int b(@NotNull Context context) {
        context.getClass();
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    private final int a(Context context, int i) {
        return rd1.p(i / context.getResources().getDisplayMetrics().density);
    }
}
