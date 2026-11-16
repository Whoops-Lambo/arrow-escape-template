package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
final class GradientColorInflaterCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ColorStops {
        public final int[] a;
        public final float[] b;

        public ColorStops(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) arrayList.get(i)).intValue();
                this.b[i] = ((Float) arrayList2.get(i)).floatValue();
            }
        }

        public ColorStops(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        }

        public ColorStops(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
        }
    }
}
