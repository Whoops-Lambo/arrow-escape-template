package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
public final class i {
    public static final int h = 8;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final com.moloco.sdk.acm.recorder.b g;

    public i(boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, @Nullable String str2, @Nullable com.moloco.sdk.acm.recorder.b bVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = bVar;
    }

    @NotNull
    public final k a(@NotNull a1 a1Var, @Nullable g gVar) {
        a1Var.getClass();
        boolean z = this.a;
        if ((z || this.c || this.b) && gVar != null) {
            return new e(gVar, a1Var, z, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        return new f(a1Var);
    }
}
