package com.adsurge.adn.x1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class h {
    public b a = b.Unuse;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        Success,
        Fail,
        Unuse
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.Unuse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.Fail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void a() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            this.a = b.Success;
        } else {
            if (i != 2) {
                return;
            }
            this.a = b.Fail;
        }
    }

    public void b() {
        this.a = b.Unuse;
    }
}
