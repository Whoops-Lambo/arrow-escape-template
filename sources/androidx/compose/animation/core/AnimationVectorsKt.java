package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AnimationVectorsKt {
    public static final AnimationVector a(AnimationVector animationVector) {
        animationVector.getClass();
        AnimationVector animationVectorC = animationVector.c();
        int iB = animationVectorC.b();
        for (int i = 0; i < iB; i++) {
            animationVectorC.e(animationVector.a(i), i);
        }
        return animationVectorC;
    }
}
