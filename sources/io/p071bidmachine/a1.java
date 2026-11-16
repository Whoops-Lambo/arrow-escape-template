package io.p071bidmachine;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ViewAdObject.MeasureMode.values().length];
        a = iArr;
        try {
            iArr[ViewAdObject.MeasureMode.Direct.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ViewAdObject.MeasureMode.Wrap.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
