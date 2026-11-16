package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TransitionData {
    public final Fade a;
    public final Slide b;
    public final ChangeSize c;
    public final Scale d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return s71.b(this.a, transitionData.a) && s71.b(this.b, transitionData.b) && s71.b(this.c, transitionData.c) && s71.b(this.d, transitionData.d);
    }

    public final int hashCode() {
        Fade fade = this.a;
        int iHashCode = fade == null ? 0 : fade.hashCode();
        Slide slide = this.b;
        if (slide != null) {
            slide.getClass();
            throw null;
        }
        int i = iHashCode * 961;
        ChangeSize changeSize = this.c;
        int iHashCode2 = (i + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.d;
        return iHashCode2 + (scale != null ? scale.hashCode() : 0);
    }

    public /* synthetic */ TransitionData(Fade fade, ChangeSize changeSize, Scale scale, int i) {
        this((i & 1) != 0 ? null : fade, (Slide) null, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ')';
    }

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale) {
        this.a = fade;
        this.b = slide;
        this.c = changeSize;
        this.d = scale;
    }
}
