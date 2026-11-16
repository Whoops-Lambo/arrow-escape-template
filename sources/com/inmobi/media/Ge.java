package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ge implements InterfaceC3921bq {
    public final Xp a;
    public final Cf b;

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    @Override // com.inmobi.media.InterfaceC3921bq
    public final EnumC3893aq a() {
        boolean zA;
        boolean z;
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3893aq.HIDDEN;
        }
        Cf cf = this.b;
        Gf gf = cf.e;
        Kp kp = gf.b;
        if (kp.a) {
            MediaView mediaView = cf.c;
            if (mediaView == null || !kp.b) {
                zA = false;
            } else {
                zA = AbstractC4115iq.a(mediaView, kp.c);
            }
        } else {
            Kp kp2 = gf.a;
            if (kp2.a) {
                ImageView imageView = cf.b;
                if (imageView == null || !kp2.b) {
                    zA = false;
                } else {
                    zA = AbstractC4115iq.a(imageView, kp2.c);
                }
            } else {
                zA = true;
            }
        }
        if (zA) {
            Xp xp = this.a;
            z = AbstractC4115iq.a(viewGroup, rect, xp.a, xp.b) && AbstractC4115iq.a(viewGroup, rect, this.a.a, this.b.d);
        }
        return z ? EnumC3893aq.VISIBLE : EnumC3893aq.HIDDEN;
    }

    public Ge(Xp xp, Cf cf) {
        xp.getClass();
        cf.getClass();
        this.a = xp;
        this.b = cf;
    }
}
