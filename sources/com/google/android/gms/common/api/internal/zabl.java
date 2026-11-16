package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zabl {
    private final ApiKey zaa;
    private final Feature zab;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zabl) {
            zabl zablVar = (zabl) obj;
            if (Objects.equal(this.zaa, zablVar.zaa) && Objects.equal(this.zab, zablVar.zab)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final /* synthetic */ ApiKey zaa() {
        return this.zaa;
    }

    public final /* synthetic */ Feature zab() {
        return this.zab;
    }

    public /* synthetic */ zabl(ApiKey apiKey, Feature feature, byte[] bArr) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(C4664b4.i.W, this.zaa).add("feature", this.zab).toString();
    }
}
