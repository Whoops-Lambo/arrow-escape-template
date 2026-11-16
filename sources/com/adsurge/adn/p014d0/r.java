package com.adsurge.adn.p014d0;

import android.animation.TimeInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {
    public static final Map a;
    public static final TimeInterpolator b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements c {
        @Override // com.adsurge.adn.d0.r.c
        public TimeInterpolator a(JSONArray jSONArray) {
            int length;
            if (jSONArray == null || (length = jSONArray.length()) < 2) {
                return null;
            }
            return length > 3 ? new PathInterpolator((float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1), (float) jSONArray.optDouble(2), (float) jSONArray.optDouble(3)) : new PathInterpolator((float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends BounceInterpolator implements c {
        public final int a;

        @Override // com.adsurge.adn.d0.r.c
        public TimeInterpolator a(JSONArray jSONArray) {
            return this;
        }

        @Override // android.view.animation.BounceInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = this.a;
            if (i == 1) {
                return 1.0f - super.getInterpolation(1.0f - f);
            }
            if (i != 2) {
                return super.getInterpolation(f);
            }
            return ((double) f) < 0.5d ? (1.0f - super.getInterpolation(1.0f - (f * 2.0f))) / 2.0f : (super.getInterpolation((f * 2.0f) - 1.0f) + 1.0f) / 2.0f;
        }

        public b(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        TimeInterpolator a(JSONArray jSONArray);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d implements c, TimeInterpolator {
        public final int a;

        public final float a(float f, float f2, int i) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 1.0f) {
                return f;
            }
            double d = ((i * f) - 1.0f) * 10.0f;
            double d2 = f2;
            return (float) (Math.sin(((d - (0.25d * d2)) * 6.283185307179586d) / d2) * (-Math.pow(2.0d, d)));
        }

        public final float b(float f, float f2, int i) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 1.0f) {
                return f;
            }
            float f3 = i;
            double d = (((f * f3) + 1.0f) - f3) * 10.0f;
            double d2 = f2;
            return (float) ((Math.sin(((d - (0.25d * d2)) * 6.283185307179586d) / d2) * Math.pow(2.0d, -d)) + 1.0d);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = this.a;
            if (i == 0) {
                return b(f, 3.0f, 1);
            }
            if (i == 1) {
                return a(f, 3.0f, 1);
            }
            if (i != 2) {
                return f;
            }
            return (((double) f) < 0.5d ? a(f, 4.5f, 2) : b(f, 4.5f, 2)) / 2.0f;
        }

        public d(int i) {
            this.a = i;
        }

        @Override // com.adsurge.adn.d0.r.c
        public TimeInterpolator a(JSONArray jSONArray) {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e implements c {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class a implements TimeInterpolator {
            public final /* synthetic */ double a;
            public final /* synthetic */ double b;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) Math.sin(((((double) f) * this.a) + this.b) * 3.141592653589793d);
            }

            public a(double d, double d2) {
                this.a = d;
                this.b = d2;
            }
        }

        @Override // com.adsurge.adn.d0.r.c
        public TimeInterpolator a(JSONArray jSONArray) {
            double dOptDouble = 0.0d;
            double dOptDouble2 = 1.0d;
            if (jSONArray != null && jSONArray.length() >= 2) {
                dOptDouble = jSONArray.optDouble(0, 0.0d);
                dOptDouble2 = jSONArray.optDouble(1, 1.0d);
            }
            double d = dOptDouble;
            return new a(dOptDouble2 - d, d);
        }
    }

    static {
        HashMap map = new HashMap();
        a = map;
        b = new LinearInterpolator();
        map.put(25, new d(1));
        map.put(26, new d(0));
        map.put(27, new d(2));
        map.put(28, new b(1));
        map.put(29, new b(0));
        map.put(30, new b(2));
        map.put(31, new a());
        map.put(32, new e());
    }

    public static TimeInterpolator a(com.adsurge.adn.p026h0.a aVar) {
        int i = aVar.i;
        if (i > 0 && i < 25) {
            i = 31;
        }
        c cVar = (c) a.get(Integer.valueOf(i));
        return cVar == null ? b : cVar.a(aVar.j);
    }
}
