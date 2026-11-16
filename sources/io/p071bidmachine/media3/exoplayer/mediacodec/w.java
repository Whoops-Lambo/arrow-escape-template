package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.MimeTypes;
import com.facebook.appevents.t;
import com.singular.sdk.internal.Constants;
import defpackage.d31;
import defpackage.ns1;
import defpackage.y21;
import defpackage.y32;
import io.p071bidmachine.media3.common.f;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.media3.common.util.c;
import io.p071bidmachine.media3.common.util.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (x.a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new q(new i()));
        }
        if (x.a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(n nVar) {
        Pair pairD;
        String str = nVar.n;
        String str2 = nVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairD = d(nVar)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if (MimeTypes.VIDEO_MV_HEVC.equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0199  */
    /* JADX WARN: Code duplicated, block: B:101:0x019d  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01af  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0202  */
    /* JADX WARN: Code duplicated, block: B:144:0x0207  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c  */
    /* JADX WARN: Code duplicated, block: B:146:0x020f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x021b  */
    /* JADX WARN: Code duplicated, block: B:151:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0220  */
    /* JADX WARN: Code duplicated, block: B:153:0x0223  */
    /* JADX WARN: Code duplicated, block: B:154:0x0226  */
    /* JADX WARN: Code duplicated, block: B:156:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0230  */
    /* JADX WARN: Code duplicated, block: B:162:0x0248  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    public static Pair d(n nVar) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num;
        byte b2;
        Integer num2;
        String str;
        byte[] bArr = c.a;
        Integer num3 = 1;
        String str2 = nVar.k;
        f fVar = nVar.B;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        int i10 = 16;
        if (!"video/dolby-vision".equals(nVar.n)) {
            String str3 = strArrSplit[0];
            str3.getClass();
            switch (str3) {
                case "av01":
                    b = 0;
                    break;
                case "avc1":
                    b = 1;
                    break;
                case "avc2":
                    b = 2;
                    break;
                case "hev1":
                    b = 3;
                    break;
                case "hvc1":
                    b = 4;
                    break;
                case "mp4a":
                    b = 5;
                    break;
                case "s263":
                    b = 6;
                    break;
                case "vp09":
                    b = 7;
                    break;
                default:
                    b = -1;
                    break;
            }
            int i11 = 16384;
            switch (b) {
                case 0:
                    if (strArrSplit.length < 4) {
                        b.e("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i14 = Integer.parseInt(strArrSplit[3]);
                        if (i12 != 0) {
                            b.c(i12, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i14 != 8 && i14 != 10) {
                            b.c(i14, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        int i15 = i14 == 8 ? 1 : (fVar == null || !(fVar.d != null || (i = fVar.c) == 7 || i == 6)) ? 2 : 4096;
                        switch (i13) {
                            case 0:
                                i11 = 1;
                                i2 = -1;
                                break;
                            case 1:
                                i11 = 2;
                                i2 = -1;
                                break;
                            case 2:
                                i11 = 4;
                                i2 = -1;
                                break;
                            case 3:
                                i11 = 8;
                                i2 = -1;
                                break;
                            case 4:
                                i11 = 16;
                                i2 = -1;
                                break;
                            case 5:
                                i11 = 32;
                                i2 = -1;
                                break;
                            case 6:
                                i11 = 64;
                                i2 = -1;
                                break;
                            case 7:
                                i11 = 128;
                                i2 = -1;
                                break;
                            case 8:
                                i11 = 256;
                                i2 = -1;
                                break;
                            case 9:
                                i11 = 512;
                                i2 = -1;
                                break;
                            case 10:
                                i11 = 1024;
                                i2 = -1;
                                break;
                            case 11:
                                i11 = 2048;
                                i2 = -1;
                                break;
                            case 12:
                                i11 = 4096;
                                i2 = -1;
                                break;
                            case 13:
                                i11 = 8192;
                                i2 = -1;
                                break;
                            case 14:
                                i2 = -1;
                                break;
                            case 15:
                                i11 = 32768;
                                i2 = -1;
                                break;
                            case 16:
                                i11 = 65536;
                                i2 = -1;
                                break;
                            case 17:
                                i11 = 131072;
                                i2 = -1;
                                break;
                            case 18:
                                i11 = Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
                                i2 = -1;
                                break;
                            case 19:
                                i11 = 524288;
                                i2 = -1;
                                break;
                            case 20:
                                i11 = 1048576;
                                i2 = -1;
                                break;
                            case 21:
                                i11 = 2097152;
                                i2 = -1;
                                break;
                            case 22:
                                i11 = 4194304;
                                i2 = -1;
                                break;
                            case 23:
                                i11 = 8388608;
                                i2 = -1;
                                break;
                            default:
                                i2 = -1;
                                i11 = -1;
                                break;
                        }
                        if (i11 != i2) {
                            return new Pair(Integer.valueOf(i15), Integer.valueOf(i11));
                        }
                        b.c(i13, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused) {
                        b.e("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 1:
                case 2:
                    if (strArrSplit.length < 2) {
                        b.e("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            if (strArrSplit.length < 3) {
                                a.A("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            i3 = Integer.parseInt(strArrSplit[1]);
                            i4 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i3 == 66) {
                            i5 = 1;
                        } else if (i3 == 77) {
                            i5 = 2;
                        } else if (i3 == 88) {
                            i5 = 4;
                        } else if (i3 == 100) {
                            i5 = 8;
                        } else if (i3 == 110) {
                            i5 = 16;
                        } else if (i3 != 122) {
                            i5 = i3 != 244 ? -1 : 64;
                        } else {
                            i5 = 32;
                        }
                        if (i5 == -1) {
                            b.c(i3, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        switch (i4) {
                            case 10:
                                i6 = -1;
                                i11 = 1;
                                break;
                            case 11:
                                i6 = -1;
                                i11 = 4;
                                break;
                            case 12:
                                i6 = -1;
                                i11 = 8;
                                break;
                            case 13:
                                i11 = 16;
                                i6 = -1;
                                break;
                            default:
                                switch (i4) {
                                    case 20:
                                        i11 = 32;
                                        i6 = -1;
                                        break;
                                    case 21:
                                        i11 = 64;
                                        i6 = -1;
                                        break;
                                    case 22:
                                        i11 = 128;
                                        i6 = -1;
                                        break;
                                    default:
                                        switch (i4) {
                                            case 30:
                                                i11 = 256;
                                                i6 = -1;
                                                break;
                                            case 31:
                                                i11 = 512;
                                                i6 = -1;
                                                break;
                                            case 32:
                                                i11 = 1024;
                                                i6 = -1;
                                                break;
                                            default:
                                                switch (i4) {
                                                    case 40:
                                                        i11 = 2048;
                                                        i6 = -1;
                                                        break;
                                                    case 41:
                                                        i11 = 4096;
                                                        i6 = -1;
                                                        break;
                                                    case 42:
                                                        i11 = 8192;
                                                        i6 = -1;
                                                        break;
                                                    default:
                                                        switch (i4) {
                                                            case 50:
                                                                i6 = -1;
                                                                break;
                                                            case 51:
                                                                i11 = 32768;
                                                                i6 = -1;
                                                                break;
                                                            case 52:
                                                                i11 = 65536;
                                                                i6 = -1;
                                                                break;
                                                            default:
                                                                i6 = -1;
                                                                i11 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i11 != i6) {
                            return new Pair(Integer.valueOf(i5), Integer.valueOf(i11));
                        }
                        b.c(i4, "Unknown AVC level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused2) {
                        b.e("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 3:
                case 4:
                    return c.b(str2, strArrSplit, fVar);
                case 5:
                    if (strArrSplit.length != 3) {
                        b.e("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(f0.f(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i16 = Integer.parseInt(strArrSplit[2]);
                            int i17 = 17;
                            if (i16 == 17) {
                                i7 = -1;
                            } else {
                                if (i16 != 20) {
                                    i17 = 23;
                                    if (i16 != 23) {
                                        i17 = 29;
                                        if (i16 != 29) {
                                            i17 = 39;
                                            if (i16 != 39) {
                                                i17 = 42;
                                                if (i16 != 42) {
                                                    switch (i16) {
                                                        case 1:
                                                            i7 = -1;
                                                            i17 = 1;
                                                            break;
                                                        case 2:
                                                            i7 = -1;
                                                            i17 = 2;
                                                            break;
                                                        case 3:
                                                            i7 = -1;
                                                            i17 = 3;
                                                            break;
                                                        case 4:
                                                            i7 = -1;
                                                            i17 = 4;
                                                            break;
                                                        case 5:
                                                            i7 = -1;
                                                            i17 = 5;
                                                            break;
                                                        case 6:
                                                            i7 = -1;
                                                            i17 = 6;
                                                            break;
                                                        default:
                                                            i7 = -1;
                                                            i17 = -1;
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i17 = 20;
                                }
                                i7 = -1;
                            }
                            if (i17 != i7) {
                                return new Pair(Integer.valueOf(i17), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        b.e("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                case 6:
                    Pair pair = new Pair(num3, num3);
                    if (strArrSplit.length < 3) {
                        b.e("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                    } catch (NumberFormatException unused4) {
                        b.e("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        return pair;
                    }
                case 7:
                    if (strArrSplit.length < 3) {
                        b.e("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        int i19 = Integer.parseInt(strArrSplit[2]);
                        if (i18 == 0) {
                            i8 = 1;
                        } else if (i18 == 1) {
                            i8 = 2;
                        } else if (i18 != 2) {
                            i8 = i18 != 3 ? -1 : 8;
                        } else {
                            i8 = 4;
                        }
                        if (i8 == -1) {
                            b.c(i18, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        if (i19 == 10) {
                            i9 = -1;
                            i10 = 1;
                        } else if (i19 == 11) {
                            i9 = -1;
                            i10 = 2;
                        } else if (i19 == 20) {
                            i9 = -1;
                            i10 = 4;
                        } else if (i19 == 21) {
                            i9 = -1;
                            i10 = 8;
                        } else if (i19 == 30) {
                            i9 = -1;
                        } else {
                            if (i19 == 31) {
                                i10 = 32;
                            } else if (i19 == 40) {
                                i10 = 64;
                            } else if (i19 == 41) {
                                i10 = 128;
                            } else if (i19 == 50) {
                                i10 = 256;
                            } else if (i19 != 51) {
                                switch (i19) {
                                    case 60:
                                        i10 = 2048;
                                        break;
                                    case 61:
                                        i10 = 4096;
                                        break;
                                    case 62:
                                        i10 = 8192;
                                        break;
                                    default:
                                        i9 = -1;
                                        i10 = -1;
                                        break;
                                }
                            } else {
                                i10 = 512;
                            }
                            i9 = -1;
                        }
                        if (i10 != i9) {
                            return new Pair(Integer.valueOf(i8), Integer.valueOf(i10));
                        }
                        b.c(i19, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return null;
                    } catch (NumberFormatException unused5) {
                        b.e("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    }
                    break;
                default:
                    return null;
            }
            return null;
        }
        if (strArrSplit.length < 3) {
            b.e("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.c.matcher(strArrSplit[1]);
        if (!matcher.matches()) {
            b.e("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            switch (strGroup.hashCode()) {
                case 1536:
                    num = 8;
                    b2 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                    break;
                case 1537:
                    if (!strGroup.equals("01")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 1;
                    }
                    break;
                case 1538:
                    if (!strGroup.equals("02")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 2;
                    }
                    break;
                case 1539:
                    if (!strGroup.equals("03")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 3;
                    }
                    break;
                case 1540:
                    if (!strGroup.equals("04")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 4;
                    }
                    break;
                case 1541:
                    if (!strGroup.equals("05")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 5;
                    }
                    break;
                case 1542:
                    if (!strGroup.equals("06")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 6;
                    }
                    break;
                case 1543:
                    if (!strGroup.equals("07")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 7;
                    }
                    break;
                case 1544:
                    if (!strGroup.equals("08")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 8;
                    }
                    break;
                case 1545:
                    if (!strGroup.equals("09")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 9;
                    }
                    break;
                case 1567:
                    if (!strGroup.equals("10")) {
                        num = 8;
                    } else {
                        num = 8;
                        b2 = 10;
                    }
                    break;
                default:
                    num = 8;
                    break;
            }
            switch (b2) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case 8:
                    num2 = 256;
                    break;
                case 9:
                    num2 = 512;
                    break;
                case 10:
                    num2 = 1024;
                    break;
            }
            if (num2 == null) {
                b.e("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str) {
                    case "01":
                        break;
                    case "02":
                        num3 = 2;
                        break;
                    case "03":
                        num3 = 4;
                        break;
                    case "04":
                        num3 = num;
                        break;
                    case "05":
                        num3 = 16;
                        break;
                    case "06":
                        num3 = 32;
                        break;
                    case "07":
                        num3 = 64;
                        break;
                    case "08":
                        num3 = 128;
                        break;
                    case "09":
                        num3 = 256;
                        break;
                    case "10":
                        num3 = 512;
                        break;
                    case "11":
                        num3 = 1024;
                        break;
                    case "12":
                        num3 = 2048;
                        break;
                    case "13":
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 == null) {
                return new Pair(num2, num3);
            }
            b.e("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        num = 8;
        num2 = null;
        if (num2 == null) {
            b.e("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
            return null;
        }
        str = strArrSplit[2];
        if (str == null) {
            switch (str) {
                case 1537:
                    if (str.equals("01")) {
                    }
                    break;
                case 1538:
                    if (str.equals("02")) {
                    }
                    break;
                case 1539:
                    if (str.equals("03")) {
                    }
                    break;
                case 1540:
                    if (str.equals("04")) {
                    }
                    break;
                case 1541:
                    if (str.equals("05")) {
                    }
                    break;
                case 1542:
                    if (str.equals("06")) {
                    }
                    break;
                case 1543:
                    if (str.equals("07")) {
                    }
                    break;
                case 1544:
                    if (str.equals("08")) {
                    }
                    break;
                case 1545:
                    if (str.equals("09")) {
                    }
                    break;
                case 1567:
                    if (str.equals("10")) {
                    }
                    break;
                case 1568:
                    if (str.equals("11")) {
                    }
                    break;
                case 1569:
                    if (str.equals("12")) {
                    }
                    break;
                case 1570:
                    if (str.equals("13")) {
                    }
                    break;
                default:
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                Method dump skipped, instruction units count: 1766
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.media3.exoplayer.mediacodec.w.d(io.bidmachine.media3.common.n):android.util.Pair");
        }

        public static synchronized List e(String str, boolean z, boolean z2) {
            try {
                s sVar = new s(str, z, z2);
                HashMap map = a;
                List list = (List) map.get(sVar);
                if (list != null) {
                    return list;
                }
                boolean zEquals = str.equals(MimeTypes.VIDEO_MV_HEVC);
                t tVar = new t();
                tVar.a = (z || z2 || zEquals) ? 1 : 0;
                ArrayList arrayListF = f(sVar, tVar);
                if (z && arrayListF.isEmpty() && x.a <= 23) {
                    arrayListF = f(sVar, new io.p071bidmachine.displays.mapper.a(14));
                    if (!arrayListF.isEmpty()) {
                        a.A("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) arrayListF.get(0)).a);
                    }
                }
                a(str, arrayListF);
                d31 d31VarA = d31.A(arrayListF);
                map.put(sVar, d31VarA);
                return d31VarA;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0047  */
        /* JADX WARN: Code duplicated, block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: io.bidmachine.media3.exoplayer.mediacodec.t.<init>(java.lang.Throwable, io.bidmachine.media3.exoplayer.mediacodec.r):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        public static java.util.ArrayList f(io.p071bidmachine.media3.exoplayer.mediacodec.s r20, io.p071bidmachine.media3.exoplayer.mediacodec.u r21) throws io.p071bidmachine.media3.exoplayer.mediacodec.t {
            /*
                Method dump skipped, instruction units count: 363
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.media3.exoplayer.mediacodec.w.f(io.bidmachine.media3.exoplayer.mediacodec.s, io.bidmachine.media3.exoplayer.mediacodec.u):java.util.ArrayList");
        }

        public static y32 g(i iVar, n nVar, boolean z, boolean z2) {
            List listA = iVar.a(nVar.n, z, z2);
            String strB = b(nVar);
            List listA2 = strB == null ? y32.e : iVar.a(strB, z, z2);
            y21 y21VarX = d31.x();
            y21VarX.d(listA);
            y21VarX.d(listA2);
            return y21VarX.g();
        }

        public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
            if (x.a >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            if (f0.k(str)) {
                return true;
            }
            String strB = ns1.B(mediaCodecInfo.getName());
            if (strB.startsWith("arc.")) {
                return false;
            }
            if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
                return true;
            }
            return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
        }

        public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
            for (String str3 : mediaCodecInfo.getSupportedTypes()) {
                if (str3.equalsIgnoreCase(str2)) {
                    return str3;
                }
            }
            if (str2.equals("video/dolby-vision")) {
                if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                    return "video/hevcdv";
                }
                if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                    return "video/dv_hevc";
                }
                return null;
            }
            if (str2.equals(MimeTypes.VIDEO_MV_HEVC)) {
                if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                    return "video/x-mvhevc";
                }
                return null;
            }
            if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
                return "audio/x-lg-alac";
            }
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }

        public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
            if (!mediaCodecInfo.isEncoder()) {
                if (z || !str.endsWith(".secure")) {
                    int i = x.a;
                    if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
                        String str3 = Build.DEVICE;
                        if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                            return false;
                        }
                    }
                    if (i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }
