package io.p071bidmachine.internal;

import defpackage.h50;
import io.p071bidmachine.protobuf.sdk.RestrictionMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RestrictionMode.values().length];
        try {
            iArr[RestrictionMode.RESTRICTION_MODE_STRICT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RestrictionMode.RESTRICTION_MODE_MODERATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RestrictionMode.RESTRICTION_MODE_OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[h50.E(3).length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
