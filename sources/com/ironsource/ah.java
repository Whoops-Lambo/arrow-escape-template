package com.ironsource;

import android.app.Activity;
import android.content.Context;
import defpackage.f22;
import defpackage.jp1;
import defpackage.p32;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ah implements InterfaceC4736f4 {
    static final /* synthetic */ KProperty<Object>[] c;

    @Nullable
    private Context a;

    @NotNull
    private final f22 b;

    static {
        jp1 jp1Var = new jp1(ah.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        p32.a.getClass();
        c = new KProperty[]{jp1Var};
    }

    @Override // com.ironsource.InterfaceC4736f4
    @Nullable
    public Activity a() {
        return (Activity) this.b.getValue(this, c[0]);
    }

    @Override // com.ironsource.InterfaceC4736f4
    @Nullable
    public Context b() {
        return this.a;
    }

    public ah(@Nullable Activity activity, @Nullable Context context) {
        this.a = context;
        this.b = C4739f7.a(activity);
    }

    @Override // com.ironsource.InterfaceC4736f4
    public void a(@Nullable Context context) {
        this.a = context;
    }

    @Override // com.ironsource.InterfaceC4736f4
    public void a(@Nullable Activity activity) {
        this.b.setValue(this, c[0], activity);
    }
}
