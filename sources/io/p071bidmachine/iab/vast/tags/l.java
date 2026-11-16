package io.p071bidmachine.iab.vast.tags;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends q {
    public static final String[] d = {"apiFramework"};
    public static final String[] e = {"creativeType"};
    public static final String[] f = {"event"};
    public final /* synthetic */ int c;

    @Override // io.p071bidmachine.iab.vast.tags.q
    public final String[] n() {
        switch (this.c) {
            case 0:
                return d;
            case 1:
                return e;
            default:
                return f;
        }
    }

    @Override // io.p071bidmachine.iab.vast.tags.q
    public boolean r() {
        switch (this.c) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.r();
        }
    }
}
