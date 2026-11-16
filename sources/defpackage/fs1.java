package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.facebook.a0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzagu;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.singular.sdk.internal.UserDetailsUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class fs1 implements zzagu {
    public static final ng1 a = new ng1(12);
    public static final /* synthetic */ int[] b = {1, 2, 3, 4};
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final double q(int i, int i2, int i3, int i4, int i5) {
        double d2 = ((double) i3) / ((double) i);
        double d3 = ((double) i4) / ((double) i2);
        int i6 = y50.$EnumSwitchMapping$0[h50.C(i5)];
        if (i6 == 1) {
            return Math.max(d2, d3);
        }
        if (i6 == 2) {
            return Math.min(d2, d3);
        }
        e.b();
        return 0.0d;
    }

    public static void F(Bundle bundle) {
        if (bundle != null && bundle.containsKey(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean(FyberMediationAdapter.KEY_MUTE_VIDEO, false));
        }
    }

    public static void J(long j, String str) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void K(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static String c(int i, int i2, String str) {
        if (i < 0) {
            return eu.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return eu.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        d.r(pv1.k(i2, "negative size: "));
        return null;
    }

    public static final void d(c32 c32Var, Throwable th) {
        CancellationException cancellationExceptionI = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionI == null) {
            cancellationExceptionI = j7.I("Channel was consumed, consumer had failed", th);
        }
        c32Var.cancel(cancellationExceptionI);
    }

    public static void e(long j, boolean z, String str) {
        if (z) {
            return;
        }
        d.r(eu.x(str, Long.valueOf(j)));
    }

    public static void f(String str, boolean z) {
        if (z) {
            return;
        }
        d.r(str);
    }

    public static void g(boolean z) {
        if (z) {
            return;
        }
        e32.a();
    }

    public static void h(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        d.r(eu.x(str, obj));
    }

    public static void i(int i, int i2) {
        String strX;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strX = eu.x("%s (%s) must not be negative", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    d.r(pv1.k(i2, "negative size: "));
                    return;
                }
                strX = eu.x("%s (%s) must be less than size (%s)", TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strX);
        }
    }

    public static void j(ListenableFuture listenableFuture, Object obj, String str) {
        if (listenableFuture != null) {
            return;
        }
        d.w(eu.x(str, obj));
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        d.w(str);
    }

    public static void l(int i, int i2) {
        if (i < 0 || i > i2) {
            y.p(c(i, i2, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        }
    }

    public static void m(int i, int i2, int i3) {
        String strC;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strC = c(i, i3, "start index");
            } else {
                strC = (i2 < 0 || i2 > i3) ? c(i2, i3, "end index") : eu.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        e32.i(str);
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        y.b();
    }

    public static final void s(int i, int i2) {
        if (i <= i2) {
            return;
        }
        y.p(jc1.n("toIndex (", i, ") is greater than size (", i2, ")."));
    }

    public static final String u(jy2 jy2Var) {
        List list = jy2Var.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) du.a0(list)).length() == 0 ? "/" : (String) du.a0(list);
        }
        return du.g0(list, "/", null, null, null, 62);
    }

    public static Object w(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return pv1.i(1, list);
        }
        d.v();
        return null;
    }

    public static Object x(List list) {
        Object next;
        if (list instanceof Collection) {
            if (list.isEmpty()) {
                return null;
            }
            if (list instanceof List) {
                return pv1.i(1, list);
            }
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final PublicKey z(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(kk2.I(kk2.I(kk2.I(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        bArrDecode.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    public static final String A(String str) {
        str.getClass();
        URL url = new URL(HttpRequest.DEFAULT_SCHEME, "www." + a0.t, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        m32 m32Var = new m32();
        a0.c().execute(new ni0((Object) url, (Object) m32Var, str, (Object) reentrantLock, (Object) conditionNewCondition, 6));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) m32Var.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static String B(File file) {
        int i;
        if (file.isFile()) {
            byte[] bArr = new byte[1024];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    int i2 = bufferedInputStream.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i2);
                }
                if (TextUtils.isEmpty(null)) {
                    bufferedInputStream.close();
                    byte[] bArrDigest = messageDigest.digest();
                    if (bArrDigest != null && bArrDigest.length > 0) {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                        char[] cArr2 = new char[bArrDigest.length * 2];
                        int i3 = 0;
                        for (byte b2 : bArrDigest) {
                            int i4 = i3 + 1;
                            cArr2[i3] = cArr[(b2 >>> 4) & 15];
                            i3 += 2;
                            cArr2[i4] = cArr[b2 & 15];
                        }
                        return new String(cArr2);
                    }
                } else {
                    throw null;
                }
            } catch (Exception e) {
                rz.kgy(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "fechkCu5ZdeFWA==", "XOs5swqwbOqkH+BUmBmTKVf6", 858);
                return "";
            }
        }
        return "";
    }

    public static final void C(jy2 jy2Var, String str) {
        List arrayList;
        jy2Var.getClass();
        str.getClass();
        if (dk2.Z(str)) {
            arrayList = gg0.a;
        } else if (str.equals("/")) {
            arrayList = my2.a;
        } else {
            arrayList = new ArrayList(dk2.m0(str, new char[]{'/'}, 6));
        }
        arrayList.getClass();
        jy2Var.h = arrayList;
    }

    public static void D(List list, ly1 ly1Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (ly1Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final void E(f92 f92Var, Object obj) {
        Object objC = f92Var.c(obj);
        if (!(objC instanceof iq)) {
            return;
        }
        Object obj2 = ((jq) tb5.y(cg0.a, new xp(f92Var, obj, (dy) null, 1))).a;
    }

    public static AdError G(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorF = rd1.f(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e("fs1", adErrorF.toString());
            return adErrorF;
        }
        if (TextUtils.isEmpty(str2)) {
            AdError adErrorF2 = rd1.f(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e("fs1", adErrorF2.toString());
            return adErrorF2;
        }
        return null;
    }

    public static AdError H(String str, String str2, String str3) {
        AdError adErrorG = G(str, str2);
        if (adErrorG != null) {
            return adErrorG;
        }
        if (TextUtils.isEmpty(str3)) {
            AdError adErrorF = rd1.f(103, "Missing or invalid Mintegral bidding signal in this ad request.");
            Log.w("fs1", adErrorF.toString());
            return adErrorF;
        }
        return null;
    }

    public static final boolean I(PublicKey publicKey, String str, String str2) {
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(er.a);
            bytes.getClass();
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            bArrDecode.getClass();
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void a(l21 l21Var, Modifier modifier, ContentScale contentScale, Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(-941517612);
        int i2 = (-1879055361) & i;
        as0 as0Var = ComposerKt.a;
        q22 q22VarE = (q22) composerImplT.v(ff1.a);
        if (q22VarE == null) {
            q22VarE = xl1.e((Context) composerImplT.v(AndroidCompositionLocals_androidKt.b));
        }
        int i3 = i2 << 3;
        nq2.a(l21Var, q22VarE, modifier, contentScale, composerImplT, (i & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i3 & 7168) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), 0);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new a9(l21Var, modifier, contentScale, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void b(jy2 jy2Var, StringBuilder sb) {
        List listY;
        sb.append(jy2Var.c().a);
        String str = jy2Var.c().a;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = jy2Var.e;
                    String str3 = jy2Var.f;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append(UserDetailsUtils.UserDetailsLiterals.AT);
                    }
                    CharSequence string = sb2.toString();
                    CharSequence charSequence = jy2Var.a;
                    sb.append(":");
                    sb.append(string);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = jy2Var.a;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = jy2Var.a;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = jy2Var.a;
                    String strU = u(jy2Var);
                    sb.append("://");
                    sb.append(charSequence4);
                    if (!dk2.p0(strU, '/')) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) strU);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = jy2Var.a;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(t(jy2Var));
        String strU2 = u(jy2Var);
        au1 au1Var = jy2Var.i;
        boolean z = jy2Var.b;
        strU2.getClass();
        au1Var.getClass();
        if (!dk2.Z(strU2) && !kk2.L(strU2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strU2);
        if (!au1Var.isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry> setD = au1Var.d();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setD) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listY = eu.y(new dt1(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(eu.f(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new dt1(str4, (String) it.next()));
                }
                listY = arrayList2;
            }
            iu.N(listY, arrayList);
        }
        du.f0(arrayList, sb, C4664b4.j.c, new w01(18), 60);
        if (jy2Var.g.length() > 0) {
            sb.append('#');
            sb.append(jy2Var.g);
        }
    }

    public static int r(Context context, float f) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f + 0.5f, resources.getDisplayMetrics());
    }

    public static final String t(jy2 jy2Var) {
        jy2Var.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = jy2Var.e;
        String str2 = jy2Var.f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append(UserDetailsUtils.UserDetailsLiterals.AT);
        }
        sb.append(sb2.toString());
        sb.append(jy2Var.a);
        int i = jy2Var.c;
        if (i != 0 && i != jy2Var.c().b) {
            sb.append(":");
            sb.append(String.valueOf(jy2Var.c));
        }
        return sb.toString();
    }

    public static Object v(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object y(List list) {
        Iterator it = list.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }
}
