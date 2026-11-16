package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i, int i2, int i3, int i4) {
        boolean z;
        if (i <= i3 && i2 <= i4) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.left = i;
        this.bottom = i2;
        this.right = i3;
        this.top = i4;
    }

    public GlRect(int i, int i2) {
        this(0, 0, i, i2);
    }
}
