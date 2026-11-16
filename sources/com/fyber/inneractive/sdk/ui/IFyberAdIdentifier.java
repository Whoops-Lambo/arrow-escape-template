package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class IFyberAdIdentifier {
    public ClickListener a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public Corner k = Corner.BOTTOM_LEFT;
    public final com.fyber.inneractive.sdk.config.global.features.a l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ClickListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public abstract void a(ViewGroup viewGroup);

    public IFyberAdIdentifier(r rVar) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = "";
        this.i = "";
        this.j = false;
        this.l = com.fyber.inneractive.sdk.config.global.features.b.e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            if (numA != null) {
                iIntValue = numA.intValue();
            } else {
                iIntValue = 110;
            }
            this.b = iIntValue;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            if (numA2 != null) {
                iIntValue2 = numA2.intValue();
            } else {
                iIntValue2 = 18;
            }
            this.c = iIntValue2;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            if (numA3 != null) {
                iIntValue3 = numA3.intValue();
            } else {
                iIntValue3 = 18;
            }
            this.d = iIntValue3;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            if (numA5 != null) {
                iIntValue4 = numA5.intValue();
            } else {
                iIntValue4 = 8;
            }
            this.f = iIntValue4;
            this.g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.l = bVar.c();
            this.h = bVar.a("ad_identifier_text", "Tap for more information");
            this.i = bVar.a("ad_identifier_icon_url", null);
            this.j = true;
        }
    }
}
