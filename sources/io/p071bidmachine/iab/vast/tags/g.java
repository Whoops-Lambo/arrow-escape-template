package io.p071bidmachine.iab.vast.tags;

import android.text.TextUtils;
import defpackage.jc1;
import defpackage.n30;
import defpackage.nj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends q {
    public static final String[] i = {"width", "height", "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", "adSlotID", "required"};
    public final l c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final EnumMap h;

    @Override // io.p071bidmachine.iab.vast.tags.q
    public final String[] n() {
        return i;
    }

    public final String y() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        l lVar = this.c;
        if (lVar != null) {
            return n30.n("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%; height: 100%; justify-content: center; align-items: center\" href=\"", this.f, "\" target=\"_blank\"><img style=\"border-style: none; height: 100%; width: 100%; object-fit: contain;\" src=\"", lVar.a, "\"/></a>');</script>");
        }
        String str2 = this.d;
        if (str2 != null) {
            return nj.q(jc1.t("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"", f("width"), "\" height=\"", f("height"), "\" src=\""), str2, "\"></iframe>");
        }
        return null;
    }

    public g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean zMatches;
        x(xmlPullParser);
        xmlPullParser.require(2, null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (q.d(name, "StaticResource")) {
                    l lVar = new l(1);
                    lVar.x(xmlPullParser);
                    String strA = lVar.a("creativeType");
                    if (!TextUtils.isEmpty(strA)) {
                        zMatches = strA.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
                    } else {
                        zMatches = false;
                    }
                    if (zMatches) {
                        this.c = lVar;
                    }
                } else if (q.d(name, "IFrameResource")) {
                    this.d = q.h(xmlPullParser);
                } else if (q.d(name, "HTMLResource")) {
                    this.e = q.h(xmlPullParser);
                } else if (q.d(name, "CompanionClickThrough")) {
                    this.f = q.h(xmlPullParser);
                } else if (q.d(name, "CompanionClickTracking")) {
                    String strH = q.h(xmlPullParser);
                    if (!TextUtils.isEmpty(strH)) {
                        if (this.g == null) {
                            this.g = new ArrayList();
                        }
                        this.g.add(strH);
                    }
                } else if (q.d(name, "TrackingEvents")) {
                    this.h = (EnumMap) new p(xmlPullParser, 1).d;
                } else if (q.d(name, "AdParameters")) {
                    q.h(xmlPullParser);
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Companion");
    }
}
