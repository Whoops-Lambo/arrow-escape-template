package com.adsurge.adn.p014d0;

import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class p extends i.a {
    public static final Property c = new a(Float.class, "rotation");
    public static final Property d = new b(Float.class, "rotationX");
    public static final Property e = new c(Float.class, "rotationY");
    public final Property b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float rotation;
            View viewC = iVar.C();
            if (viewC == null) {
                rotation = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                rotation = viewC.getRotation();
            }
            return Float.valueOf(rotation);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.b(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float rotationX;
            View viewC = iVar.C();
            if (viewC == null) {
                rotationX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                rotationX = viewC.getRotationX();
            }
            return Float.valueOf(rotationX);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.c(f.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(i iVar) {
            float rotationY;
            View viewC = iVar.C();
            if (viewC == null) {
                rotationY = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                rotationY = viewC.getRotationY();
            }
            return Float.valueOf(rotationY);
        }

        @Override // android.util.Property
        public void set(i iVar, Float f) {
            iVar.d(f.floatValue());
        }
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        if (aVar.c.length() < 2) {
            return null;
        }
        return new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) this.b, aVar.c.optInt(0), aVar.c.optInt(1))};
    }

    public p(Property property) {
        this.b = property;
    }
}
