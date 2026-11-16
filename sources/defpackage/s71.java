package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.a0;
import com.facebook.appevents.n;
import com.facebook.appevents.o;
import com.facebook.internal.a;
import com.facebook.internal.a1;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import com.facebook.internal.o0;
import com.facebook.internal.v0;
import com.facebook.k0;
import com.facebook.p;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.u;
import com.facebook.w0;
import com.facebook.x;
import com.google.firebase.FirebaseApp;
import com.inmobi.media.core.config.models.AdConfig;
import com.usercentrics.sdk.PurposeListStyle;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s71 {
    public static final tx a;
    public static final tx b;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static ff2 d;

    public static int H(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static pu3 I(pu3 pu3Var, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (pu3Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (pu3) map.get(strArr[0]);
            }
            if (length2 > 1) {
                pu3 pu3Var2 = new pu3();
                while (i < length2) {
                    pu3Var2.d((pu3) map.get(strArr[i]));
                    i++;
                }
                return pu3Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                pu3Var.d((pu3) map.get(strArr[0]));
                return pu3Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    pu3Var.d((pu3) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return pu3Var;
    }

    public static List d(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new y71(0, iArr.length, iArr);
    }

    public static int g(long j) {
        int i = (int) j;
        fs1.e(j, ((long) i) == j, "Out of range: %s");
        return i;
    }

    public static int m(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return n(bArr[0], bArr[1], bArr[2], bArr[3]);
        }
        d.r(eu.x("array too small: %s < %s", Integer.valueOf(length), 4));
        return 0;
    }

    static {
        int i = 8;
        a = new tx("REMOVED_TASK", i);
        b = new tx("CLOSED_EMPTY", i);
    }

    public static String B(Object obj, String str) {
        return str + obj;
    }

    public static void C() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void D(String str) {
        zy2 zy2Var = new zy2(pv1.n("lateinit property ", str, " has not been initialized"));
        y(zy2Var, s71.class.getName());
        throw zy2Var;
    }

    public static int[] E(Collection collection) {
        if (collection instanceof y71) {
            y71 y71Var = (y71) collection;
            return Arrays.copyOfRange(y71Var.a, y71Var.b, y71Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int J(Object obj) {
        return H(obj == null ? 0 : obj.hashCode());
    }

    public static File a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, n30.m(str2, ".temp"));
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final String[] c(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final void e(long j, long j2, long j3) {
        if (j2 >= 0 && j3 <= j) {
            if (j2 <= j3) {
                return;
            }
            d.r(n30.o(h50.o(j2, "startIndex (", ") > endIndex ("), j3, ')'));
        } else {
            StringBuilder sbO = h50.o(j2, "startIndex (", ") and endIndex (");
            sbO.append(j3);
            sbO.append(") are not within the range [0..size(");
            sbO.append(j);
            sbO.append("))");
            throw new IndexOutOfBoundsException(sbO.toString());
        }
    }

    public static final void f(long j, long j2) {
        if (0 > j || j < j2 || j2 < 0) {
            d.r(jc1.m(j, "))", h50.o(j2, "offset (0) and byteCount (", ") are not within the range [0..size(")));
        }
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int i(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public static final hf2 j(bp0 bp0Var, int i) {
        vp.V8.getClass();
        int i2 = up.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        boolean z = bp0Var instanceof yp;
        ck ckVar = ck.a;
        if (z) {
            yp ypVar = (yp) bp0Var;
            ck ckVar2 = ypVar.c;
            bp0 bp0VarG = ypVar.g();
            if (bp0VarG != null) {
                int i4 = ypVar.b;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (ckVar2 == ckVar) {
                    if (i4 == 0) {
                        i3 = 0;
                    }
                } else if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                return new hf2(i3, ckVar2, ypVar.a, bp0VarG);
            }
        }
        return new hf2(i3, ckVar, cg0.a, bp0Var);
    }

    public static final String l(String str) {
        if (str == null || str.length() != 0) {
            return str;
        }
        return null;
    }

    public static int n(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static SimpleDateFormat q(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                d.r(pv1.k(i, "Unknown DateFormat style: "));
                return null;
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                d.r(pv1.k(i2, "Unknown DateFormat style: "));
                return null;
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static int s(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void w() {
        try {
            if (d == null) {
                FirebaseApp firebaseApp = FirebaseApp.getInstance();
                firebaseApp.getClass();
                ff2 ff2Var = (ff2) ((x40) ((zn0) firebaseApp.get(zn0.class))).o.get();
                ff2Var.getClass();
                d = ff2Var;
            }
            ff2 ff2Var2 = d;
            if (ff2Var2 == null) {
                D("sharedSessionRepository");
                throw null;
            }
            if (ff2Var2.i) {
                if (ff2Var2 != null) {
                    ff2Var2.b();
                } else {
                    D("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static File x(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static List A(Iterable iterable, wr0 wr0Var) {
        iterable.getClass();
        String.CASE_INSENSITIVE_ORDER.getClass();
        return du.s0(iterable, new h8(wr0Var, 0));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer F(String str) {
        byte b2;
        Long lValueOf;
        byte b3;
        str.getClass();
        if (str.isEmpty()) {
            lValueOf = null;
            break;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            i = 1;
        }
        if (i == str.length()) {
            lValueOf = null;
            break;
        }
        int i2 = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt < 128) {
            b2 = kg1.a[cCharAt];
        } else {
            byte[] bArr = kg1.a;
            b2 = -1;
        }
        if (b2 < 0 || b2 >= 10) {
            lValueOf = null;
            break;
        }
        long j = -b2;
        while (true) {
            if (i2 < str.length()) {
                int i3 = i2 + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    b3 = kg1.a[cCharAt2];
                } else {
                    byte[] bArr2 = kg1.a;
                    b3 = -1;
                }
                if (b3 >= 0 && b3 < 10 && j >= -922337203685477580L) {
                    long j2 = j * 10;
                    long j3 = b3;
                    if (j2 >= Long.MIN_VALUE + j3) {
                        j = j2 - j3;
                        i2 = i3;
                    }
                }
            } else {
                if (i != 0) {
                    lValueOf = Long.valueOf(j);
                    break;
                }
                if (j != Long.MIN_VALUE) {
                    lValueOf = Long.valueOf(-j);
                    break;
                }
                break;
            }
            lValueOf = null;
            break;
        }
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static final Object G(sy syVar, Object obj, Object obj2, zr0 zr0Var, dy dyVar) {
        Object objInvoke;
        Object objK = ep0.K(syVar, obj2);
        try {
            gi2 gi2Var = new gi2(dyVar, syVar);
            if (zr0Var == null) {
                objInvoke = kc2.y(zr0Var, obj, gi2Var);
            } else {
                os2.j(2, zr0Var);
                objInvoke = zr0Var.invoke(obj, gi2Var);
            }
            ep0.z(syVar, objK);
            if (objInvoke == dz.a) {
                dyVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ep0.z(syVar, objK);
            throw th;
        }
    }

    public static void k(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("k");
                String strOptString2 = jSONObjectOptJSONObject.optString("v");
                strOptString.getClass();
                if (strOptString.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySetA = dm1.a();
                    next.getClass();
                    List listN0 = dk2.n0(strOptString, new String[]{","}, 0, 6);
                    strOptString2.getClass();
                    copyOnWriteArraySetA.add(new dm1(next, strOptString2, listN0));
                }
            }
        }
    }

    public static final GradientDrawable o(ju2 ju2Var, Context context, PurposeListStyle purposeListStyle) {
        int iIntValue;
        purposeListStyle.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((int) ek2.k(context, 4.0f));
        if (purposeListStyle == PurposeListStyle.b) {
            gradientDrawable.setStroke((int) ek2.k(context, 1.0f), ju2Var.j);
        }
        Integer num = ju2Var.e;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        gradientDrawable.setColor(iIntValue);
        return gradientDrawable;
    }

    public static final ArrayList p(SharePhotoContent sharePhotoContent, UUID uuid) {
        List<SharePhoto> list;
        Uri uri;
        Bitmap bitmap;
        l0 l0VarC;
        uuid.getClass();
        if (sharePhotoContent == null || (list = sharePhotoContent.g) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SharePhoto sharePhoto : list) {
            if (sharePhoto != null) {
                bitmap = sharePhoto.b;
                uri = sharePhoto.c;
            } else {
                uri = null;
                bitmap = null;
            }
            if (bitmap != null) {
                l0VarC = m0.b(uuid, bitmap);
            } else if (uri != null) {
                l0VarC = m0.c(uuid, uri);
            } else {
                l0VarC = null;
            }
            if (l0VarC != null) {
                arrayList.add(l0VarC);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((l0) obj).d);
        }
        m0.a(arrayList);
        return arrayList2;
    }

    public static final boolean r(int i, Intent intent, wt0 wt0Var) {
        a aVar;
        u uVarK;
        Bundle extras;
        UUID uuidJ = o0.j(intent);
        Bundle bundle = null;
        if (uuidJ == null) {
            aVar = null;
        } else {
            n nVar = a.d;
            synchronized (nVar) {
                if (lz.a.contains(a.class)) {
                    aVar = null;
                    if (aVar != null || !b(aVar.a(), uuidJ) || aVar.b() != i) {
                        aVar = null;
                    } else {
                        nVar.B(null);
                    }
                } else {
                    try {
                        aVar = a.e;
                    } catch (Throwable th) {
                        lz.a(a.class, th);
                        aVar = null;
                    }
                    if (aVar != null) {
                    }
                    aVar = null;
                }
            }
        }
        boolean zHasExtra = false;
        if (aVar == null) {
            return false;
        }
        UUID uuidA = aVar.a();
        uuidA.getClass();
        File fileE = m0.e(uuidA, false);
        if (fileE != null) {
            cn0.z(fileE);
        }
        if (wt0Var != null) {
            if (intent != null) {
                Set set = lz.a;
                if (set.contains(o0.class)) {
                    extras = null;
                } else {
                    try {
                        if (!set.contains(o0.class)) {
                            try {
                                Bundle bundleI = o0.i(intent);
                                if (bundleI != null) {
                                    zHasExtra = bundleI.containsKey("error");
                                } else {
                                    zHasExtra = intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
                                }
                            } catch (Throwable th2) {
                                lz.a(o0.class, th2);
                            }
                        }
                        if (!zHasExtra) {
                            extras = null;
                        } else {
                            Bundle bundleI2 = o0.i(intent);
                            if (bundleI2 != null) {
                                extras = bundleI2.getBundle("error");
                            } else {
                                extras = intent.getExtras();
                            }
                        }
                    } catch (Throwable th3) {
                        lz.a(o0.class, th3);
                    }
                }
                uVarK = o0.k(extras);
            } else {
                uVarK = null;
            }
            if (uVarK != null) {
                if (uVarK instanceof x) {
                    wt0Var.n(aVar);
                    return true;
                }
                wt0Var.o(aVar, uVarK);
                return true;
            }
            if (intent != null && !lz.a.contains(o0.class)) {
                try {
                    int iO = o0.o(intent);
                    Bundle extras2 = intent.getExtras();
                    bundle = (!o0.p(iO) || extras2 == null) ? extras2 : extras2.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
                } catch (Throwable th4) {
                    lz.a(o0.class, th4);
                }
            }
            wt0Var.p(aVar, bundle);
            return true;
        }
        return true;
    }

    public static final void t(p pVar, u uVar) {
        uVar.getClass();
        u("error", uVar.getMessage());
        if (pVar != null) {
            pVar.onError(uVar);
        }
    }

    public static void u(String str, String str2) {
        o oVar = new o(a0.a(), (String) null);
        Bundle bundleG = rl3.g("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundleG.putString("error_message", str2);
        }
        if (w0.c()) {
            oVar.h(bundleG, "fb_share_dialog_result");
        }
    }

    public static final k0 v(AccessToken accessToken, Uri uri, a1 a1Var) {
        String path = uri.getPath();
        boolean zE = v0.E(uri);
        com.facebook.o0 o0Var = com.facebook.o0.b;
        if (zE && path != null) {
            GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = new GraphRequest$ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", graphRequest$ParcelableResourceWithMimeType);
            return new k0(accessToken, "me/staging_resources", bundle, o0Var, a1Var, 32);
        }
        if (v0.C(uri)) {
            GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType2 = new GraphRequest$ParcelableResourceWithMimeType(uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", graphRequest$ParcelableResourceWithMimeType2);
            return new k0(accessToken, "me/staging_resources", bundle2, o0Var, a1Var, 32);
        }
        com.facebook.appevents.p.e("The image Uri must be either a file:// or content:// Uri");
        return null;
    }

    public static void y(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static int z(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
