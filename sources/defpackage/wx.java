package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.v0;
import com.facebook.share.model.GameRequestContent;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakl;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzgb;
import com.google.android.gms.internal.ads.zzgf;
import com.google.android.gms.internal.ads.zzgyy;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.measurement.internal.zzae;
import com.google.protobuf.ByteString;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class wx {
    public static final Object[] a = new Object[0];
    public static final ug2 b = new ug2(0);
    public static final vg2 c = new vg2(0);
    public static zzae d;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void t(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(new zzao[0]);
        }
        if (zzapVar != null) {
            ar4 ar4Var = zzgzb.b;
            zzgyy zzgyyVar = new zzgyy();
            for (zzao zzaoVar : zzapVar.a) {
                if (zzgb.class.isAssignableFrom(zzaoVar.getClass())) {
                    zzgyyVar.c((zzao) zzgb.class.cast(zzaoVar));
                }
            }
            w wVarF = zzgyyVar.f();
            int i2 = wVarF.d;
            for (int i3 = 0; i3 < i2; i3++) {
                zzgb zzgbVar = (zzgb) wVarF.get(i3);
                if (!zzgbVar.a.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.b(zzgbVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.a(zzapVar3);
        }
        if (zzapVar2.a.length > 0) {
            zztVar.k = zzapVar2;
        }
    }

    public abstract void j(be2 be2Var, float f, float f2);

    public static v7 b(Context context, String str, Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (String str2 : bundle.keySet()) {
                if (!str2.contains("IABUSPrivacy_String")) {
                    map.put(str2, bundle.getString(str2));
                }
            }
        }
        boolean z = false;
        String string = context.getSharedPreferences("NonNullPackage", 0).getString("IABUSPrivacy_String", null);
        if (string != null) {
            InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        map.put("tp", str);
        map.put("tp-ver", MobileAds.getVersion().toString());
        if (qb5.p() && MobileAds.getRequestConfiguration().getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD) {
            z = true;
        }
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1 || z) {
            map.put("coppa", "1");
        } else {
            map.put("coppa", "0");
        }
        return new v7(map, 29);
    }

    public static String h(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bByteAt = byteString.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
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
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final long l(long j) {
        if (j < 0) {
            uf0 uf0Var = xe0.b;
            return xe0.d;
        }
        uf0 uf0Var2 = xe0.b;
        return xe0.c;
    }

    public static final void n(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            dk2.Z(str);
            String string = dk2.y0(str).toString();
            if (!dk2.O(string, "://", false)) {
                string = "https://".concat(string);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(string)).putExtra("com.android.browser.application_id", context.getPackageName()));
        } catch (Throwable th) {
            tw1.a.error("Error when opening URL<" + str + ">", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    public static final long o(long j, long j2) {
        long j3;
        long j4;
        long j5;
        af0 af0Var = af0.NANOSECONDS;
        long j6 = xe0.j(j2, af0Var);
        long jD = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (!xe0.g(j2) || (j ^ j6) >= 0) {
                return j;
            }
            d.r("Summing infinities of different signs");
            return 0L;
        }
        if (((j6 - 1) | 1) != Long.MAX_VALUE) {
            long j7 = j + j6;
            if (((j6 ^ j7) & (j ^ j7)) < 0) {
                return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            return j7;
        }
        long j8 = xe0.d;
        long j9 = xe0.c;
        int i = ((int) j2) & 1;
        if (i != 0) {
            if (xe0.g(j2)) {
                j3 = 1;
                int iSignum = Integer.signum(2);
                if (xe0.g(j2)) {
                    if (iSignum == 0) {
                        d.r("Multiplying infinite duration by zero yields an undefined result.");
                        return 0L;
                    }
                    jD = iSignum > 0 ? j2 : xe0.l(j2);
                } else if (iSignum != 0) {
                    long j10 = j2 >> 1;
                    j4 = Long.MAX_VALUE;
                    long j11 = iSignum;
                    long j12 = j10 * j11;
                    if (i == 0) {
                        if (-2147483647L <= j10 && j10 < 2147483648L) {
                            jD = vk3.g(j12);
                        } else if (j12 / j11 == j10) {
                            jD = (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? vk3.d(j12 / 1000000) : vk3.g(j12);
                        } else {
                            long j13 = j10 / 1000000;
                            long j14 = j13 * j11;
                            long j15 = (((j10 - (j13 * 1000000)) * j11) / 1000000) + j14;
                            if (j14 / j11 != j13 || (j15 ^ j14) < 0) {
                                if (Integer.signum(iSignum) * Long.signum(j10) > 0) {
                                    jD = j9;
                                } else {
                                    jD = j8;
                                }
                            } else {
                                jD = vk3.d(tb5.j(j15, new fg1(-4611686018427387903L, 4611686018427387903L)));
                            }
                        }
                    } else if (j12 / j11 == j10) {
                        jD = vk3.d(tb5.j(j12, new fg1(-4611686018427387903L, 4611686018427387903L)));
                    } else {
                        if (Integer.signum(iSignum) * Long.signum(j10) > 0) {
                            jD = j9;
                        } else {
                            jD = j8;
                        }
                    }
                }
            } else {
                j3 = 1;
                j4 = Long.MAX_VALUE;
                long j16 = j2 >> 1;
                long j17 = j16 / 2;
                if (-4611686018426L > j17 || j17 >= 4611686018427L) {
                    jD = vk3.d(j17);
                } else {
                    jD = vk3.g((j17 * 1000000) + (((j16 - (j17 * 2)) * 1000000) / 2));
                }
            }
            j5 = xe0.j(jD, af0Var);
            if (((j5 - j3) | j3) == j4) {
                return j5;
            }
            return o(o(j, jD), xe0.h(j2, xe0.l(jD)));
        }
        jD = vk3.g((j2 >> 1) / 2);
        j3 = 1;
        j4 = Long.MAX_VALUE;
        j5 = xe0.j(jD, af0Var);
        if (((j5 - j3) | j3) == j4) {
            return j5;
        }
        return o(o(j, jD), xe0.h(j2, xe0.l(jD)));
    }

    public static final long p(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        af0 af0Var = af0.NANOSECONDS;
        if (j4 >= 0) {
            return vk3.x(j3, af0Var);
        }
        af0 af0Var2 = af0.MILLISECONDS;
        if (af0Var.compareTo(af0Var2) >= 0) {
            return xe0.l(l(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        uf0 uf0Var = xe0.b;
        return xe0.h(vk3.x(j5, af0Var2), vk3.x(j6, af0Var));
    }

    public static boolean u(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final vy1 a(String str, ty1 ty1Var) {
        if (!dk2.Z(str)) {
            Iterator it = ((hh1) wy1.a.values()).iterator();
            while (((dh1) it).hasNext()) {
                KSerializer kSerializer = (KSerializer) ((dh1) it).next();
                if (str.equals(kSerializer.getDescriptor().h())) {
                    StringBuilder sbR = h50.r("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    sbR.append(p32.a(kSerializer.getClass()).getSimpleName());
                    sbR.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    d.r(ek2.r(sbR.toString()));
                    return null;
                }
            }
            return new vy1(str, ty1Var);
        }
        d.r("Blank serial names are prohibited");
        return null;
    }

    public static final w92 c(String str, SerialDescriptor[] serialDescriptorArr, wr0 wr0Var) {
        if (!dk2.Z(str)) {
            wr wrVar = new wr(str);
            wr0Var.invoke(wrVar);
            return new w92(str, nk2.d, wrVar.c.size(), n8.o0(serialDescriptorArr), wrVar);
        }
        d.r("Blank serial names are prohibited");
        return null;
    }

    public static final w92 d(String str, h00 h00Var, SerialDescriptor[] serialDescriptorArr, wr0 wr0Var) {
        if (!dk2.Z(str)) {
            if (!h00Var.equals(nk2.d)) {
                wr wrVar = new wr(str);
                wr0Var.invoke(wrVar);
                return new w92(str, h00Var, wrVar.c.size(), n8.o0(serialDescriptorArr), wrVar);
            }
            d.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        d.r("Blank serial names are prohibited");
        return null;
    }

    public static w92 e(String str, h00 h00Var, SerialDescriptor[] serialDescriptorArr) {
        if (!dk2.Z(str)) {
            if (!h00Var.equals(nk2.d)) {
                wr wrVar = new wr(str);
                return new w92(str, h00Var, wrVar.c.size(), n8.o0(serialDescriptorArr), wrVar);
            }
            d.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        d.r("Blank serial names are prohibited");
        return null;
    }

    public static final Bundle f(GameRequestContent gameRequestContent) {
        String strP;
        String string;
        String string2;
        gameRequestContent.getClass();
        Bundle bundle = new Bundle();
        v0.R("message", bundle, gameRequestContent.a);
        List list = gameRequestContent.c;
        if (list != null) {
            bundle.putString("to", TextUtils.join(",", list));
        }
        v0.R("title", bundle, gameRequestContent.d);
        v0.R("data", bundle, gameRequestContent.e);
        kt0 kt0Var = gameRequestContent.f;
        String strP2 = null;
        if (kt0Var != null && (string2 = kt0Var.toString()) != null) {
            Locale locale = Locale.ENGLISH;
            strP = n30.p(locale, string2, locale);
        } else {
            strP = null;
        }
        v0.R("action_type", bundle, strP);
        v0.R("object_id", bundle, gameRequestContent.g);
        mt0 mt0Var = gameRequestContent.h;
        if (mt0Var != null && (string = mt0Var.toString()) != null) {
            Locale locale2 = Locale.ENGLISH;
            strP2 = n30.p(locale2, string, locale2);
        }
        v0.R("filters", bundle, strP2);
        ArrayList arrayList = gameRequestContent.i;
        if (arrayList != null) {
            bundle.putString("suggestions", TextUtils.join(",", arrayList));
        }
        return bundle;
    }

    public static void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            dr0.h(n30.j(file, "Unable to create parent directories of "));
        }
    }

    public static final Activity i(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return null;
    }

    public static final long k(ih2 ih2Var) {
        ih2Var.getClass();
        return ih2Var.getBuffer().c;
    }

    public static final boolean m(Context context) {
        Activity activityI = i(context);
        if (activityI != null && !activityI.isFinishing() && !activityI.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static final void q(String str, KClass kClass) {
        String string;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            string = n30.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbR = pv1.r("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            q63.y(sbR, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbR.append(kClass.getSimpleName());
            sbR.append("' has to be sealed and '@Serializable'.");
            string = sbR.toString();
        }
        throw new ba2(string);
    }

    public static final Object[] r(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        dr0.n();
                        return null;
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final Object[] s(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                dr0.n();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    public static zzakl v(int i, String str, zzey zzeyVar) {
        int iB = zzeyVar.b();
        if (zzeyVar.b() == 1684108385) {
            zzeyVar.G(8);
            return new zzakl(str, null, zzgzb.x(zzeyVar.l(iB - 16)));
        }
        zzeh.c("MetadataUtil", "Failed to parse text attribute: ".concat(zzgf.a(i)));
        return null;
    }

    public static zzakg w(int i, String str, zzey zzeyVar, boolean z, boolean z2) {
        int iX = x(zzeyVar);
        if (z2) {
            iX = Math.min(1, iX);
        }
        if (iX >= 0) {
            if (z) {
                return new zzakl(str, null, zzgzb.x(Integer.toString(iX)));
            }
            return new zzaka("und", str, Integer.toString(iX));
        }
        zzeh.c("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzgf.a(i)));
        return null;
    }

    public static int x(zzey zzeyVar) {
        int iB = zzeyVar.b();
        if (zzeyVar.b() == 1684108385) {
            zzeyVar.G(8);
            int i = iB - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (zzeyVar.I() & 128) == 0) {
                            return zzeyVar.h();
                        }
                    } else {
                        return zzeyVar.O();
                    }
                } else {
                    return zzeyVar.L();
                }
            } else {
                return zzeyVar.K();
            }
        }
        zzeh.c("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static zzakl y(int i, String str, zzey zzeyVar) {
        int iB = zzeyVar.b();
        if (zzeyVar.b() == 1684108385 && iB >= 22) {
            zzeyVar.G(10);
            int iL = zzeyVar.L();
            if (iL > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iL).length());
                sb.append(iL);
                String string = sb.toString();
                int iL2 = zzeyVar.L();
                if (iL2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iL2);
                    string = sb2.toString();
                }
                return new zzakl(str, null, zzgzb.x(string));
            }
        }
        zzeh.c("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzgf.a(i)));
        return null;
    }
}
