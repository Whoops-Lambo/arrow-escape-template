package io.p071bidmachine.utils.log;

import defpackage.sr0;
import io.p071bidmachine.core.a;
import io.p071bidmachine.media3.extractor.text.j;
import io.p071bidmachine.util.log.b;
import io.p071bidmachine.util.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // io.p071bidmachine.util.log.b
    public final void b(Object obj, final r rVar) {
        if (obj != null) {
            final int i = 1;
            a.d.x(obj, new io.p071bidmachine.utils.lazy.b() { // from class: io.bidmachine.utils.log.b
                @Override // io.p071bidmachine.utils.lazy.b
                /* JADX INFO: renamed from: get */
                public final Object mo1394get() {
                    int i2 = i;
                    r rVar2 = rVar;
                    switch (i2) {
                        case 0:
                            break;
                    }
                    return (String) rVar2.invoke();
                }
            });
        } else {
            final int i2 = 0;
            io.p071bidmachine.utils.lazy.b bVar = new io.p071bidmachine.utils.lazy.b() { // from class: io.bidmachine.utils.log.b
                @Override // io.p071bidmachine.utils.lazy.b
                /* JADX INFO: renamed from: get */
                public final Object mo1394get() {
                    int i3 = i2;
                    r rVar2 = rVar;
                    switch (i3) {
                        case 0:
                            break;
                    }
                    return (String) rVar2.invoke();
                }
            };
            j jVar = a.d;
            switch (jVar.a) {
                case 14:
                    jVar.r(5, null, null, bVar, null);
                    break;
            }
        }
    }

    @Override // io.p071bidmachine.util.log.b
    public final void c(Object obj, sr0 sr0Var) {
        if (obj == null) {
            a.a(new a(sr0Var, 0));
        } else {
            a.b(obj, new a(sr0Var, 1));
        }
    }

    @Override // io.p071bidmachine.util.log.b
    public final void d(Object obj, sr0 sr0Var) {
        if (obj == null) {
            a.e(new a(sr0Var, 2));
        } else {
            a.f(obj, new a(sr0Var, 3));
        }
    }
}
