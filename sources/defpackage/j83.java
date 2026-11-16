package defpackage;

import com.google.android.exoplayer2.text.webvtt.WebvttCssStyle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class j83 implements Comparable {
    public final int a;
    public final WebvttCssStyle b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((j83) obj).a);
    }

    public j83(int i, WebvttCssStyle webvttCssStyle) {
        this.a = i;
        this.b = webvttCssStyle;
    }
}
