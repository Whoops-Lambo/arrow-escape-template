package com.vungle.ads.fpd;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/vungle/ads/fpd/LiftoffGender;", "", "", "a", "I", "getValue", "()I", "value", "FEMALE", "MALE", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public enum LiftoffGender {
    FEMALE(0),
    MALE(1);


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int value;

    public final int getValue() {
        return this.value;
    }

    LiftoffGender(int i) {
        this.value = i;
    }
}
