package io.p071bidmachine.media3.extractor.jpeg;

import defpackage.mo1;
import defpackage.ta3;
import defpackage.y32;
import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.j;
import io.p071bidmachine.media3.extractor.m;
import io.p071bidmachine.media3.extractor.mp4.i;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.o;
import io.p071bidmachine.media3.extractor.text.k;
import io.p071bidmachine.media3.extractor.ts.y;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements m {
    public o b;
    public int c;
    public int d;
    public int e;
    public io.p071bidmachine.media3.extractor.metadata.mp4.a g;
    public n h;
    public ta3 i;
    public i j;
    public final q a = new q(6);
    public long f = -1;

    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    @Override // io.p071bidmachine.media3.extractor.m
    public final int a(n nVar, io.p071bidmachine.media3.common.q qVar) throws g0 {
        String strO;
        mo1 mo1VarA;
        y32 y32Var;
        int i;
        io.p071bidmachine.media3.extractor.metadata.mp4.a aVar;
        long j;
        int i2 = this.c;
        q qVar2 = this.a;
        if (i2 == 0) {
            qVar2.C(2);
            nVar.readFully(qVar2.a, 0, 2);
            int iZ = qVar2.z();
            this.d = iZ;
            if (iZ == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                d();
                return 0;
            }
            if ((iZ < 65488 || iZ > 65497) && iZ != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            qVar2.C(2);
            nVar.readFully(qVar2.a, 0, 2);
            this.e = qVar2.z() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    y.b();
                    return 0;
                }
                if (this.i == null || nVar != this.h) {
                    this.h = nVar;
                    this.i = new ta3(nVar, this.f);
                }
                i iVar = this.j;
                iVar.getClass();
                int iA = iVar.a(this.i, qVar);
                if (iA == 1) {
                    qVar.a += this.f;
                }
                return iA;
            }
            long position = nVar.getPosition();
            long j2 = this.f;
            if (position != j2) {
                qVar.a = j2;
                return 1;
            }
            if (!nVar.peekFully(qVar2.a, 0, 1, true)) {
                d();
                return 0;
            }
            nVar.resetPeekPosition();
            if (this.j == null) {
                this.j = new i(k.q9, 8);
            }
            ta3 ta3Var = new ta3(nVar, this.f);
            this.i = ta3Var;
            if (!this.j.b(ta3Var)) {
                d();
                return 0;
            }
            i iVar2 = this.j;
            long j3 = this.f;
            o oVar = this.b;
            oVar.getClass();
            iVar2.c(new ta3(j3, oVar));
            io.p071bidmachine.media3.extractor.metadata.mp4.a aVar2 = this.g;
            aVar2.getClass();
            o oVar2 = this.b;
            oVar2.getClass();
            e0 e0VarTrack = oVar2.track(1024, 4);
            io.p071bidmachine.media3.common.m mVar = new io.p071bidmachine.media3.common.m();
            mVar.l = f0.p("image/jpeg");
            mVar.k = new d0(aVar2);
            b.d(mVar, e0VarTrack);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            q qVar3 = new q(this.e);
            nVar.readFully(qVar3.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(qVar3.o()) && (strO = qVar3.o()) != null) {
                long length = nVar.getLength();
                if (length == -1) {
                    aVar = null;
                } else {
                    try {
                        mo1VarA = d.a(strO);
                    } catch (g0 | NumberFormatException | XmlPullParserException unused) {
                        io.p071bidmachine.media3.common.util.a.A("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        mo1VarA = null;
                    }
                    if (mo1VarA != null && (i = (y32Var = mo1VarA.b).d) >= 2) {
                        int i3 = i - 1;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        while (i3 >= 0) {
                            b bVar = (b) y32Var.get(i3);
                            boolean zEquals = "video/mp4".equals(bVar.a) | z;
                            if (i3 == 0) {
                                length -= bVar.c;
                                j = 0;
                            } else {
                                j = length - bVar.b;
                            }
                            long j8 = j;
                            long j9 = length;
                            length = j8;
                            if (zEquals && length != j9) {
                                j7 = j9 - length;
                                j6 = length;
                                zEquals = false;
                            }
                            if (i3 == 0) {
                                j4 = length;
                                j5 = j9;
                            }
                            i3--;
                            z = zEquals;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            aVar = null;
                        } else {
                            aVar = new io.p071bidmachine.media3.extractor.metadata.mp4.a(j4, j5, mo1VarA.a, j6, j7);
                        }
                    } else {
                        aVar = null;
                    }
                }
                this.g = aVar;
                if (aVar != null) {
                    this.f = aVar.d;
                }
            }
        } else {
            nVar.skipFully(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final boolean b(n nVar) {
        j jVar = (j) nVar;
        q qVar = this.a;
        qVar.C(2);
        jVar.peekFully(qVar.a, 0, 2, false);
        if (qVar.z() == 65496) {
            qVar.C(2);
            jVar.peekFully(qVar.a, 0, 2, false);
            int iZ = qVar.z();
            this.d = iZ;
            if (iZ == 65504) {
                qVar.C(2);
                jVar.peekFully(qVar.a, 0, 2, false);
                jVar.c(qVar.z() - 2, false);
                qVar.C(2);
                jVar.peekFully(qVar.a, 0, 2, false);
                this.d = qVar.z();
            }
            if (this.d == 65505) {
                jVar.c(2, false);
                qVar.C(6);
                jVar.peekFully(qVar.a, 0, 6, false);
                if (qVar.v() == 1165519206 && qVar.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void c(o oVar) {
        this.b = oVar;
    }

    public final void d() {
        o oVar = this.b;
        oVar.getClass();
        oVar.endTracks();
        this.b.h(new io.p071bidmachine.media3.extractor.q(-9223372036854775807L));
        this.c = 6;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void release() {
        i iVar = this.j;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            i iVar = this.j;
            iVar.getClass();
            iVar.seek(j, j2);
        }
    }
}
