package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AnimationSpecKt {
    public static SpringSpec a(int i, Object obj) {
        float f = (i & 2) != 0 ? 1500.0f : 400.0f;
        if ((i & 4) != 0) {
            obj = null;
        }
        return new SpringSpec(obj, f);
    }

    public static TweenSpec b(int i, int i2, Easing easing, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = EasingKt.a;
        }
        return new TweenSpec(i, i2, easing);
    }
}
