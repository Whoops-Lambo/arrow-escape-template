package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4816jd extends AbstractC4949r3 {

    @NotNull
    public static final C4816jd P;

    @Override // com.ironsource.AbstractC4949r3
    public void a(@Nullable ArrayList<C5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4949r3
    public int c(@Nullable C5 c5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean d(@Nullable C5 c5) {
        return true;
    }

    @Override // com.ironsource.AbstractC4949r3
    public void f(@Nullable C5 c5) {
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean g(@Nullable C5 c5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean h(@Nullable C5 c5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4949r3
    public boolean j(@Nullable C5 c5) {
        return false;
    }

    static {
        C4816jd c4816jd = new C4816jd();
        P = c4816jd;
        c4816jd.H = "outcome";
        c4816jd.G = 0;
        c4816jd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4816jd.e();
    }

    @Override // com.ironsource.AbstractC4949r3
    @NotNull
    public String e(int i) {
        return "";
    }

    public final void i() {
        new C4670ba().b(ContextProvider.getInstance().getApplicationContext());
        a(new C5(D5.INIT_DEFERRED_DATA, new C4777h9().a()));
    }

    private C4816jd() {
    }

    @Override // com.ironsource.AbstractC4949r3
    public void d() {
    }
}
