package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mu3 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final zzgzl e = zzgzl.B(2, "auto", "none");
    public static final zzgzl f = zzgzl.B(3, TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    public static final zzgzl g = zzgzl.B(2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    public static final zzgzl h = zzgzl.B(3, TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
    public final int a;
    public final int b;
    public final int c;

    public mu3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
