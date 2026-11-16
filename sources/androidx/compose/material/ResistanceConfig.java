package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import defpackage.h50;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ResistanceConfig {
    public final float a;
    public final float b;
    public final float c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.a == resistanceConfig.a && this.b == resistanceConfig.b && this.c == resistanceConfig.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + n30.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResistanceConfig(basis=");
        sb.append(this.a);
        sb.append(", factorAtMin=");
        sb.append(this.b);
        sb.append(", factorAtMax=");
        return h50.k(sb, this.c, ')');
    }

    public ResistanceConfig(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }
}
