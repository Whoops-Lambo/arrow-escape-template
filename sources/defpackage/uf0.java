package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.core.util.Preconditions;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdjt;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzahi;
import com.google.android.gms.measurement.internal.zzfy;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uf0 implements yv, fs, oo3, zzqp, rr1, tj1, w83, se3, zzagr, hz3, zzchc, zzdjz {
    public static final uf0 b = new uf0(1);
    public static final uf0 c = new uf0(2);
    public static final uf0 d = new uf0(3);
    public static final uf0 e = new uf0(4);
    public static final uf0 f = new uf0(5);
    public static final uf0 g = new uf0(6);
    public static final uf0 h = new uf0(7);
    public static final uf0 i = new uf0(8);
    public static final /* synthetic */ uf0 j = new uf0(18);
    public static final /* synthetic */ uf0 k = new uf0(19);
    public static final /* synthetic */ uf0 l = new uf0(20);
    public static final /* synthetic */ uf0 m = new uf0(21);
    public static final /* synthetic */ uf0 n = new uf0(22);
    public static final /* synthetic */ uf0 o = new uf0(23);
    public static final /* synthetic */ uf0 p = new uf0(24);
    public static final /* synthetic */ uf0 q = new uf0(25);
    public static final /* synthetic */ uf0 r = new uf0(26);
    public static final /* synthetic */ uf0 s = new uf0(27);
    public static final /* synthetic */ uf0 t = new uf0(28);
    public final /* synthetic */ int a;

    public static uf0 c(Context context, int i2) {
        Preconditions.a("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, r12.r);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ni1.a(context, typedArrayObtainStyledAttributes, 4);
        ni1.a(context, typedArrayObtainStyledAttributes, 9);
        ni1.a(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rd2.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).a();
        typedArrayObtainStyledAttributes.recycle();
        uf0 uf0Var = new uf0(9);
        Preconditions.b(rect.left);
        Preconditions.b(rect.top);
        Preconditions.b(rect.right);
        Preconditions.b(rect.bottom);
        return uf0Var;
    }

    @Override // defpackage.tj1
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.tj1
    public boolean secureDecodersExplicit() {
        return false;
    }

    public /* synthetic */ uf0(int i2) {
        this.a = i2;
    }

    public static SharedPreferences f(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public zzaia b(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fs
    public void d(zx0 zx0Var, ul2 ul2Var) {
        zx0Var.getClass();
        zx0Var.e.f(fz0.m, new t4((as0) ul2Var, null, 1));
    }

    public void e(Context context, zg3 zg3Var, ie3 ie3Var) {
        ConcurrentHashMap concurrentHashMap = bh3.a;
        synchronized (bh3.class) {
            if (zg3Var != null) {
                try {
                    ConcurrentHashMap concurrentHashMap2 = bh3.a;
                    eb3 eb3Var = (eb3) concurrentHashMap2.get(zg3Var.xh());
                    if (eb3Var == null) {
                        eb3Var = new eb3(zg3Var);
                        concurrentHashMap2.put(zg3Var.xh(), eb3Var);
                        zg3Var.noq();
                        zg3Var.xh();
                    }
                    eb3Var.d(ie3Var);
                    zg3Var.noq();
                    zg3Var.xh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        za3 za3Var = u12.l;
        if (za3Var != null) {
            ((oe3) za3Var).f();
        }
    }

    @Override // defpackage.yv
    public Object h(lt0 lt0Var) {
        Object objG = lt0Var.g(new l12(vy2.class, Executor.class));
        objG.getClass();
        return ak.h((Executor) objG);
    }

    @Override // defpackage.rr1
    public Object i() {
        return new ArrayList();
    }

    @Override // defpackage.tj1
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public void j(zzahr zzahrVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:370:0x067d  */
    /* JADX WARN: Code duplicated, block: B:400:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:401:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:456:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8 A[EDGE_INSN: B:70:0x00e8->B:73:0x00ef BREAK  A[LOOP:0: B:54:0x00c4->B:67:0x00e1]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed A[EDGE_INSN: B:72:0x00ed->B:73:0x00ef BREAK  A[LOOP:0: B:54:0x00c4->B:67:0x00e1]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w83
    public xi k(String str, int i2, EnumMap enumMap) throws y83 {
        int i3;
        gn1 gn1Var;
        int i4;
        h53 h53VarA;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c2;
        int i8;
        br brVar;
        int i9;
        boolean z5;
        boolean z6;
        char cCharAt;
        int i10;
        int[] iArr = kc2.a;
        if (str.isEmpty()) {
            d.r("Found empty contents");
            return null;
        }
        if (i2 != 12) {
            d.r("Can only encode QR_CODE, but got ".concat(h50.D(i2)));
            return null;
        }
        lg0 lg0Var = lg0.a;
        if (enumMap.containsKey(lg0Var)) {
            String string = enumMap.get(lg0Var).toString();
            if (string == null) {
                d.w("Name is null");
            } else if (string.equals("L")) {
                i3 = 1;
            } else if (string.equals("M")) {
                i3 = 2;
            } else if (string.equals("Q")) {
                i3 = 3;
            } else if (string.equals("H")) {
                i3 = 4;
            } else {
                d.r("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
            }
            i3 = 0;
        } else {
            i3 = 1;
        }
        lg0 lg0Var2 = lg0.f;
        int i11 = enumMap.containsKey(lg0Var2) ? Integer.parseInt(enumMap.get(lg0Var2).toString()) : 4;
        lg0 lg0Var3 = lg0.b;
        boolean zContainsKey = enumMap.containsKey(lg0Var3);
        String string2 = zContainsKey ? enumMap.get(lg0Var3).toString() : C.ISO88591_NAME;
        boolean zEquals = "Shift_JIS".equals(string2);
        int i12 = 0;
        gn1 gn1Var2 = gn1.BYTE;
        if (!zEquals) {
            i9 = 0;
            z5 = false;
            z6 = false;
            while (true) {
                if (i9 < str.length()) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i10 = iArr[cCharAt];
                        } else {
                            i10 = -1;
                        }
                        if (i10 != -1) {
                            z5 = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i10 = iArr[cCharAt];
                        } else {
                            i10 = -1;
                        }
                        if (i10 != -1) {
                            z5 = true;
                        }
                    }
                    i9++;
                } else {
                    if (z5) {
                        gn1Var = gn1.ALPHANUMERIC;
                        break;
                    }
                    if (z6) {
                        gn1Var = gn1.NUMERIC;
                        break;
                    }
                }
                gn1Var = gn1Var2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i9 = 0;
                z5 = false;
                z6 = false;
                while (true) {
                    if (i9 < str.length()) {
                        cCharAt = str.charAt(i9);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i10 = iArr[cCharAt];
                            } else {
                                i10 = -1;
                            }
                            if (i10 != -1) {
                                z5 = true;
                            }
                        } else {
                            z6 = true;
                        }
                        i9++;
                    } else {
                        if (z5) {
                            gn1Var = gn1.ALPHANUMERIC;
                            break;
                        }
                        if (z6) {
                            gn1Var = gn1.NUMERIC;
                            break;
                        }
                    }
                    gn1Var = gn1Var2;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    gn1Var = gn1.KANJI;
                } else {
                    int i14 = bytes[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if ((i14 < 129 || i14 > 159) && (i14 < 224 || i14 > 235)) {
                        i9 = 0;
                        z5 = false;
                        z6 = false;
                        while (true) {
                            if (i9 < str.length()) {
                                cCharAt = str.charAt(i9);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i10 = iArr[cCharAt];
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 != -1) {
                                        z5 = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i10 = iArr[cCharAt];
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 != -1) {
                                        z5 = true;
                                    }
                                }
                                i9++;
                            } else {
                                if (z5) {
                                    gn1Var = gn1.ALPHANUMERIC;
                                    break;
                                }
                                if (z6) {
                                    gn1Var = gn1.NUMERIC;
                                    break;
                                }
                            }
                            gn1Var = gn1Var2;
                            break;
                        }
                    }
                    i13 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        int[] iArr2 = gn1Var.a;
        ui uiVar = new ui();
        if (gn1Var == gn1Var2 && zContainsKey && (brVar = (br) br.d.get(string2)) != null) {
            uiVar.b(7, 4);
            uiVar.b(brVar.a[0], 8);
        }
        lg0 lg0Var4 = lg0.l;
        if (enumMap.containsKey(lg0Var4) && Boolean.valueOf(enumMap.get(lg0Var4).toString()).booleanValue()) {
            i4 = 4;
            uiVar.b(5, 4);
        } else {
            i4 = 4;
        }
        uiVar.b(gn1Var.b, i4);
        ui uiVar2 = new ui();
        int iOrdinal = gn1Var.ordinal();
        if (iOrdinal != 1) {
            int i15 = 8;
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i16 = 0;
                while (i16 < length2) {
                    char cCharAt2 = str.charAt(i16);
                    int i17 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i17 == -1) {
                        throw new y83();
                    }
                    int i18 = i16 + 1;
                    if (i18 < length2) {
                        char cCharAt3 = str.charAt(i18);
                        int i19 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i19 == -1) {
                            throw new y83();
                        }
                        uiVar2.b((i17 * 45) + i19, 11);
                        i16 += 2;
                    } else {
                        uiVar2.b(i17, 6);
                        i16 = i18;
                    }
                }
            } else if (iOrdinal == i4) {
                try {
                    byte[] bytes2 = str.getBytes(string2);
                    int length3 = bytes2.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        uiVar2.b(bytes2[i20], i15);
                        i20++;
                        i15 = 8;
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new y83(e2);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new y83("Invalid mode: ".concat(String.valueOf(gn1Var)));
                }
                try {
                    byte[] bytes3 = str.getBytes("Shift_JIS");
                    int length4 = bytes3.length;
                    for (int i21 = 0; i21 < length4; i21 += 2) {
                        int i22 = ((bytes3[i21] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes3[i21 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        int i23 = 33088;
                        if (i22 >= 33088 && i22 <= 40956) {
                            i8 = i22 - i23;
                        } else if (i22 < 57408 || i22 > 60351) {
                            i8 = -1;
                        } else {
                            i23 = 49472;
                            i8 = i22 - i23;
                        }
                        if (i8 == -1) {
                            throw new y83("Invalid byte sequence");
                        }
                        uiVar2.b(((i8 >> 8) * 192) + (i8 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new y83(e3);
                }
            }
        } else {
            int length5 = str.length();
            int i24 = 0;
            while (i24 < length5) {
                int iCharAt = str.charAt(i24) - '0';
                int i25 = i24 + 2;
                if (i25 < length5) {
                    uiVar2.b(pv1.v(str.charAt(i24 + 1) - '0', 10, iCharAt * 100, str.charAt(i25) - '0'), 10);
                    i24 += 3;
                } else {
                    i24++;
                    if (i24 < length5) {
                        uiVar2.b((iCharAt * 10) + (str.charAt(i24) - '0'), 7);
                        i24 = i25;
                    } else {
                        uiVar2.b(iCharAt, 4);
                    }
                }
            }
        }
        lg0 lg0Var5 = lg0.k;
        if (enumMap.containsKey(lg0Var5)) {
            h53VarA = h53.a(Integer.parseInt(enumMap.get(lg0Var5).toString()));
            int i26 = uiVar.b;
            int i27 = h53VarA.a;
            int i28 = iArr2[i27 <= 9 ? (char) 0 : i27 <= 26 ? (char) 1 : (char) 2] + i26 + uiVar2.b;
            int i29 = h53VarA.c;
            uo0 uo0Var = h53VarA.b[h50.C(i3)];
            int i30 = uo0Var.b;
            int i31 = 0;
            for (m12 m12Var : (m12[]) uo0Var.c) {
                i31 += m12Var.b;
            }
            if (!(i29 - (i31 * i30) >= (i28 + 7) / 8)) {
                throw new y83("Data too big for requested version");
            }
        } else {
            h53 h53VarA2 = h53.a(1);
            int i32 = uiVar.b;
            int i33 = h53VarA2.a;
            int i34 = iArr2[i33 <= 9 ? (char) 0 : i33 <= 26 ? (char) 1 : (char) 2] + i32 + uiVar2.b;
            int i35 = 1;
            while (true) {
                if (i35 > 40) {
                    throw new y83("Data too big");
                }
                h53 h53VarA3 = h53.a(i35);
                int i36 = h53VarA3.c;
                uo0 uo0Var2 = h53VarA3.b[h50.C(i3)];
                int i37 = uo0Var2.b;
                m12[] m12VarArr = (m12[]) uo0Var2.c;
                int length6 = m12VarArr.length;
                int i38 = i12;
                int i39 = i38;
                while (i38 < length6) {
                    int i40 = i38;
                    i39 += m12VarArr[i40].b;
                    i38 = i40 + 1;
                }
                if (i36 - (i39 * i37) >= (i34 + 7) / 8) {
                    int i41 = uiVar.b;
                    int i42 = h53VarA3.a;
                    int i43 = iArr2[i42 <= 9 ? i12 : i42 <= 26 ? 1 : 2] + i41 + uiVar2.b;
                    int i44 = 1;
                    while (true) {
                        if (i44 > 40) {
                            throw new y83("Data too big");
                        }
                        h53 h53VarA4 = h53.a(i44);
                        int i45 = h53VarA4.c;
                        uo0 uo0Var3 = h53VarA4.b[h50.C(i3)];
                        int i46 = uo0Var3.b;
                        m12[] m12VarArr2 = (m12[]) uo0Var3.c;
                        int length7 = m12VarArr2.length;
                        int i47 = i12;
                        int i48 = i47;
                        while (i47 < length7) {
                            int i49 = i47;
                            i48 += m12VarArr2[i49].b;
                            i47 = i49 + 1;
                        }
                        if (i45 - (i48 * i46) >= (i43 + 7) / 8) {
                            h53VarA = h53VarA4;
                            break;
                        }
                        i44++;
                        i12 = 0;
                    }
                } else {
                    i35++;
                    i12 = 0;
                }
            }
        }
        int i50 = h53VarA.a;
        int i51 = h53VarA.c;
        ui uiVar3 = new ui();
        int i52 = uiVar.b;
        uiVar3.c(i52);
        for (int i53 = i12; i53 < i52; i53++) {
            uiVar3.a(uiVar.d(i53));
        }
        int iE = gn1Var == gn1Var2 ? uiVar2.e() : str.length();
        int i54 = iArr2[i50 <= 9 ? i12 : i50 <= 26 ? 1 : 2];
        int i55 = 1 << i54;
        if (iE >= i55) {
            StringBuilder sb = new StringBuilder();
            sb.append(iE);
            sb.append(" is bigger than ");
            sb.append(i55 - 1);
            throw new y83(sb.toString());
        }
        uiVar3.b(iE, i54);
        int i56 = uiVar2.b;
        uiVar3.c(uiVar3.b + i56);
        for (int i57 = i12; i57 < i56; i57++) {
            uiVar3.a(uiVar2.d(i57));
        }
        uo0 uo0Var4 = h53VarA.b[h50.C(i3)];
        int i58 = uo0Var4.b;
        m12[] m12VarArr3 = (m12[]) uo0Var4.c;
        int length8 = m12VarArr3.length;
        int i59 = i12;
        int i60 = i59;
        while (i59 < length8) {
            i60 += m12VarArr3[i59].b;
            i59++;
        }
        int i61 = i51 - (i60 * i58);
        int i62 = i61 << 3;
        if (uiVar3.b > i62) {
            throw new y83("data bits cannot fit in the QR Code" + uiVar3.b + " > " + i62);
        }
        for (int i63 = i12; i63 < 4 && uiVar3.b < i62; i63++) {
            uiVar3.a(i12);
        }
        boolean z7 = i12;
        int i64 = uiVar3.b & 7;
        if (i64 > 0) {
            while (i64 < 8) {
                uiVar3.a(z7);
                i64++;
                z7 = 0;
            }
        }
        int iE2 = i61 - uiVar3.e();
        for (int i65 = 0; i65 < iE2; i65++) {
            uiVar3.b((i65 & 1) == 0 ? 236 : 17, 8);
        }
        if (uiVar3.b != i62) {
            throw new y83("Bits size does not equal capacity");
        }
        int i66 = 0;
        for (m12 m12Var2 : m12VarArr3) {
            i66 += m12Var2.b;
        }
        if (uiVar3.e() != i61) {
            throw new y83("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i66);
        int i67 = 0;
        int i68 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i67 < i66) {
            int[] iArr3 = new int[1];
            int[] iArr4 = new int[1];
            if (i67 >= i66) {
                throw new y83("Block ID too large");
            }
            int i69 = i51 % i66;
            int i70 = i50;
            int i71 = i66 - i69;
            int i72 = i51 / i66;
            int i73 = i61 / i66;
            int i74 = i73 + 1;
            int i75 = i11;
            int i76 = i72 - i73;
            int i77 = (i72 + 1) - i74;
            if (i76 != i77) {
                throw new y83("EC bytes mismatch");
            }
            if (i66 != i71 + i69) {
                throw new y83("RS blocks mismatch");
            }
            if (i51 != ((i74 + i77) * i69) + ((i73 + i76) * i71)) {
                throw new y83("Total bytes mismatch");
            }
            if (i67 < i71) {
                c2 = 0;
                iArr3[0] = i73;
                iArr4[0] = i76;
            } else {
                c2 = 0;
                iArr3[0] = i74;
                iArr4[0] = i77;
            }
            int i78 = iArr3[c2];
            byte[] bArr = new byte[i78];
            int i79 = i68 << 3;
            int i80 = 0;
            while (i80 < i78) {
                int i81 = i67;
                int i82 = i66;
                int i83 = i80;
                int i84 = i79;
                int i85 = 0;
                for (int i86 = 0; i86 < 8; i86++) {
                    if (uiVar3.d(i84)) {
                        i85 |= 1 << (7 - i86);
                    }
                    i84++;
                }
                bArr[i83] = (byte) i85;
                i80 = i83 + 1;
                i79 = i84;
                i67 = i81;
                i66 = i82;
            }
            int i87 = i67;
            int i88 = i66;
            int i89 = iArr4[0];
            int[] iArr5 = new int[i78 + i89];
            for (int i90 = 0; i90 < i78; i90++) {
                iArr5[i90] = bArr[i90] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            new uf1(ut0.k).h(i89, iArr5);
            byte[] bArr2 = new byte[i89];
            int i91 = 0;
            while (i91 < i89) {
                int[] iArr6 = iArr5;
                bArr2[i91] = (byte) iArr6[i78 + i91];
                i91++;
                iArr5 = iArr6;
            }
            arrayList.add(new dj(bArr, bArr2));
            iMax = Math.max(iMax, i78);
            iMax2 = Math.max(iMax2, i89);
            i68 += iArr3[0];
            i67 = i87 + 1;
            i66 = i88;
            i50 = i70;
            i11 = i75;
        }
        int i92 = i50;
        int i93 = i11;
        if (i61 != i68) {
            throw new y83("Data bytes does not match offset");
        }
        ui uiVar4 = new ui();
        for (int i94 = 0; i94 < iMax; i94++) {
            int size = arrayList.size();
            int i95 = 0;
            while (i95 < size) {
                Object obj = arrayList.get(i95);
                i95++;
                byte[] bArr3 = ((dj) obj).a;
                if (i94 < bArr3.length) {
                    uiVar4.b(bArr3[i94], 8);
                }
            }
        }
        for (int i96 = 0; i96 < iMax2; i96++) {
            int size2 = arrayList.size();
            int i97 = 0;
            while (i97 < size2) {
                Object obj2 = arrayList.get(i97);
                i97++;
                byte[] bArr4 = ((dj) obj2).b;
                if (i96 < bArr4.length) {
                    uiVar4.b(bArr4[i96], 8);
                }
            }
        }
        if (i51 != uiVar4.e()) {
            StringBuilder sbS = jc1.s(i51, "Interleaving error: ", " and ");
            sbS.append(uiVar4.e());
            sbS.append(" differ.");
            throw new y83(sbS.toString());
        }
        int i98 = (i92 * 4) + 17;
        vr3 vr3Var = new vr3(i98, i98);
        int i99 = vr3Var.c;
        int i100 = vr3Var.b;
        int i101 = Integer.MAX_VALUE;
        int i102 = 0;
        int i103 = -1;
        while (i102 < 8) {
            l93.f(uiVar4, i3, h53VarA, i102, vr3Var);
            int iA = l41.a(vr3Var, false) + l41.a(vr3Var, true);
            byte[][] bArr5 = (byte[][]) vr3Var.d;
            int i104 = 0;
            int i105 = 0;
            while (i104 < i99 - 1) {
                byte[] bArr6 = bArr5[i104];
                int i106 = i105;
                int i107 = 0;
                while (i107 < i100 - 1) {
                    byte b2 = bArr6[i107];
                    int i108 = i107 + 1;
                    int i109 = i104;
                    if (b2 == bArr6[i108]) {
                        byte[] bArr7 = bArr5[i109 + 1];
                        if (b2 == bArr7[i107] && b2 == bArr7[i108]) {
                            i106++;
                        }
                    }
                    i107 = i108;
                    i104 = i109;
                }
                i104++;
                i105 = i106;
            }
            int i110 = (i105 * 3) + iA;
            int i111 = 0;
            int i112 = 0;
            while (i111 < i99) {
                int i113 = 0;
                while (i113 < i100) {
                    byte[] bArr8 = bArr5[i111];
                    int i114 = i113 + 6;
                    int i115 = i112;
                    if (i114 < i100) {
                        i5 = i102;
                        byte b3 = 1;
                        if (bArr8[i113] == 1 && bArr8[i113 + 1] == 0 && bArr8[i113 + 2] == 1 && bArr8[i113 + 3] == 1 && bArr8[i113 + 4] == 1 && bArr8[i113 + 5] == 0 && bArr8[i114] == 1) {
                            int iMax3 = Math.max(i113 - 4, 0);
                            int iMin = Math.min(i113, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z3 = true;
                                    break;
                                }
                                int i116 = iMax3;
                                if (bArr8[i116] == b3) {
                                    z3 = false;
                                    break;
                                }
                                iMax3 = i116 + 1;
                                b3 = 1;
                            }
                            if (!z3) {
                                int iMax4 = Math.max(i113 + 7, 0);
                                int iMin2 = Math.min(i113 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z4 = true;
                                        break;
                                    }
                                    int i117 = iMax4;
                                    if (bArr8[iMax4] == 1) {
                                        z4 = false;
                                        break;
                                    }
                                    iMax4 = i117 + 1;
                                }
                                if (z4) {
                                }
                            }
                            i112 = i115 + 1;
                        }
                        i6 = i111 + 6;
                        if (i6 < i99) {
                            byte b4 = 1;
                            if (bArr5[i111][i113] != 1 && bArr5[i111 + 1][i113] == 0 && bArr5[i111 + 2][i113] == 1 && bArr5[i111 + 3][i113] == 1 && bArr5[i111 + 4][i113] == 1 && bArr5[i111 + 5][i113] == 0 && bArr5[i6][i113] == 1) {
                                int iMax5 = Math.max(i111 - 4, 0);
                                int iMin3 = Math.min(i111, bArr5.length);
                                while (true) {
                                    if (iMax5 >= iMin3) {
                                        i7 = i111;
                                        z = true;
                                        break;
                                    }
                                    i7 = i111;
                                    if (bArr5[iMax5][i113] == b4) {
                                        z = false;
                                        break;
                                    }
                                    iMax5++;
                                    i111 = i7;
                                    b4 = 1;
                                }
                                if (z) {
                                    i112++;
                                } else {
                                    int iMax6 = Math.max(i7 + 7, 0);
                                    int iMin4 = Math.min(i7 + 11, bArr5.length);
                                    while (true) {
                                        if (iMax6 >= iMin4) {
                                            z2 = true;
                                            break;
                                        }
                                        if (bArr5[iMax6][i113] == 1) {
                                            z2 = false;
                                            break;
                                        }
                                        iMax6++;
                                    }
                                    if (z2) {
                                        i112++;
                                    }
                                }
                            } else {
                                i7 = i111;
                            }
                        } else {
                            i7 = i111;
                        }
                        i113++;
                        i102 = i5;
                        i111 = i7;
                    } else {
                        i5 = i102;
                    }
                    i112 = i115;
                    i6 = i111 + 6;
                    if (i6 < i99) {
                        byte b5 = 1;
                        if (bArr5[i111][i113] != 1) {
                            i7 = i111;
                        } else {
                            i7 = i111;
                        }
                    } else {
                        i7 = i111;
                    }
                    i113++;
                    i102 = i5;
                    i111 = i7;
                }
                i111++;
            }
            int i118 = i102;
            int i119 = (i112 * 40) + i110;
            int i120 = 0;
            for (int i121 = 0; i121 < i99; i121++) {
                byte[] bArr9 = bArr5[i121];
                for (int i122 = 0; i122 < i100; i122++) {
                    if (bArr9[i122] == 1) {
                        i120++;
                    }
                }
            }
            int i123 = i99 * i100;
            int iAbs = (((Math.abs((i120 << 1) - i123) * 10) / i123) * 10) + i119;
            if (iAbs < i101) {
                i101 = iAbs;
                i103 = i118;
            }
            i102 = i118 + 1;
        }
        l93.f(uiVar4, i3, h53VarA, i103, vr3Var);
        int i124 = i93 << 1;
        int i125 = i100 + i124;
        int i126 = i124 + i99;
        int iMax7 = Math.max(200, i125);
        int iMax8 = Math.max(200, i126);
        int iMin5 = Math.min(iMax7 / i125, iMax8 / i126);
        int i127 = (iMax7 - (i100 * iMin5)) / 2;
        int i128 = (iMax8 - (i99 * iMin5)) / 2;
        xi xiVar = new xi(iMax7, iMax8);
        int i129 = 0;
        while (i129 < i99) {
            int i130 = i127;
            int i131 = 0;
            while (i131 < i100) {
                if (vr3Var.a(i131, i129) == 1) {
                    xiVar.c(i130, i128, iMin5, iMin5);
                }
                i131++;
                i130 += iMin5;
            }
            i129++;
            i128 += iMin5;
        }
        return xiVar;
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public Object mo1232zza() {
        switch (this.a) {
            case 18:
                return new Boolean(((zzahi) zzahh.b.a.a).zzb());
            case 19:
            default:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().i());
            case 20:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzt());
            case 21:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzL());
            case 22:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzT());
        }
    }

    @Override // defpackage.oo3
    public boolean zzb(Class cls) {
        return zzadu.class.isAssignableFrom(cls);
    }

    @Override // defpackage.oo3
    public vo3 zzc(Class cls) {
        if (!zzadu.class.isAssignableFrom(cls)) {
            d.r("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (vo3) zzadu.t(cls.asSubclass(zzadu.class)).y(3);
        } catch (Exception e2) {
            vq2.n("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public void zzw() {
        throw new UnsupportedOperationException();
    }

    public static void g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    @Override // defpackage.tj1
    public int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.tj1
    public MediaCodecInfo getCodecInfoAt(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo1051zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 24:
                ((zzdeg) obj).zze();
                break;
            case 25:
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
                break;
            case 26:
                ((zzr) obj).zzdA();
                break;
            case 27:
                ((zzdjt) obj).zzo();
                break;
            default:
                ((zzdls) obj).zza();
                break;
        }
    }
}
