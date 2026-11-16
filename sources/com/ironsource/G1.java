package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class G1 extends AbstractC4949r3 {
    @Override // com.ironsource.AbstractC4949r3
    public int c(@Nullable C5 c5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4949r3
    public void f(@Nullable C5 c5) {
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean h(@Nullable C5 c5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean j(@Nullable C5 c5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4949r3
    @NotNull
    public String e(int i) {
        return "";
    }

    public G1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean d(@NotNull C5 c5) {
        c5.getClass();
        int iC = c5.c();
        if (iC != D5.FIRST_INSTANCE.c() && iC != D5.INIT_COMPLETE.c() && iC != D5.SDK_INIT_FAILED.c() && iC != D5.SDK_INIT_SUCCESS.c()) {
            return false;
        }
        return true;
    }

    @Override // com.ironsource.AbstractC4949r3
    public void d() {
    }
}
