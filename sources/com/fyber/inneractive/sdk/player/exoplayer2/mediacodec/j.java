package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import com.singular.sdk.internal.Constants;
import defpackage.jc1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j {
    public static final Pattern a;
    public static final HashMap b;
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final HashMap e;
    public static int f;

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        e = map;
        jc1.u(1, map, "L30", 4, "L60");
        jc1.u(16, map, "L63", 64, "L90");
        jc1.u(256, map, "L93", 1024, "L120");
        jc1.u(4096, map, "L123", 16384, "L150");
        jc1.u(65536, map, "L153", Constants.REFERRER_LINK_MAX_RESPONSE_CHARS, "L156");
        jc1.u(1048576, map, "L180", 4194304, "L183");
        jc1.u(16777216, map, "L186", 2, "H30");
        jc1.u(8, map, "H60", 32, "H63");
        jc1.u(128, map, "H90", 512, "H93");
        jc1.u(2048, map, "H120", 8192, "H123");
        jc1.u(32768, map, "H150", 131072, "H153");
        jc1.u(524288, map, "H156", 2097152, "H180");
        jc1.u(8388608, map, "H183", 33554432, "H186");
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = z.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(z.c)) {
            String str4 = z.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && z.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return true;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f == -1) {
            int iMax = 0;
            a aVarA = a(false, "video/avc");
            if (aVarA != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aVarA.e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, z.a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f = iMax;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    public static ArrayList a(e eVar, g gVar) throws f {
        boolean z;
        g gVar2 = gVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = eVar.a;
            int iA = gVar2.a();
            boolean zB = gVar2.b();
            int i = 0;
            loop0: while (i < iA) {
                MediaCodecInfo mediaCodecInfoA = gVar2.a(i);
                String name = mediaCodecInfoA.getName();
                if (a(mediaCodecInfoA, name, zB)) {
                    String[] supportedTypes = mediaCodecInfoA.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(str2);
                                boolean zA = gVar2.a(str, capabilitiesForType);
                                if (z.a <= 22) {
                                    String str3 = z.d;
                                    if (!str3.equals("ODROID-XU3") && !str3.equals("Nexus 10")) {
                                        z = false;
                                    } else if ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if ((zB && eVar.b == zA) || (!zB && !eVar.b)) {
                                    arrayList.add(new a(name, str, capabilitiesForType, z));
                                } else if (!zB && zA) {
                                    arrayList.add(new a(name + ".secure", str, capabilitiesForType, z));
                                    break loop0;
                                }
                            } catch (Exception e2) {
                                if (z.a <= 23 && !arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                } else {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e2;
                                }
                            }
                        }
                        i2++;
                        gVar2 = gVar;
                    }
                }
                i++;
                gVar2 = gVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new f(e3);
        }
    }

    public static a a(boolean z, String str) {
        List listUnmodifiableList;
        synchronized (j.class) {
            try {
                e eVar = new e(z, str);
                listUnmodifiableList = (List) b.get(eVar);
                if (listUnmodifiableList == null) {
                    int i = z.a;
                    ArrayList arrayListA = a(eVar, i >= 21 ? new i(z) : new h());
                    if (z && arrayListA.isEmpty() && 21 <= i && i <= 23) {
                        arrayListA = a(eVar, new h());
                        if (!arrayListA.isEmpty()) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((a) arrayListA.get(0)).a);
                        }
                    }
                    if (i < 26) {
                        if (arrayListA.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) arrayListA.get(0)).a)) {
                            for (int i2 = 1; i2 < arrayListA.size(); i2++) {
                                a aVar = (a) arrayListA.get(i2);
                                if ("OMX.google.raw.decoder".equals(aVar.a)) {
                                    arrayListA.remove(i2);
                                    arrayListA.add(0, aVar);
                                    break;
                                }
                            }
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayListA);
                    b.put(eVar, listUnmodifiableList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (a) listUnmodifiableList.get(0);
    }
}
