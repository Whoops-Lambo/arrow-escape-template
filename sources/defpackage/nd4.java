package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.internal.ads.zziid;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbv;
import com.usercentrics.sdk.UsercentricsConsentUserResponse;
import com.usercentrics.sdk.UsercentricsUserInteraction;
import com.usercentrics.sdk.ui.PredefinedUIResponse;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class nd4 {
    public static final tx a;
    public static final tx b;

    public static final void a(bu1 bu1Var, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int iN = n(i, i3, str);
            int iM = m(iN, i3, str);
            if (iM > iN) {
                bu1Var.f(str.substring(iN, iM), gg0.a);
                return;
            }
            return;
        }
        int iN2 = n(i, i2, str);
        int iM2 = m(iN2, i2, str);
        if (iM2 > iN2) {
            String strSubstring = str.substring(iN2, iM2);
            int iN3 = n(i2 + 1, i3, str);
            bu1Var.j(strSubstring, str.substring(iN3, m(iN3, i3, str)));
        }
    }

    public abstract Task r(String str);

    static {
        int i = 8;
        a = new tx("NULL", i);
        b = new tx("UNINITIALIZED", i);
    }

    public static String e(String str) throws uu0 {
        try {
            oh.Companion.getClass();
            return nh.b(str);
        } catch (Exception e) {
            throw new uu0(n30.y("Failed to encode bit string: ", e.getMessage()), e);
        }
    }

    public static void g(InputStream inputStream, File file) throws Throwable {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        uu.i(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    uu.i(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final UsercentricsConsentUserResponse l(PredefinedUIResponse predefinedUIResponse) {
        UsercentricsUserInteraction usercentricsUserInteraction;
        dx1 dx1Var = predefinedUIResponse.a;
        dx1Var.getClass();
        int i = x33.$EnumSwitchMapping$0[dx1Var.ordinal()];
        if (i == 1) {
            usercentricsUserInteraction = UsercentricsUserInteraction.ACCEPT_ALL;
        } else if (i == 2) {
            usercentricsUserInteraction = UsercentricsUserInteraction.DENY_ALL;
        } else if (i == 3) {
            usercentricsUserInteraction = UsercentricsUserInteraction.GRANULAR;
        } else {
            if (i != 4) {
                e.b();
                return null;
            }
            usercentricsUserInteraction = UsercentricsUserInteraction.NO_INTERACTION;
        }
        return new UsercentricsConsentUserResponse(usercentricsUserInteraction, predefinedUIResponse.b, predefinedUIResponse.c);
    }

    public static final int m(int i, int i2, String str) {
        while (i2 > i && ns1.t(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        while (i < i2 && ns1.t(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static String s(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final zziid t(Object obj, Object obj2) {
        zziid zziidVarF = (zziid) obj;
        zziid zziidVar = (zziid) obj2;
        if (!zziidVar.isEmpty()) {
            if (!zziidVarF.a) {
                zziidVarF = zziidVarF.f();
            }
            zziidVarF.j();
            if (!zziidVar.isEmpty()) {
                zziidVarF.putAll(zziidVar);
            }
        }
        return zziidVarF;
    }

    public Task q(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        mx3 mx3Var = new mx3();
        mx3Var.b = this;
        zzbv zzbvVarZzb = firebaseAuth.zzb();
        if (zzbvVarZzb != null && zzbvVarZzb.d("EMAIL_PASSWORD_PROVIDER")) {
            Task taskB = zzbvVarZzb.b(str, Boolean.FALSE, recaptchaAction);
            return taskB.continueWithTask(mx3Var).continueWithTask(new m62(str, zzbvVarZzb, recaptchaAction, mx3Var));
        }
        Task taskR = r(null);
        m62 m62Var = new m62(21);
        m62Var.c = recaptchaAction;
        m62Var.d = firebaseAuth;
        m62Var.b = str;
        m62Var.e = mx3Var;
        return taskR.continueWithTask(m62Var);
    }

    public static String b(String str) throws tu0 {
        str.getClass();
        try {
            oh.Companion.getClass();
            return nh.a(str);
        } catch (Exception e) {
            throw new tu0(n30.y("Failed to decode Base64 URL string: ", e.getMessage()), e);
        }
    }

    public static final String c(CharsetDecoder charsetDecoder, ih2 ih2Var) throws EOFException {
        charsetDecoder.getClass();
        StringBuilder sb = new StringBuilder((int) Math.min(2147483647L, ih2Var.getBuffer().c));
        Charset charset = charsetDecoder.charset();
        charset.getClass();
        if (charset.equals(er.a)) {
            sb.append((CharSequence) tb5.w(ih2Var));
        } else {
            long j = ih2Var.getBuffer().c;
            byte[] bArrN = u12.n(ih2Var, -1);
            Charset charset2 = charsetDecoder.charset();
            charset2.getClass();
            sb.append((CharSequence) new String(bArrN, charset2));
        }
        return sb.toString();
    }

    public static final bk d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) throws CharacterCodingException {
        charSequence.getClass();
        bk bkVar = new bk();
        if (i < i2) {
            do {
                byte[] bArrG = u12.g(charsetEncoder, charSequence, i, i2);
                bkVar.t(bArrG.length, bArrG);
                int length = bArrG.length;
                if (length >= 0) {
                    i += length;
                } else {
                    e32.i("Check failed.");
                    return null;
                }
            } while (i < i2);
        }
        return bkVar;
    }

    public static final int f(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.RGBA_F16) {
                    i = 8;
                } else {
                    i = 4;
                }
                return height * i;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final Integer h(String str) {
        int color;
        str.getClass();
        try {
            if (kk2.L(str, "#", false)) {
                color = Color.parseColor(str);
            } else {
                color = Color.parseColor("#".concat(str));
            }
            return Integer.valueOf(color);
        } catch (Throwable th) {
            tw1.a.error("Error when parsing color with HEX<" + str + ">", th);
            return null;
        }
    }

    public static yt1 i(String str) {
        int i;
        str.getClass();
        if (str.length() - 1 < 0) {
            yt1.b.getClass();
            return ig0.c;
        }
        k92 k92Var = yt1.b;
        bu1 bu1Var = new bu1(3);
        int length = str.length() - 1;
        int i2 = 0;
        int i3 = -1;
        if (length >= 0) {
            int i4 = 0;
            i = 0;
            int i5 = -1;
            while (true) {
                if (i2 != 1000) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt != '&') {
                        if (cCharAt == '=' && i5 == -1) {
                            i5 = i4;
                        }
                    } else {
                        a(bu1Var, str, i, i5, i4);
                        i = i4 + 1;
                        i2++;
                        i5 = -1;
                    }
                    if (i4 != length) {
                        i4++;
                    } else {
                        i3 = i5;
                        break;
                    }
                }
                Map map = (Map) bu1Var.a;
                map.getClass();
                return new cu1(map);
            }
        }
        i = 0;
        if (i2 != 1000) {
            a(bu1Var, str, i, i3, str.length());
        }
        Map map2 = (Map) bu1Var.a;
        map2.getClass();
        return new cu1(map2);
    }

    public static final byte[] j(String str, Charset charset) throws CharacterCodingException {
        str.getClass();
        charset.getClass();
        Charset charset2 = er.a;
        if (charset.equals(charset2)) {
            int length = str.length();
            j1 j1Var = n1.Companion;
            int length2 = str.length();
            j1Var.getClass();
            j1.a(0, length, length2);
            CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
            if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
                int iRemaining = byteBufferEncode.remaining();
                byte[] bArrArray = byteBufferEncode.array();
                bArrArray.getClass();
                if (iRemaining == bArrArray.length) {
                    byte[] bArrArray2 = byteBufferEncode.array();
                    bArrArray2.getClass();
                    return bArrArray2;
                }
            }
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        }
        return u12.g(charset.newEncoder(), str, 0, str.length());
    }

    public static String k(int i) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    public static final List o(List list, List list2) {
        list.getClass();
        list2.getClass();
        List list3 = list;
        int iU = rh1.U(eu.f(list3, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Object obj : list3) {
            linkedHashMap.put(((wd1) obj).f, obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            wd1 wd1Var = (wd1) it.next();
            linkedHashMap2.put(wd1Var.f, wd1Var);
        }
        return du.z0(linkedHashMap2.values());
    }

    public static final String p(String str, double d) {
        str.getClass();
        if (dk2.Z(str)) {
            return "";
        }
        String hexString = Long.toHexString(rd1.q(d * 255.0d));
        if (hexString.length() == 1) {
            hexString = "0".concat(hexString);
        }
        if (str.charAt(0) == '#') {
            return hexString.concat(str.substring(1));
        }
        return hexString.concat(str);
    }
}
