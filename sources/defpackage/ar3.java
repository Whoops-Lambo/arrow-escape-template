package defpackage;

import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzahq;
import com.google.android.gms.internal.ads.zzahw;
import com.google.android.gms.internal.ads.zzahy;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzajp;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzaof;
import com.google.android.gms.internal.ads.zzap;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfz;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ar3 implements zzago {
    public zzagr b;
    public int c;
    public int d;
    public int e;
    public zzajp g;
    public zzagp h;
    public zzahw i;
    public zzamx j;
    public final zzey a = new zzey(2);
    public long f = -1;

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zzamx zzamxVar = this.j;
            zzamxVar.getClass();
            zzamxVar.a(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) {
        String strM;
        zzey zzeyVar = this.a;
        zzeyVar.y(2);
        zzagpVar.f(0, 2, zzeyVar.a);
        if (zzeyVar.L() == 65496) {
            while (true) {
                zzeyVar.y(2);
                zzagpVar.f(0, 2, zzeyVar.a);
                int iL = zzeyVar.L();
                this.d = iL;
                if (iL == 65498) {
                    break;
                }
                zzeyVar.y(2);
                zzagpVar.f(0, 2, zzeyVar.a);
                int iL2 = zzeyVar.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    zzagpVar.b(iL2);
                } else {
                    zzeyVar.y(iL2);
                    zzagpVar.f(0, iL2, zzeyVar.a);
                    if (Objects.equals(zzeyVar.m(), "http://ns.adobe.com/xap/1.0/") && (strM = zzeyVar.m()) != null) {
                        String[] strArr = ns1.b;
                        for (int i = 0; i < 4; i++) {
                            if (strM.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0222  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x0232  */
    /* JADX WARN: Code duplicated, block: B:123:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0247  */
    /* JADX WARN: Code duplicated, block: B:170:0x0249 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) throws zzat {
        String strM;
        long j;
        ta3 ta3Var;
        w wVar;
        int i;
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        zzajj zzajjVar;
        String str;
        boolean z;
        long j6;
        long j7;
        int i3 = this.c;
        zzey zzeyVar = this.a;
        long j8 = -1;
        if (i3 == 0) {
            zzeyVar.y(2);
            zzagpVar.h(zzeyVar.a, 0, 2);
            int iL = zzeyVar.L();
            this.d = iL;
            if (iL == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                e();
                return 0;
            }
            if ((iL < 65488 || iL > 65497) && iL != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i3 == 1) {
            zzeyVar.y(2);
            zzagpVar.f(0, 2, zzeyVar.a);
            this.e = zzeyVar.L() - 2;
            zzagpVar.zzf(2);
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return -1;
                    }
                    y.b();
                    return 0;
                }
                if (this.i == null || zzagpVar != this.h) {
                    this.h = zzagpVar;
                    this.i = new zzahw(zzagpVar, this.f);
                }
                zzamx zzamxVar = this.j;
                zzamxVar.getClass();
                int iC = zzamxVar.c(this.i, zzahoVar);
                if (iC == 1) {
                    zzahoVar.a += this.f;
                }
                return iC;
            }
            long jZzn = zzagpVar.zzn();
            long j9 = this.f;
            if (jZzn != j9) {
                zzahoVar.a = j9;
                return 1;
            }
            if (!zzagpVar.d(zzeyVar.a, 0, 1, true)) {
                e();
                return 0;
            }
            zzagpVar.zzl();
            if (this.j == null) {
                this.j = new zzamx(8, zzaof.b9);
            }
            zzahw zzahwVar = new zzahw(zzagpVar, this.f);
            this.i = zzahwVar;
            if (!this.j.b(zzahwVar)) {
                e();
                return 0;
            }
            zzamx zzamxVar2 = this.j;
            long j10 = this.f;
            zzagr zzagrVar = this.b;
            zzagrVar.getClass();
            zzamxVar2.d(new zzahy(j10, zzagrVar));
            zzajp zzajpVar = this.g;
            zzajpVar.getClass();
            zzagr zzagrVar2 = this.b;
            zzagrVar2.getClass();
            zzaia zzaiaVarB = zzagrVar2.b(1024, 4);
            zzt zztVar = new zzt();
            zztVar.d("image/jpeg");
            zztVar.k = new zzap(zzajpVar);
            zzaiaVarB.f(new zzv(zztVar));
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            zzey zzeyVar2 = new zzey(this.e);
            zzagpVar.h(zzeyVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(zzeyVar2.m()) && (strM = zzeyVar2.m()) != null) {
                long jZzo = zzagpVar.zzo();
                zzajp zzajpVar2 = null;
                if (jZzo != -1) {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(strM));
                        xmlPullParserNewPullParser.next();
                        try {
                            if (!zzfz.b(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                throw zzat.b("Couldn't find xmp metadata", null);
                            }
                            ar4 ar4Var = zzgzb.b;
                            w wVarY = w.e;
                            long j11 = -9223372036854775807L;
                            loop0: while (true) {
                                xmlPullParserNewPullParser.next();
                                j = j8;
                                if (zzfz.b(xmlPullParserNewPullParser, "rdf:Description")) {
                                    String[] strArr = ns1.b;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < 4) {
                                            String strC = zzfz.c(xmlPullParserNewPullParser, strArr[i4]);
                                            if (strC == null) {
                                                i4++;
                                            } else if (Integer.parseInt(strC) == 1) {
                                                String[] strArr2 = ns1.c;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 < 4) {
                                                        String strC2 = zzfz.c(xmlPullParserNewPullParser, strArr2[i5]);
                                                        if (strC2 != null) {
                                                            long j12 = Long.parseLong(strC2);
                                                            if (j12 != j) {
                                                                j11 = j12;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    j11 = -9223372036854775807L;
                                                    break;
                                                }
                                                String[] strArr3 = ns1.d;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 >= 2) {
                                                        wVarY = w.e;
                                                        break;
                                                    }
                                                    String strC3 = zzfz.c(xmlPullParserNewPullParser, strArr3[i6]);
                                                    if (strC3 != null) {
                                                        wVarY = zzgzb.y(new zzajj("image/jpeg", 0L, 0L), new zzajj("video/mp4", Long.parseLong(strC3), 0L));
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                            }
                                        }
                                        ta3Var = null;
                                        break loop0;
                                    }
                                }
                                if (zzfz.b(xmlPullParserNewPullParser, "Container:Directory")) {
                                    wVarY = ns1.I(xmlPullParserNewPullParser, "Container", "Item");
                                } else if (zzfz.b(xmlPullParserNewPullParser, "GContainer:Directory")) {
                                    wVarY = ns1.I(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                                }
                                long j13 = j11;
                                if (zzfz.a(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                    if (!wVarY.isEmpty()) {
                                        ta3Var = new ta3(j13, wVarY);
                                        break;
                                    }
                                    ta3Var = null;
                                    break loop0;
                                }
                                j11 = j13;
                                j8 = j;
                            }
                            if (ta3Var != null && (i = (wVar = (w) ta3Var.b).d) >= 2) {
                                j2 = j;
                                j3 = j2;
                                j4 = j3;
                                j5 = j4;
                                for (i2 = i - 1; i2 >= 0; i2--) {
                                    zzajjVar = (zzajj) wVar.get(i2);
                                    str = zzajjVar.a;
                                    if (!str.equals("video/mp4") || str.equals("video/quicktime")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i2 == 0) {
                                        jZzo -= zzajjVar.c;
                                        j6 = 0;
                                    } else {
                                        j6 = jZzo - zzajjVar.b;
                                    }
                                    long j14 = j6;
                                    j7 = jZzo;
                                    jZzo = j14;
                                    if (z && jZzo != j7) {
                                        j5 = j7 - jZzo;
                                        j4 = jZzo;
                                    }
                                    if (i2 == 0) {
                                        j3 = j7;
                                    }
                                    if (i2 == 0) {
                                        j2 = jZzo;
                                    }
                                }
                                if (j4 != j && j5 != j && j2 != j && j3 != j) {
                                    zzajpVar2 = new zzajp(j2, j3, ta3Var.a, j4, j5);
                                }
                            }
                        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
                            zzeh.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    } catch (zzat | NumberFormatException | XmlPullParserException unused2) {
                        j = j8;
                    }
                    zzeh.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    ta3Var = null;
                    if (ta3Var != null) {
                        j2 = j;
                        j3 = j2;
                        j4 = j3;
                        j5 = j4;
                        while (i2 >= 0) {
                            zzajjVar = (zzajj) wVar.get(i2);
                            str = zzajjVar.a;
                            if (str.equals("video/mp4")) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (i2 == 0) {
                                jZzo -= zzajjVar.c;
                                j6 = 0;
                            } else {
                                j6 = jZzo - zzajjVar.b;
                            }
                            long j15 = j6;
                            j7 = jZzo;
                            jZzo = j15;
                            if (z) {
                                j5 = j7 - jZzo;
                                j4 = jZzo;
                            }
                            if (i2 == 0) {
                                j3 = j7;
                            }
                            if (i2 == 0) {
                                j2 = jZzo;
                            }
                        }
                        if (j4 != j) {
                            zzajpVar2 = new zzajp(j2, j3, ta3Var.a, j4, j5);
                        }
                    }
                }
                this.g = zzajpVar2;
                if (zzajpVar2 != null) {
                    this.f = zzajpVar2.d;
                }
            }
        } else {
            zzagpVar.zzf(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.b = zzagrVar;
    }

    public final void e() {
        zzagr zzagrVar = this.b;
        zzagrVar.getClass();
        zzagrVar.zzw();
        this.b.j(new zzahq(-9223372036854775807L, 0L));
        this.c = 6;
    }
}
