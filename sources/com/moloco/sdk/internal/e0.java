package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.jc1;
import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    public final MolocoAdError a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;
    public final Map c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a) && s71.b(this.b, e0Var.b) && this.c.equals(e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MolocoInternalAdError(molocoAdError=");
        sb.append(this.a);
        sb.append(", subErrorType=");
        sb.append(this.b);
        sb.append(", details=");
        return jc1.r(sb, this.c, ')');
    }

    public e0(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map) {
        cVar.getClass();
        this.a = molocoAdError;
        this.b = cVar;
        this.c = map;
    }
}
