package androidx.webkit.internal;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.n;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class AssetHelper {
    public final Context a;

    public static String a(String str) {
        String str2 = null;
        if (str != null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                byte b = 46;
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            b = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                            break;
                        case 3401:
                            b = !lowerCase.equals("js") ? (byte) -1 : (byte) 1;
                            break;
                        case 97669:
                            b = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                            break;
                        case 98819:
                            b = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                            break;
                        case 102340:
                            b = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                            break;
                        case 103649:
                            b = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                            break;
                        case 104085:
                            b = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                            break;
                        case 105441:
                            b = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                            break;
                        case 106458:
                            b = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                            break;
                        case 106479:
                            b = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                            break;
                        case 108089:
                            b = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                            break;
                        case 108150:
                            b = !lowerCase.equals("mjs") ? (byte) -1 : (byte) 11;
                            break;
                        case 108272:
                            b = !lowerCase.equals("mp3") ? (byte) -1 : (byte) 12;
                            break;
                        case 108273:
                            b = !lowerCase.equals(n.d) ? (byte) -1 : (byte) 13;
                            break;
                        case 108324:
                            b = !lowerCase.equals("mpg") ? (byte) -1 : (byte) 14;
                            break;
                        case 109961:
                            b = !lowerCase.equals("oga") ? (byte) -1 : (byte) 15;
                            break;
                        case 109967:
                            b = !lowerCase.equals("ogg") ? (byte) -1 : (byte) 16;
                            break;
                        case 109973:
                            b = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                            break;
                        case 109982:
                            b = !lowerCase.equals("ogv") ? (byte) -1 : (byte) 18;
                            break;
                        case 110834:
                            b = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                            break;
                        case 111030:
                            b = !lowerCase.equals("pjp") ? (byte) -1 : (byte) 20;
                            break;
                        case 111145:
                            b = !lowerCase.equals("png") ? (byte) -1 : (byte) 21;
                            break;
                        case 114276:
                            b = !lowerCase.equals("svg") ? (byte) -1 : (byte) 22;
                            break;
                        case 114791:
                            b = !lowerCase.equals("tgz") ? (byte) -1 : (byte) 23;
                            break;
                        case 114833:
                            b = !lowerCase.equals("tif") ? (byte) -1 : (byte) 24;
                            break;
                        case 117484:
                            b = !lowerCase.equals("wav") ? (byte) -1 : (byte) 25;
                            break;
                        case 118660:
                            b = !lowerCase.equals("xht") ? (byte) -1 : (byte) 26;
                            break;
                        case 118807:
                            b = !lowerCase.equals("xml") ? (byte) -1 : (byte) 27;
                            break;
                        case 120609:
                            b = !lowerCase.equals("zip") ? (byte) -1 : (byte) 28;
                            break;
                        case 3000872:
                            b = !lowerCase.equals("apng") ? (byte) -1 : (byte) 29;
                            break;
                        case 3145576:
                            b = !lowerCase.equals("flac") ? (byte) -1 : (byte) 30;
                            break;
                        case 3213227:
                            b = !lowerCase.equals(CreativeInfo.al) ? (byte) -1 : (byte) 31;
                            break;
                        case 3259225:
                            b = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                            break;
                        case 3268712:
                            b = !lowerCase.equals("jpeg") ? (byte) -1 : (byte) 33;
                            break;
                        case 3271912:
                            b = !lowerCase.equals("json") ? (byte) -1 : (byte) 34;
                            break;
                        case 3358085:
                            b = !lowerCase.equals("mpeg") ? (byte) -1 : (byte) 35;
                            break;
                        case 3418175:
                            b = !lowerCase.equals("opus") ? (byte) -1 : (byte) 36;
                            break;
                        case 3529614:
                            b = !lowerCase.equals("shtm") ? (byte) -1 : (byte) 37;
                            break;
                        case 3542678:
                            b = !lowerCase.equals("svgz") ? (byte) -1 : (byte) 38;
                            break;
                        case 3559925:
                            b = !lowerCase.equals("tiff") ? (byte) -1 : (byte) 39;
                            break;
                        case 3642020:
                            b = !lowerCase.equals("wasm") ? (byte) -1 : (byte) 40;
                            break;
                        case 3645337:
                            b = !lowerCase.equals("webm") ? (byte) -1 : (byte) 41;
                            break;
                        case 3645340:
                            b = !lowerCase.equals("webp") ? (byte) -1 : (byte) 42;
                            break;
                        case 3655064:
                            b = !lowerCase.equals("woff") ? (byte) -1 : (byte) 43;
                            break;
                        case 3678569:
                            b = !lowerCase.equals("xhtm") ? (byte) -1 : (byte) 44;
                            break;
                        case 96488848:
                            b = !lowerCase.equals("ehtml") ? (byte) -1 : (byte) 45;
                            break;
                        case 103877016:
                            if (!lowerCase.equals("mhtml")) {
                                b = -1;
                            }
                            break;
                        case 106703064:
                            b = !lowerCase.equals("pjpeg") ? (byte) -1 : (byte) 47;
                            break;
                        case 109418142:
                            b = !lowerCase.equals("shtml") ? (byte) -1 : (byte) 48;
                            break;
                        case 114035747:
                            b = !lowerCase.equals("xhtml") ? (byte) -1 : (byte) 49;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = MimeTypes.IMAGE_BMP;
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case 37:
                        case 45:
                        case 48:
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case 32:
                        case 33:
                        case 47:
                            str2 = "image/jpeg";
                            break;
                        case 8:
                            str2 = "audio/x-m4a";
                            break;
                        case 9:
                        case 13:
                            str2 = "video/mp4";
                            break;
                        case 10:
                        case 46:
                            str2 = "multipart/related";
                            break;
                        case 12:
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case 35:
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case 36:
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            str2 = "video/ogg";
                            break;
                        case 19:
                            str2 = "application/pdf";
                            break;
                        case 21:
                            str2 = MimeTypes.IMAGE_PNG;
                            break;
                        case 22:
                        case 38:
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case 39:
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case 44:
                        case 49:
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case 30:
                            str2 = "audio/flac";
                            break;
                        case 34:
                            str2 = G5.M;
                            break;
                        case 40:
                            str2 = "application/wasm";
                            break;
                        case 41:
                            str2 = "video/webm";
                            break;
                        case 42:
                            str2 = MimeTypes.IMAGE_WEBP;
                            break;
                        case 43:
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = strGuessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }

    public AssetHelper(Context context) {
        this.a = context;
    }
}
