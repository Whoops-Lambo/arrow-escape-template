package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.e80;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Tf {

    @Nullable
    private final String a;

    @Nullable
    private final String b;
    private final boolean c;

    @Nullable
    private final Boolean d;

    public /* synthetic */ Tf(String str, boolean z, Boolean bool, String str2, int i, e80 e80Var) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return s71.b(this.d, Boolean.TRUE);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        networkSettings.getClass();
        aVar.getClass();
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Wf wf = Wf.a;
        if (s71.b(wf.a(networkSettings), this.b) && wf.a(networkSettings, aVar) == this.c) {
            return true;
        }
        return false;
    }

    public Tf(@Nullable String str, boolean z, @Nullable Boolean bool, @Nullable String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    @Nullable
    public final String a() {
        return this.b;
    }
}
