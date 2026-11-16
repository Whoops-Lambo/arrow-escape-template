package com.adsurge.adn.p014d0;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends i.a {
    public final Property b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends g {

        /* JADX INFO: renamed from: com.adsurge.adn.d0.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C0106a extends Property {
            @Override // android.util.Property
            public Integer get(i iVar) {
                View viewC = iVar.C();
                if (viewC == null) {
                    return 0;
                }
                Drawable background = viewC.getBackground();
                if (background instanceof ColorDrawable) {
                    return Integer.valueOf(((ColorDrawable) background).getColor());
                }
                return 0;
            }

            public C0106a(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            public void set(i iVar, Integer num) {
                iVar.f(num.intValue());
            }
        }

        public a() {
            super(new C0106a(Integer.class, "backgroundColor"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends g {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class a extends Property {
            public a(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            public Integer get(i iVar) {
                return 0;
            }

            @Override // android.util.Property
            public void set(i iVar, Integer num) {
                iVar.g(num.intValue());
            }
        }

        public b() {
            super(new a(Integer.class, "borderColor"));
        }
    }

    @Override // com.adsurge.adn.d0.i.a
    public PropertyValuesHolder[] a(com.adsurge.adn.p026h0.a aVar) {
        if (aVar.c.length() < 2) {
            return null;
        }
        try {
            String strOptString = aVar.c.optString(0);
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            int color = Color.parseColor(strOptString);
            try {
                String strOptString2 = aVar.c.optString(1);
                if (TextUtils.isEmpty(strOptString2)) {
                    return null;
                }
                PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt((Property<?, Integer>) this.b, color, Color.parseColor(strOptString2));
                propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
                return new PropertyValuesHolder[]{propertyValuesHolderOfInt};
            } catch (IllegalArgumentException e) {
                com.adsurge.adn.J0.a.a(this.a, e.toString());
                return null;
            }
        } catch (IllegalArgumentException e2) {
            com.adsurge.adn.J0.a.a(this.a, e2.toString());
            return null;
        }
    }

    public g(Property property) {
        this.b = property;
    }
}
