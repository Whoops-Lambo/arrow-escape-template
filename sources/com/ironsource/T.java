package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.ya2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC5088yg {

    @NotNull
    private final String a;

    @Nullable
    private final InterfaceC5027v9 b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError b() {
        return C5095z5.a.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError c() {
        return C5095z5.a.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError d() {
        return C5095z5.a.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError e() {
        return C5095z5.a.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError f() {
        return C5095z5.a.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IronSourceError g() {
        return C5095z5.a.g();
    }

    @Override // com.ironsource.InterfaceC5088yg
    public void a() throws C5032ve {
        a(this.c, new ya2(10));
        a(this.b != null, new ya2(11));
        InterfaceC5027v9 interfaceC5027v9 = this.b;
        if (interfaceC5027v9 != null) {
            if (interfaceC5027v9.f() == EnumC5063x9.NonBidder) {
                a(this.a.length() == 0, new ya2(12));
            }
            if (interfaceC5027v9.f() == EnumC5063x9.Bidder) {
                a(this.a.length() > 0, new ya2(13));
            }
            a(interfaceC5027v9.f() != EnumC5063x9.NotSupported, new ya2(14));
            a(interfaceC5027v9.e().length() > 0, new ya2(15));
        }
    }

    public T(@NotNull String str, @Nullable InterfaceC5027v9 interfaceC5027v9, boolean z) {
        str.getClass();
        this.a = str;
        this.b = interfaceC5027v9;
        this.c = z;
    }
}
