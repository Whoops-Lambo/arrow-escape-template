package io.p071bidmachine.iab.vast.tags;

import android.graphics.Color;
import android.text.TextUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.pv1;
import io.p071bidmachine.iab.utils.y;
import io.p071bidmachine.iab.vast.c;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class q implements Serializable {
    public String a;
    public HashMap b;

    public static void c(XmlPullParser xmlPullParser, io.p071bidmachine.iab.utils.q qVar) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        qVar.a = g(attributeValue);
                    } else if ("fill".equals(attributeName)) {
                        qVar.b = g(attributeValue);
                    } else if ("outlined".equals(attributeName)) {
                        qVar.c = Boolean.valueOf(t(attributeValue));
                    } else if ("visible".equals(attributeName)) {
                        qVar.d = Boolean.valueOf(t(attributeValue));
                    } else if ("x".equals(attributeName)) {
                        qVar.e = o(attributeValue);
                    } else if ("y".equals(attributeName)) {
                        qVar.f = q(attributeValue);
                    } else if ("style".equals(attributeName)) {
                        qVar.g = attributeValue;
                    } else if ("opacity".equals(attributeName)) {
                        qVar.h = Float.valueOf(Float.parseFloat(attributeValue));
                    } else if ("hideafter".equals(attributeName)) {
                        qVar.i = Float.valueOf(Float.parseFloat(attributeValue));
                    } else if ("padding".equals(attributeName)) {
                        qVar.y(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        qVar.t(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        qVar.s = y.b(attributeValue);
                    } else if ("width".equals(attributeName)) {
                        qVar.z(y.b(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        qVar.q(y.b(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        qVar.v = Integer.valueOf(Integer.parseInt(attributeValue));
                    } else if ("fontsize".equals(attributeName)) {
                        qVar.w = y.b(attributeValue);
                    }
                } catch (Throwable th) {
                    c.a.C("VastXmlTag", th);
                }
            }
        }
        try {
            qVar.r = h(xmlPullParser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void b(XmlPullParser xmlPullParser) {
    }

    public String[] n() {
        return new String[0];
    }

    public static boolean d(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    public static int j(String str) {
        if (str == null) {
            return -1;
        }
        int iIndexOf = str.indexOf(UserDetailsUtils.UserDetailsLiterals.DOT);
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            return -1;
        }
        try {
            return pv1.v(Integer.parseInt(strArrSplit[1]), 60, Integer.parseInt(strArrSplit[0]) * 3600, Integer.parseInt(strArrSplit[2]));
        } catch (Exception e) {
            c.a.C("VastXmlTag", e);
            return -1;
        }
    }

    public static boolean t(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1");
        }
        return false;
    }

    public final String a(String str) {
        HashMap map = this.b;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public boolean r() {
        return this instanceof b;
    }

    public static Integer g(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception e) {
                c.b("VastXmlTag", e.getMessage(), new Object[0]);
                return null;
            }
        }
        return null;
    }

    public static String h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() == 4) {
            String text = xmlPullParser.getText();
            if (!TextUtils.isEmpty(text)) {
                text = text.trim();
            }
            xmlPullParser.nextTag();
            return text;
        }
        return null;
    }

    public static void i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 3) {
                        i--;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        io.p071bidmachine.media3.extractor.ts.y.b();
    }

    public static Integer o(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase) {
                case "center":
                    return 1;
                case "left":
                    return 3;
                case "right":
                    return 5;
                default:
                    return null;
            }
        }
        return null;
    }

    public static Integer q(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            lowerCase.getClass();
            switch (lowerCase) {
                case "bottom":
                    return 80;
                case "center":
                    return 16;
                case "top":
                    return 48;
                default:
                    return null;
            }
        }
        return null;
    }

    public final int f(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            c.a("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception unused) {
            c.b("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
    }

    public final boolean k(String str) {
        String strA = a(str);
        if (t(strA) || strA == null || (!strA.equalsIgnoreCase("false") && !strA.equalsIgnoreCase("0"))) {
            return true;
        }
        return false;
    }

    public final void x(XmlPullParser xmlPullParser) {
        HashMap map;
        if (xmlPullParser.getAttributeCount() > 0) {
            map = new HashMap();
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                String attributeName = xmlPullParser.getAttributeName(i);
                for (String str : n()) {
                    if (str.equals(attributeName)) {
                        map.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        break;
                    }
                }
            }
        } else {
            map = null;
        }
        this.b = map;
        if (r()) {
            this.a = h(xmlPullParser);
        }
        b(xmlPullParser);
    }
}
