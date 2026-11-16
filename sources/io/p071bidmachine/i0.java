package io.p071bidmachine;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreativeFormat.values().length];
        a = iArr;
        try {
            iArr[CreativeFormat.Banner.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CreativeFormat.Video.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CreativeFormat.Native.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
