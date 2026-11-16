package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ym0 extends f1 {
    public final ArrayDeque c;
    public final /* synthetic */ an0 d;

    @Override // defpackage.f1
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            zm0 zm0Var = (zm0) arrayDeque.peek();
            if (zm0Var == null) {
                file = null;
                break;
            }
            File fileA = zm0Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(zm0Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public final um0 b(File file) {
        int iOrdinal = ((bn0) this.d.c).ordinal();
        if (iOrdinal == 0) {
            return new xm0(this, file);
        }
        if (iOrdinal == 1) {
            return new vm0(this, file);
        }
        e.b();
        return null;
    }

    public ym0(an0 an0Var) {
        this.d = an0Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = (File) an0Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new wm0(file));
        } else {
            this.a = 2;
        }
    }
}
