package io.p071bidmachine.media3.common;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import defpackage.m93;
import defpackage.ns1;
import io.p071bidmachine.media3.common.util.x;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f0 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        e0 e0VarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (e0VarG = g(str2)) == null || (iA = e0VarG.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x.W(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrW = x.W(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrW) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String e(String str) {
        e0 e0VarG;
        String strF = null;
        if (str != null) {
            String strB = ns1.B(str.trim());
            if (strB.startsWith("avc1") || strB.startsWith("avc3")) {
                return "video/avc";
            }
            if (strB.startsWith("hev1") || strB.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strB.startsWith("dvav") || strB.startsWith("dva1") || strB.startsWith("dvhe") || strB.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strB.startsWith("av01")) {
                return "video/av01";
            }
            if (strB.startsWith("vp9") || strB.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strB.startsWith("vp8") || strB.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strB.startsWith("mp4a")) {
                if (strB.startsWith("mp4a.") && (e0VarG = g(strB)) != null) {
                    strF = f(e0VarG.a);
                }
                return strF == null ? "audio/mp4a-latm" : strF;
            }
            if (strB.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strB.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strB.startsWith("ac-3") || strB.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strB.startsWith("ec-3") || strB.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strB.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strB.startsWith("ac-4") || strB.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strB.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strB.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strB.startsWith("dtsh") || strB.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strB.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strB.startsWith("opus")) {
                return "audio/opus";
            }
            if (strB.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strB.startsWith("flac")) {
                return "audio/flac";
            }
            if (strB.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strB.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strB.contains("cea708")) {
                return "application/cea-708";
            }
            if (strB.contains("eia608") || strB.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                m93.b();
                return null;
            }
        }
        return null;
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x.W(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static String f(int i) {
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

    public static e0 g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new e0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String strB = ns1.B(str);
        strB.getClass();
        switch (strB) {
            case "video/x-mvhevc":
                return MimeTypes.VIDEO_MV_HEVC;
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strB;
        }
    }

    public static int d(String str, String str2) {
        e0 e0VarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (e0VarG = g(str2)) == null) {
                    return 0;
                }
                return e0VarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
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

    public static int i(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (k(str)) {
                return 1;
            }
            if (o(str)) {
                return 2;
            }
            if (n(str)) {
                return 3;
            }
            if (m(str)) {
                return 4;
            }
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = a;
                if (arrayList.size() <= 0) {
                    return -1;
                }
                arrayList.get(0).getClass();
                m93.b();
                return 0;
            }
            return 5;
        }
        return -1;
    }
}
