package io.p071bidmachine.media3.common.util;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import defpackage.h50;
import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.media3.exoplayer.j0;
import io.p071bidmachine.media3.extractor.ts.y;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static ExecutorService a;
    public static final Object b = new Object();

    public static FloatBuffer l(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static int[] r(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void v(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void z(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(pv1.k(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void A(String str, String str2) {
        synchronized (b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void B(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.w(str, a(str2, th));
        }
    }

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbQ = h50.q(str, "\n  ");
        sbQ.append(strReplace.replace("\n", "\n  "));
        sbQ.append('\n');
        return sbQ.toString();
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        d.r(str);
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        e32.a();
    }

    public static void d() throws h {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = nj.m(iGlGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new h(sb.toString());
        }
    }

    public static void e(boolean z, String str) throws h {
        if (!z) {
            throw new h(str);
        }
    }

    public static void f(int i, int i2) {
        if (i < 0 || i >= i2) {
            dr0.b();
        }
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        e32.i(str);
    }

    public static void i(boolean z) {
        if (z) {
            return;
        }
        y.b();
    }

    public static void j(Object obj) {
        if (obj != null) {
            return;
        }
        y.b();
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        e32.i(str);
    }

    public static void m(String str, String str2) {
        synchronized (b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void n(String str, String str2) {
        synchronized (b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.e(str, a(str2, th));
        }
    }

    public static synchronized Executor p() {
        try {
            if (a == null) {
                int i = x.a;
                a = Executors.newSingleThreadExecutor(new w("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static void s(String str, String str2) {
        synchronized (b) {
            Log.i(str, a(str2, null));
        }
    }

    public static String w(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String x(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrR = r(str2);
        if (iArrR[0] != -1) {
            sb.append(str2);
            w(sb, iArrR[1], iArrR[2]);
            return sb.toString();
        }
        int[] iArrR2 = r(str);
        if (iArrR[3] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrR[2] == 0) {
            sb.append((CharSequence) str, 0, iArrR2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrR[1];
        if (i != 0) {
            int i2 = iArrR2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return w(sb, iArrR[1] + i2, i2 + iArrR[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrR2[1]);
            sb.append(str2);
            int i3 = iArrR2[1];
            return w(sb, i3, iArrR[2] + i3);
        }
        int i4 = iArrR2[0] + 2;
        int i5 = iArrR2[1];
        if (i4 >= i5 || i5 != iArrR2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrR2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrR2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return w(sb, iArrR2[1], i6 + iArrR[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrR2[1];
        return w(sb, i7, iArrR[2] + i7 + 1);
    }

    public static void g(j0 j0Var) {
        j0Var.getClass();
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }
}
