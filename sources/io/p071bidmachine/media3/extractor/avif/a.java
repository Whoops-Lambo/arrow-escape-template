package io.p071bidmachine.media3.extractor.avif;

import androidx.media3.common.MimeTypes;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.b0;
import io.p071bidmachine.media3.extractor.j;
import io.p071bidmachine.media3.extractor.m;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements m {
    public final /* synthetic */ int a;
    public final q b;
    public final b0 c;

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    public a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new q(4);
                this.c = new b0(-1, -1, MimeTypes.IMAGE_HEIF);
                break;
            case 2:
                this.b = new q(4);
                this.c = new b0(-1, -1, MimeTypes.IMAGE_WEBP);
                break;
            default:
                this.b = new q(4);
                this.c = new b0(-1, -1, MimeTypes.IMAGE_AVIF);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final int a(n nVar, io.p071bidmachine.media3.common.q qVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c.a(nVar, qVar);
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final boolean b(n nVar) {
        int i = this.a;
        q qVar = this.b;
        switch (i) {
            case 0:
                j jVar = (j) nVar;
                jVar.c(4, false);
                qVar.C(4);
                jVar.peekFully(qVar.a, 0, 4, false);
                if (qVar.v() == 1718909296) {
                    qVar.C(4);
                    jVar.peekFully(qVar.a, 0, 4, false);
                    if (qVar.v() == 1635150182) {
                        return true;
                    }
                }
                return false;
            case 1:
                j jVar2 = (j) nVar;
                jVar2.c(4, false);
                qVar.C(4);
                jVar2.peekFully(qVar.a, 0, 4, false);
                if (qVar.v() == 1718909296) {
                    qVar.C(4);
                    jVar2.peekFully(qVar.a, 0, 4, false);
                    if (qVar.v() == 1751476579) {
                        return true;
                    }
                }
                return false;
            default:
                qVar.C(4);
                j jVar3 = (j) nVar;
                jVar3.peekFully(qVar.a, 0, 4, false);
                if (qVar.v() == 1380533830) {
                    jVar3.c(4, false);
                    qVar.C(4);
                    jVar3.peekFully(qVar.a, 0, 4, false);
                    if (qVar.v() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void c(o oVar) {
        int i = this.a;
        b0 b0Var = this.c;
        switch (i) {
            case 0:
                b0Var.c(oVar);
                break;
            case 1:
                b0Var.c(oVar);
                break;
            default:
                b0Var.c(oVar);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void release() {
        int i = this.a;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void seek(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.seek(j, j2);
                break;
            case 1:
                this.c.seek(j, j2);
                break;
            default:
                this.c.seek(j, j2);
                break;
        }
    }
}
