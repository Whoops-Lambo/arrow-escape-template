package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dt1;
import defpackage.rh1;
import defpackage.s71;
import defpackage.wr0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public final KeyframesSpecConfig a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class KeyframeEntity<T> {
        public final Float a;
        public Easing b;

        public KeyframeEntity(Float f) {
            CubicBezierEasing cubicBezierEasing = EasingKt.a;
            this.a = f;
            this.b = EasingKt$LinearEasing$1.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return s71.b(keyframeEntity.a, this.a) && s71.b(keyframeEntity.b, this.b);
        }

        public final int hashCode() {
            Float f = this.a;
            return this.b.hashCode() + ((f != null ? f.hashCode() : 0) * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class KeyframesSpecConfig<T> {
        public int a = 300;
        public final LinkedHashMap b = new LinkedHashMap();

        public final KeyframeEntity a(Float f, int i) {
            KeyframeEntity keyframeEntity = new KeyframeEntity(f);
            this.b.put(Integer.valueOf(i), keyframeEntity);
            return keyframeEntity;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof KeyframesSpecConfig)) {
                return false;
            }
            KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) obj;
            return this.a == keyframesSpecConfig.a && s71.b(this.b, keyframesSpecConfig.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a * 961);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyframesSpec) {
            return this.a.equals(((KeyframesSpec) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public KeyframesSpec(KeyframesSpecConfig keyframesSpecConfig) {
        this.a = keyframesSpecConfig;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final VectorizedKeyframesSpec a(TwoWayConverter twoWayConverter) {
        twoWayConverter.getClass();
        KeyframesSpecConfig keyframesSpecConfig = this.a;
        LinkedHashMap linkedHashMap = keyframesSpecConfig.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(rh1.U(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            KeyframeEntity keyframeEntity = (KeyframeEntity) entry.getValue();
            wr0 a = twoWayConverter.getA();
            keyframeEntity.getClass();
            a.getClass();
            linkedHashMap2.put(key, new dt1(a.invoke(keyframeEntity.a), keyframeEntity.b));
        }
        return new VectorizedKeyframesSpec(linkedHashMap2, keyframesSpecConfig.a);
    }
}
