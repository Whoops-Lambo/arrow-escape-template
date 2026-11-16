package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.MimeTypes;
import com.ironsource.C4664b4;
import com.moloco.sdk.internal.publisher.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.d31;
import defpackage.h50;
import defpackage.jc1;
import defpackage.l63;
import defpackage.nj;
import defpackage.nj1;
import defpackage.pv1;
import defpackage.ti0;
import defpackage.y21;
import defpackage.y32;
import io.p071bidmachine.media3.common.f;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.c;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.container.h;
import io.p071bidmachine.media3.container.o;
import io.p071bidmachine.media3.exoplayer.g;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    public final boolean g(int i, int i2, double d) {
        String str;
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = x.a;
        if (i3 >= 29) {
            if (i3 < 29 || (((bool = d.a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c = 0;
            } else {
                nj1.g();
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
                if (c == 1 && d.a == null) {
                    if (i3 >= 35) {
                        z = false;
                    } else {
                        int iP = k0.p(false);
                        int iP2 = k0.p(true);
                        if (iP != 0 && (iP2 != 0 ? iP == 2 && iP2 == 2 : iP == 2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    d.a = Boolean.valueOf(z);
                    if (z) {
                        c = 0;
                    }
                }
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder sbT = jc1.t("sizeAndRate.cover, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
                    sbT.append(d);
                    h(sbT.toString());
                    return false;
                }
                if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbT2 = jc1.t("sizeAndRate.rotated, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
                            sbT2.append(d);
                            StringBuilder sbR = pv1.r("AssumedSupport [", sbT2.toString(), "] [", str, ", ");
                            sbR.append(this.b);
                            sbR.append("] [");
                            sbR.append(x.b);
                            sbR.append(C4664b4.j.e);
                            a.m("MediaCodecInfo", sbR.toString());
                            return true;
                        }
                        StringBuilder sbT3 = jc1.t("sizeAndRate.rotated, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
                        sbT3.append(d);
                        StringBuilder sbR2 = pv1.r("AssumedSupport [", sbT3.toString(), "] [", str, ", ");
                        sbR2.append(this.b);
                        sbR2.append("] [");
                        sbR2.append(x.b);
                        sbR2.append(C4664b4.j.e);
                        a.m("MediaCodecInfo", sbR2.toString());
                        return true;
                    }
                    StringBuilder sbT4 = jc1.t("sizeAndRate.support, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
                    sbT4.append(d);
                    h(sbT4.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbT5 = jc1.t("sizeAndRate.rotated, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
                    sbT5.append(d);
                    StringBuilder sbR3 = pv1.r("AssumedSupport [", sbT5.toString(), "] [", str, ", ");
                    sbR3.append(this.b);
                    sbR3.append("] [");
                    sbR3.append(x.b);
                    sbR3.append(C4664b4.j.e);
                    a.m("MediaCodecInfo", sbR3.toString());
                    return true;
                }
            }
            StringBuilder sbT6 = jc1.t("sizeAndRate.support, ", i, "x", i2, UserDetailsUtils.UserDetailsLiterals.AT);
            sbT6.append(d);
            h(sbT6.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    public static m i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z5 = false;
        } else {
            if (x.a <= 22) {
                String str4 = Build.MODEL;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z5 = false;
                }
            }
            z5 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (x.a < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z6 = false;
        } else {
            String str5 = Build.MANUFACTURER;
            if (str5.equals("Xiaomi") || str5.equals("OPPO")) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        return new m(str, str2, str3, codecCapabilities, z, z2, z3, z5, z7, z6);
    }

    public final g b(n nVar, n nVar2) {
        n nVar3;
        n nVar4;
        String str = nVar.n;
        f fVar = nVar.B;
        String str2 = nVar2.n;
        f fVar2 = nVar2.B;
        int i = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (nVar.x != nVar2.x) {
                i |= 1024;
            }
            if (!this.e && (nVar.u != nVar2.u || nVar.v != nVar2.v)) {
                i |= 512;
            }
            if ((!f.e(fVar) || !f.e(fVar2)) && !Objects.equals(fVar, fVar2)) {
                i |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !nVar.b(nVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new g(this.a, nVar, nVar2, nVar.b(nVar2) ? 3 : 2, 0);
            }
            nVar3 = nVar;
            nVar4 = nVar2;
        } else {
            nVar3 = nVar;
            nVar4 = nVar2;
            if (nVar3.D != nVar4.D) {
                i |= 4096;
            }
            if (nVar3.E != nVar4.E) {
                i |= 8192;
            }
            if (nVar3.F != nVar4.F) {
                i |= 16384;
            }
            String str3 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairD = w.d(nVar3);
                Pair pairD2 = w.d(nVar4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new g(this.a, nVar3, nVar4, 3, 0);
                    }
                }
            }
            if (!nVar3.b(nVar4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i |= 2;
            }
            if (i == 0) {
                return new g(this.a, nVar3, nVar4, 1, 0);
            }
        }
        return new g(this.a, nVar3, nVar4, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c4 A[PHI: r2
  0x00c4: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v13 android.util.Pair) binds: [B:3:0x000f, B:5:0x0017, B:10:0x002b, B:40:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c(n nVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strA;
        int i;
        Pair pairD = w.d(nVar);
        String str = nVar.n;
        int i2 = 4;
        String str2 = this.c;
        if (str != null && str.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String strP = f0.p(str2);
            if (strP.equals(MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (strP.equals("video/hevc")) {
                List list = nVar.q;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i3);
                    int length = bArr.length;
                    int i4 = 3;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        y21 y21VarX = d31.x();
                        int i5 = 0;
                        while (i5 < bArr.length) {
                            int iC = o.c(bArr, i5, bArr.length, zArr);
                            if (iC != bArr.length) {
                                y21VarX.a(Integer.valueOf(iC));
                            }
                            i5 = iC + 3;
                        }
                        y32 y32VarG = y21VarX.g();
                        int i6 = 0;
                        while (i6 < y32VarG.d) {
                            if (((Integer) y32VarG.get(i6)).intValue() + i4 < length) {
                                p pVar = new p(bArr, ((Integer) y32VarG.get(i6)).intValue() + i4, length);
                                l63 l63VarF = o.f(pVar);
                                if (l63VarF.a == 33 && l63VarF.b == 0) {
                                    pVar.t(4);
                                    int i7 = pVar.i(3);
                                    pVar.s();
                                    pair = null;
                                    h hVarG = o.g(pVar, true, i7, null);
                                    strA = c.a(hVarG.a, hVarG.b, hVarG.c, hVarG.d, hVarG.e, hVarG.f);
                                    break loop0;
                                }
                                i = 3;
                            } else {
                                i = i4;
                            }
                            i6++;
                            i4 = i;
                        }
                    }
                    i3++;
                }
                if (strA == null) {
                    pairD = pair;
                } else {
                    String strTrim = strA.trim();
                    int i8 = x.a;
                    pairD = c.b(strA, strTrim.split("\\.", -1), nVar.B);
                }
            }
        }
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str3 = this.b;
        if (zEquals) {
            str3.getClass();
            switch (str3) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (x.a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i2 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i2 = 512;
            } else if (iIntValue3 >= 60000000) {
                i2 = 256;
            } else if (iIntValue3 >= 30000000) {
                i2 = 128;
            } else if (iIntValue3 >= 18000000) {
                i2 = 64;
            } else if (iIntValue3 >= 12000000) {
                i2 = 32;
            } else if (iIntValue3 >= 7200000) {
                i2 = 16;
            } else if (iIntValue3 >= 3600000) {
                i2 = 8;
            } else if (iIntValue3 < 1800000) {
                i2 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i2;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = Build.DEVICE;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + nVar.k + ", " + str2);
        return false;
    }

    public final boolean d(n nVar) {
        return (Objects.equals(nVar.n, "audio/flac") && nVar.F == 22 && x.a < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(n nVar) {
        int i;
        int i2;
        String str = nVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(w.b(nVar))) || !c(nVar, true) || !d(nVar)) {
            return false;
        }
        if (this.i) {
            int i3 = nVar.u;
            if (i3 > 0 && (i2 = nVar.v) > 0) {
                return g(i3, i2, nVar.w);
            }
        } else {
            int i4 = nVar.E;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = nVar.D;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((x.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbS = nj.s("AssumedMaxChannelAdjustment: ", maxInputChannelCount, this.a, ", [", " to ");
                    sbS.append(i);
                    sbS.append(C4664b4.j.e);
                    a.A("MediaCodecInfo", sbS.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(n nVar) {
        if (this.i) {
            return this.e;
        }
        Pair pairD = w.d(nVar);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final void h(String str) {
        StringBuilder sbR = h50.r("NoSupport [", str, "] [");
        sbR.append(this.a);
        sbR.append(", ");
        sbR.append(this.b);
        sbR.append("] [");
        sbR.append(x.b);
        sbR.append(C4664b4.j.e);
        a.m("MediaCodecInfo", sbR.toString());
    }

    public final String toString() {
        return this.a;
    }

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = f0.o(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(x.f(i, widthAlignment) * widthAlignment, x.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }
}
