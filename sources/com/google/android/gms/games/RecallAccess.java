package com.google.android.gms.games;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.games_v2.zzad;
import com.google.android.gms.internal.games_v2.zzam;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@zzad
public final class RecallAccess {
    private final String zza;

    public static RecallAccess zza(zzam zzamVar) {
        return new RecallAccess(zzamVar.b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecallAccess) {
            return Objects.equals(this.zza, ((RecallAccess) obj).zza);
        }
        return false;
    }

    @NonNull
    @zzad
    public String getSessionId() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hash(this.zza);
    }

    private RecallAccess(String str) {
        this.zza = str;
    }
}
