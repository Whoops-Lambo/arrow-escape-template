package defpackage;

import com.google.android.gms.internal.ads.zzgwa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tp4 implements zzgwa {
    public static final tp4 a;
    public static final /* synthetic */ tp4[] b;

    static {
        tp4 tp4Var = new tp4("ALWAYS_TRUE", 0);
        a = tp4Var;
        b = new tp4[]{tp4Var, new tp4("ALWAYS_FALSE", 1), new tp4("IS_NULL", 2), new tp4("NOT_NULL", 3)};
    }

    public static tp4[] values() {
        return (tp4[]) b.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        return super.toString();
                    }
                    return "Predicates.notNull()";
                }
                return "Predicates.isNull()";
            }
            return "Predicates.alwaysFalse()";
        }
        return "Predicates.alwaysTrue()";
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final /* synthetic */ boolean zza(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
