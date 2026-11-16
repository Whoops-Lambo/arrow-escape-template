package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import com.fyber.inneractive.sdk.model.vast.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[k.values().length];
        a = iArr;
        try {
            iArr[k.Jpeg.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[k.Jpg.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[k.Png.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
