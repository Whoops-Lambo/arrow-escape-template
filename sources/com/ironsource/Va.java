package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Va implements Ya {

    @NotNull
    private final Ta a;

    @Override // com.ironsource.Ya
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    public Va(@NotNull Ta ta) {
        ta.getClass();
        this.a = ta;
    }

    @Override // com.ironsource.Ya
    public void a(@NotNull C5000u0 c5000u0) {
        c5000u0.getClass();
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ya
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
