package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4678c0 implements InterfaceC4660b0 {

    @NotNull
    private final Gc a;

    public C4678c0(@NotNull Gc gc) {
        gc.getClass();
        this.a = gc;
    }

    @Override // com.ironsource.InterfaceC4660b0
    public void a(@NotNull Activity activity, @NotNull R9 r9) {
        activity.getClass();
        r9.getClass();
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + r9.g() + " adInstanceId=" + r9.e());
        this.a.a(activity, r9, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4660b0
    public boolean a(@NotNull R9 r9) {
        r9.getClass();
        return this.a.a(r9);
    }
}
