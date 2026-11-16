package io.p071bidmachine.media3.extractor.jpeg;

import defpackage.d31;
import defpackage.mo1;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.a;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static mo1 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (a.u(xmlPullParserNewPullParser, "x:xmpmeta")) {
            z21 z21Var = d31.b;
            y32 y32VarB = y32.e;
            long j = -9223372036854775807L;
            loop0: do {
                xmlPullParserNewPullParser.next();
                if (a.u(xmlPullParserNewPullParser, "rdf:Description")) {
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strQ = a.q(xmlPullParserNewPullParser, a[i2]);
                        if (strQ != null) {
                            if (Integer.parseInt(strQ) != 1) {
                                break loop0;
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strQ2 = a.q(xmlPullParserNewPullParser, b[i3]);
                                    if (strQ2 != null) {
                                        j = Long.parseLong(strQ2);
                                        if (j != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i3++;
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            while (true) {
                                if (i < 2) {
                                    String strQ3 = a.q(xmlPullParserNewPullParser, c[i]);
                                    if (strQ3 != null) {
                                        y32VarB = d31.F(new b("image/jpeg", 0L, 0L), new b("video/mp4", Long.parseLong(strQ3), 0L));
                                        break;
                                    }
                                    i++;
                                } else {
                                    z21 z21Var2 = d31.b;
                                    y32VarB = y32.e;
                                    break;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (a.u(xmlPullParserNewPullParser, "Container:Directory")) {
                    y32VarB = b(xmlPullParserNewPullParser, "Container", "Item");
                } else if (a.u(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    y32VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!a.t(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (y32VarB.isEmpty()) {
                break loop0;
            }
            return new mo1(j, y32VarB);
            return null;
        }
        throw g0.a("Couldn't find xmp metadata", null);
    }

    public static y32 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        y21 y21VarX = d31.x();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (a.u(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strQ = a.q(xmlPullParser, strConcat3);
                String strQ2 = a.q(xmlPullParser, strConcat4);
                String strQ3 = a.q(xmlPullParser, strConcat5);
                String strQ4 = a.q(xmlPullParser, strConcat6);
                if (strQ != null && strQ2 != null) {
                    long j2 = 0;
                    if (strQ3 != null) {
                        j = Long.parseLong(strQ3);
                    } else {
                        j = 0;
                    }
                    if (strQ4 != null) {
                        j2 = Long.parseLong(strQ4);
                    }
                    y21VarX.a(new b(strQ, j, j2));
                } else {
                    return y32.e;
                }
            }
        } while (!a.t(xmlPullParser, strConcat2));
        return y21VarX.g();
    }
}
