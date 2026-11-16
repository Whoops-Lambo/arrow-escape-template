package com.bytedance.sdk.openadsdk.core.twf.kgy.kgy;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    public static com.bytedance.sdk.openadsdk.core.twf.rz kgy(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ct.kgy kgyVar;
        int i;
        byte b;
        if (context == null) {
            ct.kgy(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i4 = (int) (i2 / f);
        int i5 = (int) (i3 / f);
        float f2 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.twf.rz rzVar = null;
        while (true) {
            int i6 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return rzVar;
            }
            xmlPullParser.next();
            int i7 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = ct.fi;
                int iAhm = ct.ahm(xmlPullParser.getAttributeValue(str, "width"));
                int iAhm2 = ct.ahm(xmlPullParser.getAttributeValue(str, "height"));
                if (iAhm < 300 || iAhm2 < 250) {
                    ct.kgy(xmlPullParser);
                    f2 = f2;
                    rzVar = rzVar;
                } else {
                    ct.kgy kgyVar2 = new ct.kgy();
                    while (true) {
                        if (xmlPullParser.getEventType() != i6 || !xmlPullParser.getName().equals("Companion")) {
                            iAhm2 = iAhm2;
                            iAhm = iAhm;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i7) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                f2 = f2;
                                rzVar = rzVar;
                                byte b2 = -1;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b = 0;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            b = 1;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            b = 4;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b = 5;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        ct.kgy kgyVar3 = kgyVar2;
                                        i = 2;
                                        Point pointKgy = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.kgy(context, iAhm, iAhm2, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.HTML_RESOURCE);
                                        int i8 = pointKgy.x;
                                        int i9 = pointKgy.y;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.IFRAME_RESOURCE;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.NONE;
                                        float fKgy = com.bytedance.sdk.openadsdk.core.twf.rz.kgy(i4, i5, i8, i9, ahmVar, enumC0266kgy);
                                        String strAhm = ct.ahm(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strAhm) && fKgy > kgyVar3.yo && fKgy > f2) {
                                            kgyVar3.yo = fKgy;
                                            kgyVar3.kgy(strAhm, enumC0266kgy, ahmVar);
                                            kgyVar2 = kgyVar3;
                                            i7 = i;
                                            iAhm = iAhm;
                                            iAhm2 = iAhm2;
                                            f2 = f2;
                                            rzVar = rzVar;
                                            i6 = 3;
                                        } else {
                                            ct.kgy(xmlPullParser, "IFrameResource", 3);
                                            kgyVar2 = kgyVar3;
                                            i6 = 3;
                                            i7 = 2;
                                        }
                                        break;
                                    case 1:
                                        i = 2;
                                        kgyVar2.uq = ct.ahm(xmlPullParser, "CompanionClickThrough");
                                        i7 = i;
                                        iAhm = iAhm;
                                        iAhm2 = iAhm2;
                                        f2 = f2;
                                        rzVar = rzVar;
                                        i6 = 3;
                                        break;
                                    case 2:
                                        kgyVar = kgyVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                kgyVar2 = kgyVar;
                                                iAhm2 = iAhm2;
                                                f2 = f2;
                                                rzVar = rzVar;
                                                i6 = 3;
                                                i7 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                kgyVar.ahm(ct.ahm(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        kgyVar = kgyVar2;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy2 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(ct.fi, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.kgy;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.IMAGE : com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.JAVASCRIPT;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar2 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.STATIC_RESOURCE;
                                        Point pointKgy2 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.kgy(context, iAhm, iAhm2, ahmVar2);
                                        float fKgy2 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy(i4, i5, pointKgy2.x, pointKgy2.y, ahmVar2, enumC0266kgy3);
                                        String strAhm2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.contains(lowerCase)) ? ct.ahm(xmlPullParser, "StaticResource") : null;
                                        if (fKgy2 >= kgyVar.yo && fKgy2 > f2 && !TextUtils.isEmpty(strAhm2)) {
                                            kgyVar.yo = fKgy2;
                                            kgyVar.kgy(strAhm2, enumC0266kgy3, ahmVar2);
                                            kgyVar2 = kgyVar;
                                            iAhm2 = iAhm2;
                                            f2 = f2;
                                            rzVar = rzVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            ct.kgy(xmlPullParser, "StaticResource", 3);
                                            iAhm = iAhm;
                                            kgyVar2 = kgyVar;
                                            iAhm2 = iAhm2;
                                            f2 = f2;
                                            i7 = 2;
                                            i6 = 3;
                                            rzVar = rzVar;
                                        }
                                        break;
                                    case 4:
                                        kgyVar2.kgy(ct.ahm(xmlPullParser, "CompanionClickTracking"));
                                        iAhm2 = iAhm2;
                                        f2 = f2;
                                        rzVar = rzVar;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    case 5:
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar3 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm.HTML_RESOURCE;
                                        Point pointKgy3 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.kgy(context, iAhm, iAhm2, ahmVar3);
                                        int i10 = pointKgy3.x;
                                        int i11 = pointKgy3.y;
                                        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy4 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy.NONE;
                                        kgyVar = kgyVar2;
                                        float fKgy3 = com.bytedance.sdk.openadsdk.core.twf.rz.kgy(i4, i5, i10, i11, ahmVar3, enumC0266kgy4);
                                        String strAhm3 = ct.ahm(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strAhm3) && fKgy3 > kgyVar.yo && fKgy3 > f2) {
                                            kgyVar.yo = fKgy3;
                                            kgyVar.kgy(strAhm3, enumC0266kgy4, ahmVar3);
                                            kgyVar2 = kgyVar;
                                            iAhm2 = iAhm2;
                                            f2 = f2;
                                            rzVar = rzVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            ct.kgy(xmlPullParser, "HTMLResource", 3);
                                            kgyVar2 = kgyVar;
                                            i7 = 2;
                                            i6 = 3;
                                        }
                                        break;
                                    default:
                                        ct.kgy(xmlPullParser);
                                        kgyVar = kgyVar2;
                                        kgyVar2 = kgyVar;
                                        iAhm2 = iAhm2;
                                        f2 = f2;
                                        rzVar = rzVar;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                }
                            } else {
                                iAhm = iAhm;
                                iAhm2 = iAhm2;
                            }
                        } else if (!TextUtils.isEmpty(kgyVar2.kgy) && kgyVar2.yo >= f2) {
                            com.bytedance.sdk.openadsdk.core.twf.rz rzVar2 = new com.bytedance.sdk.openadsdk.core.twf.rz(iAhm, iAhm2, kgyVar2.ahm, kgyVar2.rz, kgyVar2.kgy, kgyVar2.ct, kgyVar2.noq, kgyVar2.uq);
                            f2 = kgyVar2.yo;
                            rzVar = rzVar2;
                        }
                    }
                }
            } else {
                f2 = f2;
                rzVar = rzVar;
            }
        }
    }
}
