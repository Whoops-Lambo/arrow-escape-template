package com.adsurge.adn.p070z0;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends com.adsurge.adn.p070z0.a {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements i.e {
        @Override // com.adsurge.adn.l0.i.e
        public i a() {
            return new b();
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public d q() {
        return new d(this, (c) this.y);
    }

    @Override // com.adsurge.adn.p038l0.i
    public void b(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            return;
        }
        ((c) this.y).setShadowLayer(iArr[2], iArr[0], iArr[1], iArr[3]);
    }

    @Override // com.adsurge.adn.p070z0.a
    public boolean c(int[] iArr) {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 26 || iArr == null || iArr.length != 3 || (i = iArr[0]) <= 0 || (i2 = iArr[2]) <= 0 || i >= (i3 = iArr[1]) || i2 > i3 - i) {
            return false;
        }
        ((c) this.y).setAutoSizeTextTypeWithDefaults(1);
        ((c) this.y).setAutoSizeTextTypeUniformWithConfiguration(iArr[0], iArr[1], iArr[2], 1);
        return true;
    }

    @Override // com.adsurge.adn.p070z0.a
    public void m(int i) {
        ((c) this.y).setGravity(i);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void n(int i) {
        ((c) this.y).setMaxLines(i);
        ((c) this.y).setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void o(int i) {
        ((c) this.y).setTextColor(i);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void p(int i) {
        ((c) this.y).setTextSize(1, i);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void q(int i) {
        int i2 = i & 3;
        if (i2 != 0) {
            if (i2 == 1) {
                ((c) this.y).setTypeface(Typeface.defaultFromStyle(1));
            } else if (i2 == 2) {
                ((c) this.y).setTypeface(Typeface.defaultFromStyle(2));
            } else if (i2 == 3) {
                ((c) this.y).setTypeface(Typeface.defaultFromStyle(3));
            }
        }
        int i3 = (i & 4) != 0 ? 16 : 0;
        if ((i & 8) != 0) {
            i3 |= 8;
        }
        if (i3 != 0) {
            TextPaint paint = ((c) this.y).getPaint();
            paint.setFlags(paint.getFlags() | i3);
        }
    }

    @Override // com.adsurge.adn.p070z0.a, com.adsurge.adn.p038l0.i
    public /* bridge */ /* synthetic */ boolean a(String str, h hVar) {
        return super.a(str, hVar);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void a(CharSequence charSequence) {
        b(charSequence);
    }

    @Override // com.adsurge.adn.p070z0.a
    public void b(boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ((c) this.y).setAutoSizeTextTypeWithDefaults(z ? 1 : 0);
        if (z) {
            ((c) this.y).setAutoSizeTextTypeUniformWithConfiguration(12, 400, 1, 0);
        }
    }

    public final void b(CharSequence charSequence) {
        ((c) this.y).setText(charSequence);
    }

    @Override // com.adsurge.adn.p038l0.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c b(com.adsurge.adn.p011c0.a aVar) {
        return new c(aVar.c());
    }

    @Override // com.adsurge.adn.p070z0.a
    public void c(boolean z) {
        ((c) this.y).a(z);
    }
}
