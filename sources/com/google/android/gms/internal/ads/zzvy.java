package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h00;
import defpackage.pv1;
import defpackage.q63;
import defpackage.qb5;
import defpackage.ra5;
import defpackage.rl3;
import defpackage.ti0;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzvy {
    public static final zzgwr m = zzgwu.a(ra5.b);
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    public final boolean e(int i, int i2, double d) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (i3 < 29 || (((bool = qb5.e) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = ti0.c(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    if (ti0.d(supportedPerformancePoints.get(i4)).covers(performancePointC)) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && qb5.e == null) {
                    if (i3 >= 37) {
                        z = false;
                    } else {
                        int iW = h00.w(true);
                        if (i3 < 35 ? h00.w(false) != 2 || iW == 1 : iW == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    qb5.e = Boolean.valueOf(z);
                    if (z) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder sb = new StringBuilder(q63.a(String.valueOf(i).length() + 20, 1, String.valueOf(i2)) + String.valueOf(d).length());
                    pv1.s(i, i2, "sizeAndRate.cover, ", "x", sb);
                    sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
                    sb.append(d);
                    i(sb.toString());
                    return false;
                }
                if (!j(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        HashSet hashSet = zzal.a;
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + rl3.c(i, 22) + 1 + String.valueOf(d).length());
                            pv1.s(i, i2, "sizeAndRate.rotated, ", "x", sb2);
                            sb2.append(UserDetailsUtils.UserDetailsLiterals.AT);
                            sb2.append(d);
                            String string = sb2.toString();
                            int length = str.length();
                            String str2 = zzfq.a;
                            String str3 = this.b;
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            q63.y(sb3, ", ", str3, "] [", str2);
                            sb3.append(C4664b4.j.e);
                            zzeh.a("MediaCodecInfo", sb3.toString());
                            return true;
                        }
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + rl3.c(i, 22) + 1 + String.valueOf(d).length());
                        pv1.s(i, i2, "sizeAndRate.rotated, ", "x", sb4);
                        sb4.append(UserDetailsUtils.UserDetailsLiterals.AT);
                        sb4.append(d);
                        String string2 = sb4.toString();
                        int length2 = str.length();
                        String str4 = zzfq.a;
                        String str5 = this.b;
                        StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length2 + 2 + String.valueOf(str5).length() + 3 + String.valueOf(str4).length() + 1);
                        sb5.append("AssumedSupport [");
                        sb5.append(string2);
                        sb5.append("] [");
                        sb5.append(str);
                        q63.y(sb5, ", ", str5, "] [", str4);
                        sb5.append(C4664b4.j.e);
                        zzeh.a("MediaCodecInfo", sb5.toString());
                        return true;
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + rl3.c(i, 22) + 1 + String.valueOf(d).length());
                    pv1.s(i, i2, "sizeAndRate.support, ", "x", sb6);
                    sb6.append(UserDetailsUtils.UserDetailsLiterals.AT);
                    sb6.append(d);
                    i(sb6.toString());
                    return false;
                }
            }
        } else if (!j(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                HashSet hashSet2 = zzal.a;
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && j(videoCapabilities, i2, i, d)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i2).length() + rl3.c(i, 22) + 1 + String.valueOf(d).length());
                    pv1.s(i, i2, "sizeAndRate.rotated, ", "x", sb7);
                    sb7.append(UserDetailsUtils.UserDetailsLiterals.AT);
                    sb7.append(d);
                    String string3 = sb7.toString();
                    int length3 = str.length();
                    String str6 = zzfq.a;
                    String str7 = this.b;
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length3 + 2 + String.valueOf(str7).length() + 3 + String.valueOf(str6).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    q63.y(sb8, ", ", str7, "] [", str6);
                    sb8.append(C4664b4.j.e);
                    zzeh.a("MediaCodecInfo", sb8.toString());
                    return true;
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i2).length() + rl3.c(i, 22) + 1 + String.valueOf(d).length());
            pv1.s(i, i2, "sizeAndRate.support, ", "x", sb9);
            sb9.append(UserDetailsUtils.UserDetailsLiterals.AT);
            sb9.append(d);
            i(sb9.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    public static zzvy a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        boolean z3 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z4 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z2 = false;
        } else {
            Integer num = (Integer) m.mo1232zza();
            if (num != null && num.intValue() <= 202604) {
                String str4 = Build.MANUFACTURER;
                if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO") || str4.equals("Fairphone")) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return new zzvy(str, str2, str3, codecCapabilities, z, z3, z4, z2);
    }

    public final boolean b(Context context, zzv zzvVar) {
        int i;
        int i2;
        String str = zzvVar.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(zzwp.d(zzvVar))) || !f(context, zzvVar, true) || !g(zzvVar)) {
            return false;
        }
        if (this.i) {
            int i3 = zzvVar.v;
            if (i3 > 0 && (i2 = zzvVar.w) > 0) {
                return e(i3, i2, zzvVar.z);
            }
        } else {
            int i4 = zzvVar.J;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    i("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    i("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i4);
                    i(sb.toString());
                    return false;
                }
            }
            int i5 = zzvVar.H;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    i("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    i("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    String str3 = this.a;
                    StringBuilder sb2 = new StringBuilder(q63.a(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i);
                    sb2.append(C4664b4.j.e);
                    zzeh.c("MediaCodecInfo", sb2.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i5);
                    i(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(zzv zzvVar) {
        boolean z;
        if (this.i) {
            return this.e;
        }
        zzdq zzdqVarD = zzdr.d(zzvVar);
        if (zzdqVarD == null || !(z = zzdqVarD.c)) {
            return false;
        }
        zzgvz.f(z);
        return zzdqVarD.a == 42;
    }

    public final zzjj d(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i;
        String str = zzvVar.o;
        String str2 = zzvVar2.o;
        zzi zziVar = zzvVar2.F;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (zzvVar.A != zzvVar2.A) {
                i2 |= 1024;
            }
            boolean z = (zzvVar.v == zzvVar2.v && zzvVar.w == zzvVar2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            zzi zziVar2 = zzvVar.F;
            if ((!zzi.a(zziVar2) || !zzi.a(zziVar)) && !Objects.equals(zziVar2, zziVar)) {
                i2 |= 2048;
            }
            HashSet hashSet = zzal.a;
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.b(zzvVar2)) {
                i2 |= 2;
            }
            int i3 = zzvVar.x;
            if (i3 != -1 && (i = zzvVar.y) != -1 && i3 == zzvVar2.x && i == zzvVar2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairC = zzdr.c(zzvVar);
                Pair pairC2 = zzdr.c(zzvVar2);
                if (pairC == null || pairC2 == null || !((Integer) pairC.first).equals(pairC2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new zzjj(str3, zzvVar, zzvVar2, true == zzvVar.b(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.H != zzvVar4.H) {
                i2 |= 4096;
            }
            if (zzvVar3.J != zzvVar4.J) {
                i2 |= 8192;
            }
            if (zzvVar3.K != zzvVar4.K) {
                i2 |= 16384;
            }
            String str4 = this.b;
            if (i2 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairC3 = zzdr.c(zzvVar3);
                Pair pairC4 = zzdr.c(zzvVar4);
                if (pairC3 != null && pairC4 != null) {
                    int iIntValue = ((Integer) pairC3.first).intValue();
                    int iIntValue2 = ((Integer) pairC4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzjj(this.a, zzvVar3, zzvVar4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairC3.equals(pairC4)) {
                        return new zzjj(this.a, zzvVar3, zzvVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new zzjj(this.a, zzvVar3, zzvVar4, 3, 0);
            }
            if (!zzvVar3.b(zzvVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzjj(this.a, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzjj(this.a, zzvVar3, zzvVar4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        if (r5.equals("video/hevc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        r2 = r2;
        r2 = r2;
        r2 = r2;
        r2 = r2;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        if (r5.equals("video/av01") != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.content.Context r26, com.google.android.gms.internal.ads.zzv r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvy.f(android.content.Context, com.google.android.gms.internal.ads.zzv, boolean):boolean");
    }

    public final boolean g(zzv zzvVar) {
        return (Objects.equals(zzvVar.o, "audio/flac") && zzvVar.K == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void i(String str) {
        String str2 = zzfq.a;
        String str3 = this.b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        q63.y(sb, "NoSupport [", str, "] [", str4);
        q63.y(sb, ", ", str3, "] [", str2);
        sb.append(C4664b4.j.e);
        zzeh.a("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.a;
    }

    public zzvy(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = zzas.b(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfq.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointH = h(videoCapabilities, i, i2);
        int i3 = pointH.x;
        int i4 = pointH.y;
        if (d != -1.0d && d >= 1.0d) {
            double dFloor = Math.floor(d);
            if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
                Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
                if (achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }
}
