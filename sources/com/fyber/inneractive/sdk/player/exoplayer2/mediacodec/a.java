package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.jc1;
import defpackage.nj;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str) {
        String strA;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        if (str == null || this.d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.a;
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        int i = 2;
        byte b = -1;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    b = 0;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    b = 1;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    b = 2;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    b = 3;
                }
                break;
        }
        Pair pair = null;
        switch (b) {
            case 0:
            case 1:
                if (strArrSplit.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                        }
                        pair = new Pair(Integer.valueOf(j.c.get(numValueOf.intValue())), Integer.valueOf(j.d.get(numValueOf2.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                }
                break;
            case 2:
            case 3:
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                } else {
                    Matcher matcher = j.a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        str.getClass();
        this.a = str;
        this.d = str2;
        this.e = codecCapabilities;
        boolean z3 = false;
        if (!z && codecCapabilities != null && z.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b = z2;
        if (codecCapabilities != null && z.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z3 = true;
        }
        this.c = z3;
    }

    public final void b(String str) {
        StringBuilder sbR = h50.r("NoSupport [", str, "] [");
        sbR.append(this.a);
        sbR.append(", ");
        sbR.append(this.d);
        sbR.append("] [");
        sbR.append(z.e);
        sbR.append(C4664b4.j.e);
        Log.d("MediaCodecInfo", sbR.toString());
    }

    public final boolean a(int i, int i2, double d) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d != -1.0d && d > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d != -1.0d && d > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (zIsSizeSupported2) {
                StringBuilder sbT = jc1.t("sizeAndRate.rotated, ", i, "x", i2, "x");
                sbT.append(d);
                StringBuilder sbR = h50.r("AssumedSupport [", sbT.toString(), "] [");
                sbR.append(this.a);
                sbR.append(", ");
                sbR.append(this.d);
                sbR.append("] [");
                sbR.append(z.e);
                sbR.append(C4664b4.j.e);
                Log.d("MediaCodecInfo", sbR.toString());
                return true;
            }
        }
        StringBuilder sbT2 = jc1.t("sizeAndRate.support, ", i, "x", i2, "x");
        sbT2.append(d);
        b(sbT2.toString());
        return false;
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = z.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.a;
        String str2 = this.d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else {
                i2 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            StringBuilder sbS = nj.s("AssumedMaxChannelAdjustment: ", maxInputChannelCount, str, ", [", " to ");
            sbS.append(i2);
            sbS.append(C4664b4.j.e);
            Log.w("MediaCodecInfo", sbS.toString());
            maxInputChannelCount = i2;
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }
}
