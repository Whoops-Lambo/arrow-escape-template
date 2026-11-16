package io.p071bidmachine.iab.vast.tags;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C4664b4;
import io.p071bidmachine.iab.utils.q;
import io.p071bidmachine.iab.vast.c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends j {
    public final q d;
    public final q e;
    public final q f;
    public final q g;
    public final q h;
    public final q i;
    public final q j;
    public final q k;
    public final o l;
    public final Integer m;
    public final Integer n;
    public final g o;
    public final Boolean p;
    public final Float q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final Integer v;

    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed  */
    public e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer num;
        int i;
        x(xmlPullParser);
        this.d = new q();
        this.e = new q();
        this.f = new q();
        this.g = new q();
        this.h = new q();
        this.i = new q();
        this.j = new q();
        this.k = new q();
        this.l = new o();
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        xmlPullParser.require(2, null, "Extension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (q.d(name, "Video")) {
                    q.c(xmlPullParser, this.d);
                } else if (q.d(name, "LoadingView")) {
                    q.c(xmlPullParser, this.j);
                } else if (q.d(name, "Countdown")) {
                    q.c(xmlPullParser, this.k);
                } else if (q.d(name, "Progress")) {
                    q.c(xmlPullParser, this.h);
                } else if (q.d(name, "ClosableView")) {
                    q.c(xmlPullParser, this.g);
                } else if (q.d(name, "Mute")) {
                    q.c(xmlPullParser, this.f);
                } else if (q.d(name, NativeAdContent.ViewTag.CTA)) {
                    q.c(xmlPullParser, this.e);
                } else if (q.d(name, "RepeatView")) {
                    q.c(xmlPullParser, this.i);
                } else if (q.d(name, "Postbanner")) {
                    this.l.x(xmlPullParser);
                } else if (q.d(name, "Autorotate")) {
                    this.p = Boolean.valueOf(q.t(q.h(xmlPullParser)));
                } else if (q.d(name, "R1")) {
                    this.t = q.t(q.h(xmlPullParser));
                } else if (q.d(name, "R2")) {
                    this.u = q.t(q.h(xmlPullParser));
                } else if (q.d(name, "ForceOrientation")) {
                    String strH = q.h(xmlPullParser);
                    if (!TextUtils.isEmpty(strH)) {
                        String lowerCase = strH.toLowerCase();
                        lowerCase.getClass();
                        if (!lowerCase.equals(C4664b4.i.D)) {
                            if (lowerCase.equals(C4664b4.i.C)) {
                                num = 2;
                            } else {
                                num = null;
                            }
                        } else {
                            num = 1;
                        }
                    } else {
                        num = null;
                    }
                    this.v = num;
                } else if (q.d(name, "CtaText")) {
                    this.e.r = q.h(xmlPullParser);
                } else if (q.d(name, "ShowCta")) {
                    this.e.d = Boolean.valueOf(q.t(q.h(xmlPullParser)));
                } else if (q.d(name, "ShowMute")) {
                    this.f.d = Boolean.valueOf(q.t(q.h(xmlPullParser)));
                } else if (q.d(name, "ShowCompanion")) {
                    this.l.j = q.t(q.h(xmlPullParser));
                } else if (q.d(name, "CompanionCloseTime")) {
                    String strH2 = q.h(xmlPullParser);
                    if (strH2 != null) {
                        String[] strArrSplit = strH2.split(":");
                        if (strArrSplit.length > 1) {
                            try {
                                i = (Integer.parseInt(strArrSplit[0]) * 60) + Integer.parseInt(strArrSplit[1]);
                            } catch (Exception e) {
                                c.a.C("VastXmlTag", e);
                                i = -1;
                            }
                        } else {
                            i = -1;
                        }
                    } else {
                        i = -1;
                    }
                    if (i > -1) {
                        this.l.h = i;
                    }
                } else if (q.d(name, "Muted")) {
                    this.r = q.t(q.h(xmlPullParser));
                } else if (q.d(name, "VideoClickable")) {
                    this.s = q.t(q.h(xmlPullParser));
                } else if (q.d(name, "CtaXPosition")) {
                    this.e.e = q.o(q.h(xmlPullParser));
                } else if (q.d(name, "CtaYPosition")) {
                    this.e.f = q.q(q.h(xmlPullParser));
                } else if (q.d(name, "CloseXPosition")) {
                    this.g.e = q.o(q.h(xmlPullParser));
                } else if (q.d(name, "CloseYPosition")) {
                    this.g.f = q.q(q.h(xmlPullParser));
                } else if (q.d(name, "MuteXPosition")) {
                    this.f.e = q.o(q.h(xmlPullParser));
                } else if (q.d(name, "MuteYPosition")) {
                    this.f.f = q.q(q.h(xmlPullParser));
                } else if (q.d(name, "AssetsColor")) {
                    Integer numG = q.g(q.h(xmlPullParser));
                    if (numG != null) {
                        this.m = numG;
                    }
                } else if (q.d(name, "AssetsBackgroundColor")) {
                    Integer numG2 = q.g(q.h(xmlPullParser));
                    if (numG2 != null) {
                        this.n = numG2;
                    }
                } else if (q.d(name, "Companion")) {
                    g gVar = new g(xmlPullParser);
                    String strA = gVar.a("width");
                    String strA2 = gVar.a("height");
                    if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA2) && (gVar.e != null || gVar.c != null || gVar.d != null)) {
                        this.o = gVar;
                    }
                } else if (q.d(name, "CloseTime")) {
                    String strH3 = q.h(xmlPullParser);
                    if (strH3 != null) {
                        this.q = Float.valueOf(Float.parseFloat(strH3));
                    }
                } else if (q.d(name, "ShowProgress")) {
                    this.h.d = Boolean.valueOf(q.t(q.h(xmlPullParser)));
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extension");
    }
}
