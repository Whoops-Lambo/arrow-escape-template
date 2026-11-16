package com.unity3d.player;

import defpackage.fs1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
abstract class SoftInputProvider {
    private static final native int nativeGetSoftInputType();

    public static int a() {
        int iNativeGetSoftInputType = nativeGetSoftInputType();
        int[] iArr = new int[4];
        System.arraycopy(fs1.b, 0, iArr, 0, 4);
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= 4) {
                return 1;
            }
            int i3 = iArr[i];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            i2 = 2;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    i2 = 0;
                }
            } else {
                i2 = -1;
            }
            if (i2 == iNativeGetSoftInputType) {
                return i3;
            }
            i++;
        }
    }
}
