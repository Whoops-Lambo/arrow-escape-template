package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.m93;
import defpackage.nc2;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzas {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec A[RETURN] */
    public static boolean d(String str, String str2) {
        nc2 nc2VarI;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    return true;
                }
                return false;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    return true;
                }
                return false;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    return true;
                }
                return false;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    return true;
                }
                return false;
            case -1248341703:
                if (str.equals("application/id3")) {
                    return true;
                }
                return false;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    return true;
                }
                return false;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    return true;
                }
                return false;
            case -53558318:
                return (!str.equals("audio/mp4a-latm") || str2 == null || (nc2VarI = i(str2)) == null || (iZza = nc2VarI.zza()) == 0 || iZza == 16) ? false : true;
            case -43764892:
                if (str.equals("application/meta")) {
                    return true;
                }
                return false;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    return true;
                }
                return false;
            case 187094639:
                if (str.equals("audio/raw")) {
                    return true;
                }
                return false;
            case 469933706:
                if (str.equals(MimeTypes.APPLICATION_MEDIA3_CUES)) {
                    return true;
                }
                return false;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    return true;
                }
                return false;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    return true;
                }
                return false;
            case 1331836563:
                if (str.equals(MimeTypes.VIDEO_APV)) {
                    return true;
                }
                return false;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    return true;
                }
                return false;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    return true;
                }
                return false;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    return true;
                }
                return false;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    return true;
                }
                return false;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    return true;
                }
                return false;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static boolean a(String str) {
        return "audio".equals(j(str));
    }

    public static boolean b(String str) {
        return "video".equals(j(str));
    }

    public static boolean c(String str) {
        return "image".equals(j(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        String strA = zzgvh.a(str);
        switch (strA.hashCode()) {
            case -1833600100:
                return strA.equals("video/x-mvhevc") ? MimeTypes.VIDEO_MV_HEVC : strA;
            case -1007807498:
                return strA.equals("audio/x-flac") ? "audio/flac" : strA;
            case -979095690:
                return strA.equals("application/x-mpegurl") ? "application/x-mpegURL" : strA;
            case -586683234:
                return strA.equals("audio/x-wav") ? "audio/wav" : strA;
            case -432836268:
                return strA.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strA;
            case -432836267:
                return strA.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strA;
            case 187090231:
                return strA.equals("audio/mp3") ? "audio/mpeg" : strA;
            default:
                return strA;
        }
    }

    public static nc2 i(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            Integer.parseInt(strGroup, 16);
            return new nc2(strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 3);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int f(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (a(str)) {
                return 1;
            }
            if (!b(str)) {
                if (!"text".equals(j(str)) && !MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                    if (c(str)) {
                        return 4;
                    }
                    if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str) && !"application/meta".equals(str) && !"application/x-itut-t35".equals(str)) {
                        if (!"application/x-camera-motion".equals(str)) {
                            ArrayList arrayList = a;
                            if (arrayList.size() <= 0) {
                                return -1;
                            }
                            arrayList.get(0).getClass();
                            m93.b();
                            return 0;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[RETURN] */
    public static int g(String str, String str2) {
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (!str.equals("audio/mp4a-latm") || str2 == null || (r3 = i(str2)) == null) {
                    return 0;
                }
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }
}
