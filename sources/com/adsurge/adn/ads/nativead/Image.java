package com.adsurge.adn.ads.nativead;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Image {
    public final String a;
    public final float b;

    public boolean equals(@Nullable String str) {
        return TextUtils.equals(this.a, str);
    }

    public float getAspectRatio() {
        return this.b;
    }

    public String getUrl() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Image{mUrl='");
        sb.append(this.a);
        sb.append("', mAspectRatio=");
        return h50.k(sb, this.b, '}');
    }

    public Image(String str, float f) {
        this.a = str;
        this.b = f;
    }
}
