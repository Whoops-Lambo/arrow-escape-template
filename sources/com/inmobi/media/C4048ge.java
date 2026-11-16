package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4048ge implements InterfaceC3921bq {
    public final Xp a;
    public final Cf b;

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // com.inmobi.media.InterfaceC3921bq
    public final EnumC3893aq a() {
        boolean z;
        boolean z2;
        Xp xp;
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3893aq.HIDDEN;
        }
        Cf cf = this.b;
        Gf gf = cf.e;
        if (gf.b.a || gf.a.a) {
            Kp kp = gf.a;
            ImageView imageView = cf.b;
            if (kp.a) {
                if ((imageView == null || !kp.b) ? false : AbstractC4115iq.a(imageView, kp.c)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                xp = this.a;
                if (AbstractC4115iq.a(viewGroup, rect, xp.a, xp.b)) {
                    return EnumC3893aq.VISIBLE;
                }
            } else {
                Kp kp2 = gf.b;
                MediaView mediaView = this.b.c;
                if (kp2.a) {
                    z2 = (mediaView == null || !kp2.b) ? false : AbstractC4115iq.a(mediaView, kp2.c);
                }
                if (z2) {
                    xp = this.a;
                    if (AbstractC4115iq.a(viewGroup, rect, xp.a, xp.b) && AbstractC4115iq.a(viewGroup, rect, this.a.a, this.b.d)) {
                        return EnumC3893aq.VISIBLE;
                    }
                }
            }
        } else {
            xp = this.a;
            if (AbstractC4115iq.a(viewGroup, rect, xp.a, xp.b)) {
                return EnumC3893aq.VISIBLE;
            }
        }
        return EnumC3893aq.HIDDEN;
    }

    public C4048ge(Xp xp, Cf cf) {
        xp.getClass();
        cf.getClass();
        this.a = xp;
        this.b = cf;
    }
}
