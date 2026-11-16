package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.internal.m;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdlk;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.stats.zzd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xl1 implements fs, zzqp, rr1, w83, el0, zzd, hz3, zzbc, zzq, com.google.android.gms.internal.p002firebaseauthapi.zzqp, zzdjz {
    public static q22 d;
    public final /* synthetic */ int a;
    public static final xl1 b = new xl1(0);
    public static final xl1 c = new xl1(1);
    public static final xl1 e = new xl1(2);
    public static final xl1 f = new xl1(3);
    public static final xl1 g = new xl1(4);
    public static final xl1 h = new xl1(5);
    public static final xl1 i = new xl1(6);
    public static final xl1 j = new xl1(7);
    public static final xl1 k = new xl1(8);
    public static final /* synthetic */ xl1 l = new xl1(19);
    public static final /* synthetic */ xl1 m = new xl1(21);
    public static final /* synthetic */ xl1 n = new xl1(22);
    public static final /* synthetic */ xl1 o = new xl1(23);
    public static final /* synthetic */ xl1 p = new xl1(25);
    public static final /* synthetic */ xl1 q = new xl1(26);
    public static final /* synthetic */ xl1 r = new xl1(27);
    public static final /* synthetic */ xl1 s = new xl1(28);

    public /* synthetic */ xl1(int i2) {
        this.a = i2;
    }

    public static final ArrayList a(View view) {
        List listY;
        if (lz.a.contains(xl1.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(b63.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            int i2 = 0;
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    resourceName.getClass();
                    Pattern patternCompile = Pattern.compile("/");
                    patternCompile.getClass();
                    dk2.j0(0);
                    Matcher matcher = patternCompile.matcher(resourceName);
                    if (matcher.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList2.add(resourceName.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(resourceName.subSequence(iEnd, resourceName.length()).toString());
                        listY = arrayList2;
                    } else {
                        listY = eu.y(resourceName.toString());
                    }
                    String[] strArr = (String[]) listY.toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    lowerCase.getClass();
                    arrayList3.add(lowerCase);
                }
            }
            return arrayList3;
        } catch (Throwable th) {
            lz.a(xl1.class, th);
            return null;
        }
    }

    public static m b(Class cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return je2.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return je2.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return je2.VIDEO;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return je2.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return go.a;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return re2.a;
        }
        return null;
    }

    public static final q22 e(Context context) {
        q22 q22Var = d;
        if (q22Var != null) {
            return q22Var;
        }
        synchronized (c) {
            q22 q22Var2 = d;
            if (q22Var2 != null) {
                return q22Var2;
            }
            context.getApplicationContext();
            q22 q22VarG = l7.g(context);
            d = q22VarG;
            return q22VarG;
        }
    }

    public static final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        if (!lz.a.contains(xl1.class)) {
            try {
                arrayList.getClass();
                arrayList2.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    xl1 xl1Var = b;
                    if (!lz.a.contains(xl1Var)) {
                        try {
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayList2.get(i3);
                                i3++;
                                if (dk2.O(str, (String) obj2, false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            lz.a(xl1Var, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                lz.a(xl1.class, th2);
                return false;
            }
        }
        return false;
    }

    public static final zzaew g(Object obj, Object obj2) {
        zzaew zzaewVarF = (zzaew) obj;
        zzaew zzaewVar = (zzaew) obj2;
        if (!zzaewVar.isEmpty()) {
            if (!zzaewVarF.a) {
                zzaewVarF = zzaewVarF.f();
            }
            zzaewVarF.j();
            if (!zzaewVar.isEmpty()) {
                zzaewVarF.putAll(zzaewVar);
            }
        }
        return zzaewVarF;
    }

    public ArrayList c(View view) {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                ArrayList arrayListB = b63.b(view);
                int size = arrayListB.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListB.get(i2);
                    i2++;
                    arrayList.addAll(c((View) obj));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fs
    public void d(zx0 zx0Var, ul2 ul2Var) {
        zx0Var.getClass();
        zx0Var.e.f(fz0.j, new d32((as0) ul2Var, null, 2));
    }

    @Override // defpackage.q02
    public Object get() {
        return n43.a;
    }

    @Override // defpackage.rr1
    public Object i() {
        return new LinkedHashMap();
    }

    @Override // defpackage.w83
    public xi k(String str, int i2, EnumMap enumMap) {
        int i3;
        xi xiVar;
        int i4;
        int i5;
        if (str.isEmpty()) {
            d.r("Found empty contents");
            return null;
        }
        if (i2 != 6) {
            d.r("Can only encode DATA_MATRIX, but got ".concat(h50.D(i2)));
            return null;
        }
        yl2 yl2Var = (yl2) enumMap.get(lg0.c);
        if (yl2Var == null) {
            yl2Var = yl2.a;
        }
        if (enumMap.get(lg0.d) != null) {
            m93.b();
            return null;
        }
        if (enumMap.get(lg0.e) != null) {
            m93.b();
            return null;
        }
        int i6 = 9;
        int i7 = 0;
        int i8 = 1;
        ng0[] ng0VarArr = {new h72(8), new t40(i6), new dp2(i7), new dp2(i8), new xw0(11), new k92(i6)};
        qg0 qg0Var = new qg0(str);
        qg0Var.b = yl2Var;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            qg0Var.d((char) 236);
            qg0Var.g = 2;
            qg0Var.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            qg0Var.d((char) 237);
            qg0Var.g = 2;
            qg0Var.d += 7;
        }
        int i9 = 0;
        while (qg0Var.b()) {
            ng0VarArr[i9].f(qg0Var);
            int i10 = qg0Var.e;
            if (i10 >= 0) {
                qg0Var.e = -1;
                i9 = i10;
            }
        }
        StringBuilder sb = qg0Var.c;
        int length = sb.length();
        qg0Var.c(sb.length());
        int i11 = qg0Var.f.b;
        if (length < i11 && i9 != 0 && i9 != 5 && i9 != 4) {
            qg0Var.d((char) 254);
        }
        if (sb.length() < i11) {
            sb.append((char) 129);
        }
        while (sb.length() < i11) {
            int length2 = ((sb.length() + 1) * 149) % 253;
            int i12 = length2 + 130;
            if (i12 > 254) {
                i12 = length2 - 124;
            }
            sb.append((char) i12);
        }
        String string = sb.toString();
        xl2 xl2VarE = xl2.e(string.length(), yl2Var);
        int i13 = xl2VarE.e;
        int i14 = xl2VarE.d;
        int[] iArr = nh0.a;
        int length3 = string.length();
        int i15 = xl2VarE.b;
        int i16 = xl2VarE.c;
        if (length3 != i15) {
            d.r("The number of codewords does not match the selected symbol");
            return null;
        }
        StringBuilder sb2 = new StringBuilder(i15 + i16);
        sb2.append(string);
        int iC = xl2VarE.c();
        if (iC == 1) {
            sb2.append(nh0.a(i16, string));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i17 = 0;
            while (i17 < iC) {
                int i18 = i17 + 1;
                iArr2[i17] = xl2VarE.a(i18);
                iArr3[i17] = xl2VarE.h;
                iArr4[i17] = 0;
                if (i17 > 0) {
                    iArr4[i17] = iArr4[i17 - 1] + iArr2[i17];
                }
                i17 = i18;
            }
            int i19 = 0;
            while (i19 < iC) {
                StringBuilder sb3 = new StringBuilder(iArr2[i19]);
                for (int i20 = i19; i20 < i15; i20 += iC) {
                    sb3.append(string.charAt(i20));
                }
                String strA = nh0.a(iArr3[i19], sb3.toString());
                int i21 = i19;
                int i22 = i7;
                while (i21 < iArr3[i19] * iC) {
                    sb2.setCharAt(i15 + i21, strA.charAt(i22));
                    i21 += iC;
                    i22++;
                }
                i19++;
                i7 = 0;
            }
        }
        String string2 = sb2.toString();
        int iB = xl2VarE.b() * i14;
        int iD = xl2VarE.d() * i13;
        k90 k90Var = new k90();
        k90Var.c = string2;
        k90Var.b = iB;
        k90Var.a = iD;
        byte[] bArr = new byte[iB * iD];
        k90Var.d = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i23 = k90Var.b;
        byte[] bArr2 = (byte[]) k90Var.d;
        int i24 = 0;
        int i25 = 4;
        int i26 = 0;
        while (true) {
            if (i25 == iD && i26 == 0) {
                int i27 = iD - 1;
                k90Var.d(i27, 0, i24, i8);
                k90Var.d(i27, i8, i24, 2);
                k90Var.d(i27, 2, i24, 3);
                k90Var.d(0, iB - 2, i24, 4);
                int i28 = iB - 1;
                k90Var.d(0, i28, i24, 5);
                k90Var.d(1, i28, i24, 6);
                k90Var.d(2, i28, i24, 7);
                k90Var.d(3, i28, i24, 8);
                i24++;
            }
            i3 = iD - 2;
            if (i25 == i3 && i26 == 0 && iB % 4 != 0) {
                k90Var.d(iD - 3, 0, i24, 1);
                k90Var.d(i3, 0, i24, 2);
                k90Var.d(iD - 1, 0, i24, 3);
                k90Var.d(0, iB - 4, i24, 4);
                k90Var.d(0, iB - 3, i24, 5);
                k90Var.d(0, iB - 2, i24, 6);
                int i29 = iB - 1;
                k90Var.d(0, i29, i24, 7);
                k90Var.d(1, i29, i24, 8);
                i24++;
            }
            if (i25 == i3 && i26 == 0 && iB % 8 == 4) {
                k90Var.d(iD - 3, 0, i24, 1);
                k90Var.d(i3, 0, i24, 2);
                k90Var.d(iD - 1, 0, i24, 3);
                k90Var.d(0, iB - 2, i24, 4);
                int i30 = iB - 1;
                k90Var.d(0, i30, i24, 5);
                k90Var.d(1, i30, i24, 6);
                k90Var.d(2, i30, i24, 7);
                k90Var.d(3, i30, i24, 8);
                i24++;
            }
            if (i25 == iD + 4 && i26 == 2 && iB % 8 == 0) {
                int i31 = iD - 1;
                k90Var.d(i31, 0, i24, 1);
                int i32 = iB - 1;
                k90Var.d(i31, i32, i24, 2);
                int i33 = iB - 3;
                k90Var.d(0, i33, i24, 3);
                int i34 = iB - 2;
                k90Var.d(0, i34, i24, 4);
                k90Var.d(0, i32, i24, 5);
                k90Var.d(1, i33, i24, 6);
                k90Var.d(1, i34, i24, 7);
                k90Var.d(1, i32, i24, 8);
                i24++;
            }
            while (true) {
                if (i25 < iD && i26 >= 0 && bArr2[(i25 * i23) + i26] < 0) {
                    k90Var.j(i25, i26, i24);
                    i24++;
                }
                int i35 = i25 - 2;
                int i36 = i26 + 2;
                if (i35 < 0 || i36 >= iB) {
                    break;
                }
                i25 = i35;
                i26 = i36;
            }
            int i37 = i25 - 1;
            int i38 = i26 + 5;
            while (true) {
                if (i37 >= 0 && i38 < iB && bArr2[(i37 * i23) + i38] < 0) {
                    k90Var.j(i37, i38, i24);
                    i24++;
                }
                int i39 = i37 + 2;
                int i40 = i38 - 2;
                if (i39 >= iD || i40 < 0) {
                    break;
                }
                i37 = i39;
                i38 = i40;
            }
            i25 = i37 + 5;
            i26 = i38 - 1;
            if (i25 >= iD && i26 >= iB) {
                break;
            }
            i8 = 1;
            i23 = i23;
            xl2VarE = xl2VarE;
        }
        int i41 = iB - 1;
        boolean z = true;
        int i42 = iD - 1;
        if (bArr2[(i42 * i23) + i41] < 0) {
            bArr2[(i42 * i23) + i41] = 1;
            bArr2[(i3 * i23) + (iB - 2)] = 1;
        }
        int iB2 = xl2VarE.b() * i14;
        int iD2 = xl2VarE.d() * i13;
        vr3 vr3Var = new vr3((xl2VarE.b() * i14) + (xl2VarE.b() << 1), (xl2VarE.d() * i13) + (xl2VarE.d() << 1));
        int i43 = 0;
        int i44 = 0;
        while (i44 < iD2) {
            int i45 = i44 % i13;
            if (i45 == 0) {
                int i46 = 0;
                int i47 = 0;
                while (i46 < (xl2VarE.b() * i14) + (xl2VarE.b() << 1)) {
                    vr3Var.c(i47, i43, i46 % 2 == 0 ? z : false);
                    i47++;
                    i46++;
                    z = true;
                }
                i43++;
            }
            int i48 = 0;
            for (int i49 = 0; i49 < iB2; i49++) {
                int i50 = i49 % i14;
                if (i50 == 0) {
                    vr3Var.c(i48, i43, true);
                    i48++;
                }
                vr3Var.c(i48, i43, bArr2[(i44 * i23) + i49] == 1);
                int i51 = i48 + 1;
                if (i50 == i14 - 1) {
                    vr3Var.c(i51, i43, i44 % 2 == 0);
                    i48 += 2;
                } else {
                    i48 = i51;
                }
            }
            int i52 = i43 + 1;
            if (i45 == i13 - 1) {
                int i53 = 0;
                for (int i54 = 0; i54 < (xl2VarE.b() * i14) + (xl2VarE.b() << 1); i54++) {
                    vr3Var.c(i53, i52, true);
                    i53++;
                }
                i43 += 2;
            } else {
                i43 = i52;
            }
            i44++;
            z = true;
        }
        int i55 = vr3Var.b;
        int i56 = vr3Var.c;
        int iMax = Math.max(200, i55);
        int iMax2 = Math.max(200, i56);
        int iMin = Math.min(iMax / i55, iMax2 / i56);
        int i57 = (iMax - (i55 * iMin)) / 2;
        int i58 = (iMax2 - (i56 * iMin)) / 2;
        if (200 < i56 || 200 < i55) {
            xiVar = new xi(i55, i56);
            i4 = 0;
            i5 = 0;
        } else {
            xiVar = new xi(200, 200);
            i4 = i57;
            i5 = i58;
        }
        int[] iArr5 = xiVar.d;
        int length4 = iArr5.length;
        for (int i59 = 0; i59 < length4; i59++) {
            iArr5[i59] = 0;
        }
        int i60 = i5;
        int i61 = 0;
        while (i61 < i56) {
            int i62 = i4;
            int i63 = 0;
            while (i63 < i55) {
                if (vr3Var.a(i63, i61) == 1) {
                    xiVar.c(i62, i60, iMin, iMin);
                }
                i63++;
                i62 += iMin;
            }
            i61++;
            i60 += iMin;
        }
        return xiVar;
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public Object mo1232zza() {
        switch (this.a) {
            case 19:
                List list = zzfy.a;
                return zzags.b.get().zzn();
            case 20:
            case 21:
            default:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().w());
            case 22:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzR());
            case 23:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().C());
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (iInterfaceQueryLocalInterface instanceof zzcdq) {
            return (zzcdq) iInterfaceQueryLocalInterface;
        }
        return new zzcdq(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 25:
                ((zzdec) obj).N();
                break;
            case 26:
                ((zzr) obj).zzdW();
                break;
            default:
                ((zzdlk) obj).zze();
                break;
        }
    }
}
