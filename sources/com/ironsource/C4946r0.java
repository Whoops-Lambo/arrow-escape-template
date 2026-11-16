package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.ek2;
import defpackage.jh0;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4946r0 {

    @NotNull
    private final HashMap<String, Q0> a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.r0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall;

        private static final /* synthetic */ jh0 h = ek2.m(a());

        @NotNull
        public static jh0 b() {
            return h;
        }
    }

    @NotNull
    public final Q0 a(@NotNull String str, @NotNull List<? extends NetworkSettings> list, int i) {
        str.getClass();
        list.getClass();
        Q0 q0 = this.a.get(str);
        if (q0 == null) {
            Q0 q1 = new Q0(list, i);
            this.a.put(str, q1);
            return q1;
        }
        return q0;
    }
}
