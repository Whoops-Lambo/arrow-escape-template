package io.p071bidmachine.iab.mraid;

import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ecffri.arrows.R;
import com.facebook.internal.j0;
import com.inmobi.media.core.config.models.AdConfig;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import defpackage.dw;
import io.p071bidmachine.media3.common.f;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.common.y;
import io.p071bidmachine.media3.exoplayer.audio.a0;
import io.p071bidmachine.media3.exoplayer.audio.g;
import io.p071bidmachine.media3.exoplayer.audio.h;
import io.p071bidmachine.media3.exoplayer.dash.j;
import io.p071bidmachine.media3.exoplayer.drm.b;
import io.p071bidmachine.media3.exoplayer.drm.e;
import io.p071bidmachine.media3.exoplayer.drm.i;
import io.p071bidmachine.media3.exoplayer.hls.k;
import io.p071bidmachine.media3.exoplayer.image.c;
import io.p071bidmachine.media3.exoplayer.source.c1;
import io.p071bidmachine.media3.exoplayer.source.d1;
import io.p071bidmachine.media3.exoplayer.source.i1;
import io.p071bidmachine.media3.extractor.d0;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.ui.c0;
import io.p071bidmachine.media3.ui.l0;
import io.p071bidmachine.util.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class w implements k0, j, c1, c, io.p071bidmachine.media3.exoplayer.text.c, l0, io.p071bidmachine.util.j, io.p071bidmachine.rendering.ad.view.j {
    public Object a;

    public io.p071bidmachine.media3.exoplayer.drm.j F() {
        return null;
    }

    public int I() {
        return 1;
    }

    public String L(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.a).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void O(e eVar) {
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long c(long j, long j2) {
        return j2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public boolean w() {
        return true;
    }

    public void y(e eVar) {
    }

    public static b D(d dVar) {
        new j0();
        dVar.getClass();
        new HashMap();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x029a  */
    /* JADX WARN: Multi-variable type inference failed */
    public void A(int i, int i2, n nVar) throws g0 {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        io.p071bidmachine.media3.extractor.mkv.c cVar = (io.p071bidmachine.media3.extractor.mkv.c) this.a;
        io.p071bidmachine.media3.extractor.mkv.d dVar = cVar.b;
        SparseArray sparseArray = cVar.c;
        q qVar = cVar.k;
        q qVar2 = cVar.i;
        int i14 = 1;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (cVar.J != 2) {
                    return;
                }
                io.p071bidmachine.media3.extractor.mkv.b bVar = (io.p071bidmachine.media3.extractor.mkv.b) sparseArray.get(cVar.P);
                int i16 = cVar.S;
                q qVar3 = cVar.p;
                if (i16 != 4 || !"V_VP9".equals(bVar.c)) {
                    nVar.skipFully(i2);
                    return;
                } else {
                    qVar3.C(i2);
                    nVar.readFully(qVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                cVar.e(i);
                io.p071bidmachine.media3.extractor.mkv.b bVar2 = cVar.x;
                int i17 = bVar2.h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    nVar.skipFully(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                bVar2.P = bArr;
                nVar.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                cVar.e(i);
                byte[] bArr2 = new byte[i2];
                cVar.x.j = bArr2;
                nVar.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                nVar.readFully(bArr3, 0, i2);
                cVar.e(i);
                cVar.x.k = new d0(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(qVar.a, (byte) 0);
                nVar.readFully(qVar.a, 4 - i2, i2);
                qVar.F(0);
                cVar.z = (int) qVar.v();
                return;
            }
            if (i == 25506) {
                cVar.e(i);
                byte[] bArr4 = new byte[i2];
                cVar.x.l = bArr4;
                nVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw g0.a("Unexpected id: " + i, null);
            }
            cVar.e(i);
            byte[] bArr5 = new byte[i2];
            cVar.x.x = bArr5;
            nVar.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (cVar.J == 0) {
            cVar.P = (int) dVar.b(nVar, false, true, 8);
            cVar.Q = dVar.c;
            cVar.L = -9223372036854775807L;
            cVar.J = 1;
            qVar2.C(0);
        }
        io.p071bidmachine.media3.extractor.mkv.b bVar3 = (io.p071bidmachine.media3.extractor.mkv.b) sparseArray.get(cVar.P);
        if (bVar3 == null) {
            nVar.skipFully(i2 - cVar.Q);
            cVar.J = 0;
            return;
        }
        bVar3.Z.getClass();
        if (cVar.J == 1) {
            cVar.h(nVar, 3);
            int i19 = (qVar2.a[2] & 6) >> 1;
            if (i19 == 0) {
                cVar.N = 1;
                int[] iArr2 = cVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                cVar.O = iArr2;
                iArr2[0] = (i2 - cVar.Q) - 3;
            } else {
                cVar.h(nVar, 4);
                int i20 = (qVar2.a[3] & 255) + 1;
                cVar.N = i20;
                int[] iArr3 = cVar.O;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i4 = 4;
                } else {
                    i4 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                cVar.O = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - cVar.Q) - 4;
                    int i22 = cVar.N;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i4;
                        while (true) {
                            i10 = cVar.N - 1;
                            iArr = cVar.O;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                cVar.h(nVar, i11);
                                int i26 = qVar2.a[i25] & 255;
                                int[] iArr4 = cVar.O;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - cVar.Q) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw g0.a("Unexpected lacing value: " + i19, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i4;
                        while (true) {
                            int i30 = cVar.N - i14;
                            int[] iArr5 = cVar.O;
                            if (i27 >= i30) {
                                i3 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - cVar.Q) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            cVar.h(nVar, i31);
                            if (qVar2.a[i29] == 0) {
                                throw g0.a("No valid varint length mask found", null);
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = i14 << (7 - i32);
                                i7 = i14;
                                if ((qVar2.a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    cVar.h(nVar, i9);
                                    i8 = i15;
                                    j = (~i33) & qVar2.a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (qVar2.a[i31] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i14 = i7;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw g0.a("EBML lacing sample size out of range.", null);
                            }
                            int i34 = (int) j;
                            int[] iArr6 = cVar.O;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i14 = i7;
                            i18 = i6;
                            i15 = i8;
                        }
                    }
                    byte[] bArr6 = qVar2.a;
                    cVar.K = cVar.j((bArr6[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr6[i5] << 8)) + cVar.E;
                    if (bVar3.e != 2 || (i == 163 && (qVar2.a[2] & 128) == 128)) {
                        i13 = i3;
                    } else {
                        i13 = i5;
                    }
                    cVar.R = i13;
                    cVar.J = 2;
                    cVar.M = i5;
                }
            }
            i3 = 1;
            i5 = 0;
            byte[] bArr7 = qVar2.a;
            cVar.K = cVar.j((bArr7[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr7[i5] << 8)) + cVar.E;
            if (bVar3.e != 2) {
                i13 = i3;
            } else {
                i13 = i3;
            }
            cVar.R = i13;
            cVar.J = 2;
            cVar.M = i5;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i35 = cVar.M;
                if (i35 >= cVar.N) {
                    cVar.J = 0;
                    return;
                }
                cVar.f(bVar3, ((long) ((cVar.M * bVar3.f) / 1000)) + cVar.K, cVar.R, cVar.k(nVar, bVar3, cVar.O[i35], false), 0);
                cVar.M++;
            }
        } else {
            while (true) {
                int i36 = cVar.M;
                if (i36 >= cVar.N) {
                    return;
                }
                int[] iArr7 = cVar.O;
                boolean z = i3;
                iArr7[i36] = cVar.k(nVar, bVar3, iArr7[i36], z);
                cVar.M += z ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public String B(io.p071bidmachine.media3.common.n nVar) {
        String displayName;
        String str = nVar.d;
        String str2 = nVar.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = x.a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strL = L(displayName, C(nVar));
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public String C(io.p071bidmachine.media3.common.n nVar) {
        Resources resources = (Resources) this.a;
        int i = nVar.f;
        int i2 = nVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = L(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = L(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? L(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public i E(y yVar) {
        yVar.b.getClass();
        yVar.b.getClass();
        return i.a;
    }

    public io.p071bidmachine.media3.exoplayer.drm.c G() {
        return (io.p071bidmachine.media3.exoplayer.drm.c) this.a;
    }

    public UUID H() {
        return io.p071bidmachine.media3.common.e.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public String J(io.p071bidmachine.media3.common.n nVar) {
        String strB;
        String string;
        Resources resources = (Resources) this.a;
        String str = nVar.n;
        int i = nVar.j;
        int i2 = nVar.D;
        int i3 = nVar.v;
        int i4 = nVar.u;
        String str2 = nVar.k;
        int i5 = f0.i(str);
        if (i5 == -1) {
            if (f0.j(str2) != null) {
                i5 = 2;
            } else if (f0.b(str2) != null) {
                i5 = 1;
            } else if (i4 != -1 || i3 != -1) {
                i5 = 2;
            } else if (i2 == -1 && nVar.E == -1) {
                i5 = -1;
            } else {
                i5 = 1;
            }
        }
        if (i5 == 2) {
            strB = L(C(nVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (i5 == 1) {
            String strB2 = B(nVar);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strB = L(strB2, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strB = B(nVar);
        }
        if (strB.length() != 0) {
            return strB;
        }
        String str3 = nVar.d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    public void K(int i, long j) throws g0 {
        io.p071bidmachine.media3.extractor.mkv.c cVar = (io.p071bidmachine.media3.extractor.mkv.c) this.a;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw g0.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw g0.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                cVar.e(i);
                cVar.x.e = (int) j;
                return;
            case 136:
                cVar.e(i);
                cVar.x.X = j == 1;
                return;
            case 155:
                cVar.L = cVar.j(j);
                return;
            case 159:
                cVar.e(i);
                cVar.x.Q = (int) j;
                return;
            case 176:
                cVar.e(i);
                cVar.x.n = (int) j;
                return;
            case 179:
                cVar.d(i);
                cVar.F.d(cVar.j(j));
                return;
            case 186:
                cVar.e(i);
                cVar.x.o = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                cVar.e(i);
                cVar.x.d = (int) j;
                return;
            case 231:
                cVar.E = cVar.j(j);
                return;
            case 238:
                cVar.S = (int) j;
                return;
            case 241:
                if (cVar.H) {
                    return;
                }
                cVar.d(i);
                cVar.G.d(j);
                cVar.H = true;
                return;
            case 251:
                cVar.T = true;
                return;
            case 16871:
                cVar.e(i);
                cVar.x.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw g0.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw g0.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw g0.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw g0.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw g0.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                cVar.A = j + cVar.s;
                return;
            case 21432:
                int i2 = (int) j;
                cVar.e(i);
                if (i2 == 0) {
                    cVar.x.y = 0;
                    return;
                }
                if (i2 == 1) {
                    cVar.x.y = 2;
                    return;
                } else if (i2 == 3) {
                    cVar.x.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    cVar.x.y = 3;
                    return;
                }
            case 21680:
                cVar.e(i);
                cVar.x.q = (int) j;
                return;
            case 21682:
                cVar.e(i);
                cVar.x.s = (int) j;
                return;
            case 21690:
                cVar.e(i);
                cVar.x.r = (int) j;
                return;
            case 21930:
                cVar.e(i);
                cVar.x.W = j == 1;
                return;
            case 21938:
                cVar.e(i);
                io.p071bidmachine.media3.extractor.mkv.b bVar = cVar.x;
                bVar.z = true;
                bVar.p = (int) j;
                return;
            case 21998:
                cVar.e(i);
                cVar.x.g = (int) j;
                return;
            case 22186:
                cVar.e(i);
                cVar.x.T = j;
                return;
            case 22203:
                cVar.e(i);
                cVar.x.U = j;
                return;
            case 25188:
                cVar.e(i);
                cVar.x.R = (int) j;
                return;
            case 30114:
                cVar.U = j;
                return;
            case 30321:
                cVar.e(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    cVar.x.t = 0;
                    return;
                }
                if (i3 == 1) {
                    cVar.x.t = 1;
                    return;
                } else if (i3 == 2) {
                    cVar.x.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    cVar.x.t = 3;
                    return;
                }
            case 2352003:
                cVar.e(i);
                cVar.x.f = (int) j;
                return;
            case 2807729:
                cVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        cVar.e(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            cVar.x.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            cVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        cVar.e(i);
                        int iG = f.g((int) j);
                        if (iG != -1) {
                            cVar.x.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        cVar.e(i);
                        cVar.x.z = true;
                        int iF = f.f((int) j);
                        if (iF != -1) {
                            cVar.x.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        cVar.e(i);
                        cVar.x.D = (int) j;
                        return;
                    case 21949:
                        cVar.e(i);
                        cVar.x.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void M(Exception exc) {
        a.o("MediaCodecAudioRenderer", "Audio sink error", exc);
        h hVar = ((a0) this.a).D0;
        Handler handler = hVar.a;
        if (handler != null) {
            handler.post(new g(hVar, exc, 8));
        }
    }

    public void N() {
        k kVar = (k) this.a;
        int i = kVar.r - 1;
        kVar.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (io.p071bidmachine.media3.exoplayer.hls.q qVar : kVar.t) {
            qVar.l();
            i2 += qVar.I.a;
        }
        s0[] s0VarArr = new s0[i2];
        int i3 = 0;
        for (io.p071bidmachine.media3.exoplayer.hls.q qVar2 : kVar.t) {
            qVar2.l();
            int i4 = qVar2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                qVar2.l();
                s0VarArr[i3] = qVar2.I.a(i5);
                i5++;
                i3++;
            }
        }
        kVar.s = new i1(s0VarArr);
        kVar.q.l(kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r6 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r6 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int P(io.p071bidmachine.media3.common.n r6) {
        /*
            r5 = this;
            java.lang.String r5 = r6.n
            r0 = 0
            if (r5 == 0) goto L82
            boolean r5 = io.p071bidmachine.media3.common.f0.m(r5)
            if (r5 != 0) goto Ld
            goto L82
        Ld:
            java.lang.String r5 = r6.n
            int r6 = io.p071bidmachine.media3.common.util.x.a
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r1) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r1 = "image/png"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r1 = "image/bmp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r1 = "image/webp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = r2
            goto L6b
        L40:
            java.lang.String r1 = "image/jpeg"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r1 = "image/heif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r1 = "image/heic"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = r3
            goto L6b
        L61:
            java.lang.String r1 = "image/avif"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            switch(r4) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                default: goto L6e;
            }
        L6e:
            goto L7d
        L6f:
            r5 = 26
            if (r6 < r5) goto L7d
            goto L78
        L74:
            r5 = 34
            if (r6 < r5) goto L7d
        L78:
            int r5 = io.p071bidmachine.media3.exoplayer.e.b(r2, r0, r0, r0)
            return r5
        L7d:
            int r5 = io.p071bidmachine.media3.exoplayer.e.b(r3, r0, r0, r0)
            return r5
        L82:
            int r5 = io.p071bidmachine.media3.exoplayer.e.b(r0, r0, r0, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.iab.mraid.w.P(io.bidmachine.media3.common.n):int");
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void d(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.h()) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.a(fVar));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long e(long j, long j2) {
        return 0L;
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void g(Object obj, io.p071bidmachine.util.e eVar) {
        eVar.getClass();
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.c(false)) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.b(fVar, eVar, 1));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void h(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.d(false)) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.a(fVar));
        }
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void i(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.d(true)) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.a(fVar));
        }
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void j(Object obj, io.p071bidmachine.rendering.model.s0 s0Var) {
        io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.d(1, (io.p071bidmachine.rendering.ad.fullscreen.f) this.a, s0Var));
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long k(long j, long j2) {
        return 0L;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long m(long j) {
        return 1L;
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void n(Object obj, m mVar, io.p071bidmachine.rendering.model.q qVar) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        io.p071bidmachine.rendering.internal.state.d dVar = fVar.a;
        int i = 0;
        if (dVar.k.compareAndSet(false, true)) {
            dVar.a(9);
        }
        io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.e(i, fVar, mVar, qVar));
    }

    @Override // io.p071bidmachine.util.j
    public void o(io.p071bidmachine.util.h hVar) {
        io.p071bidmachine.nativead.f fVar = (io.p071bidmachine.nativead.f) this.a;
        if (hVar.a) {
            fVar.getAdProcessCallback().processClickVerified(hVar.b, null);
        }
        io.p071bidmachine.nativead.f.e(fVar);
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void onAdExpired(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        io.p071bidmachine.rendering.internal.state.d dVar = fVar.a;
        boolean zCompareAndSet = dVar.n.compareAndSet(false, true);
        if (zCompareAndSet) {
            dVar.a(13);
        }
        if (zCompareAndSet) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.c(fVar, 2));
        }
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void onAdLoaded(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        int i = 1;
        if (fVar.a.c(true)) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.c(fVar, i));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.c1
    public void p(d1 d1Var) {
        k kVar = (k) this.a;
        kVar.q.p(kVar);
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void q(Object obj, io.p071bidmachine.rendering.model.n nVar) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.f.get()) {
            return;
        }
        io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.d(0, fVar, nVar));
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long r() {
        return 0L;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public io.p071bidmachine.media3.exoplayer.dash.manifest.j s(long j) {
        return (io.p071bidmachine.media3.exoplayer.dash.manifest.j) this.a;
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void t(Object obj) {
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        fVar.b.e();
        io.p071bidmachine.rendering.internal.state.d dVar = fVar.a;
        int i = 0;
        if (dVar.d(false)) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.a(fVar));
        }
        boolean zCompareAndSet = dVar.l.compareAndSet(false, true);
        if (zCompareAndSet) {
            dVar.a(12);
        }
        if (zCompareAndSet) {
            io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.c(fVar, i));
        }
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void u(Object obj, io.p071bidmachine.util.viewabilitytracker.model.a aVar, io.p071bidmachine.util.e eVar) {
        aVar.getClass();
        io.p071bidmachine.rendering.ad.fullscreen.f fVar = (io.p071bidmachine.rendering.ad.fullscreen.f) this.a;
        if (fVar.a.f.get()) {
            return;
        }
        io.p071bidmachine.util.n.a(new c0(1, fVar, aVar, eVar));
    }

    @Override // io.p071bidmachine.rendering.ad.a
    public void v(Object obj, io.p071bidmachine.util.e eVar) {
        eVar.getClass();
        io.p071bidmachine.util.n.a(new io.p071bidmachine.rendering.ad.fullscreen.b((io.p071bidmachine.rendering.ad.fullscreen.f) this.a, eVar, 0));
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long x(long j, long j2) {
        return 1L;
    }

    public void z(int i, boolean z) {
        dw dwVar = (dw) this.a;
        if (z) {
            dwVar.c(i);
        } else {
            dwVar.getClass();
        }
    }

    public w(int i) {
        switch (i) {
            case 5:
                this.a = new dw();
                break;
            case 11:
                this.a = new Object();
                break;
            case 14:
                this.a = new io.p071bidmachine.media3.exoplayer.hls.d(5, 1.0f, false);
                break;
            case 16:
                this.a = new SparseArray();
                break;
            case 17:
                this.a = new io.p071bidmachine.media3.exoplayer.analytics.d(15);
                break;
            case 19:
                this.a = new io.p071bidmachine.displays.mapper.a(29);
                break;
            case 20:
                this.a = new CopyOnWriteArrayList();
                break;
            default:
                this.a = new n0();
                break;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.j
    public long f(long j, long j2) {
        return -9223372036854775807L;
    }

    public /* synthetic */ w(Object obj) {
        this.a = obj;
    }

    public w(Resources resources) {
        resources.getClass();
        this.a = resources;
    }
}
