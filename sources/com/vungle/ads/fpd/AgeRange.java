package com.vungle.ads.fpd;

import defpackage.e80;
import defpackage.j71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/fpd/AgeRange;", "", "", "a", "I", "getId", "()I", "id", "Lj71;", "b", "Lj71;", "getRange", "()Lj71;", "range", "Companion", "AGE_18_20", "AGE_21_30", "AGE_31_40", "AGE_41_50", "AGE_51_60", "AGE_61_70", "AGE_71_75", "OTHERS", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public enum AgeRange {
    AGE_18_20(1, new j71(18, 20, 1)),
    AGE_21_30(2, new j71(21, 30, 1)),
    AGE_31_40(3, new j71(31, 40, 1)),
    AGE_41_50(4, new j71(41, 50, 1)),
    AGE_51_60(5, new j71(51, 60, 1)),
    AGE_61_70(6, new j71(61, 70, 1)),
    AGE_71_75(7, new j71(71, 75, 1)),
    OTHERS(0, new j71(Integer.MIN_VALUE, Integer.MAX_VALUE, 1));


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final j71 range;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/vungle/ads/fpd/AgeRange$Companion;", "", "", "age", "Lcom/vungle/ads/fpd/AgeRange;", "fromAge$vungle_ads_release", "(I)Lcom/vungle/ads/fpd/AgeRange;", "fromAge", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001d  */
        /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
        @NotNull
        public final AgeRange fromAge$vungle_ads_release(int age) {
            for (AgeRange ageRange : AgeRange.values()) {
                j71 range = ageRange.getRange();
                int i = range.a;
                if (age <= range.b && i <= age) {
                    if (ageRange == null) {
                        return AgeRange.OTHERS;
                    }
                    return ageRange;
                }
            }
            ageRange = null;
            if (ageRange == null) {
                return AgeRange.OTHERS;
            }
            return ageRange;
        }

        public Companion() {
        }
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final j71 getRange() {
        return this.range;
    }

    AgeRange(int i, j71 j71Var) {
        this.id = i;
        this.range = j71Var;
    }
}
