package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class r extends s {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p a;
    public final boolean b;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a == rVar.a && this.b == rVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mraid(viewModel=");
        sb.append(this.a);
        sb.append(", isLastAdPart=");
        return h50.m(sb, this.b, ')');
    }

    public r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p pVar, boolean z) {
        this.a = pVar;
        this.b = z;
    }
}
