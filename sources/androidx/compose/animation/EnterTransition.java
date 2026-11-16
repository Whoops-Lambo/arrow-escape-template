package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "Companion", "Landroidx/compose/animation/EnterTransitionImpl;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class EnterTransition {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public abstract TransitionData getA();

    public final EnterTransition b(EnterTransition enterTransition) {
        TransitionData transitionData = ((EnterTransitionImpl) this).a;
        Fade fade = transitionData.a;
        if (fade == null) {
            fade = ((EnterTransitionImpl) enterTransition).a.a;
        }
        Slide slide = transitionData.b;
        if (slide == null) {
            slide = ((EnterTransitionImpl) enterTransition).a.b;
        }
        ChangeSize changeSize = transitionData.c;
        if (changeSize == null) {
            changeSize = ((EnterTransitionImpl) enterTransition).a.c;
        }
        Scale scale = transitionData.d;
        if (scale == null) {
            scale = ((EnterTransitionImpl) enterTransition).a.d;
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && s71.b(((EnterTransition) obj).getA(), getA());
    }

    public final int hashCode() {
        return getA().hashCode();
    }
}
