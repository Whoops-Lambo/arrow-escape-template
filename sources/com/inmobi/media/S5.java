package com.inmobi.media;

import defpackage.az2;
import defpackage.cz;
import defpackage.ej1;
import defpackage.tb5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class S5 implements Nk {
    public Fd a;
    public AbstractC4425u1 b;
    public InterfaceC3932c9 c;

    @Override // com.inmobi.media.Nk
    public final void c() {
    }

    @Override // com.inmobi.media.Nk
    public final void a() {
        cz czVarA;
        Y9 y9C;
        InterfaceC3932c9 interfaceC3932c9 = this.c;
        if (interfaceC3932c9 != null && (y9C = interfaceC3932c9.c()) != null) {
            ((Z9) y9C).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC3932c9 interfaceC3932c10 = this.c;
        if (interfaceC3932c10 == null || (czVarA = interfaceC3932c10.a()) == null) {
            return;
        }
        tb5.t(czVarA, null, null, new R5(this, null), 3).invokeOnCompletion(new ej1(this, 4));
    }

    public S5(InterfaceC3932c9 interfaceC3932c9) {
        this.a = null;
        this.b = null;
        this.c = interfaceC3932c9;
    }

    public S5(Fd fd, AbstractC4425u1 abstractC4425u1, InterfaceC3932c9 interfaceC3932c9) {
        this.a = fd;
        this.b = abstractC4425u1;
        this.c = interfaceC3932c9;
    }

    public static final az2 a(S5 s5, Throwable th) {
        Y9 y9C;
        InterfaceC3932c9 interfaceC3932c9 = s5.c;
        if (interfaceC3932c9 != null && (y9C = interfaceC3932c9.c()) != null) {
            ((Z9) y9C).a();
        }
        InterfaceC3932c9 interfaceC3932c10 = s5.c;
        AbstractC4038g4.a(interfaceC3932c10 != null ? interfaceC3932c10.a() : null);
        s5.b = null;
        s5.c = null;
        s5.a = null;
        return az2.a;
    }
}
