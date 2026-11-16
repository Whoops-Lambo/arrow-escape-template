package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.explorestack.protobuf.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
public final class e implements k {
    public static final int j = 8;

    @NotNull
    public final g a;

    @NotNull
    public final a1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final com.moloco.sdk.acm.recorder.b i;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void b(@Nullable String str) throws Throwable {
        if (this.d && !this.f) {
            this.a.a(str, this.b);
            return;
        }
        if (this.f) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                ((b1) this.b).a(str);
                com.moloco.sdk.acm.recorder.b bVar = this.i;
                if (bVar != null) {
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(z.n("store_launch_complete", "result", "auto_fullsheet_shown_complete"));
                }
                String str3 = this.h;
                if (str3 != null) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) com.moloco.sdk.service_locator.j.b()).a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void c(@Nullable String str) throws Throwable {
        if (this.e && !this.f) {
            this.a.a(str, this.b);
            return;
        }
        if (this.f) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                ((b1) this.b).a(str);
                com.moloco.sdk.acm.recorder.b bVar = this.i;
                if (bVar != null) {
                    ((com.moloco.sdk.acm.recorder.c) bVar).a(z.n("store_launch_complete", "result", "auto_fullsheet_shown_skip"));
                }
                String str3 = this.h;
                if (str3 != null) {
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) com.moloco.sdk.service_locator.j.b()).a(str3);
                }
            }
        }
    }

    public e(@NotNull g gVar, @NotNull a1 a1Var, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, @Nullable String str2, @Nullable com.moloco.sdk.acm.recorder.b bVar) {
        gVar.getClass();
        a1Var.getClass();
        this.a = gVar;
        this.b = a1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
        this.i = bVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k
    public void a(@NotNull String str) {
        str.getClass();
        if (this.c) {
            this.a.b(str, this.b);
        } else {
            ((b1) this.b).a(str);
        }
    }
}
