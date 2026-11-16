package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ba0;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fy;
import defpackage.n30;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4504x {
    public final Context a;
    public final Image b;
    public final AdConfig.AdChoiceConfig c;
    public final Z9 d;
    public final String e;

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    public final Object a(C4546ye c4546ye) {
        String url;
        int width;
        int height;
        Image image = this.b;
        if (image == null || (url = image.getUrl()) == null) {
            url = this.c.getUrl();
        } else {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
            if (url == null) {
                url = this.c.getUrl();
            }
        }
        String str = url;
        Image image2 = this.b;
        if (image2 != null) {
            int width2 = image2.getWidth();
            Integer numValueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                width = numValueOf.intValue();
            } else {
                width = this.c.getWidth();
            }
        } else {
            width = this.c.getWidth();
        }
        int i = width;
        Image image3 = this.b;
        if (image3 != null) {
            int height2 = image3.getHeight();
            Integer numValueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
            if (numValueOf2 != null) {
                height = numValueOf2.intValue();
            } else {
                height = this.c.getHeight();
            }
        } else {
            height = this.c.getHeight();
        }
        int i2 = height;
        int loadTimeout = this.c.getLoadTimeout();
        if (URLUtil.isNetworkUrl(str)) {
            ba0 ba0Var = xc0.a;
            return tb5.E(wg1.a, new C4367s(this, str, loadTimeout, i, i2, null), c4546ye);
        }
        Z9 z9 = this.d;
        if (z9 != null) {
            n30.v("Invalid URL: ", str, z9, "AdChoiceViewManager");
        }
        throw new C3964dd();
    }

    public C4504x(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, Z9 z9) {
        context.getClass();
        adChoiceConfig.getClass();
        this.a = context;
        this.b = image;
        this.c = adChoiceConfig;
        this.d = z9;
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.e = "AdChoice-Image-".concat(string);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(C4504x c4504x, C4250nl c4250nl, String str, int i, fy fyVar) {
        C4395t c4395t;
        c4504x.getClass();
        if (fyVar instanceof C4395t) {
            c4395t = (C4395t) fyVar;
            int i2 = c4395t.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4395t.c = i2 - Integer.MIN_VALUE;
            } else {
                c4395t = new C4395t(c4504x, fyVar);
            }
        } else {
            c4395t = new C4395t(c4504x, fyVar);
        }
        Object objN = c4395t.a;
        int i3 = c4395t.c;
        if (i3 == 0) {
            wz2.a0(objN);
            C4477w c4477w = new C4477w(c4504x, str, c4250nl, null);
            c4395t.c = 1;
            objN = ep0.N(i, c4477w, c4395t);
            dz dzVar = dz.a;
            if (objN == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objN);
        }
        Boolean bool = (Boolean) objN;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
