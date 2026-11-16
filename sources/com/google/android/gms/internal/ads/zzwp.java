package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import androidx.media3.common.MimeTypes;
import defpackage.ar4;
import defpackage.db5;
import defpackage.eb5;
import defpackage.h8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"InlinedApi"})
public final class zzwp {
    public static final HashMap a = new HashMap();

    /* JADX WARN: Code duplicated, block: B:102:0x018a A[Catch: all -> 0x0059, Exception -> 0x0152, TRY_LEAVE, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[EDGE_INSN: B:44:0x00a7->B:68:0x00ff BREAK  A[LOOP:1: B:29:0x0071->B:33:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x013d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d A[Catch: all -> 0x0059, Exception -> 0x0152, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0154 A[Catch: all -> 0x0059, Exception -> 0x0152, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167 A[Catch: all -> 0x0059, Exception -> 0x0152, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x016b A[Catch: all -> 0x0059, Exception -> 0x0152, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017b A[Catch: all -> 0x0059, Exception -> 0x0152, TryCatch #1 {all -> 0x0059, blocks: (B:4:0x0009, B:8:0x001a, B:15:0x002f, B:17:0x0041, B:19:0x0049, B:26:0x005f, B:28:0x0069, B:30:0x0073, B:69:0x0101, B:76:0x0125, B:84:0x0145, B:86:0x014d, B:93:0x015e, B:95:0x0167, B:102:0x018a, B:96:0x016b, B:98:0x017b, B:100:0x0183, B:89:0x0154, B:104:0x0192, B:105:0x01c0, B:33:0x007f, B:34:0x0082, B:36:0x008a, B:39:0x0096, B:41:0x009e, B:46:0x00ac, B:48:0x00b4, B:50:0x00bc, B:53:0x00c7, B:55:0x00cf, B:58:0x00da, B:60:0x00e2, B:63:0x00ed, B:65:0x00f5, B:110:0x01d3, B:111:0x01d6, B:113:0x01de, B:115:0x01e4, B:117:0x01ee, B:119:0x01f6, B:121:0x0207, B:122:0x0216, B:123:0x0221, B:125:0x0227, B:127:0x022e, B:129:0x023f, B:130:0x0248, B:133:0x0251, B:134:0x0257), top: B:139:0x0009, inners: #0 }] */
    public static synchronized List a(String str, boolean z, boolean z2) {
        String str2;
        MediaCodecInfo[] mediaCodecInfoArr;
        boolean zIsFeatureSupported;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean zIsHardwareAccelerated;
        String strA;
        try {
            db5 db5Var = new db5(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(db5Var);
            if (list != null) {
                return list;
            }
            int i4 = (z || z2 || str.equals(MimeTypes.VIDEO_MV_HEVC)) ? 1 : 0;
            try {
                ArrayList arrayList = new ArrayList();
                MediaCodecInfo[] codecInfos = new MediaCodecList(i4).getCodecInfos();
                int length = codecInfos.length;
                int i5 = 0;
                while (i5 < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i5];
                    if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias()) {
                        String name = mediaCodecInfo.getName();
                        if (mediaCodecInfo.isEncoder()) {
                            mediaCodecInfoArr = codecInfos;
                            i = length;
                            i3 = i5;
                        } else {
                            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            int length2 = supportedTypes.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    if (!str.equals("video/dolby-vision")) {
                                        if (!str.equals(MimeTypes.VIDEO_MV_HEVC)) {
                                            if (!str.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                                if (!str.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                    if (!str.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                        str2 = null;
                                                        break;
                                                    }
                                                    str2 = "audio/lg-ac3";
                                                    break;
                                                }
                                                str2 = "audio/x-lg-flac";
                                                break;
                                            }
                                            str2 = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                            str2 = null;
                                            break;
                                        }
                                        str2 = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str2 = null;
                                            break;
                                        }
                                        str2 = "video/dv_hevc";
                                        break;
                                    }
                                    str2 = "video/hevcdv";
                                    break;
                                }
                                int i7 = i6;
                                str2 = supportedTypes[i7];
                                if (str2.equalsIgnoreCase(str)) {
                                    break;
                                }
                                i6 = i7 + 1;
                            }
                            if (str2 != null) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                                    boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                    mediaCodecInfoArr = codecInfos;
                                    boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                    if (db5Var.c) {
                                        if (zIsFeatureSupported2) {
                                            zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                            boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                            z3 = db5Var.b;
                                            if (z3) {
                                                if (!z3) {
                                                    z4 = zIsFeatureSupported;
                                                } else if (zIsFeatureSupported) {
                                                    z4 = true;
                                                }
                                                i = length;
                                                i2 = Build.VERSION.SDK_INT;
                                                i3 = i5;
                                                if (i2 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                } else if (e(mediaCodecInfo, str)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                e(mediaCodecInfo, str);
                                                if (i2 >= 29) {
                                                    mediaCodecInfo.isVendor();
                                                } else {
                                                    strA = zzgvh.a(mediaCodecInfo.getName());
                                                    if (!strA.startsWith("omx.google.")) {
                                                        strA.startsWith("c2.google.");
                                                    }
                                                }
                                                if (z3 == z4) {
                                                    arrayList.add(zzvy.a(name, str, str2, capabilitiesForType, zIsHardwareAccelerated));
                                                }
                                            } else {
                                                if (!z3) {
                                                    z4 = zIsFeatureSupported;
                                                } else if (zIsFeatureSupported) {
                                                    z4 = true;
                                                }
                                                i = length;
                                                i2 = Build.VERSION.SDK_INT;
                                                i3 = i5;
                                                if (i2 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                                } else if (e(mediaCodecInfo, str)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                e(mediaCodecInfo, str);
                                                if (i2 >= 29) {
                                                    mediaCodecInfo.isVendor();
                                                } else {
                                                    strA = zzgvh.a(mediaCodecInfo.getName());
                                                    if (!strA.startsWith("omx.google.")) {
                                                        strA.startsWith("c2.google.");
                                                    }
                                                }
                                                if (z3 == z4) {
                                                    arrayList.add(zzvy.a(name, str, str2, capabilitiesForType, zIsHardwareAccelerated));
                                                }
                                            }
                                        }
                                    } else if (!zIsFeatureRequired) {
                                        zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                        boolean zIsFeatureRequired3 = capabilitiesForType.isFeatureRequired("secure-playback");
                                        z3 = db5Var.b;
                                        if (z3 || !zIsFeatureRequired3) {
                                            if (!z3) {
                                                z4 = zIsFeatureSupported;
                                            } else if (zIsFeatureSupported) {
                                                z4 = true;
                                            }
                                            i = length;
                                            i2 = Build.VERSION.SDK_INT;
                                            i3 = i5;
                                            if (i2 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                            } else if (e(mediaCodecInfo, str)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            e(mediaCodecInfo, str);
                                            if (i2 >= 29) {
                                                mediaCodecInfo.isVendor();
                                            } else {
                                                strA = zzgvh.a(mediaCodecInfo.getName());
                                                if (!strA.startsWith("omx.google.") && !strA.startsWith("c2.android.")) {
                                                    strA.startsWith("c2.google.");
                                                }
                                            }
                                            if (z3 == z4) {
                                                arrayList.add(zzvy.a(name, str, str2, capabilitiesForType, zIsHardwareAccelerated));
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 24 + str2.length() + 1);
                                    sb.append("Failed to query codec ");
                                    sb.append(name);
                                    sb.append(" (");
                                    sb.append(str2);
                                    sb.append(")");
                                    zzeh.e("MediaCodecUtil", sb.toString());
                                    throw e;
                                }
                            } else {
                                mediaCodecInfoArr = codecInfos;
                            }
                            i = length;
                            i3 = i5;
                        }
                    } else {
                        mediaCodecInfoArr = codecInfos;
                        i = length;
                        i3 = i5;
                    }
                    i5 = i3 + 1;
                    codecInfos = mediaCodecInfoArr;
                    length = i;
                }
                if (z) {
                    arrayList.isEmpty();
                }
                if ("audio/raw".equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((zzvy) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        arrayList.add(zzvy.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
                    }
                    Collections.sort(arrayList, new h8(eb5.a, 2));
                }
                if (Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzvy) arrayList.get(0)).a)) {
                    arrayList.add((zzvy) arrayList.remove(0));
                }
                zzgzb zzgzbVarB = zzgzb.B(arrayList);
                map.put(db5Var, zzgzbVarB);
                return zzgzbVarB;
            } catch (Exception e2) {
                throw new zzwj(e2, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static w b(zzwh zzwhVar, zzv zzvVar, boolean z, boolean z2) {
        List listA;
        List listA2 = zzwhVar.a(zzvVar.o, z, z2);
        String strD = d(zzvVar);
        if (strD == null) {
            ar4 ar4Var = zzgzb.b;
            listA = w.e;
        } else {
            listA = zzwhVar.a(strD, z, z2);
        }
        ar4 ar4Var2 = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        zzgyyVar.d(listA2);
        zzgyyVar.d(listA);
        return zzgyyVar.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String d(zzv zzvVar) {
        zzdq zzdqVarD;
        boolean z;
        String str = zzvVar.o;
        if ("audio/eac3-joc".equals(str)) {
            if (Objects.equals(Build.MANUFACTURER, "Google")) {
                return null;
            }
            return "audio/eac3";
        }
        if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
            return "audio/vnd.dts";
        }
        if ("video/dolby-vision".equals(str) && (zzdqVarD = zzdr.d(zzvVar)) != null && (z = zzdqVarD.c)) {
            zzgvz.f(z);
            int i = zzdqVarD.a;
            if (i == 16 || i == 256) {
                return "video/hevc";
            }
            if (i == 512) {
                return "video/avc";
            }
            if (i == 1024) {
                zzi zziVar = zzvVar.F;
                if (zziVar != null && zziVar.c == 6 && zziVar.b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if (MimeTypes.VIDEO_MV_HEVC.equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.a(str)) {
            return true;
        }
        String strA = zzgvh.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }
}
