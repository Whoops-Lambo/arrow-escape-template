package io.p071bidmachine.media3.extractor.bmp;

import androidx.media3.common.MimeTypes;
import io.p071bidmachine.media3.common.q;
import io.p071bidmachine.media3.extractor.b0;
import io.p071bidmachine.media3.extractor.m;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements m {
    public final /* synthetic */ int a;
    public final m b;

    private final void d() {
    }

    private final void e() {
    }

    public a(byte b, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new b0(35152, 2, MimeTypes.IMAGE_PNG);
                break;
            default:
                this.b = new b0(16973, 2, MimeTypes.IMAGE_BMP);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final int a(n nVar, q qVar) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                return ((b0) mVar).a(nVar, qVar);
            case 1:
                return ((b0) mVar).a(nVar, qVar);
            default:
                return mVar.a(nVar, qVar);
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final boolean b(n nVar) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                return ((b0) mVar).b(nVar);
            case 1:
                return ((b0) mVar).b(nVar);
            default:
                return mVar.b(nVar);
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void c(o oVar) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                ((b0) mVar).c(oVar);
                break;
            case 1:
                ((b0) mVar).c(oVar);
                break;
            default:
                mVar.c(oVar);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void release() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b.release();
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void seek(long j, long j2) {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                ((b0) mVar).seek(j, j2);
                break;
            case 1:
                ((b0) mVar).seek(j, j2);
                break;
            default:
                mVar.seek(j, j2);
                break;
        }
    }

    public a(int i) {
        this.a = 2;
        if ((i & 1) != 0) {
            this.b = new b0(65496, 2, "image/jpeg");
        } else {
            this.b = new io.p071bidmachine.media3.extractor.jpeg.a();
        }
    }
}
