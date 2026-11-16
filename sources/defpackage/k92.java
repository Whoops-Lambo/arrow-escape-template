package defpackage;

import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.ads.zzala;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzclg;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagy;
import com.google.android.gms.internal.measurement.zzagz;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzahf;
import com.google.android.gms.measurement.internal.zzfy;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k92 implements yv, bq2, zzqp, ng0, rr1, uc2, p11, jf2, zzagi, hz3, zzagu, zzdjz {
    public static final k92 b = new k92(0);
    public static final k92 c = new k92(1);
    public static final /* synthetic */ k92 d = new k92(2);
    public static final k92 e = new k92(3);
    public static final k92 f = new k92(4);
    public static final k92 g = new k92(5);
    public static final k92 h = new k92(6);
    public static final k92 i = new k92(7);
    public static final k92 j = new k92(8);
    public static final /* synthetic */ k92 k = new k92(17);
    public static final /* synthetic */ k92 l = new k92(18);
    public static final /* synthetic */ k92 m = new k92(19);
    public static final /* synthetic */ k92 n = new k92(20);
    public static final /* synthetic */ k92 o = new k92(21);
    public static final /* synthetic */ k92 p = new k92(22);
    public static final /* synthetic */ k92 q = new k92(23);
    public static final /* synthetic */ k92 r = new k92(24);
    public static final /* synthetic */ k92 s = new k92(25);
    public static final /* synthetic */ k92 t = new k92(26);
    public static final /* synthetic */ k92 u = new k92(27);
    public static final /* synthetic */ k92 v = new k92(28);
    public final /* synthetic */ int a;

    public /* synthetic */ k92(int i2) {
        this.a = i2;
    }

    public static oc2 g(uf0 uf0Var) {
        return new oc2(System.currentTimeMillis() + 3600000, new nc2(8, 0), new mc2(true, false, false), 10.0d, 1.2d, 60);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final boolean k(View view) {
        boolean z;
        boolean z2;
        TextView textView;
        boolean z3;
        TextView textView2;
        boolean z4;
        TextView textView3;
        String strJ;
        boolean zMatches;
        k92 k92Var = b;
        Set set = lz.a;
        if (set.contains(k92.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(k92Var)) {
                z = false;
            } else {
                try {
                    z = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    lz.a(k92Var, th);
                    z = false;
                }
            }
            if (!z && !k92Var.j((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (lz.a.contains(k92Var)) {
                    z2 = false;
                    if (!z2) {
                        textView = (TextView) view;
                        if (lz.a.contains(k92Var)) {
                            z3 = false;
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (lz.a.contains(k92Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else {
                                            try {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strJ = b63.j(textView3);
                                                    if (strJ != null || strJ.length() == 0) {
                                                        zMatches = false;
                                                    } else {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strJ).matches();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                lz.a(k92Var, th2);
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    try {
                                        if (textView2.getInputType() == 3) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    } catch (Throwable th3) {
                                        lz.a(k92Var, th3);
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            try {
                                if (textView.getInputType() == 112) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } catch (Throwable th4) {
                                lz.a(k92Var, th4);
                            }
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (lz.a.contains(k92Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() == 96) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th5) {
                        lz.a(k92Var, th5);
                    }
                    if (!z2) {
                        textView = (TextView) view;
                        if (lz.a.contains(k92Var)) {
                            z3 = false;
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (lz.a.contains(k92Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (textView.getInputType() == 112) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (lz.a.contains(k92Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (lz.a.contains(k92Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strJ = b63.j(textView3);
                                            if (strJ != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            lz.a(k92.class, th6);
            return false;
        }
    }

    @Override // defpackage.jf2
    public bp0 b(cl2 cl2Var) {
        return new z62(new g9(cl2Var, null, 9));
    }

    @Override // defpackage.p11
    public xf1 c(String str) {
        return tp1.a;
    }

    @Override // defpackage.ng0
    public void f(qg0 qg0Var) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean zB = qg0Var.b();
            sb = qg0Var.c;
            if (!zB) {
                break;
            }
            sb2.append(qg0Var.a());
            int i2 = qg0Var.d + 1;
            qg0Var.d = i2;
            if (eu.B(qg0Var.a, i2, 5) != 5) {
                qg0Var.e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        qg0Var.c(length2);
        boolean z = qg0Var.f.b - length2 > 0;
        if (qg0Var.b() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                e32.i("Message length not in valid ranges: ".concat(String.valueOf(length)));
                return;
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i3 = 0; i3 < length3; i3++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i3);
            if (length4 > 255) {
                length4 -= 256;
            }
            qg0Var.d((char) length4);
        }
    }

    @Override // defpackage.yv
    public Object h(lt0 lt0Var) {
        Object objG = lt0Var.g(new l12(ug.class, Executor.class));
        objG.getClass();
        return ak.h((Executor) objG);
    }

    @Override // defpackage.rr1
    public Object i() {
        return new TreeSet();
    }

    public boolean j(TextView textView) {
        if (lz.a.contains(this)) {
            return false;
        }
        try {
            String strJ = b63.j(textView);
            Pattern patternCompile = Pattern.compile("\\s");
            patternCompile.getClass();
            strJ.getClass();
            String strReplaceAll = patternCompile.matcher(strJ).replaceAll("");
            strReplaceAll.getClass();
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i2 = 0;
                boolean z = false;
                for (int i3 = length - 1; -1 < i3; i3--) {
                    char cCharAt = strReplaceAll.charAt(i3);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigit = Character.digit((int) cCharAt, 10);
                    if (iDigit < 0) {
                        throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                    }
                    if (z && (iDigit = iDigit * 2) > 9) {
                        iDigit = (iDigit % 10) + 1;
                    }
                    i2 += iDigit;
                    z = !z;
                }
                if (i2 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            lz.a(this, th);
            return false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                int i2 = fo1.b;
                return "TimeSource(System.nanoTime())";
            case 15:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public Object mo1232zza() {
        switch (this.a) {
            case 18:
                return new Boolean(((zzagz) zzagy.b.a.a).zza());
            case 19:
                List list = zzfy.a;
                return ((zzahf) zzahe.b.a.a).zzb();
            case 20:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().F());
            case 21:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzC());
            case 22:
            default:
                List list4 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzJ());
            case 23:
                List list5 = zzfy.a;
                return Long.valueOf(zzags.b.get().zzi());
            case 24:
                List list6 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().I());
        }
    }

    public static ac3 d(String str) {
        if (TextUtils.isEmpty(str)) {
            v7.l("%s : empty one dt", "OneDTParser");
            return new ac3("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new ac3(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e2) {
            v7.h(qc3.ONE_DT_PARSE_ERROR, e2);
            v7.l("%s : failed parse one dt", "OneDTParser");
        }
        return new ac3("", -1L);
    }

    @Override // defpackage.bq2
    public aq2 a() {
        return new aq2(fo1.b());
    }

    @Override // defpackage.uc2
    public oc2 e(uf0 uf0Var, JSONObject jSONObject) {
        return g(uf0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzagi, defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Constructor mo1232zza() {
        int[] iArr = zzagk.c;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzago.class).getConstructor(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        switch (this.a) {
            case 25:
                ((zzdec) obj).zzf();
                break;
            case 26:
                ((zzr) obj).zzdx();
                break;
            default:
                ((zzdlo) obj).zzg();
                break;
        }
    }

    @Override // defpackage.hz3, com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ zzago[] mo1232zza() {
        int i2 = zzclg.w;
        return new zzago[]{new zzamx(), new zzala()};
    }
}
